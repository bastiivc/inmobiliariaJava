/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Inmobiliaria;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * La clase Login representa la ventana de inicio de sesión de la aplicación.
 * Extiende JFrame para crear una ventana de aplicación.
 * Permite a los usuarios iniciar sesión o acceder como invitados.
 *
 * @autor gioahumada
 */
public class Login extends javax.swing.JFrame {
    Inmobiliaria inmobiliaria;

    /**
     * Constructor de la clase Login.
     * Inicializa la ventana de inicio de sesión.
     *
     * @param inmobiliaria la instancia de la clase Inmobiliaria
     */
    public Login(Inmobiliaria inmobiliaria) {
        this.inmobiliaria = inmobiliaria;
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana
        setResizable(false); // Deshabilitar el cambio de tamaño
        setTitle("Inmobiliaria Java");
        Image icon = new ImageIcon(getClass().getResource("/img/favicon.png")).getImage();
        setIconImage(icon);
    }

    /**
     * Este método es llamado desde el constructor para inicializar el formulario.
     * ADVERTENCIA: No modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de Formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        loginAsGuestButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Mx3 Team © | Programación Avanzada");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("v.0.6");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoLow.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/orange.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoTextOrange.png"))); // NOI18N

        jLabel6.setText("Usuario");

        textField.setForeground(new java.awt.Color(204, 204, 204));
        textField.setText("Nombre de Usuario");
        textField.setToolTipText("");
        textField.setBorder(null);
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Contraseña");

        passwordField.setText("password");
        passwordField.setToolTipText("dfd");
        passwordField.setBorder(null);

        loginAsGuestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciarInvitado.png"))); // NOI18N
        loginAsGuestButton.setBorder(null);
        loginAsGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAsGuestButtonActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciarSesion.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel5)
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel6))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel7))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(loginAsGuestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(40, 40, 40))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                                                .addComponent(jLabel9)
                                                                .addContainerGap())))))
        );
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(1, 1, 1)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)
                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel7)
                                .addGap(3, 3, 3)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginAsGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addContainerGap())
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clearFields();
            }
        });

        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clearFields();
            }
        });

        pack();
    }// </editor-fold>

    /**
     * Método que limpia los campos de texto y contraseña al hacer clic en ellos.
     * Cambia el color del texto a negro.
     */

    private void clearFields() { /* Permite que se borre el
                                    texto en los fields al hacer click,
                                    se complementa con initComponents */
        textField.setText("");
        textField.setForeground(new java.awt.Color(0, 0, 0)); // Cambiar el color del texto a negro
        passwordField.setText("");
        passwordField.setForeground(new java.awt.Color(0, 0, 0)); // Cambiar el color del texto a negro
    }

    /**
     * Acción realizada al hacer clic en el botón de iniciar sesión como invitado.
     * Muestra un mensaje de bienvenida y abre el menú de invitado.
     *
     * @param evt el evento de acción
     */

    private void loginAsGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/iconJ.png"));
        JOptionPane.showMessageDialog(this, "¡Bienvenido, Invitado!", "Iniciar Sesión", JOptionPane.INFORMATION_MESSAGE, icon);
        dispose(); /* Cerrar Ventana */
        new MenuInvitado(inmobiliaria).setVisible(true);
    }

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {
        /* Deprecado desde NetBeans */
    }

    /**
     * Acción realizada al hacer clic en el botón de iniciar sesión.
     * Verifica las credenciales del usuario y abre el menú correspondiente.
     *
     * @param evt el evento de acción
     */

    /* El mal nombre de la función proviene desde NetBeans */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        /* Recoje los datos desde los fields */
        String username = textField.getText();
        String password = new String(passwordField.getPassword());

        /* Busca el usuario, si no lo encuentra marca error.*/
        Usuario usuario = inmobiliaria.obtenerUsuario(username);
        if (usuario != null && usuario.verificarContraseña(password)) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/img/iconJ.png"));
            JOptionPane.showMessageDialog(this, "¡Bienvenido, " + username + "!", "Iniciar Sesión", JOptionPane.INFORMATION_MESSAGE, icon);
            dispose(); /* Cierra la ventana */
            if (usuario.isEsAdministrador()) { /* Carga los diferentes menus depediendo del usuario. */
                new MenuAdministrador(inmobiliaria, username).setVisible(true);
            } else {
                new MenuInvitado(inmobiliaria).setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña y/o Usuario incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    /**
     * Método principal que inicia la aplicación.
     *
     * @param args los argumentos de la línea de comandos
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inmobiliaria newInmobiliaria = new Inmobiliaria();
                new Login(newInmobiliaria).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginAsGuestButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textField;
    // End of variables declaration
}
