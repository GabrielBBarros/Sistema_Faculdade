import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

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
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setBackground(new Color(123, 104, 238));
		table.setBounds(0, 248, 434, 13);
		contentPane.add(table);
		
		JLabel lblCadastro = new JLabel("O que deseja cadastrar?");
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblCadastro.setBounds(10, 11, 452, 56);
		contentPane.add(lblCadastro);
		
		JButton Tecnico = new JButton("T\u00E9cnico");
		Tecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Tecnico.setBounds(140, 144, 142, 39);
		contentPane.add(Tecnico);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setBackground(new Color(135, 206, 250));
		table_1.setBounds(0, 0, 434, 13);
		contentPane.add(table_1);
		
		JButton Docente_efetivo = new JButton("Docente Efetivo");
		Docente_efetivo.setBounds(224, 94, 142, 39);
		contentPane.add(Docente_efetivo);
		
		JButton Docente_substituto = new JButton("Docente Substituto");
		Docente_substituto.setBounds(49, 94, 142, 39);
		contentPane.add(Docente_substituto);
	}

}
