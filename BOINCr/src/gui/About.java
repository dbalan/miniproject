package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;




/**
 *
 * @author akhi
 */

@SuppressWarnings("serial")
    public class About extends javax.swing.JDialog{
	private javax.swing.JLabel jLabel1;

	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
    
	public About() {
    	
	    setTitle("About");
	    setAlwaysOnTop(true);
	    initComponents();
	    requestFocus();
	    setVisible(true);
	    setLocation(400, 200);
	}

    
	private void initComponents(){
    	
    	
	    jPanel1 = new javax.swing.JPanel();
	    jLabel2 = new javax.swing.JLabel();
	    jLabel3 = new javax.swing.JLabel();
	    jLabel1 = new javax.swing.JLabel();
	    jLabel4 = new javax.swing.JLabel();
	    jLabel5 = new javax.swing.JLabel();
	    jLabel6 = new javax.swing.JLabel();
	    jLabel7 = new javax.swing.JLabel();
	    jLabel8 = new javax.swing.JLabel();
	    jLabel9 = new javax.swing.JLabel();
	    jLabel10 = new javax.swing.JLabel();

	    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

	    jPanel1.setBackground(new java.awt.Color(204, 204, 204));
	    jPanel1.setLayout(null);

	    jLabel2.setText("Boinc Server Database Management System");
	    jPanel1.add(jLabel2);
	    jLabel2.setBounds(40, 20, 350, 20);

	    jLabel3.setText("Version  : 0.4");
	    jPanel1.add(jLabel3);
	    jLabel3.setBounds(170, 70, 110, 20);

	    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/boinc256new.jpg"))); // NOI18N
	    jLabel1.setText("jLabel1");
	    jPanel1.add(jLabel1);
	    jLabel1.setBounds(20, 70, 130, 120);

	    jLabel4.setText("Developed By");
	    jPanel1.add(jLabel4);
	    jLabel4.setBounds(170, 150, 130, 15);

	    jLabel5.setText("1.Dhananjay M B");
	    jPanel1.add(jLabel5);
	    jLabel5.setBounds(170, 170, 130, 15);

	    jLabel6.setText("3.Abil N George");
	    jPanel1.add(jLabel6);
	    jLabel6.setBounds(170, 190, 120, 15);

	    jLabel7.setText("2.Akhil P M");
	    jPanel1.add(jLabel7);
	    jLabel7.setBounds(300, 170, 120, 15);

	    jLabel8.setText("4.Afthab V P");
	    jPanel1.add(jLabel8);
	    jLabel8.setBounds(300, 190, 110, 15);

	    jLabel9.setText("A graphical user interface for");
	    jPanel1.add(jLabel9);
	    jLabel9.setBounds(170, 90, 210, 15);

	    jLabel10.setText("managing boinc server database");
	    jPanel1.add(jLabel10);
	    jLabel10.setBounds(170, 100, 240, 20);

	    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	    getContentPane().setLayout(layout);
	    layout.setHorizontalGroup(
				      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				      );
	    layout.setVerticalGroup(
				    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
				    );

        
	    JButton btnOk = new JButton("OK");
	    btnOk.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
        		Main.Win.setEnabled(true);
        		dispose();
		    }
		});
	    btnOk.setBounds(163, 235, 117, 25);
	    jPanel1.add(btnOk);

	    pack();
	}
    }
    


    



