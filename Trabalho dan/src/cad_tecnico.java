import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class cad_tecnico extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField codigo;
	private JTextField nome;
	private JTextField salario;
	private JTextField nivel;
	private JTextField funcao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_tecnico frame = new cad_tecnico();
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
	public cad_tecnico() {
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
		
		JLabel lblCadastroTcnico = new JLabel("Cadastro T\u00E9cnico");
		lblCadastroTcnico.setForeground(Color.WHITE);
		lblCadastroTcnico.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblCadastroTcnico.setBounds(10, 11, 452, 56);
		contentPane.add(lblCadastroTcnico);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setBackground(new Color(135, 206, 250));
		table_1.setBounds(0, 0, 434, 13);
		contentPane.add(table_1);
		
		codigo = new JTextField();
		codigo.setBounds(124, 65, 113, 20);
		contentPane.add(codigo);
		codigo.setColumns(10);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(124, 96, 264, 20);
		contentPane.add(nome);
		
		salario = new JTextField();
		salario.setColumns(10);
		salario.setBounds(124, 127, 113, 20);
		contentPane.add(salario);
		
		nivel = new JTextField();
		nivel.setColumns(10);
		nivel.setBounds(124, 158, 36, 20);
		contentPane.add(nivel);
		
		funcao = new JTextField();
		funcao.setColumns(10);
		funcao.setBounds(124, 189, 205, 20);
		contentPane.add(funcao);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 65, 94, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNome.setBounds(43, 96, 94, 20);
		contentPane.add(lblNome);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setForeground(Color.WHITE);
		lblSalrio.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblSalrio.setBounds(43, 130, 94, 20);
		contentPane.add(lblSalrio);
		
		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setForeground(Color.WHITE);
		lblNvel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNvel.setBounds(43, 161, 94, 20);
		contentPane.add(lblNvel);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setForeground(Color.WHITE);
		lblFuno.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblFuno.setBounds(43, 192, 94, 20);
		contentPane.add(lblFuno);
	}
}
