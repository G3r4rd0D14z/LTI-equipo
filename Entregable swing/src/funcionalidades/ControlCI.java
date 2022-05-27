package funcionalidades;

import java.awt.Color;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import interfazUsuario.InterfazGrafica;

public class ControlCI implements DocumentListener{
	
	private boolean numero;


	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		numero = esNumero();
		validarCi();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
		validarCi();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private boolean esNumero() {
		
		
		boolean valido = true;
		
		try {
			Integer.parseInt(InterfazGrafica.getTextField_2().getText());
		}catch(Exception e) {
			valido = false;
		}
		
		
		return valido;
	}
	
	private boolean ciCorrecta() {
		
		boolean ciCorrecta = false;
		
		if(InterfazGrafica.getTextField_2().getText().length() > 8 || InterfazGrafica.getTextField_2().getText().length() < 8 || !numero) {
			ciCorrecta = false;
		}else if(InterfazGrafica.getTextField_2().getText().length() == 8 && numero){
			ciCorrecta = true;
		}
		
		return ciCorrecta;
	}
	private void validarCi() {
		
		if(!ciCorrecta()) {
			
			InterfazGrafica.getTextField_2().setForeground(Color.RED);
			InterfazGrafica.getButton().setEnabled(false);
		}else if(ciCorrecta()) {
			
			InterfazGrafica.getTextField_2().setForeground(Color.GREEN);
		}
	}

}
