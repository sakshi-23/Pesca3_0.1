/*
 * ResultPanel2.java
 *
 * Created on 29 dicembre 2008, 17.18
 */
package org.cytoscape.pesca.internal;

/**
 *
 * @author scardoni
 */
import java.awt.Component;
import java.util.*;
import javax.swing.Icon;
import org.cytoscape.application.swing.CytoPanelComponent;
import org.cytoscape.application.swing.CytoPanelName;
import org.cytoscape.model.CyNode;

public class ResultPanel extends javax.swing.JPanel implements Observer, CytoPanelComponent {
    //CyNetworkView view = Cytoscape.getCurrentNetworkView();
    //   CyNetwork network = Cytoscape.getCurrentNetwork();

    CyNode source;
    String resulttype;
    static Vector ShortestPathVector;
    static Vector orderedbysizeVector;
    static Vector orderedbyNameVector;
    Vector provavector;
    PescaCore pescacore;
    PescaSPMap pescaSPmap;

    /**
     * Creates new form ResultPanel
     */
    public ResultPanel(Vector spvector, String resulttype, PescaCore pescacore, PescaSPMap pescaSPmap) {
        this.pescacore = pescacore;
        initComponents();
        this.resulttype = resulttype;
        sptable.getColumnModel().getColumn(0).setHeaderValue("Node Name");
        sptable.getColumnModel().getColumn(1).setHeaderValue("PescaMultiShortestPathTree Value");

        sptable.setVisible(false);

        ShortestPathVector = spvector;
        provavector = spvector;
        Vector sizeVector = addElements(0);

        printresult(sizeVector);
        
        sizetable.getColumnModel().getColumn(0).setHeaderValue("Size");
        sizetable.getColumnModel().getColumn(1).setHeaderValue("Number of SP ");

        sizetable.setVisible(true);
        this.pescaSPmap = pescaSPmap;
        showsizedistribution(pescaSPmap);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sptable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        orderNameButton = new javax.swing.JButton();
        orderSizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        selectedNodesButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sizetable = new javax.swing.JTable();

        jPanel1.setAutoscrolls(true);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        sptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sptable.setColumnSelectionAllowed(true);
        sptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sptable);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Multi Shortest Path Tree");

        orderNameButton.setText("order by name");
        orderNameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderNameButtonMouseClicked(evt);
            }
        });

        orderSizeButton.setText("order by size");
        orderSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderSizeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(orderNameButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(orderSizeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(orderNameButton)
                    .add(orderSizeButton)))
        );

        closeButton.setText("Close");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        selectedNodesButton.setText("View only selected nodes paths");
        selectedNodesButton.setEnabled(false);
        selectedNodesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedNodesButtonMouseClicked(evt);
            }
        });
        selectedNodesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedNodesButtonActionPerformed(evt);
            }
        });

        sizetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(sizetable);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(selectedNodesButton)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 204, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(closeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(closeButton))
                .add(18, 18, 18)
                .add(selectedNodesButton)
                .add(1, 1, 1)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void sptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sptableMouseClicked

    // network.unselectAllNodes();

    int selectedrows[] = sptable.getSelectedRows();
    String listaclick = " ";
    for (int j = 0; j < selectedrows.length; j++) {
        listaclick = listaclick + selectedrows[j];


        int elementrow = selectedrows[j];
        PescaShortestPathList clickedlist = (PescaShortestPathList) sptable.getModel().getValueAt(elementrow, 0);



        for (Iterator i = clickedlist.iterator(); i.hasNext();) {
            PescaMultiSPath tmpPescaMultiSPath = (PescaMultiSPath) i.next();
            //    NodeView tmpnodeView = view.getNodeView(tmpPescaMultiSPath.getNode());
            // tmpnodeView.setSelected(true);

        }
    }

    // view.redrawGraph(false, true);
}//GEN-LAST:event_sptableMouseClicked
    @Override
    public void update(Observable o, Object arg) {
    }

    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public CytoPanelName getCytoPanelName() {
        return CytoPanelName.EAST;
    }

    @Override
    public String getTitle() {
        return "PescaResult " + resulttype;
    }

    @Override
    public Icon getIcon() {
        return null;
    }

private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
}//GEN-LAST:event_jScrollPane1MouseClicked

private void orderNameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderNameButtonMouseClicked
// TODO add your handling code here:
    Vector nameVector = addElements(1);
    Collections.sort(nameVector);
    printresult(nameVector);
}//GEN-LAST:event_orderNameButtonMouseClicked

private void orderSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderSizeButtonActionPerformed
// TODO add your handling code here:
    Vector sizeVector = addElements(0);
    Collections.sort(sizeVector);
    printresult(sizeVector);
}//GEN-LAST:event_orderSizeButtonActionPerformed

private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
    pescacore.closeCurrentResultPanel(this);
    // TODO add your handling code here:
    /*CytoscapeDesktop desktop = Cytoscape.getDesktop();
     CytoPanel cytoPaneleast = desktop.getCytoPanel(SwingConstants.EAST);
     int index = cytoPaneleast.indexOfComponent(this);
     cytoPaneleast.remove(index);*/
}//GEN-LAST:event_closeButtonMouseClicked

