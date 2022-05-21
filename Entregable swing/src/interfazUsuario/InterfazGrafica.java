package interfazUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
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
import funcionalidades.EventoCargar;
import funcionalidades.EventoMostrar;
import funcionalidades.EventoSalir;
import funcionalidades.EventoTerminar;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;

public class InterfazGrafica {

	

	private JFrame frmEntregableSwingCpoo;
	private static JPanel panel;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JComboBox<String> comboBox;
	private static JSpinner spinner_1;
	private static JTextArea textArea;
	private static JButton btnNewButton;
	private static JDateChooser dateChooser;
	private static JPanel panel_izquierdo;
	private static JLabel labPropietario;
	private static JRadioButton botonBarco;
	private static JRadioButton botonAvion;
	
	private static JSpinner spinnerManga;
	private static JSpinner spinnerEslora;
	private static JSpinner spinnerLongitud;
	private static JSpinner spinnerPasajeros;
	private static JButton botonCargar;
	private static JButton botonTerminar;
	private static ArrayList <Persona> listaPersonas;
	private static JTextField nomVehiculo;
	private static JComboBox<String> comboColores;
	private static JCheckBox checkInvertir;
	
	

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
		frmEntregableSwingCpoo.setBounds(100, 50, 738, 797);
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
		
		panel = new JPanel();
		frmEntregableSwingCpoo.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 89, 364, 40);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setBounds(10, 7, 141, 30);
		panel_2.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_1.setBounds(167, 0, 197, 37);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(33, 155, 362, 40);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDocumento = new JLabel("C.I.");
		lblDocumento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocumento.setBounds(10, 4, 141, 30);
		panel_3.add(lblDocumento);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(164, 3, 198, 37);
		textField_2.getDocument().addDocumentListener(new ControlCI());
		panel_3.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(33, 221, 364, 40);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblL = new JLabel("Departamento");
		lblL.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setBounds(27, 2, 130, 30);
		panel_4.add(lblL);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(164, 0, 198, 38);
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
		panel_4_1.setBounds(33, 290, 364, 40);
		panel.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaNacimiento.setBounds(10, 0, 141, 40);
		panel_4_1.add(lblFechaNacimiento);
		
	    dateChooser = new JDateChooser();
		dateChooser.setBounds(161, 0, 203, 40);
		panel_4_1.add(dateChooser);
		dateChooser.setDate(new Date(1950l));
	
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(33, 358, 362, 40);
		panel.add(panel_4_2);
		panel_4_2.setLayout(null);
		
		JLabel lblHijos = new JLabel("Hijos");
		lblHijos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijos.setHorizontalAlignment(SwingConstants.CENTER);
		lblHijos.setBounds(0, 0, 141, 40);
		panel_4_2.add(lblHijos);
		
	    spinner_1 = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	    spinner_1.setBounds(162, 1, 49, 40);
	    panel_4_2.add(spinner_1);
	    spinner_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
	    textArea = new JTextArea();
		textArea.setBounds(35, 521, 681, 173);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		JScrollPane barras = new JScrollPane(textArea);
		panel.add(barras);
		barras.setBounds(35, 521, 681, 173);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(150, 461, 143, 40);
		btnNewButton.addActionListener(new EventoBoton());
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(33, 24, 362, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(14, 7, 141, 30);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField.setBounds(165, 0, 197, 37);
		panel_1.add(textField);
		textField.setColumns(10);
		
		panel_izquierdo = new JPanel();
		panel_izquierdo.setBounds(405, 10, 311, 491);
		panel.add(panel_izquierdo);
		panel_izquierdo.setLayout(null);
		
		labPropietario = new JLabel();
		labPropietario.setEnabled(false);
		labPropietario.setText("Propietario");
		labPropietario.setForeground(Color.BLACK);
		labPropietario.setHorizontalAlignment(SwingConstants.CENTER);
		labPropietario.setFont(new Font("Tahoma", Font.BOLD, 15));
		labPropietario.setBounds(10, 10, 278, 26);
		panel_izquierdo.add(labPropietario);
		
		ButtonGroup grupo = new ButtonGroup();
		
		botonBarco = new JRadioButton("Barco");
		botonBarco.setEnabled(false);
		botonBarco.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonBarco.setBounds(33, 62, 103, 21);
		panel_izquierdo.add(botonBarco);
		botonBarco.setSelected(true);
		botonBarco.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				InterfazGrafica.spinnerLongitud.setEnabled(false);
				InterfazGrafica.spinnerPasajeros.setEnabled(false);
				InterfazGrafica.spinnerManga.setEnabled(true);
				InterfazGrafica.spinnerEslora.setEnabled(true);

			}
			
		});
		
		botonAvion = new JRadioButton("Avión");
		botonAvion.setEnabled(false);
		botonAvion.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonAvion.setBounds(33, 197, 103, 21);
		panel_izquierdo.add(botonAvion);
		botonAvion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				InterfazGrafica.spinnerManga.setEnabled(false);
				InterfazGrafica.spinnerEslora.setEnabled(false);
				InterfazGrafica.spinnerLongitud.setEnabled(true);
				InterfazGrafica.spinnerPasajeros.setEnabled(true);

			}
			
		});

		grupo.add(botonAvion);
		grupo.add(botonBarco);
		
		spinnerManga = new JSpinner(new SpinnerNumberModel(0.0,0.0,28.0,0.1));
		spinnerManga.setEnabled(false);
		spinnerManga.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinnerManga.setBounds(154, 99, 68, 20);
		panel_izquierdo.add(spinnerManga);
		
		
		spinnerEslora = new JSpinner(new SpinnerNumberModel(0.0,0.0,180.0,0.5));
		spinnerEslora.setEnabled(false);
		spinnerEslora.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinnerEslora.setBounds(154, 141, 67, 20);
		panel_izquierdo.add(spinnerEslora);
		
		JLabel lblNewLabel_1 = new JLabel("Manga");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(33, 100, 103, 19);
		panel_izquierdo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Eslora");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(33, 142, 103, 19);
		panel_izquierdo.add(lblNewLabel_1_1);
		
		JLabel labLongitud = new JLabel("Longitud");
		labLongitud.setHorizontalAlignment(SwingConstants.CENTER);
		labLongitud.setFont(new Font("Tahoma", Font.BOLD, 15));
		labLongitud.setBounds(33, 242, 103, 19);
		panel_izquierdo.add(labLongitud);
		
		JLabel lblNewLabel_1_3 = new JLabel("Pasajeros");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(33, 291, 103, 19);
		panel_izquierdo.add(lblNewLabel_1_3);
		
		spinnerLongitud = new JSpinner(new SpinnerNumberModel(0.0,0.0,90.0,0.1));
		spinnerLongitud.setEnabled(false);
		spinnerLongitud.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinnerLongitud.setBounds(154, 242, 68, 20);
		panel_izquierdo.add(spinnerLongitud);
		
		spinnerPasajeros = new JSpinner(new SpinnerNumberModel(0,0,450,1));
		spinnerPasajeros.setEnabled(false);
		spinnerPasajeros.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinnerPasajeros.setBounds(154, 290, 68, 20);
		panel_izquierdo.add(spinnerPasajeros);
		
		botonCargar = new JButton("Cargar");
		botonCargar.setEnabled(false);
		botonCargar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonCargar.setBounds(33, 446, 103, 35);
		panel_izquierdo.add(botonCargar);
		botonCargar.addActionListener(new EventoCargar());
		
		botonTerminar = new JButton("Terminar");
		botonTerminar.setEnabled(false);
		botonTerminar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonTerminar.setBounds(169, 446, 101, 35);
		panel_izquierdo.add(botonTerminar);
		botonTerminar.addActionListener(new EventoTerminar());
		
		JLabel labNomVehiculo = new JLabel("Nombre");
		labNomVehiculo.setHorizontalAlignment(SwingConstants.CENTER);
		labNomVehiculo.setFont(new Font("Tahoma", Font.BOLD, 14));
		labNomVehiculo.setBounds(48, 345, 77, 26);
		panel_izquierdo.add(labNomVehiculo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Color");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(48, 389, 77, 26);
		panel_izquierdo.add(lblNewLabel_2_1);
		
		nomVehiculo = new JTextField();
		nomVehiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		nomVehiculo.setEnabled(false);
		nomVehiculo.setBounds(154, 345, 134, 26);
		panel_izquierdo.add(nomVehiculo);
		nomVehiculo.setColumns(10);
		
		comboColores = new JComboBox<String>();
		comboColores.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboColores.setEnabled(false);
		comboColores.setBounds(154, 394, 134, 21);
		panel_izquierdo.add(comboColores);
		comboColores.addItem("ROJO");
		comboColores.addItem("AZUL");
		comboColores.addItem("CAFE");
		comboColores.addItem("CELESTE");
		comboColores.addItem("BLANCO");
		comboColores.addItem("NEGRO");
		comboColores.addItem("GRIS");
		comboColores.addItem("VERDE");
		comboColores.addItem("VIOLETA");
		comboColores.setEditable(true);
		
		checkInvertir = new JCheckBox("Invertir orden");
		checkInvertir.setFont(new Font("Tahoma", Font.BOLD, 15));
		checkInvertir.setBounds(31, 700, 143, 21);
		panel.add(checkInvertir);


		
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

	public static JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		InterfazGrafica.panel = panel;
	}

	public static JPanel getPanel_izquierdo() {
		return panel_izquierdo;
	}

	public static JLabel getLabPropietario() {
		return labPropietario;
	}


	public static JSpinner getSpinnerManga() {
		return spinnerManga;
	}

	public static JSpinner getSpinnerEslora() {
		return spinnerEslora;
	}
	public static JSpinner getSpinnerLongitud() {
		return spinnerLongitud;
	}

	public static JSpinner getSpinnerPasajeros() {
		return spinnerPasajeros;
	}

	public static JButton getBotonCargar() {
		return botonCargar;
	}

	public static JButton getBotonTerminar() {
		return botonTerminar;
	}
	public static JRadioButton getBotonAvion() {
		return botonAvion;
	
	}public static JRadioButton getBotonBarco() {
		return botonBarco;
	}
	
	public static JTextField getNomVehiculo() {
		return nomVehiculo;
	}

	public static JComboBox<String> getComboColores() {
		return comboColores;
	}

	public static JCheckBox getCheckInvertir() {
		return checkInvertir;
	}
}
