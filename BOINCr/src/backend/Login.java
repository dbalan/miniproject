package boinc;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame{
	
	private JButton jButton1 = new JButton("Login");
	private JLabel jLabel1 = new JLabel("username");
	private JLabel jLabel2 = new JLabel("password");
	private JLabel jLabel3 = new JLabel("database");
	private JPanel jPanel1  = new JPanel();
	private JPasswordField jPasswordField1 = new JPasswordField();
	private JTextField jTextField1 = new JTextField();
	private JTextField jTextField2 = new JTextField();
	private String Nul="";
	private Authenticator auth = new Authenticator();
	
	public Login(){
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jTextField2))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jButton1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		if(jTextField1.getText().equals(Nul)){
        			JOptionPane.showMessageDialog(null,"Enter the Username");
        		}
        		else if(jPasswordField1.getText().equals(Nul)){
        			JOptionPane.showMessageDialog(null,"Enter the Password");
        		}
        		else if(jTextField2.getText().equals(Nul)){
        			JOptionPane.showMessageDialog(null,"Enter the Database Name");
        		}
        		
        			
        		else{
        			String uname = jTextField1.getText();
        			String passwd = jPasswordField1.getText();
        			String dbase = jTextField2.getText();
        			String host = "localhost";
        			if(auth.getConnected(uname, passwd, host, dbase)){
        				//code for opening new window should be at here
        				//this is a sample message box just for checking
        				JOptionPane.showMessageDialog(null,"connected to database");
        				//call for connection close is now just put at here
        				//this will be changed later
        				auth.exit();
        			}
        			else JOptionPane.showMessageDialog(null,"invalid username or password");
        		}
        	}
        });
        getContentPane().add(jPanel1);

        pack();
        
	}

}
