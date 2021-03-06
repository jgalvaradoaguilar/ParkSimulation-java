/*
 * GestionAtraccionesUI.java
 *
 * Created on 11 de agosto de 2008, 4:30
 */

package mi.parque;
import javax.swing.*;

/**
 *
 * @author  owner
 */
public class GestionAtraccionesUI extends javax.swing.JPanel {

    /** Creates new form GestionAtraccionesUI */
    public GestionAtraccionesUI() {
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

        modificar_noria = new javax.swing.JButton();
        modificar_montaña = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión de atracciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        modificar_noria.setText("Modificar noria");
        modificar_noria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_noriaActionPerformed(evt);
            }
        });

        modificar_montaña.setText("Modificar montaña rusa");
        modificar_montaña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_montañaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(modificar_montaña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar_noria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modificar_noria)
                .addGap(27, 27, 27)
                .addComponent(modificar_montaña)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void modificar_noriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_noriaActionPerformed
// TODO add your handling code here:
    DatosModificarUI rec = new DatosModificarUI();
    if(JOptionPane.showConfirmDialog(this, rec, "Introduzca datos",
    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
    == JOptionPane.OK_OPTION) {
    //Recogida datos RELLENAR
    boolean aniadir=rec.aniadir();
    boolean quitar=rec.quitar();
    int numero_elementos=rec.numero_elementos();
    int velocidad=rec.velocidad();
    //Procesamos los datos recogidos
    if (aniadir && numero_elementos>0) {
        int j;
        int vehiculos_aniadidos=0;
        for( j=1; j <= numero_elementos && ParqueUI.noria.vehiculos.size()<10 ; j++ ) { 
            //añade todos los vehiculos pedidos
            Vehiculo c = new Vehiculo();
            ParqueUI.noria.vehiculos.add(c);
            vehiculos_aniadidos++;
        }
        ParqueUI.mi_consola.append("Se han añadido "+vehiculos_aniadidos+" vehículos\n");
    }
    
    if (quitar && numero_elementos>0) {
        int j,k;
        int vehiculos_quitados=0;
        boolean retirado=false;
        //no podra tener menos de 3 vehiculos la noria
        for( j=1; j <= numero_elementos && ParqueUI.noria.vehiculos.size()>3 ; j++ ) { 
            //ahora se recorren los vehiculos y solo si no tiene averia se quita
            for(k=0; k<ParqueUI.noria.vehiculos.size() && !retirado; k++){
                //si no tiene averia se quita
                if (!((Vehiculo)ParqueUI.noria.vehiculos.get(k)).averia){
                    ParqueUI.noria.vehiculos.remove(k);
                    vehiculos_quitados++; 
                    retirado=true;
                }    
            }
            retirado=false;
        }
        ParqueUI.mi_consola.append("Se han quitado " +vehiculos_quitados+ " vehículos\n");
    }
    
    switch( velocidad ) {
    case 2:
        ParqueUI.noria.velocidad=velocidad;
        ParqueUI.mi_consola.append("Se ha establecido la velocidad de la noria a LENTO\n");
        break;
    case 6:
        ParqueUI.noria.velocidad=velocidad;
        ParqueUI.mi_consola.append("Se ha establecido la velocidad de la noria a RÁPIDO\n");
        break;
    default:
        ParqueUI.noria.velocidad=4;
        ParqueUI.mi_consola.append("Se ha establecido la velocidad de la noria a NORMAL\n");
}

    }        
}//GEN-LAST:event_modificar_noriaActionPerformed

private void modificar_montañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_montañaActionPerformed
// TODO add your handling code here:
    DatosModificarUI rec = new DatosModificarUI();
    if(JOptionPane.showConfirmDialog(this, rec, "Introduzca datos",
    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
    == JOptionPane.OK_OPTION) {
    //Recogida datos RELLENAR
    boolean aniadir=rec.aniadir();
    boolean quitar=rec.quitar();
    int numero_elementos=rec.numero_elementos();
    int velocidad=rec.velocidad();
        //Procesamos los datos recogidos
    if (aniadir && numero_elementos>0) {
        int j;
        int coches_aniadidos=0;
        for( j=1; j <= numero_elementos && ParqueUI.montania.coches.size()<10 ; j++ ) { 
            //añade todos los coches pedidos
            Vehiculo c = new Vehiculo();
            ParqueUI.montania.coches.add(c);
            coches_aniadidos++;
        }
        ParqueUI.mi_consola.append("Se han añadido "+coches_aniadidos+" coches\n");
    }
    
     if (quitar && numero_elementos>0) {
        int j,k;
        int coches_quitados=0;
        boolean retirado=false;
        //no podra tener menos de 3 coches la montaña
        for( j=1; j <= numero_elementos && ParqueUI.montania.coches.size()>3 ; j++ ) { 
            //ahora se recorren los coches y solo si no tiene averia se quita
            for(k=0; k<ParqueUI.montania.coches.size() && !retirado; k++){
                //si no tiene averia se quita
                if (!((Vehiculo)ParqueUI.montania.coches.get(k)).averia){
                    ParqueUI.montania.coches.remove(k);
                    coches_quitados++; 
                    retirado=true;
                }    
            }
            retirado=false;
        }
        ParqueUI.mi_consola.append("Se han quitado " +coches_quitados+ " coches\n");
    }

    
    switch( velocidad ) {
    case 4:
        ParqueUI.montania.velocidad=velocidad;
        ParqueUI.mi_consola.append("Se ha establecido la velocidad de la montaña a LENTO\n");
        break;
    case 12:
        ParqueUI.montania.velocidad=velocidad;
        ParqueUI.mi_consola.append("Se ha establecido la velocidad de la montaña a RÁPIDO\n");
        break;
    default:
        ParqueUI.montania.velocidad=8;
        ParqueUI.mi_consola.append("Se ha establecido la velocidad de la montaña a NORMAL\n");
}
    }   
}//GEN-LAST:event_modificar_montañaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton modificar_montaña;
    private javax.swing.JButton modificar_noria;
    // End of variables declaration//GEN-END:variables

}
