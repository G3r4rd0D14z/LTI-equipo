package funcionalidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JComponent;

import clases.HabilitaComponentes;
import clases.Persona;
import clases.ReseteaCampos;
import interfazUsuario.InterfazGrafica;

public class EventoBoton implements ActionListener{
	
	private HabilitaComponentes habilitador = new HabilitaComponentes();
	JComponent[] paraResetear = {
			 					 InterfazGrafica.getTextField(),
								 InterfazGrafica.getTextField_1(),
								 InterfazGrafica.getTextField_2(),
								 InterfazGrafica.getSpinner_1()
								 };
	private ReseteaCampos reseteador = new ReseteaCampos();
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String nombre = InterfazGrafica.getTextField().getText().trim();
		String apellido = InterfazGrafica.getTextField_1().getText().trim();
		int documento = Integer.parseInt(InterfazGrafica.getTextField_2().getText());
		String departamento = (String)InterfazGrafica.getComboBox().getSelectedItem();
		LocalDate fechaNacimiento = convertToLocalDateViaInstant(InterfazGrafica.getDateChooser().getDate());
		double num_hijos = (double) InterfazGrafica.getSpinner_1().getValue();
		
		InterfazGrafica.getListapersonas().add( new Persona(nombre,apellido,documento,departamento,num_hijos,fechaNacimiento));
		habilitador.habilitarDerecha(true);
		habilitador.habilitarIzquierda(false);
		InterfazGrafica.getLabPropietario().setText(InterfazGrafica.getListapersonas().get(InterfazGrafica.getListapersonas().size()-1).nombre +" "+ InterfazGrafica.getListapersonas().get(InterfazGrafica.getListapersonas().size()-1).apellido+ " tiene:");
		
		reseteador.resetear(paraResetear);
	}
	
	public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	
	

}
