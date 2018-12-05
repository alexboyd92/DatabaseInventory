package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexb
 */
public class SelectOption extends javax.swing.JFrame {
	DataConnect con;
	Connection mycon;

	/**
	 * Creates new form SelectOption
	 */
	public SelectOption() {
		initComponents();
		this.setLocationRelativeTo(null);
		deleteSheet.setEnabled(false);
		listExisting.setEnabled(false);
		table.setDefaultEditor(Object.class, null);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jDialog1 = new javax.swing.JDialog();
		jDialog2 = new javax.swing.JDialog();
		jFrame1 = new javax.swing.JFrame();
		createSheet = new javax.swing.JButton();
		listExisting = new javax.swing.JButton();
		deleteSheet = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
		jDialog2.getContentPane().setLayout(jDialog2Layout);
		jDialog2Layout.setHorizontalGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jDialog2Layout.setVerticalGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		createSheet.setText("Create inventrory Sheet");
		createSheet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createSheetActionPerformed(evt);
			}
		});

		listExisting.setText("Veiw Selected");
		listExisting.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				listExistingActionPerformed(evt);
			}
		});

		deleteSheet.setText("Delete Selected");
		deleteSheet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deleteSheetActionPerformed(evt);
			}
		});

		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { },
				new String[] { "invID", "buisinessName", "description", "Date Created", }));
		table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setEditingColumn(0);
		table.setEditingRow(0);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tableMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(table);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(createSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(listExisting, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(deleteSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(createSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(listExisting, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(deleteSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 25, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void createSheetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createSheetActionPerformed
		InvDetails newSheet = new InvDetails(this);
		this.setVisible(false);
		newSheet.setVisible(true);
	}// GEN-LAST:event_createSheetActionPerformed

	private void listExistingActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listExistingActionPerformed

	}// GEN-LAST:event_listExistingActionPerformed

	private void deleteSheetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteSheetActionPerformed
		int inv_ID;
		inv_ID =  (int) table.getValueAt(table.getSelectedRow(), 0);
		System.out.println(inv_ID);
		try {
			PreparedStatement stat2;
			stat2 = mycon.prepareStatement("delete from inv.invdetails where invID = ?");

			PreparedStatement stat3 = mycon.prepareStatement("delete from inv.invsheet where invID = ?");
			stat2.setInt(1, inv_ID);
			stat3.setInt(1, inv_ID);

			int i = stat2.executeUpdate();
			//System.out.println(i + "record deleted");
			i = stat3.executeUpdate();
			//System.out.println(i + "record deleted");
			mycon.commit();
		} catch (SQLException e) {
			try {
				mycon.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		 DefaultTableModel model = (DefaultTableModel) this.table.getModel();
		 model.removeRow(table.getSelectedRow());
	}// GEN-LAST:event_deleteSheetActionPerformed

	private void tableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableMouseClicked
		deleteSheet.setEnabled(true);
		listExisting.setEnabled(true);
	}// GEN-LAST:event_tableMouseClicked

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton createSheet;
	private javax.swing.JButton deleteSheet;
	private javax.swing.JDialog jDialog1;
	private javax.swing.JDialog jDialog2;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton listExisting;
	private javax.swing.JTable table;
	private String activeUser;

	// End of variables declaration//GEN-END:variables
	public void setDataConect(DataConnect connect) {
		this.con = connect;

	}

	public void setActiveUser(String activeUser) {
		this.activeUser = activeUser;

	}

	void fillTable() {
		String compName = null;
		mycon = this.con.getConnect();

		try {
			int correctInput = 0;
			PreparedStatement sheets = mycon
					.prepareStatement(" SELECT businessName FROM inv.employee where username=?");
			sheets.setString(1, this.activeUser);
			ResultSet businessSheets = sheets.executeQuery();

			if (businessSheets.next()) {
				compName = businessSheets.getString(1);
			//	System.out.println(compName);
			}
			sheets = mycon.prepareStatement(" SELECT * FROM inv.invsheet where businessName=?;");
			sheets.setString(1, compName);
			businessSheets = sheets.executeQuery();
			DefaultTableModel model = (DefaultTableModel) table.getModel();

			while (businessSheets.next()) {
				model.addRow(new Object[] { businessSheets.getInt(1), businessSheets.getString(2),
						businessSheets.getString(3), businessSheets.getDate(4) });

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}