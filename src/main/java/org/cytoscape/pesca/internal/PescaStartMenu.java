package org.cytoscape.pesca.internal;


/*
 * PescaStartMenu.java
 *
 * Created on 13 novembre 2007, 13.37
 */
/**
 *
 * @author  scardoni
 */

//import cytoscape.CyNetwork;
//import cytoscape.view.CyNetworkView;
import java.awt.Component;
import java.util.List;
import javax.swing.*;
import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.application.swing.CySwingApplication;
import org.cytoscape.application.swing.CytoPanel;
import org.cytoscape.application.swing.CytoPanelComponent;
import org.cytoscape.application.swing.CytoPanelName;
import org.cytoscape.model.CyNetwork;
import org.cytoscape.model.CyNode;
import org.cytoscape.model.CyTableUtil;
import org.cytoscape.view.model.CyNetworkView;
//import utils.Centrality;

public class PescaStartMenu extends JPanel implements CytoPanelComponent {
    
    
    public CyNetworkView currentnetworkview;
    public CyNetwork currentnetwork;
    private int numberofcentralities = 4;
    private boolean calculating = false;
    private PescaAlgorithm Pescaalg; 
    private PescaCore pescacore;
    private PescaThreadEngine ThrEng;// = new PescaThreadEngine(Pescaalg);
    private boolean[] CheckedCentralities = new boolean[numberofcentralities];
    private boolean[] LoadedCentralities = new boolean[numberofcentralities];
    private CytoPanel cytopanelwest;
    private CytoPanel cytopaneleast;
    private double inizio;
    private double fine;
    private CyNetwork lastworkednetwork;
    private CyNetworkView lastworkedview;
    public CyApplicationManager cyApplicationManager;
    public CySwingApplication cytoscapeDesktopService;
    public CyActivator cyactivator;
    //  public Vector<Centrality> VectorResults = new Vector();

