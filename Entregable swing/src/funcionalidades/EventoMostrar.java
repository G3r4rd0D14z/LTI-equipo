package funcionalidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import clases.Persona;
import interfazUsuario.InterfazGrafica;

public class EventoMostrar implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for (Persona p : InterfazGrafica.getListapersonas()) {
			
			InterfazGrafica.getTextArea().append(p.toString());
		}
	
	}
}