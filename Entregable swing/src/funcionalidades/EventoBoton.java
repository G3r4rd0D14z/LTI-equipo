package funcionalidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import clases.HabilitaComponentes;
import clases.Persona;
import interfazUsuario.InterfazGrafica;

public class EventoBoton implements ActionListener{
	
	private HabilitaComponentes habilitador = new HabilitaComponentes();
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String nombre = InterfazGrafica.getTextField().getText().trim();
		String apellido = InterfazGrafica.getTextField_1().getText().trim();
		int documento = Integer.parseInt(InterfazGrafica.getTextField_2().getText());
		String departamento = (String)InterfazGrafica.getComboBox().getSelectedItem();
		LocalDate fechaNacimiento = convertToLocalDateViaInstant(InterfazGrafica.getDateChooser().getDate());
		int num_hijos = (int) InterfazGrafica.getSpinner_1().getValue();
		
		InterfazGrafica.getListapersonas().add( new Persona(nombre,apellido,documento,departamento,num_hijos,fechaNacimiento));
		habilitador.habilitarDerecha(true);
		habilitador.habilitarIzquierda(false);
		InterfazGrafica.getLabPropietario().setText(InterfazGrafica.getListapersonas().get(InterfazGrafica.getListapersonas().size()-1).nombre +" "+ InterfazGrafica.getListapersonas().get(InterfazGrafica.getListapersonas().size()-1).apellido+ " tiene:");
	}
	
	public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	
	

}
