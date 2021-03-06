package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ManageVersion extends JFrame {

	private JPanel contentPane;
	private backend.ManageVersion ver;
	private JComboBox comboBox;
	private String app_id;
	/**
	 * Create the frame.
	 */
	public ManageVersion(String appid) {
		try {
			app_id=appid;
			ver=new backend.ManageVersion(appid);
			setTitle("Minimum Version");
			requestFocus();
			setVisible(true);
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setBounds(100, 100, 321, 187);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
		
			JPanel panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
		
			JLabel lblCurrent = new JLabel("Current      :");
			lblCurrent.setBounds(47, 31, 106, 15);
			panel.add(lblCurrent);
		
			JLabel lblmin_ver = new JLabel("");
			lblmin_ver.setBounds(165, 31, 102, 15);
			panel.add(lblmin_ver);
			lblmin_ver.setText(Integer.toString(ver.getCurrentMinVersion()));
		
			JLabel lblNew = new JLabel("New           :");
			lblNew.setBounds(47, 77, 106, 15);
			panel.add(lblNew);
		
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(ver.getAvailableVersion().toArray()));
			comboBox.setBounds(161, 72, 106, 24);
			panel.add(comboBox);
			
			JButton btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Main.Win.setEnabled(true);
					dispose();
				}
			});
			btnCancel.setBounds(31, 112, 117, 25);
			panel.add(btnCancel);
			
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(comboBox.getSelectedItem()==null){
						dispose();
						Main.Win.setEnabled(true);
						return;
					}
					String version=comboBox.getSelectedItem().toString();
					ver.changeMinVersion(Integer.parseInt(version));
					Main.Win.setmsg(app_id);
					Main.Win.setEnabled(true);
					dispose();
				}
			});
			btnOk.setBounds(162, 112, 117, 25);
			panel.add(btnOk);
			
			JLabel lblAppname = new JLabel("");
			lblAppname.setHorizontalAlignment(SwingConstants.CENTER);
			lblAppname.setBounds(77, 0, 152, 15);
			lblAppname.setText(ver.getname());
			panel.add(lblAppname);
			} catch (SQLException e) {
				e.printStackTrace();
				dispose();
			}
	}
}
