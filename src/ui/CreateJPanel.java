package ui;

import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Directory;
import model.EmployeeDetails;


/**
 *
 * @author jurreyyahfirdawsmohammad
 */
public class CreateJPanel extends javax.swing.JPanel {

    
    Directory directory;
    EmployeeDetails details;

    /**
     * Creates new form CreateJPanel
     */
    int flag=0;
    public CreateJPanel(EmployeeDetails details, Directory directory) {
        initComponents();
        this.details = details;
        this.directory = directory;
        
    }
     private Boolean checkBlankInput()
    {
        if(txtName.getText().length()==0||txtAge.getText().length()==0||txtEID.getText().length()==0||grpr.getButtonCount()==0||txtStartDate.getText().length()==0||txtLevel.getText().length()==0||txtTI.getText().length()==0||txtPositionTitle.getText().length()==0||txtPhone.getText().length()==0||txtEmailID.getText().length()==0)
                
        {
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpr = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblTI = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        txtTI = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        mEmailAdd = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        rMale = new javax.swing.JRadioButton();
        rFemale = new javax.swing.JRadioButton();
        rOthers = new javax.swing.JRadioButton();

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("   Create  Profile ");

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name");

        lblEID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEID.setText("Employee ID");

        lblAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age");

        lblGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGender.setText("Gender");

        lblStartDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStartDate.setText("Start Date ");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtEmailID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });
        txtEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailIDKeyReleased(evt);
            }
        });

        txtStartDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        lblLevel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLevel.setText("Level");

        lblTI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTI.setText("Team Info ");

        txtLevel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        txtTI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTIActionPerformed(evt);
            }
        });

        lblPositionTitle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPositionTitle.setText("Position Title ");

        txtPositionTitle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblContact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContact.setText("Contact Info");

        lblPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhone.setText("Contact Number");

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lblEmailID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmailID.setText("Email Address");

        lblPhoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoto.setText("Photo");

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpload.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnUpload.setText("Upload Image");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        lblImage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        grpr.add(rMale);
        rMale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rMale.setText("Male");
        rMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMaleActionPerformed(evt);
            }
        });

        grpr.add(rFemale);
        rFemale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rFemale.setText("Female");
        rFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemaleActionPerformed(evt);
            }
        });

        grpr.add(rOthers);
        rOthers.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rOthers.setText("Others");
        rOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rOthersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailID)
                            .addComponent(lblPhoto)
                            .addComponent(lblLevel)
                            .addComponent(lblTI)
                            .addComponent(lblPositionTitle)
                            .addComponent(lblContact)
                            .addComponent(lblName)
                            .addComponent(lblEID)
                            .addComponent(lblAge)
                            .addComponent(lblGender)
                            .addComponent(lblStartDate)
                            .addComponent(lblPhone))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTI, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rMale)
                                                .addGap(28, 28, 28)
                                                .addComponent(rFemale)
                                                .addGap(17, 17, 17)
                                                .addComponent(rOthers))))
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(379, 379, 379)
                                .addComponent(btnUpload)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(mEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblContact, lblEID, lblEmailID, lblGender, lblLevel, lblName, lblPhone, lblPhoto, lblPositionTitle, lblStartDate, lblTI});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(mEmailAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(lblStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(lblLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(lblTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPositionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rMale)
                                    .addComponent(rFemale)
                                    .addComponent(rOthers))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto)
                    .addComponent(btnUpload))
                .addGap(39, 39, 39)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTIActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String lenCheck;
        lenCheck=txtName.getText().trim();
        if((!lenCheck.isEmpty() && lenCheck.length()>0  &&  lenCheck.chars().allMatch(Character::isLetter)))
            directory.setName(txtName.getText());
            else{
             JOptionPane.showMessageDialog(this,"Invalid Name");
             return;
        }
        
        lenCheck=txtEID.getText().trim();
        if(!lenCheck.isEmpty()  &&  (lenCheck.chars().allMatch(Character::isDigit) ) && lenCheck.length()>=1 && lenCheck.length()<=10)
            directory.setEmployeeID(Integer.parseInt(txtEID.getText()));
        else{
             JOptionPane.showMessageDialog(this,"Invalid Employee ID");
             return;           
        }
        
        lenCheck=txtAge.getText().trim();
        if(!lenCheck.isEmpty()  &&  (lenCheck.chars().allMatch(Character::isDigit) ) && lenCheck.length()>=0 && lenCheck.length()<=120 )
            directory.setAge(Integer.parseInt(txtAge.getText()));
        else{
             JOptionPane.showMessageDialog(this,"Invalid Age");
             return;
        }
         
        lenCheck=txtLevel.getText().trim();
        if((!lenCheck.isEmpty() && lenCheck.length()>=2  &&  lenCheck.chars().allMatch(Character::isLetter)))
            directory.setLevel(txtLevel.getText());
            else{
             JOptionPane.showMessageDialog(this,"Invalid Level");
             return;
        }
        
        lenCheck=txtTI.getText().trim();
        if((!lenCheck.isEmpty() && lenCheck.length()>=2  &&  lenCheck.chars().allMatch(Character::isLetter)))
            directory.setLevel(txtTI.getText());
            else{
             JOptionPane.showMessageDialog(this,"Invalid Team Info");
             return;
        }
        
        lenCheck=txtPositionTitle.getText().trim();
        if((!lenCheck.isEmpty() && lenCheck.length()>=2  &&  lenCheck.chars().allMatch(Character::isLetter)))
            directory.setPositionTitle(txtPositionTitle.getText());
            else{
             JOptionPane.showMessageDialog(this,"Invalid Position Title");
             return;
        }

       
        lenCheck=txtPhone.getText().trim();
        if(!lenCheck.isEmpty()&& lenCheck.charAt(0)!='0' && lenCheck.length()==10  &&  lenCheck.chars().allMatch(Character::isDigit))
            directory.setPhone(txtPhone.getText());
        else{
             JOptionPane.showMessageDialog(this,"Invalid Mobile Number");
             return;
        }
        
        String Email=txtEmailID.getText().trim();
        if(checkEmail(Email))
            directory.setEmail(txtEmailID.getText());
        else{
            JOptionPane.showMessageDialog(this,"Invalid Email");
                return;
            }  
        
         
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        if(checkBlankInput()){
        String Name = txtName.getText();
        String EmployeeID = txtEID.getText();
        String Age = txtAge.getText();
        String Gender;
        if(rMale.isSelected()){
            Gender="Male";
        }else if(rFemale.isSelected()){
            Gender="Female";
        }else{
            Gender="Others";
        }
        String StartDate = txtStartDate.getText();
        String Level = txtLevel.getText();
        String TeamInfo = txtTI.getText();
        String PositionTitle = txtPositionTitle.getText();
        String Phone = txtPhone.getText();
        String email = txtEmailID.getText();


        
        Directory dir = details.addnewemployees();
        
        dir.setName(Name);
        dir.setEmployeeID(Integer.valueOf(EmployeeID));
        dir.setAge(Integer.valueOf(Age));
        dir.setGender(Gender);
        dir.setStartDate(new Date());
        dir.setLevel(Level);
        dir.setTeamInfo(TeamInfo);
        dir.setPositionTitle(PositionTitle);
        dir.setPhone(Phone);
        dir.setEmail(email);
        
        
        
        JOptionPane.showMessageDialog(this, "New Employee Info Saved!!");
        
        txtName.setText("");
        txtEID.setText("");
        txtAge.setText("");
        //String Gender
        if(Gender.equals("Male")) { 
            rMale.setSelected(true);
        } else
        if(Gender.equals("Female")) { 
            rFemale.setSelected(true);
        }else if (Gender.equals("Others")) { 
            rOthers.setSelected(true);
        } 
       
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTI.setText("");
        txtPositionTitle.setText("");
        txtPhone.setText("");
        txtEmailID.setText("");
        
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter the information correctly");
        }
        

        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailIDKeyReleased
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_txtEmailIDKeyReleased

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        
        JFileChooser upload = new JFileChooser();
        FileNameExtensionFilter file=new FileNameExtensionFilter("*.images", "jpg", "jpeg", "png");
        upload.addChoosableFileFilter(file);
        int selected= upload.showOpenDialog(null);
        if(selected==JFileChooser.APPROVE_OPTION){
            File uploadedImage=upload.getSelectedFile();
            String path= uploadedImage.getAbsolutePath();
            JOptionPane.showMessageDialog(null, path);
            
            ImageIcon i=new ImageIcon(path); 
            
            Image i1=i.getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(), Image.SCALE_SMOOTH);
          
            directory.setPhoto(path);
            lblImage.setIcon(new ImageIcon(directory.getPhoto()));  
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void rMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMaleActionPerformed
     if(rMale.isSelected())
    rFemale.setSelected(false);
