package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class CadastroFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtF_nome;
	private JTextField txtF_salario;
	private JTextField txtF_cargo;
	private JTextField txtF_telefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setBackground(new Color(0, 0, 160));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastrar Funcion\u00E1rio", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(20, 21, 820, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(74, 24, 55, 19);
		panel.add(lblNewLabel);
		
		txtF_nome = new JTextField();
		txtF_nome.setBounds(24, 47, 144, 19);
		panel.add(txtF_nome);
		txtF_nome.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Salário");
		lblSalrio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalrio.setBounds(222, 24, 55, 19);
		panel.add(lblSalrio);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCargo.setBounds(380, 24, 55, 19);
		panel.add(lblCargo);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(528, 24, 64, 19);
		panel.add(lblTelefone);
		
		JButton bt_cadastrar = new JButton("Cadastrar");
		bt_cadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bt_cadastrar.setBounds(648, 44, 154, 21);
		panel.add(bt_cadastrar);
		
		txtF_salario = new JTextField();
		txtF_salario.setColumns(10);
		txtF_salario.setBounds(178, 47, 144, 19);
		panel.add(txtF_salario);
		
		txtF_cargo = new JTextField();
		txtF_cargo.setColumns(10);
		txtF_cargo.setBounds(332, 47, 144, 19);
		panel.add(txtF_cargo);
		
		txtF_telefone = new JTextField();
		txtF_telefone.setColumns(10);
		txtF_telefone.setBounds(486, 47, 144, 19);
		panel.add(txtF_telefone);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es sobre os funcion\u00E1rios", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 130, 820, 328);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(415, 23, 382, 245);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JList list = new JList();
		list.setBorder(new TitledBorder(null, "Lista de funcion\u00E1rios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		list.setBounds(0, 0, 382, 247);
		panel_2.add(list);
		
		JButton bt_exibirDados = new JButton("Exibir dados");
		bt_exibirDados.setBounds(415, 285, 114, 21);
		panel_1.add(bt_exibirDados);
		
		JButton bt_editar = new JButton("Editar");
		bt_editar.setBounds(550, 285, 114, 21);
		panel_1.add(bt_editar);
		
		JButton bt_excluir = new JButton("Excluir");
		bt_excluir.setBounds(683, 285, 118, 21);
		panel_1.add(bt_excluir);
		
		JLabel lblNewLabel_1 = new JLabel("Informações do funcionário");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(39, 23, 259, 21);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(22, 66, 57, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel label_telefone = new JLabel("d");
		label_telefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_telefone.setBounds(89, 242, 205, 26);
		panel_1.add(label_telefone);
		
		JLabel lblNewLabel_2_2 = new JLabel("Salário:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(22, 119, 57, 26);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Cargo:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(22, 181, 57, 26);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Telefone:");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_2.setBounds(22, 242, 69, 26);
		panel_1.add(lblNewLabel_2_2_2);
		
		JLabel label_cargo = new JLabel("c");
		label_cargo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_cargo.setBounds(89, 181, 205, 26);
		panel_1.add(label_cargo);
		
		JLabel label_salario = new JLabel("b");
		label_salario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_salario.setBounds(89, 119, 205, 26);
		panel_1.add(label_salario);
		
		JLabel label_nome = new JLabel("a");
		label_nome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_nome.setBounds(89, 66, 205, 26);
		panel_1.add(label_nome);
	}
}
