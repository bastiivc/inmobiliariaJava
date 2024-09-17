package modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inmobiliaria {
    private String nombre;
    private ArrayList<Comuna> comunas;
    private HashMap<String, Usuario> usuarios;

    /* Constructor */

    public Inmobiliaria() {
        this.nombre = "InmobiliariaJava";
        this.comunas = new ArrayList<>();
        this.usuarios = new HashMap<>();
    }

    /* Setters & Getters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* Metodos */

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNombreUsuario(), usuario);
    }

    public Usuario obtenerUsuario(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }

    public boolean esUsuarioAdministrador(String nombreUsuario) {
        Usuario usuario = obtenerUsuario(nombreUsuario);
        return usuario != null && usuario.isEsAdministrador();
    }

    public void agregarComuna(Comuna comuna) {
        comunas.add(comuna);
        guardarCambiosComunas();
    }

    public void eliminarComuna(Comuna comuna) {
        comunas.remove(comuna);
        guardarCambiosComunas();
    }

    public void actualizarComuna(Comuna comunaActualizada) {
        for (Comuna comuna : comunas) {
            if (comuna.getId() == comunaActualizada.getId()) {
                comuna.setNombre(comunaActualizada.getNombre());
                comuna.setClase(comunaActualizada.getClase());

                // Guardar los cambios en el archivo CSV después de la actualización
                try {
                    guardarComunasCSV("comunas.csv");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Comuna actualizada con éxito.");
                return;
            }
        }
        System.out.println("No se encontró la comuna con ID: " + comunaActualizada.getId());
    }

    public List<Comuna> obtenerTodasLasComunas() {
        return new ArrayList<>(comunas);
    }

    /* InmobiliariaController */

    public Comuna buscarComunaPorId(int id) {
        for (Comuna comuna : comunas) {
            if (comuna.getId() == id) {
                return comuna; // Devuelve la comuna si encuentra coincidencia de ID
            }
        }
        return null; // Retorna null si no se encuentra la comuna
    }

    public void agregarComuna(int id, String nombre, String clase) {
        Comuna comuna = new Comuna(id, nombre, clase);
        agregarComuna(comuna); // Llama al método ya existente para agregar una comuna
    }

    public void eliminarComunaPorId(int id) {
        Comuna comuna = buscarComunaPorId(id);
        if (comuna != null) {
            comunas.remove(comuna);
            guardarCambiosComunas(); // Ya existente
            
            // Eliminar el archivo CSV de propiedades asociado a la comuna
            String propiedadesFilePath = "db/comuna_" + id + "_propiedades.csv";
            File archivoPropiedades = new File(propiedadesFilePath);
            
            if (archivoPropiedades.exists()) {
                if (archivoPropiedades.delete()) {
                    System.out.println("Archivo de propiedades eliminado");
                } else {
                    System.out.println("No se pudo eliminar el archivo de propiedades");
                }
            } else {
                System.out.println("El archivo de propiedades no existe");
            }
        } else {
            System.out.println("Comuna no encontrada.");
        }
    }
    

    public void actualizarComuna(int id, String nombre, String clase) {
        Comuna comuna = buscarComunaPorId(id);
        if (comuna != null) {
            comuna.setNombre(nombre);
            comuna.setClase(clase);
            guardarCambiosComunas(); // Ya existente
        }
    }

    /* Persistencia de Datos */

    public void guardarUsuariosCSV(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter(file))) {
            for (Usuario usuario : usuarios.values()) {
                String[] record = {usuario.getNombreUsuario(), usuario.getHashContraseña(), String.valueOf(usuario.isEsAdministrador())};
                writer.writeNext(record);
            }
        }
    }

    public void cargarUsuariosCSV(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String nombreUsuario = nextLine[0];
                String hashContraseña = nextLine[1];
                boolean esAdministrador = Boolean.parseBoolean(nextLine[2]);
                Usuario usuario = new Usuario(nombreUsuario, hashContraseña, esAdministrador);
                agregarUsuario(usuario);
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }

    // Métodos para guardar y cargar comunas
    public void guardarComunasCSV(String filePath) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            for (Comuna comuna : comunas) {
                String[] record = {String.valueOf(comuna.getId()), comuna.getNombre(), comuna.getClase()};
                writer.writeNext(record);
            }
        }
    }

    public void cargarComunasCSV(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                int id = Integer.parseInt(nextLine[0]);
                String nombre = nextLine[1];
                String clase = nextLine[2];
                Comuna comuna = new Comuna(id, nombre, clase);
                agregarComuna(comuna);

                // Cargar propiedades asociadas a la comuna desde sus CSV
                String propiedadesPath = "db/comuna_" + id + "_propiedades.csv";
                comuna.cargarPropiedadesCSV(propiedadesPath); // Cargar las propiedades de cada comuna
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }

    private void guardarCambiosComunas() {
        try {
            guardarComunasCSV("comunas.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}