    /**
     * Creates new form PescaStartMenujLabel1
     */
    public PescaStartMenu(CyApplicationManager cyApplicationManager, CySwingApplication cytoscapeDesktopService, CyActivator cyactivator, PescaCore pescacore) {
        initComponents();
        buttonGroup1.add(spTreeRadioButton);
        buttonGroup1.add(spRadioButton);
        buttonGroup1.add(spClusterRadioButton);
        buttonGroup1.add(spIsolatednodesRadioButton);

        lastworkednetwork = null;
        lastworkedview = null;
       
        this.cyactivator = cyactivator;
        this.cyApplicationManager = cyactivator.getcyApplicationManager();
        this.cytoscapeDesktopService = cytoscapeDesktopService;
        this.pescacore = pescacore;
         Pescaalg = new PescaAlgorithm(pescacore);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        spHelpButton = new javax.swing.JButton();
        spTreeHelpButton = new javax.swing.JButton();
        spTreeRadioButton = new javax.swing.JRadioButton();
        spRadioButton = new javax.swing.JRadioButton();
        spClusterRadioButton = new javax.swing.JRadioButton();
        spClusterHelpButton = new javax.swing.JButton();
        spIsolatednodesRadioButton = new javax.swing.JRadioButton();
        spIsolatednodesHelpButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();
        StopButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        ExitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Shortest path options"));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        spHelpButton.setText("?");
        spHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spHelpButtonActionPerformed(evt);
            }
        });

        spTreeHelpButton.setText("?");
        spTreeHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spTreeHelpButtonActionPerformed(evt);
            }
        });

        spTreeRadioButton.setText("Multi Shortest Paths Tree");
        spTreeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spTreeRadioButtonActionPerformed(evt);
            }
        });

        spRadioButton.setText("Multi Shortest Paths");
        spRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spRadioButtonActionPerformed(evt);
            }
        });

        spClusterRadioButton.setText("S-P Cluster");
        spClusterRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spClusterRadioButtonActionPerformed(evt);
            }
        });

        spClusterHelpButton.setText("?");
        spClusterHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spClusterHelpButtonActionPerformed(evt);
            }
        });

        spIsolatednodesRadioButton.setText("Connect isolated nodes");
        spIsolatednodesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spIsolatednodesRadioButtonActionPerformed(evt);
            }
        });

        spIsolatednodesHelpButton.setText("?");
        spIsolatednodesHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spIsolatednodesHelpButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(spTreeRadioButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .add(5, 5, 5))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(spIsolatednodesRadioButton)
                            .add(spClusterRadioButton)
                            .add(spRadioButton)
                            .add(spHelpButton)
                            .add(spTreeHelpButton)
                            .add(spClusterHelpButton)
                            .add(spIsolatednodesHelpButton))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(spTreeRadioButton)
                .add(16, 16, 16)
                .add(spTreeHelpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(spRadioButton)
                .add(15, 15, 15)
                .add(spHelpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(spClusterRadioButton)
                .add(17, 17, 17)
                .add(spClusterHelpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(spIsolatednodesRadioButton)
                .add(18, 18, 18)
                .add(spIsolatednodesHelpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        StartButton.setText("Start");
        StartButton.setEnabled(false);
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        StopButton.setText("Stop");
        StopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Click Start to calculate");

        jSeparator1.setForeground(java.awt.Color.gray);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jSeparator1))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(StartButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(StopButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(ExitButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ExitButton)
                    .add(StopButton)
                    .add(StartButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Pesca Menu");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(jLabel2))
                    .add(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(93, 93, 93))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(538, 538, 538))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Shortest paths options");

        jScrollPane1.setViewportView(jPanel5);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 541, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //  }

    
    
    
   
    
    private void spTreeHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spTreeHelpButtonActionPerformed
        // TODO add your handling code here:
   /*     PescaHelp help = new PescaHelp();
        help.setText(0);
        help.setVisible(true);*/
    }//GEN-LAST:event_spTreeHelpButtonActionPerformed

    private void spHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spHelpButtonActionPerformed
        // TODO add your handling code here:
        /*PescaHelp help = new PescaHelp();
        help.setText(1);
        help.setVisible(true);*/
    }//GEN-LAST:event_spHelpButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // call stop

        // CyNetworkView view = Cytoscape.getCurrentNetworkView();

       Object[] options = {"YES", "NO"};
        int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Pesca",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (answer == 0) {
            if (calculating) {
                if (ThrEng.isAlive()) {
                    ThrEng.endprogram();
                }
                stopcalculus();
            }

            closePesca();
          

        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopButtonActionPerformed
        // TODO add your handling code here:
        if (calculating) {
            if (ThrEng.isAlive()) {
                ThrEng.endprogram();
            }
            stopcalculus();
        }
    }//GEN-LAST:event_StopButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
       System.out.println("No network");
       currentnetworkview = cyApplicationManager.getCurrentNetworkView();
        if (currentnetworkview == null               ) {
            System.out.println("No network1");
            JOptionPane.showMessageDialog(this.cytoscapeDesktopService.getJFrame(),
                    "No network selected!", "Pesca", JOptionPane.WARNING_MESSAGE);
        return;
        }
        else
       currentnetworkview = cyApplicationManager.getCurrentNetworkView();
       CyNetwork currentnetwork = currentnetworkview.getModel();
       String currentnetworkname = currentnetwork.getRow(currentnetwork).get("name", String.class);
   //    System.out.println("la network selected e' " + currentnetwork.getTable(CyNode.class, currentnetworkname).toString());
        System.out.println("la network e' " + currentnetworkname);
        if (currentnetwork.getNodeList().isEmpty()) {
            System.out.println("No network2");
            JOptionPane.showMessageDialog(this.cytoscapeDesktopService.getJFrame(),
                    "No network selected!", "Pesca", JOptionPane.WARNING_MESSAGE);
        } else {
            
            CyNode node = (CyNode)currentnetworkview.getModel().getNodeList().get(1);
            
       //     System.out.println("yes network" + node.toString() + " hhh" + currentnetworkview.getModel().getNodeList().toString());
//System.out.println("yes network" + currentnetwork.getRow(node).get("name",String.class));
List<CyNode> nodes = CyTableUtil.getNodesInState(currentnetwork,"selected",true);
//System.out.println("yes network" + nodes.toString()); 

            int answer = 0;
            if (iscurrentnetworkchanged()) {
                System.out.println("network changed");
                Object[] options = {"Start computation", "Abort computation"};
                answer =      
                        JOptionPane.showOptionDialog(
                        this.cytoscapeDesktopService.getJFrame()
                    ,
                        "Attention! You have changed the current network. ",
                        //+
                        // "Starting a new computation you will\n" +
                        // "loose all the previous network attributes. " +
                        // "Save them before proceeding.", 
                        "Pesca",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);

            } else {
                System.out.println("network not changed");
            }

            if (answer == 0) {
                changelastworkednetwork(currentnetwork, currentnetworkview);
                inizio = System.currentTimeMillis();
                System.out.println("start time =" + inizio);
                this.setEnabled(false);
                // verify Checkbox
                CheckedCentralities[0] = spTreeRadioButton.isSelected();
                CheckedCentralities[1] = spRadioButton.isSelected();
                CheckedCentralities[2] = spClusterRadioButton.isSelected();
                CheckedCentralities[3] = spIsolatednodesRadioButton.isSelected();
                int secondanswer = 0;
            

                Pescaalg.setChecked(CheckedCentralities);

                if (secondanswer == 0) {
                    CyNetworkView view = currentnetworkview;//Cytoscape.getCurrentNetworkView();
                    List<CyNode> lista = CyTableUtil.getNodesInState(currentnetwork,"selected",true);
                            //view.getSelectedNodes();
                    if (CheckedCentralities[0]) {
                        if (lista.size() == 1) {
                            calculatingresult();
                            ThrEng = new PescaThreadEngine(Pescaalg, currentnetwork, currentnetworkview);
                            ThrEng.setCaller(this);
                            ThrEng.start();

                        } else {
                            JOptionPane.showMessageDialog(this.cytoscapeDesktopService.getJFrame(),
                                    //view.getComponent(),
                                    "Please select one node to start computation");
                        }

                    }
                    if (CheckedCentralities[1]) {
                        if (lista.size() == 2) {
                            calculatingresult();
                            ThrEng = new PescaThreadEngine(Pescaalg, currentnetwork, currentnetworkview);
                            ThrEng.setCaller(this);
                            ThrEng.start();
                        } else {
                            JOptionPane.showMessageDialog(this.cytoscapeDesktopService.getJFrame(),
                                  //  view.getComponent(),
                                    "Please select source and target nodes to start computation");
                        }

                    }

                    if (CheckedCentralities[2]) {
                        if (lista.size() >= 2) {
                            calculatingresult();
                            ThrEng = new PescaThreadEngine(Pescaalg, currentnetwork, currentnetworkview);
                            ThrEng.setCaller(this);
                            ThrEng.start();
                        } else {
                            JOptionPane.showMessageDialog(this.cytoscapeDesktopService.getJFrame(),
                                    //view.getComponent(),
                                    "Please select two or more nodes");
                        }
                    }

                    if (CheckedCentralities[3]) {
                        if (lista.size() >= 1) {
                            calculatingresult();
                            ThrEng = new PescaThreadEngine(Pescaalg, currentnetwork, currentnetworkview);
                            ThrEng.setCaller(this);
                            ThrEng.start();
                        } else {
                            JOptionPane.showMessageDialog(this.cytoscapeDesktopService.getJFrame(),
                                   // view.getComponent(),
                                    "Please select one or more nodes");
                        }
                    }

                    
                    this.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_StartButtonActionPerformed

private void spTreeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spTreeRadioButtonActionPerformed
    verifyselection();// TODO add your handling code here:
}//GEN-LAST:event_spTreeRadioButtonActionPerformed

private void spRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spRadioButtonActionPerformed
    verifyselection(); //TODO add your handling code here:
}//GEN-LAST:event_spRadioButtonActionPerformed

private void spClusterHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spClusterHelpButtonActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_spClusterHelpButtonActionPerformed

private void spClusterRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spClusterRadioButtonActionPerformed
    // TODO add your handling code here:
    verifyselection();
}//GEN-LAST:event_spClusterRadioButtonActionPerformed

private void spIsolatednodesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spIsolatednodesRadioButtonActionPerformed
    // TODO add your handling code here:
     verifyselection();
}//GEN-LAST:event_spIsolatednodesRadioButtonActionPerformed

