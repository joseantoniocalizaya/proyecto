
package vista;

import bean.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Arreglousuario;

public class Principalusuario extends javax.swing.JFrame {

     Arreglousuario listausd = new Arreglousuario();
    
    DefaultTableModel modelo;
    public Principalusuario() {
        initComponents();
        modelo = (DefaultTableModel) table.getModel();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtIngresecodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtDistrito1 = new javax.swing.JTextField();
        txtDireccion1 = new javax.swing.JTextField();
        txtCorreo1 = new javax.swing.JTextField();
        txtFecha1 = new javax.swing.JTextField();
        txtDni1 = new javax.swing.JTextField();
        txtEdad1 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtIngresecodigo1 = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIONAR USUARIOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, 10));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CODIGO");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DISTRIOTO");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DIRECCION");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CORREO");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("EDAD");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("DNI");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("FECHA DE NACIMIENTO");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("TELEFONO");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 70, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 230, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 230, -1));

        txtDistrito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 210, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 210, -1));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 240, -1));

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 160, -1));

        txtDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 160, -1));

        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 60, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 150, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR DATOS");
        btnGuardar.setActionCommand("GUARDAR DATOS");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel6.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 210, 60));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO REGISTRO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel6.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 50));

        jTabbedPane1.addTab("REGISTRA USUARIOS", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("INGRESE EL CODIGO ");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtIngresecodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtIngresecodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 80, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR CODIGO");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel7.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("NOMBRE");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("APELLIDO");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("DISTRITO");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("DIRECCION");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("CORREO");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("FECHA DE NACIMIENTO");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("DNI");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("EDAD");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("TELEFONO");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        txtNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 260, -1));

        txtApellido1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 260, -1));

        txtDistrito1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtDistrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 240, -1));

        txtDireccion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 240, -1));

        txtCorreo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 230, -1));

        txtFecha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 160, -1));

        txtDni1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 160, -1));

        txtEdad1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 50, -1));

        txtTelefono1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 160, -1));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel7.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 170, 40));

        jTabbedPane1.addTab("MODIFICAR USUARIOS", jPanel7);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("INGRESE CODIGO PARA ELIMINAR");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        txtIngresecodigo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtIngresecodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 90, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR REGISTRO");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "FECHA NACIMIENTO", "DNI", "TELEFONO", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 800, 260));

        btnListar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnListar.setText("LISTAR USUARIOS");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel3.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 240, 50));

        jTabbedPane1.addTab("ELIMINAR Y LISTAR", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 820, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Principalusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principalusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principalusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principalusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principalusuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDistrito1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDni1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtIngresecodigo;
    private javax.swing.JTextField txtIngresecodigo1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
 private void guardar() {
        try{
            Usuario P= new Usuario(getCodigo(), getNombre(),getApellido(),getDistrito(),getDireccion(),getCorreo(),getFecha(),getDni(),getEdad(),getTelefono());
            String respuesta = listausd.adicionar(P);
            listausd.grabar();
            JOptionPane.showMessageDialog(null, respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no hay registro para guardar");
            nuevo();
        }
    }
    
    private int getCodigo(){
        return Integer.parseInt(txtCodigo.getText());
    }
    
    private String getNombre(){
        return txtNombre.getText();
    }
    private String getApellido(){
        return txtApellido.getText();
    }
    private String getDistrito(){
        return txtDistrito.getText();
    }
    private String getDireccion(){
        return txtDireccion.getText();
    }
    private String getCorreo(){
        return txtCorreo.getText();
    }
    private String getFecha(){
        return txtFecha.getText();
    }
     private int getDni(){
        return Integer.parseInt(txtDni.getText());
    }
     private int getEdad(){
        return Integer.parseInt(txtEdad.getText());
    }
  
    private int getTelefono(){
        return Integer.parseInt(txtTelefono.getText());
    }

    private void nuevo() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDistrito.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtFecha.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtCodigo.requestFocus();
    }

    private void listar() {
        //limpiar la tabla
        int filas = table.getRowCount();
        for(int i=0; i<filas; i++)
                modelo.removeRow(0);
        
        //agregar la lista a la tabla
        if(listausd.totalProd()>0)
            for(int i=0; i<listausd.totalProd(); i++){
                modelo.addRow(new Object[]{
                    listausd.obtener(i).getCodigo(),
                    listausd.obtener(i).getNombre(),
                    listausd.obtener(i).getApellido(),
                    listausd.obtener(i).getFecha(),
                    listausd.obtener(i).getDni(),
                    listausd.obtener(i).getTelefono(),
                    listausd.obtener(i).getEdad()});
            }
        else JOptionPane.showMessageDialog(null, "No hay productos para mostrar");
    }

    private void buscar() {
        try{
            Usuario P = null;
            P = listausd.buscar(getCodigoM());
            mostrarusuarios(P);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "El código no existe");
        }
    }

    private int getCodigoM() {
        return Integer.parseInt(txtIngresecodigo.getText());
    }

    private void mostrarusuarios(Usuario P) {
        // para double = txtPrecioUnitarioM.setText(String.valueOf(p.getPrecioUnitario()));//
        txtNombre1.setText(P.getNombre());
        txtApellido1.setText(P.getApellido());
        txtDistrito1.setText(P.getDistrito());
        txtDireccion1.setText(P.getDireccion());
        txtCorreo1.setText(P.getCorreo());
        txtFecha1.setText(P.getFecha());
         txtDni1.setText(String.valueOf(P.getDni()));
          txtEdad1.setText(String.valueOf(P.getEdad()));
        txtTelefono1.setText(String.valueOf(P.getTelefono()));
    }

    private void actualizar() {
        try{
            Usuario P = new Usuario(getIngresecodigo(), getNombre1(), 
                    getApellido1(), getDistrito1(),getDireccion1(),getCorreo1(),getFecha1(),getDni1(),getEdad(),getTelefono());
            listausd.actualizar(P);
            listausd.grabar();
            JOptionPane.showMessageDialog(null, "Actualización realizada con éxito");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no hay datos para actualizar");
        }
    }
    
    private int getIngresecodigo(){
        return Integer.parseInt(txtIngresecodigo.getText());
    }
    
    private String getNombre1(){
        return txtNombre1.getText();
    }
    private String getApellido1(){
        return txtApellido1.getText();
    }
    private String getDistrito1(){
        return txtDistrito1.getText();
    }
    private String getDireccion1(){
        return txtDireccion1.getText();
    }
    private String getCorreo1(){
        return txtCorreo1.getText();
    }
    private String getFecha1(){
        return txtFecha1.getText();
    }
    private int getDni1(){
        return Integer.parseInt(txtDni1.getText());
    } 
    private int getEdad1(){
        return Integer.parseInt(txtEdad1.getText());
    }
    private int getTelefono1(){
        return Integer.parseInt(txtTelefono1.getText());
    }

    private void eliminar() {
        try{
            Usuario P = null;
            P = listausd.buscar(getIngresecodigo1());
            listausd.eliminar(P);
            listausd.grabar();
            JOptionPane.showMessageDialog(null, "Eliminación realizada con éxito");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ingrese un codigo balido para poder eliminar");
        }
       
    }

    private int getIngresecodigo1() {
        return Integer.parseInt(txtIngresecodigo1.getText());
       
    }
   

}
