import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class menu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Relatorios = new JButton("Relatorio");
		Relatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Relatorios.setBackground(new Color(255, 255, 255));
		Relatorios.setBounds(67, 164, 89, 23);
		contentPane.add(Relatorios);
		
		JButton Cadastro = new JButton("Cadastro");
		Cadastro.setBackground(new Color(255, 255, 255));
		Cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Cadastro.setBounds(258, 164, 89, 23);
		contentPane.add(Cadastro);
		
		JLabel lblNewLabel = new JLabel("Universidade de Presidente Prudente");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(24, 35, 452, 106);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("O que deseja fazer?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblNewLabel_1.setBounds(143, 130, 135, 23);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setBackground(new Color(135, 206, 250));
		table.setBounds(0, 0, 434, 13);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setBackground(new Color(123, 104, 238));
		table_1.setBounds(0, 248, 434, 13);
		contentPane.add(table_1);
	}
}