private void spIsolatednodesHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spIsolatednodesHelpButtonActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_spIsolatednodesHelpButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton StopButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton spClusterHelpButton;
    private javax.swing.JRadioButton spClusterRadioButton;
    private javax.swing.JButton spHelpButton;
    private javax.swing.JButton spIsolatednodesHelpButton;
    private javax.swing.JRadioButton spIsolatednodesRadioButton;
    private javax.swing.JRadioButton spRadioButton;
    private javax.swing.JButton spTreeHelpButton;
    private javax.swing.JRadioButton spTreeRadioButton;
    // End of variables declaration//GEN-END:variables

    public void endcalculus(int totalnodecount) {

        this.jProgressBar1.setIndeterminate(false);
        jLabel1.setText("Finished: " + totalnodecount + " nodes worked");
        StartButton.setEnabled(true);
        calculating = false;
        StartButton.setEnabled(true);
        fine = System.currentTimeMillis();
        System.out.println("end time =" + fine + ", execution time (millis) = " + (fine - inizio));

    }

    public void stopcalculus() {
        this.jProgressBar1.setIndeterminate(false);
        jLabel1.setText("Interrupted by user, click start to repeat");
        //StartButton.setEnabled(true);
        calculating = false;
        StartButton.setEnabled(true);
    }

    public void calculatingresult() {

        calculating = true;
        jProgressBar1.setIndeterminate(true);
        jProgressBar1.setVisible(true);
        jLabel1.setText("Calculating...");
        StartButton.setEnabled(false);

    }

    public void updatenodecounting(int nodeworked, int totalnodecount) {

        jLabel1.setText("Working: node " + nodeworked + " of " + totalnodecount);


    }

    public void closePesca() {

       pescacore.closePescavisualizer();
       pescacore.closePescaStartMenu();
      

    }

