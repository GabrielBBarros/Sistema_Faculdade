import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class cad_efetivo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField codigo;
	private JTextField nome;
	private JTextField salario;
	private JTextField nivel;
	private JTextField titulacao;
	private JTextField area;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_efetivo frame = new cad_efetivo();
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
	public cad_efetivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(30, 144, 255));
		contentPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(contentPane_1);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setBackground(new Color(123, 104, 238));
		table.setBounds(0, 248, 434, 13);
		contentPane_1.add(table);
		
		JLabel lblDocenteEfetivo = new JLabel("Docente efetivo");
		lblDocenteEfetivo.setForeground(Color.WHITE);
		lblDocenteEfetivo.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblDocenteEfetivo.setBounds(10, 11, 452, 56);
		contentPane_1.add(lblDocenteEfetivo);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setBackground(new Color(135, 206, 250));
		table_1.setBounds(0, 0, 434, 13);
		contentPane_1.add(table_1);
		
		codigo = new JTextField();
		codigo.setColumns(10);
		codigo.setBounds(124, 65, 113, 20);
		contentPane_1.add(codigo);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(124, 96, 264, 20);
		contentPane_1.add(nome);
		
		salario = new JTextField();
		salario.setColumns(10);
		salario.setBounds(124, 127, 113, 20);
		contentPane_1.add(salario);
		
		nivel = new JTextField();
		nivel.setColumns(10);
		nivel.setBounds(124, 158, 36, 20);
		contentPane_1.add(nivel);
		
		titulacao = new JTextField();
		titulacao.setColumns(10);
		titulacao.setBounds(124, 189, 205, 20);
		contentPane_1.add(titulacao);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 65, 94, 20);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNome.setBounds(43, 96, 94, 20);
		contentPane_1.add(lblNome);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setForeground(Color.WHITE);
		lblSalrio.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblSalrio.setBounds(43, 130, 94, 20);
		contentPane_1.add(lblSalrio);
		
		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setForeground(Color.WHITE);
		lblNvel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNvel.setBounds(43, 161, 94, 20);
		contentPane_1.add(lblNvel);
		
		JLabel lblTitulao = new JLabel("Titula\u00E7\u00E3o:");
		lblTitulao.setForeground(Color.WHITE);
		lblTitulao.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblTitulao.setBounds(43, 192, 94, 20);
		contentPane_1.add(lblTitulao);
		
		JLabel lblrea = new JLabel("\u00C1rea:");
		lblrea.setForeground(Color.WHITE);
		lblrea.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblrea.setBounds(43, 220, 94, 20);
		contentPane_1.add(lblrea);
		
		area = new JTextField();
		area.setColumns(10);
		area.setBounds(124, 217, 205, 20);
		contentPane_1.add(area);
	}

}
