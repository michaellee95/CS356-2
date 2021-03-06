/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
/**
 *
 * @author Michael
 */
public class AdminControlPanel extends javax.swing.JFrame {

    private static AdminControlPanel acp = null;
    private UserController userController = new UserController();
    private Updator updator = new Updator();
    private UserCounter userCounter = new UserCounter();
    private GroupCounter groupCounter = new GroupCounter();
    private MessageCounter messageCounter = new MessageCounter();
    private PositiveCounter positiveCounter = new PositiveCounter();    
    private String userName;
    private String groupName;
    private String lastUpdatedUser = null;
    private boolean isUnique = true;
    
    /**
     * Creates new form AdminControlPanel
     */
    //admin control panel constructor
    private AdminControlPanel() {
        //set look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        initComponents();
        String treeView = "<html><u>Tree View</u></html>";
        treeViewLabel.setText(treeView);
        this.setTitle("Admin Control Panel");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    //Use singleton pattern. Insure there's only one object of type admincontrolpanel
    public static AdminControlPanel getInstance(){
        if (acp == null){
            synchronized(AdminControlPanel.class){
                if (acp == null){
                    acp = new AdminControlPanel();
                }
            }
        }
        return acp;
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
        treeViewLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userListTree = new javax.swing.JTree();
        addUserButton = new javax.swing.JButton();
        addGroupButton = new javax.swing.JButton();
        userInfoButton = new javax.swing.JButton();
        messageTotalButton = new javax.swing.JButton();
        groupTotalButton = new javax.swing.JButton();
        positiveButton = new javax.swing.JButton();
        userTotalButton = new javax.swing.JButton();
        userNameInputField = new javax.swing.JTextField();
        groupNameInputField = new javax.swing.JTextField();
        userVerificationButton = new javax.swing.JButton();
        lastUserUpdatedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        treeViewLabel.setText("Tree View");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        userListTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        DefaultTreeModel model = (DefaultTreeModel)userListTree.getModel();
        model.setAsksAllowsChildren(true);
        userController.addGroup("Root");
        updator.visit(groupCounter);
        jScrollPane3.setViewportView(userListTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(treeViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treeViewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        addGroupButton.setText("Add Group");
        addGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupButtonActionPerformed(evt);
            }
        });

        userInfoButton.setText("Open User View");
        userInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInfoButtonActionPerformed(evt);
            }
        });

        messageTotalButton.setText("Message Total");
        messageTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTotalButtonActionPerformed(evt);
            }
        });

        groupTotalButton.setText("Group Total");
        groupTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupTotalButtonActionPerformed(evt);
            }
        });

        positiveButton.setText("Positive Percentage");
        positiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positiveButtonActionPerformed(evt);
            }
        });

        userTotalButton.setText("User Total");
        userTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTotalButtonActionPerformed(evt);
            }
        });

        userNameInputField.setText("Input User Name");
        userNameInputField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                userNameInputField.setText("");
            }
        });

        groupNameInputField.setText("Input Group Name");
        groupNameInputField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                groupNameInputField.setText("");
            }
        });

        userVerificationButton.setText("User Verification");
        userVerificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userVerificationButtonActionPerformed(evt);
            }
        });

        lastUserUpdatedButton.setText("Last User Updated");
        lastUserUpdatedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastUserUpdatedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(positiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userInfoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userNameInputField)
                                .addComponent(groupNameInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addGroupButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(userVerificationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(groupTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lastUserUpdatedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(userNameInputField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(groupNameInputField))
                        .addGap(18, 18, 18)
                        .addComponent(userInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userVerificationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(lastUserUpdatedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        positiveButton.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Code for what happens when user clicks add user button
    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        //Check what group user clicked on
        DefaultTreeModel model = (DefaultTreeModel)userListTree.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) userListTree.getLastSelectedPathComponent();
        
        //If user did not click any group set default group to root
        if (selectedNode == null)
            selectedNode =  (DefaultMutableTreeNode)model.getRoot();  
        
        //Or if user clicked on user, set group to root as users cannot have children
        if(!selectedNode.getAllowsChildren()){
            selectedNode =  (DefaultMutableTreeNode)model.getRoot();  
        }
        
        /*Check what user input into user text field
        If empty don't do anything. If user text field contains user name that already exist
        Show a popup error box. Else create new user and add into user group and reload panel
        Also update user controller to inform creation of new user and call updator to update user counter
        */
        userName = userNameInputField.getText();
        if (!userName.equals("")){
            if (userController.checkUser(userName)){
                DefaultMutableTreeNode newUser = new DefaultMutableTreeNode(userName, false); 
                model.insertNodeInto(newUser, selectedNode, selectedNode.getChildCount());
                model.reload(); 
                userController.addUser(userName, selectedNode.getUserObject());
                updator.visit(userCounter);
                userListTree.scrollPathToVisible(new TreePath(newUser.getPath()));
            }
            else{
                JOptionPane.showMessageDialog(this, "User name already taken.", "Invalid user name.", JOptionPane.WARNING_MESSAGE);
            }                
        }
    }//GEN-LAST:event_addUserButtonActionPerformed

    //Code for add group button
    private void addGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupButtonActionPerformed
        //Check what group user clicked on
        DefaultTreeModel model = (DefaultTreeModel)userListTree.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) userListTree.getLastSelectedPathComponent();
        
        //If user did not click any group set default group to root
        if (selectedNode == null)
            selectedNode =  (DefaultMutableTreeNode)model.getRoot();    
        
        //OR if user clicked on user, set group to root as users cannot have children
        if(!selectedNode.getAllowsChildren()){
            selectedNode =  (DefaultMutableTreeNode)model.getRoot();  
        }        
        
        /*Check what user input into group text field
        If empty don't do anything. If group text field contains group name that already exist
        Show a popup error box. Else create new group and add into user group and reload panel
        Also update user controller to inform creation of new group and call updator to update group counter
        */        
        groupName = groupNameInputField.getText();
        if(!groupName.equals("")){         
            if (userController.checkGroup(groupName)){
                DefaultMutableTreeNode newGroup = new DefaultMutableTreeNode(groupName, true);
                model.insertNodeInto(newGroup, selectedNode, selectedNode.getChildCount());  
                model.reload();  
                userController.addGroup(groupName, selectedNode.getUserObject());
                updator.visit(groupCounter);
                userListTree.scrollPathToVisible(new TreePath(newGroup.getPath()));   
            }
            else{
                JOptionPane.showMessageDialog(this, "Group name already taken.", "Invalid group name.", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_addGroupButtonActionPerformed

    //When user clicks on message total button show popup box that show how many tweets were posted
    private void messageTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTotalButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Total Message Count: " + messageCounter.getCounter(), "Message Counter.", JOptionPane.PLAIN_MESSAGE);        
    }//GEN-LAST:event_messageTotalButtonActionPerformed

    //When user clicks on group total button show popup box that show how many groups exist
    private void groupTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupTotalButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Total Group Count: " + groupCounter.getCounter(), "Group Counter.", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_groupTotalButtonActionPerformed

    //When user clicks on positive percentage button show popup box that show how many tweets contain positive words
    private void positiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positiveButtonActionPerformed
        double positivePercentage = (double)positiveCounter.getCounter()/(double)messageCounter.getCounter() * 100;
        JOptionPane.showMessageDialog(this, "Positive Message Percentage: " + String.format("%.2f", positivePercentage) + "%",
                                        "Positive Message Counter.", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_positiveButtonActionPerformed

    //When user clicks on user total button show popup box that show how many users exist
    private void userTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTotalButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Total User Count: " + userCounter.getCounter(), "User Counter.", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_userTotalButtonActionPerformed

    //Code for what hapepns when open user view button is clicked
    private void userInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInfoButtonActionPerformed
        //Check what user, user clicked on        
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) userListTree.getLastSelectedPathComponent();
        
        //If user did not click on aything or clicked on a group show error box
        if (selectedNode == null || selectedNode.getAllowsChildren())
            JOptionPane.showMessageDialog(this, "Select User", "Error", JOptionPane.WARNING_MESSAGE);
        
        //Else create a new userInfo panel and pass selected user into it
        else{
           User user = userController.getUser(selectedNode.getUserObject());
           UserInfo userInfoPanel = new UserInfo(user, userController, updator, messageCounter, positiveCounter);
           userInfoPanel.setVisible(true);
        }
    }//GEN-LAST:event_userInfoButtonActionPerformed

    //code for what happens when user verification button is clicked
    private void userVerificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userVerificationButtonActionPerformed
        //Call User Controller class and check if all user and group is unique
        isUnique = userController.isUnique();
        if(isUnique)
            JOptionPane.showMessageDialog(this, "All Users and Groups are Valid", "Valid", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Not All Users and Groups are Valid", "Invalid", JOptionPane.PLAIN_MESSAGE);            
    }//GEN-LAST:event_userVerificationButtonActionPerformed

    //code for what happens when last user updated button is clicked
    private void lastUserUpdatedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastUserUpdatedButtonActionPerformed
        if (lastUpdatedUser == null)
            JOptionPane.showMessageDialog(this, "Last Updated User Does Not Exist", "Last Updated User", JOptionPane.PLAIN_MESSAGE);            
        else
            JOptionPane.showMessageDialog(this, "Last Updated User is: " + lastUpdatedUser, "Last Updated User", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_lastUserUpdatedButtonActionPerformed

    public void setLastUpdatedUser(UserComponent lastUpdatedUser){
        this.lastUpdatedUser = lastUpdatedUser.getName();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroupButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JTextField groupNameInputField;
    private javax.swing.JButton groupTotalButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton lastUserUpdatedButton;
    private javax.swing.JButton messageTotalButton;
    private javax.swing.JButton positiveButton;
    private javax.swing.JLabel treeViewLabel;
    private javax.swing.JButton userInfoButton;
    private javax.swing.JTree userListTree;
    private javax.swing.JTextField userNameInputField;
    private javax.swing.JButton userTotalButton;
    private javax.swing.JButton userVerificationButton;
    // End of variables declaration//GEN-END:variables
}