/*    public void removeattributes() {
        CyAttributes currentNodeAttributes = Cytoscape.getNodeAttributes();
        CyAttributes currentNetworkAttributes = Cytoscape.getNetworkAttributes();
        String currentnetworkid = Cytoscape.getCurrentNetwork().getIdentifier();

        if (CheckedCentralities[0] || LoadedCentralities[0]) {

            currentNetworkAttributes.deleteAttribute("Pesca Diameter");
        }



        if (CheckedCentralities[1] || LoadedCentralities[1]) {

            currentNetworkAttributes.deleteAttribute("Pesca Average Distance");
        }


        if (CheckedCentralities[2] || LoadedCentralities[2]) {

            currentNodeAttributes.deleteAttribute("Pesca Node degree");

            currentNetworkAttributes.deleteAttribute("Pesca degree Max value");
            currentNetworkAttributes.deleteAttribute("Pesca degree min value");
            currentNetworkAttributes.deleteAttribute("Pesca degree mean value");


        }
      
        for (int i = 0; i < numberofcentralities; i++) {
            LoadedCentralities[i] = false;



        }

    }

    public void hideattributes() {

        CyAttributes currentNodeAttributes = Cytoscape.getNodeAttributes();
        CyAttributes currentNetworkAttributes = Cytoscape.getNetworkAttributes();

        //if (CheckedCentralities[0]) {

        //    currentNetworkAttributes.setUserVisible("Pesca Diameter",false);
        System.out.println("hiding diameter");
        //}

        CytoscapeDesktop desktop = Cytoscape.getDesktop();
        CytoPanel cytoPanelsouth = desktop.getCytoPanel(SwingConstants.SOUTH);
        cytoPanelsouth.setState(CytoPanelState.HIDE);
        cytoPanelsouth.setState(CytoPanelState.DOCK);
        System.out.println("hiding attributes");
     
    }

    public void enableStart() {
        StartButton.setEnabled(true);
    }*/

    public void changelastworkednetwork(CyNetwork newnetwork, CyNetworkView newview) {
        lastworkednetwork = newnetwork;
        lastworkedview = newview;
    }
