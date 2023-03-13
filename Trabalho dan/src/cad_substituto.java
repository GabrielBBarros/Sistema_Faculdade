import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;

public class cad_substituto extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField codigo;
	private JTextField nome;
	private JTextField salario;
	private JTextField nivel;
	private JTextField textField_4;
	private JTextField carga_horaria;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_substituto frame = new cad_substituto();
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
	public cad_substituto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDocenteEfetivo = new JLabel("Docente efetivo");
		lblDocenteEfetivo.setForeground(Color.WHITE);
		lblDocenteEfetivo.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblDocenteEfetivo.setBounds(10, 11, 452, 56);
		contentPane.add(lblDocenteEfetivo);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setBackground(new Color(135, 206, 250));
		table.setBounds(0, 0, 434, 13);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 65, 94, 20);
		contentPane.add(lblNewLabel);
		
		codigo = new JTextField();
		codigo.setColumns(10);
		codigo.setBounds(124, 65, 113, 20);
		contentPane.add(codigo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNome.setBounds(43, 96, 94, 20);
		contentPane.add(lblNome);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(124, 96, 264, 20);
		contentPane.add(nome);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setForeground(Color.WHITE);
		lblSalrio.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblSalrio.setBounds(43, 130, 94, 20);
		contentPane.add(lblSalrio);
		
		salario = new JTextField();
		salario.setColumns(10);
		salario.setBounds(124, 127, 113, 20);
		contentPane.add(salario);
		
		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setForeground(Color.WHITE);
		lblNvel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNvel.setBounds(43, 161, 94, 20);
		contentPane.add(lblNvel);
		
		nivel = new JTextField();
		nivel.setColumns(10);
		nivel.setBounds(124, 158, 36, 20);
		contentPane.add(nivel);
		
		JLabel titulacao = new JLabel("Titula\u00E7\u00E3o:");
		titulacao.setForeground(Color.WHITE);
		titulacao.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		titulacao.setBounds(43, 192, 94, 20);
		contentPane.add(titulacao);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 189, 205, 20);
		contentPane.add(textField_4);
		
		JLabel lblCargaHorria = new JLabel("Carga hor\u00E1ria(h):");
		lblCargaHorria.setForeground(Color.WHITE);
		lblCargaHorria.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblCargaHorria.setBounds(0, 220, 126, 20);
		contentPane.add(lblCargaHorria);
		
		carga_horaria = new JTextField();
		carga_horaria.setColumns(10);
		carga_horaria.setBounds(124, 217, 46, 20);
		contentPane.add(carga_horaria);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setBackground(new Color(123, 104, 238));
		table_1.setBounds(0, 248, 434, 13);
		contentPane.add(table_1);
	}

}
