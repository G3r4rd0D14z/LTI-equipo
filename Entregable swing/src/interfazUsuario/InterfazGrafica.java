package interfazUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import clases.Persona;
import funcionalidades.ControlCI;
import funcionalidades.EventoBoton;
import funcionalidades.EventoMostrar;
import funcionalidades.EventoSalir;

public class InterfazGrafica {

	

	private JFrame frmEntregableSwingCpoo;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JComboBox<String> comboBox;
	private static JSpinner spinner_1;
	private static JTextArea textArea;
	private static JButton btnNewButton;
	private static JDateChooser dateChooser;
	private static ArrayList <Persona> listaPersonas;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica window = new InterfazGrafica();
					window.frmEntregableSwingCpoo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		listaPersonas = new ArrayList<Persona>();
		
		frmEntregableSwingCpoo = new JFrame();
		frmEntregableSwingCpoo.getContentPane().setBackground(Color.ORANGE);
		frmEntregableSwingCpoo.getContentPane().setForeground(Color.WHITE);
		frmEntregableSwingCpoo.setBackground(Color.WHITE);
		frmEntregableSwingCpoo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Documents\\Eclipse Workspace\\Entregable swing\\src\\interfazUsuario\\WhatsApp Image 2022-04-21 at 3.14.32 PM.jpeg"));
		frmEntregableSwingCpoo.setForeground(Color.BLACK);
		frmEntregableSwingCpoo.setTitle("Entregable Swing C3POO");
		frmEntregableSwingCpoo.setBounds(100, 100, 618, 722);
		frmEntregableSwingCpoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEntregableSwingCpoo.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.BLUE);
		frmEntregableSwingCpoo.getContentPane().add(menuBar,BorderLayout.NORTH);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		mnNewMenu.setBackground(Color.BLUE);
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Mostrar");
		mntmNewMenuItem.addActionListener(new EventoMostrar());
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.addActionListener(new EventoSalir());
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JPanel panel = new JPanel();
		frmEntregableSwingCpoo.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(33, 31, 531, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(92, 10, 141, 30);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(267, 0, 214, 37);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(33, 92, 531, 40);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setBounds(90, 10, 141, 30);
		panel_2.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(267, 3, 214, 37);
		panel_2.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(33, 155, 531, 40);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDocumento = new JLabel("C.I.");
		lblDocumento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocumento.setBounds(90, 10, 141, 30);
		panel_3.add(lblDocumento);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(268, 3, 214, 37);
		textField_2.getDocument().addDocumentListener(new ControlCI());
		panel_3.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(33, 221, 531, 40);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblL = new JLabel("Departamento");
		lblL.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setBounds(89, 10, 141, 30);
		panel_4.add(lblL);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(269, 0, 213, 38);
		comboBox.addItem("ARTIGAS");
		comboBox.addItem("RIVERA");
		comboBox.addItem("MONTEVIDEO");
		comboBox.addItem("SALTO");
		comboBox.addItem("PAISANDÚ");
		comboBox.addItem("TACUAREMBÓ");
		comboBox.addItem("DURAZNO");
		comboBox.addItem("COLONIA");
		comboBox.addItem("SANJOSE");
		comboBox.addItem("TREINTA Y TRES");
		comboBox.addItem("CERRO LARGO");
		comboBox.addItem("MALDONADO");
		comboBox.addItem("SORIANO");
		comboBox.addItem("MELO");
		comboBox.addItem("ROCHA");
		comboBox.addItem("CANELONES");
		comboBox.addItem("FLORES");
		comboBox.addItem("FLORIDA");
		comboBox.addItem("LAVALLEJA");

		panel_4.add(comboBox);
		
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(33, 290, 531, 40);
		panel.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaNacimiento.setBounds(88, 10, 141, 30);
		panel_4_1.add(lblFechaNacimiento);
		
	    dateChooser = new JDateChooser();
		dateChooser.setBounds(268, 0, 213, 40);
		panel_4_1.add(dateChooser);
	
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(33, 354, 531, 40);
		panel.add(panel_4_2);
		panel_4_2.setLayout(null);
		
		JLabel lblHijos = new JLabel("Hijos");
		lblHijos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijos.setHorizontalAlignment(SwingConstants.CENTER);
		lblHijos.setBounds(87, 10, 141, 30);
		panel_4_2.add(lblHijos);
		
	    spinner_1 = new JSpinner(new SpinnerNumberModel(0,0,100,1));
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_1.setBounds(272, 0, 49, 40);
		panel_4_2.add(spinner_1);
		
		textArea = new JTextArea();
		textArea.setBounds(33, 476, 531, 173);
		panel.add(textArea);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(206, 413, 143, 40);
		btnNewButton.addActionListener(new EventoBoton());
		panel.add(btnNewButton);

		
	}

	public static JDateChooser getDateChooser() {
		return dateChooser;
	}

	public static JTextField getTextField() {
		return textField;
	}

	public static JTextField getTextField_1() {
		return textField_1;
	}

	public static JTextField getTextField_2() {
		return textField_2;
	}

	public static JComboBox<String> getComboBox() {
		return comboBox;
	}
	
	public static JTextArea getTextArea() {
		return textArea;
	}
	public static JButton getButton() {
		return btnNewButton;
	}
	public static JSpinner getSpinner_1() {
		return spinner_1;
	}
	public static ArrayList<Persona> getListapersonas() {
		return listaPersonas;
	}
	
}
