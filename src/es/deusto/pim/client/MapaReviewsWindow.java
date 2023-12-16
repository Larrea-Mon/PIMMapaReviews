package es.deusto.pim.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MapaReviewsWindow extends JFrame{
	private static final long serialVersionUID = 3897717242376590087L;
	private JPanel contentPane,panel;
	private JPanel panel7,panel9,panel1,panel3;
	
	

	public MapaReviewsWindow() {
		setLocationRelativeTo(null);
		setResizable(true);
		setTitle("MapaReviews");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30,30,900,600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel,BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2,2));
		
		panel7 = new JPanel();
		panel9 = new JPanel();
		panel1 = new JPanel();
		panel3 = new JPanel();
		
		panel.add(panel7);
		panel.add(panel9);
		panel.add(panel1);
		panel.add(panel3);	
		
		
	}
}
