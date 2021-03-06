/*
 * OperariosUI.java
 *
 * Created on 11 de agosto de 2008, 4:30
 */

package mi.parque;
//import javax.swing.*;

/**
 *
 * @author  owner
 */
public class OperariosUI extends javax.swing.JPanel {

    /** Creates new form OperariosUI */
    public OperariosUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crea_operario = new javax.swing.JButton();
        borra_operario = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        crea_operario.setText("Crear Operario(s)");
        crea_operario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crea_operarioActionPerformed(evt);
            }
        });

        borra_operario.setText("Eliminar Operario(s)");
        borra_operario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borra_operarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borra_operario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crea_operario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crea_operario)
                .addGap(18, 18, 18)
                .addComponent(borra_operario)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void crea_operarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crea_operarioActionPerformed
// TODO add your handling code here:
    if (ParqueUI.cra.operarios.size()<10){
        Operario operario =new Operario();
        ParqueUI.cra.operarios.add(operario);
        ParqueUI.mi_consola.append("Se ha contratado a un operario\n");
    } 
    else{
        ParqueUI.mi_consola.append("No puede contratar más operarios, MAX. POSIBLE\n");
    }
}//GEN-LAST:event_crea_operarioActionPerformed

private void borra_operarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borra_operarioActionPerformed
// TODO add your handling code here:
    if (ParqueUI.cra.operarios.size()>3){   //habra al menos 3 operarios siempre
        boolean operario_ocupado;
        boolean despedido=false;
        for( int k=0; k<ParqueUI.cra.operarios.size() && !despedido; k++){
            operario_ocupado=((Operario)(ParqueUI.cra.operarios.get(k))).ocupado;
            //si no esta ocupado el operario se lo puede despedir
            if (!operario_ocupado){
                ParqueUI.cra.operarios.remove(k);
                ParqueUI.mi_consola.append("Se ha despedido a un operario\n");
                despedido=true;
            }
        }
    }
    else{
        ParqueUI.mi_consola.append("No puede despedir más operarios, MIN. POSIBLE\n");
    }
}//GEN-LAST:event_borra_operarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borra_operario;
    private javax.swing.JButton crea_operario;
    // End of variables declaration//GEN-END:variables

}