/*
    public CyNetworkView getlastworkedview() {
        return lastworkedview;
    }*/

    public boolean iscurrentnetworkchanged() {

     /*   if (lastworkedview == null) {
            return false;
        } else if (lastworkedview.getNodeViewCount() == 0) {
            return false;
        } else {
            return !lastworkedview.getTitle().equals(Cytoscape.getCurrentNetworkView().getTitle());
        }*/
        // da eliminare quando tolgo i commenti sopra
        return false;
    }
/*
    public String verifyloadedattributes(boolean[] selectedCentralities) {

        boolean[] loadedCentralities = new boolean[numberofcentralities];
        int loadedcentralities = 0;
        String stringcentralities = "";
        CyAttributes currentNetworkAttributes = Cytoscape.getNetworkAttributes();



        loadedCentralities[0] = currentNetworkAttributes.hasAttribute(Cytoscape.getCurrentNetwork().getIdentifier(), "Pesca Diameter");
        loadedCentralities[1] = currentNetworkAttributes.hasAttribute(Cytoscape.getCurrentNetwork().getIdentifier(), "Pesca Average Distance");
       

        for (int i = 0; i < numberofcentralities; i++) {
            if (selectedCentralities[i] & loadedCentralities[i]) {
                loadedcentralities++;
                switch (i) {
                    case 0:
                        stringcentralities = stringcentralities + "Diameter, ";
                        break;
                    case 1:

                        stringcentralities = stringcentralities + "Average Distance, ";
                        break;
                    case 2:
                        stringcentralities = stringcentralities + "Degree, ";
                        break;
                    case 3:
                        stringcentralities = stringcentralities + "Eccentricity, ";
                        break;
                    case 4:
                        stringcentralities = stringcentralities + "Radiality, ";
                        break;
                    case 5:
                        stringcentralities = stringcentralities + "Closeness, ";
                        break;
                    case 6:
                        stringcentralities = stringcentralities + "Stress, ";
                        break;
                    case 7:
                        stringcentralities = stringcentralities + "Betweenness, ";
                        break;
                    case 8:
                        stringcentralities = stringcentralities + "Centroid value, ";
                        break;
                }
            }
        }

        if (loadedcentralities == 1) {
            stringcentralities = stringcentralities.substring(0, stringcentralities.length() - 2) + " is ";
        } else if (loadedcentralities > 1) {
            stringcentralities = stringcentralities.substring(0, stringcentralities.length() - 2);
            stringcentralities = stringcentralities.substring(0, stringcentralities.lastIndexOf(',')) + " and" + stringcentralities.substring(stringcentralities.lastIndexOf(',') + 1) + " are ";
        } else {
            stringcentralities = null;
        }
        return stringcentralities;
    }

    public boolean isalreadyloaded(String centralitiestring) {

        CyAttributes currentNodeAttributes = Cytoscape.getNodeAttributes();
        String[] attributesarray = currentNodeAttributes.getAttributeNames();
        boolean result = false;
        for (int i = 0; i < attributesarray.length; i++) {
            if (centralitiestring.equals(attributesarray[i])) {
                result = true;
                return result;
            }
        }
        return result;
    }*/

    public void verifyselection() {
        if (spTreeRadioButton.isSelected() || spRadioButton.isSelected() 
                || spClusterRadioButton.isSelected() || spIsolatednodesRadioButton.isSelected()) {

       


            StartButton.setEnabled(true);
        } else {
            StartButton.setEnabled(false);
        }
    }
    
    public Component getComponent() {
		return this;
	}


	public CytoPanelName getCytoPanelName() {
		return CytoPanelName.WEST;
	}


	public String getTitle() {
		return "MyPanel";
	}


	public Icon getIcon() {
		return null;
	}
}
