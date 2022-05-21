package funcionalidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import clases.Persona;
import clases.Vehiculo;
import interfazUsuario.InterfazGrafica;

public class EventoMostrar implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		InterfazGrafica.getTextArea().setText("");
		
		if(!InterfazGrafica.getCheckInvertir().isSelected()) {
			
			for(int i=0;i<InterfazGrafica.getListapersonas().size();i++) {
				
				Persona p = InterfazGrafica.getListapersonas().get(i);
				InterfazGrafica.getTextArea().append(p.toString());
			
				for(int j=0;j<p.getListaVehiculos().size();j++) {
					
					Vehiculo v = p.getListaVehiculos().get(j);
					InterfazGrafica.getTextArea().append(v.toString());

				}
			}
		
		}else if(InterfazGrafica.getCheckInvertir().isSelected()) {
			
			for(int i=InterfazGrafica.getListapersonas().size()-1;i>=0;i--) {
				
				Persona p = InterfazGrafica.getListapersonas().get(i);
				InterfazGrafica.getTextArea().append(p.toString());
			
				for(int j=p.getListaVehiculos().size()-1;j>=0;j--) {
					
					Vehiculo v = p.getListaVehiculos().get(j);
					InterfazGrafica.getTextArea().append(v.toString());

				}
			}
		}
	}	
}
