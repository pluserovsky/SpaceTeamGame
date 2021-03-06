/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crew;

import java.util.Objects;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import server.ServerInterface;

/**
 *
 * @author Luk
 */
public class CrewGui extends javax.swing.JFrame {

    /**
     * Creates new form CrewGui
     */
    int id;
    String name;
    int score = 0;

    public int getScore() {
        return score;
    }

    public void setInputPowerStatus(boolean inputPowerStatus) {
        this.inputPowerStatus = inputPowerStatus;
    }

    public void setCommandTextArea(String commandText) {
        commandTextArea.setText(commandText);
    }

    public void setInputPowerLevelStatus(int inputPowerLevelStatus) {
        this.inputPowerLevelStatus = inputPowerLevelStatus;
    }

    public void setInputEngineStatus(boolean inputEngineStatus) {
        this.inputEngineStatus = inputEngineStatus;
    }

    public void setInputCoolingStatus(boolean inputCoolingStatus) {
        this.inputCoolingStatus = inputCoolingStatus;
    }

    public void setInputTurboStatus(boolean inputTurboStatus) {
        this.inputTurboStatus = inputTurboStatus;
    }
    boolean inputPowerStatus = false;
    int inputPowerLevelStatus = 0;
    boolean inputEngineStatus = false;
    boolean inputCoolingStatus = false;
    boolean inputTurboStatus = false;

    public CrewGui(String name, int id) {
        this.id = id;
        this.name = name;
        initComponents();
        this.setTitle("Crew member nr " + id + ": " + name);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        runButton = new javax.swing.JButton();
        powerOnRadioButton = new javax.swing.JRadioButton();
        powerOffRadioButton = new javax.swing.JRadioButton();
        powerLevelSlider = new javax.swing.JSlider();
        engineCheckBox = new javax.swing.JCheckBox();
        coolingCheckBox = new javax.swing.JCheckBox();
        turboCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        commandTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        runButton.setText("Run system!");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        powerOnRadioButton.setText("On");

        powerOffRadioButton.setText("Off");

        powerLevelSlider.setMaximum(3);
        powerLevelSlider.setToolTipText("");
        powerLevelSlider.setValue(0);

        engineCheckBox.setText("Engine");

        coolingCheckBox.setText("Cooling");

        turboCheckBox.setText("Turbo");

        commandTextArea.setColumns(20);
        commandTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        commandTextArea.setLineWrap(true);
        commandTextArea.setRows(5);
        jScrollPane1.setViewportView(commandTextArea);

        jLabel1.setText("Command from Captain:");

        jLabel2.setText("Power:");

        jLabel3.setText("Power level:");

        jLabel5.setText("Your score:");

        scoreLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(powerLevelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(powerOnRadioButton)
                                    .addComponent(powerOffRadioButton))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coolingCheckBox)
                            .addComponent(engineCheckBox)
                            .addComponent(turboCheckBox))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(runButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(scoreLabel)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(engineCheckBox)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coolingCheckBox)
                            .addComponent(powerOnRadioButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(powerLevelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turboCheckBox)
                    .addComponent(powerOffRadioButton))
                .addGap(18, 18, 18)
                .addComponent(runButton)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(scoreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        if (powerOnRadioButton.isSelected() == inputPowerStatus) {
            score++;
        }
        if (powerLevelSlider.getValue() == inputPowerLevelStatus) {
            score++;
        }
        if (engineCheckBox.isSelected() == inputEngineStatus) {
            score++;
        }
        if (coolingCheckBox.isSelected() == inputCoolingStatus) {
            score++;
        }
        if (turboCheckBox.isSelected() == inputTurboStatus) {
            score++;
        }
        scoreLabel.setText(Integer.toString(score));
    }//GEN-LAST:event_runButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrewGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
        String url = "rmi://localhost/";

        try {
            Context context = new InitialContext();
            ServerInterface gameServer = (ServerInterface) context.lookup(url + "GameServer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayersName() {
        return name;
    }

    public void setPlayersName(String name) {
        this.name = name;
    }

    public boolean isSwitch1Selected() {
        return powerOnRadioButton.isSelected();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea commandTextArea;
    private javax.swing.JCheckBox coolingCheckBox;
    private javax.swing.JCheckBox engineCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider powerLevelSlider;
    private javax.swing.JRadioButton powerOffRadioButton;
    private javax.swing.JRadioButton powerOnRadioButton;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JCheckBox turboCheckBox;
    // End of variables declaration//GEN-END:variables
}
