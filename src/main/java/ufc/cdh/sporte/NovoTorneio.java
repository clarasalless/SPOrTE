/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ufc.cdh.sporte;

/**
 *
 * @author main
 */
public class NovoTorneio extends javax.swing.JFrame {

    /**
     * Creates new form NovoTorneio
     */
    public NovoTorneio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetSeededGroup = new javax.swing.ButtonGroup();
        SetPlayoffGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        FormNovoTorneio = new javax.swing.JPanel();
        NomeTorneio = new javax.swing.JLabel();
        DescricaoTorneio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescricaoTexto = new javax.swing.JTextArea();
        SetSeeded = new javax.swing.JLabel();
        SetPlayoff = new javax.swing.JLabel();
        SeededTrue = new javax.swing.JRadioButton();
        SeededFalse = new javax.swing.JRadioButton();
        PlayoffTrue = new javax.swing.JRadioButton();
        PlayoffFalse = new javax.swing.JRadioButton();
        NomeNovoTorneio = new javax.swing.JTextField();
        CriaNovoTorneio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Criação de Torneio");

        NomeTorneio.setText("Nome do Torneio :");

        DescricaoTorneio.setText("Descrição (opcional) :");

        DescricaoTexto.setColumns(20);
        DescricaoTexto.setLineWrap(true);
        DescricaoTexto.setRows(3);
        jScrollPane1.setViewportView(DescricaoTexto);

        SetSeeded.setText("Colocação de equipes :");

        SetPlayoff.setText("Formação de chaves :");

        SetSeededGroup.add(SeededTrue);
        SeededTrue.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SeededTrue.setText("Seeded");

        SetSeededGroup.add(SeededFalse);
        SeededFalse.setText("Não-seeded");
        SeededFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeededFalseActionPerformed(evt);
            }
        });

        SetPlayoffGroup.add(PlayoffTrue);
        PlayoffTrue.setText("Mata-mata");

        SetPlayoffGroup.add(PlayoffFalse);
        PlayoffFalse.setText("Eliminação dupla");

        NomeNovoTorneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeNovoTorneioActionPerformed(evt);
            }
        });

        CriaNovoTorneio.setText("Criar Torneio");
        CriaNovoTorneio.setIconTextGap(2);
        CriaNovoTorneio.setMargin(new java.awt.Insets(2, 1, 2, 1));
        CriaNovoTorneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriaNovoTorneioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormNovoTorneioLayout = new javax.swing.GroupLayout(FormNovoTorneio);
        FormNovoTorneio.setLayout(FormNovoTorneioLayout);
        FormNovoTorneioLayout.setHorizontalGroup(
            FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormNovoTorneioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormNovoTorneioLayout.createSequentialGroup()
                        .addComponent(SetSeeded)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormNovoTorneioLayout.createSequentialGroup()
                        .addGroup(FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CriaNovoTorneio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FormNovoTorneioLayout.createSequentialGroup()
                                .addGroup(FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescricaoTorneio)
                                    .addComponent(SetPlayoff)
                                    .addComponent(PlayoffTrue)
                                    .addComponent(SeededTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SeededFalse, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PlayoffFalse, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormNovoTorneioLayout.createSequentialGroup()
                                .addComponent(NomeTorneio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeNovoTorneio)))
                        .addGap(34, 34, 34))))
        );
        FormNovoTorneioLayout.setVerticalGroup(
            FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormNovoTorneioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeTorneio)
                    .addComponent(NomeNovoTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(DescricaoTorneio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetSeeded)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeededTrue)
                    .addComponent(SeededFalse))
                .addGap(18, 18, 18)
                .addComponent(SetPlayoff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormNovoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayoffTrue)
                    .addComponent(PlayoffFalse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(CriaNovoTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormNovoTorneio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormNovoTorneio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeededFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeededFalseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeededFalseActionPerformed

    private void CriaNovoTorneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriaNovoTorneioActionPerformed
        // TODO add your handling code here:
        CriaTimes criaTimes = new CriaTimes();
        criaTimes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CriaNovoTorneioActionPerformed

    private void NomeNovoTorneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeNovoTorneioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeNovoTorneioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CriaNovoTorneio;
    private javax.swing.JTextArea DescricaoTexto;
    private javax.swing.JLabel DescricaoTorneio;
    private javax.swing.JPanel FormNovoTorneio;
    private javax.swing.JTextField NomeNovoTorneio;
    private javax.swing.JLabel NomeTorneio;
    private javax.swing.JRadioButton PlayoffFalse;
    private javax.swing.JRadioButton PlayoffTrue;
    private javax.swing.JRadioButton SeededFalse;
    private javax.swing.JRadioButton SeededTrue;
    private javax.swing.JLabel SetPlayoff;
    private javax.swing.ButtonGroup SetPlayoffGroup;
    private javax.swing.JLabel SetSeeded;
    private javax.swing.ButtonGroup SetSeededGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