rOthers.setSelected(false); // TODO add your handling code here:
      // TODO add your handling code here:
    }//GEN-LAST:event_rMaleActionPerformed

    private void rFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFemaleActionPerformed
   if(rFemale.isSelected())
    rMale.setSelected(false);
rOthers.setSelected(false); // TODO add your handling code here:
       // TODO add your handling code here:
    }//GEN-LAST:event_rFemaleActionPerformed

    private void rOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rOthersActionPerformed
if(rOthers.isSelected())
    rMale.setSelected(false);
rFemale.setSelected(false);         // TODO add your handling code here:
    }//GEN-LAST:event_rOthersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpload;
    private javax.swing.ButtonGroup grpr;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEID;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTI;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel mEmailAdd;
    private javax.swing.JRadioButton rFemale;
    private javax.swing.JRadioButton rMale;
    private javax.swing.JRadioButton rOthers;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTI;
    // End of variables declaration//GEN-END:variables

    private boolean checkEmail(String email) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches(); 
    }
    
    public String getSelectedGender() {
        Enumeration<AbstractButton> radioButtons = grpr.getElements();
        while (radioButtons.hasMoreElements()) {
            AbstractButton currentRadioButton = radioButtons.nextElement();
            if (currentRadioButton.isSelected()) {
                return currentRadioButton.getText();
            }
        }
        return null;
    }
}
