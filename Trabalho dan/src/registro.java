import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class registro extends JFrame {

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
					registro frame = new registro();
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
	public registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(30, 144, 255));
		contentPane_1.setBounds(0, 0, 434, 672);
		contentPane.add(contentPane_1);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setBackground(new Color(123, 104, 238));
		table.setBounds(0, 482, 434, 13);
		contentPane_1.add(table);
		
		JLabel lblCadastro = new JLabel("Relat\u00F3rios");
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblCadastro.setBounds(10, 24, 452, 37);
		contentPane_1.add(lblCadastro);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setBackground(new Color(135, 206, 250));
		table_1.setBounds(0, 0, 434, 13);
		contentPane_1.add(table_1);
		
		JButton btnNewButton = new JButton("Geral");
		btnNewButton.setBounds(82, 58, 271, 23);
		contentPane_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Resumo dos departamentos");
		btnNewButton_1.setBounds(82, 92, 271, 23);
		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("R.D. com gastos em faixa espec\u00EDficos");
		btnNewButton_2.setBounds(82, 126, 271, 23);
		contentPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Funcion\u00E1rios com faixa de salario especifico");
		btnNewButton_2_1.setBounds(82, 160, 271, 23);
		contentPane_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Exibir Funcion\u00E1rios");
		btnNewButton_2_2.setBounds(82, 194, 271, 23);
		contentPane_1.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Exibir T\u00E9cnicos");
		btnNewButton_2_3.setBounds(82, 228, 271, 23);
		contentPane_1.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_3_1 = new JButton("Exibir Docentes");
		btnNewButton_2_3_1.setBounds(82, 262, 271, 23);
		contentPane_1.add(btnNewButton_2_3_1);
		
		JButton btnNewButton_2_3_2 = new JButton("Exibir Docentes Efetivos");
		btnNewButton_2_3_2.setBounds(82, 296, 271, 23);
		contentPane_1.add(btnNewButton_2_3_2);
		
		JButton btnNewButton_2_3_2_1 = new JButton("Exibir Docentes Substitutos");
		btnNewButton_2_3_2_1.setBounds(82, 330, 271, 23);
		contentPane_1.add(btnNewButton_2_3_2_1);
		
		JButton btnNewButton_2_3_2_1_1 = new JButton("Informa\u00E7\u00F5es sobre departamento");
		btnNewButton_2_3_2_1_1.setBounds(82, 364, 271, 23);
		contentPane_1.add(btnNewButton_2_3_2_1_1);
		
		JButton btnNewButton_2_3_2_1_2 = new JButton("Buscar Funcion\u00E1rio por c\u00F3digo");
		btnNewButton_2_3_2_1_2.setBounds(82, 398, 271, 23);
		contentPane_1.add(btnNewButton_2_3_2_1_2);
		
		JButton btnNewButton_2_3_2_1_2_1 = new JButton("Buscar Funcion\u00E1rio por nome");
		btnNewButton_2_3_2_1_2_1.setBounds(82, 430, 271, 23);
		contentPane_1.add(btnNewButton_2_3_2_1_2_1);
	}
}