private void selectedNodesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedNodesButtonActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_selectedNodesButtonActionPerformed

private void selectedNodesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedNodesButtonMouseClicked
    // TODO add your handling code here:
  //  System.out.println("ciao");
    Vector subvector = new Vector();
    Vector selectedvector = new Vector();
    String name;
    /*    List selectednodeslist = view.getSelectedNodes();
     for (int i=0; i<selectednodeslist.size();i++) {
     NodeView currentnodeView = (NodeView)selectednodeslist.get(i);
     CyNode currentnode = (CyNode)currentnodeView.getNode();
     System.out.println("nodocorrente = " + currentnode.getIdentifier());
     selectedvector.addElement(currentnode.getIdentifier());
     }*/
    Collections.sort(selectedvector);

    for (int j = 0; j < selectedvector.size(); j++) {
        for (int i = 0; i < provavector.size(); i++) {

            PescaShortestPathList resultelement = (PescaShortestPathList) provavector.elementAt(i);
            name = ((PescaMultiSPath) resultelement.getLast()).getName();
            if (name.equals((String) selectedvector.elementAt(j))) {
               // System.out.println("eccolo" + resultelement.toString());
                subvector.add(resultelement);
            }
        }
    }
    for (int i = 0; i < subvector.size(); i++) {
        PescaShortestPathList currentelement = (PescaShortestPathList) subvector.elementAt(i);
        for (int j = 0; j < currentelement.size(); j++) {
            System.out.println("accendo " + (((PescaMultiSPath) currentelement.get(j)).getName()));
            //    network.setSelectedNodeState( ((PescaMultiSPath)currentelement.get(j)).getNode(),true);
            //    view.redrawGraph(true, true);
        }
    }
}//GEN-LAST:event_selectedNodesButtonMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton orderNameButton;
    private javax.swing.JButton orderSizeButton;
    private javax.swing.JButton selectedNodesButton;
    private javax.swing.JTable sizetable;
    private javax.swing.JTable sptable;
    // End of variables declaration//GEN-END:variables

    public Vector addElements(int choosed) {
        Vector svector = new Vector();
        for (int i = 0; i < provavector.size(); i++) {
            if (choosed == 0) {
                Resultsbysize resultelement = new Resultsbysize((PescaShortestPathList) provavector.elementAt(i));
                svector.add(i, resultelement);
            } else {
                Resultsbyname resultelement = new Resultsbyname((PescaShortestPathList) provavector.elementAt(i));
                svector.add(i, resultelement);
            }
        }
        return svector;
    }

    public void printresult(final Vector data) {

        sptable.setModel(new javax.swing.table.AbstractTableModel() {
            public int getColumnCount() {
                return 3;
            }

            public int getRowCount() {
                return data.size();
            }

            public Object getValueAt(int rowIndex, int columnIndex) {
                if (columnIndex == 0) {
                    //      return (data.get(rowIndex));
                    return (((Results) data.get(rowIndex)).getSPlist());
                } else if (columnIndex == 1) {
                    //              return  ((PescaMultiSPath)(((PescaShortestPathList)data.get(rowIndex)).getLast())).getName();
                    return (((Results) data.get(rowIndex)).getName());
                } else {
                    //    return ( ((PescaShortestPathList)data.get(rowIndex)).size() );
                    return (((Results) data.get(rowIndex)).getSize() - 1);
                }


            }
        });
        // this.jProgressBar1.setIndeterminate(false);
//        jScrollPane2.setVisible(true);  
        // jButton1.setEnabled(true);
        sptable.getColumnModel().getColumn(0).setHeaderValue("Shortest Path");
        sptable.getColumnModel().getColumn(1).setHeaderValue("Target Node");
        sptable.getColumnModel().getColumn(2).setHeaderValue("size");
        sptable.setVisible(true);
        //  jLabel2.setVisible(true);
        // jLabel3.setVisible(true);
        // jLabel3.setText("Finished:");  
        // jLabel4.setText(data.size() + " nodes worked");  
        // jLabel2.setText("Source Node = " + source.getIdentifier() + " Results found: ");  
        // calculating = false;

    }

    public void showsizedistribution(PescaSPMap pescaSPmap) {

    final Vector data = pescaSPmap.MaptoVector();
  //  System.out.println(data.toString());
       
 


        sizetable.setModel(new javax.swing.table.AbstractTableModel() {
            @Override
            public int getColumnCount() {
                return 2;
            }

            @Override
            public int getRowCount() {
                return data.size();
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                if (columnIndex == 0) {
                    //      return (data.get(rowIndex));
                    return (((Map.Entry)data.get(rowIndex)).getKey());
                } else  {
                    //              return  ((PescaMultiSPath)(((PescaShortestPathList)data.get(rowIndex)).getLast())).getName();
                    return (((Map.Entry)data.get(rowIndex)).getValue());
                }


            }
        });

        sizetable.getColumnModel().getColumn(0).setHeaderValue("Size");
        sizetable.getColumnModel().getColumn(1).setHeaderValue("Number of Sp");
        sizetable.setVisible(true);


    }
}
