package edu.unipiloto.softwarecomputacion.torreshanoi.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import edu.unipiloto.softwarecomputacion.torreshanoi.modelo.HanoiModelo;
import edu.unipiloto.softwarecomputacion.torreshanoi.vista.Vista;

public class Controlador implements ActionListener{
	
	protected HanoiModelo hanoi;
	protected Vista vista;
	
	public Controlador(){
		vista = new Vista();
		vista.getCalcularButton().addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Controlador();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vista.getCalcularButton()){
			try{
				int numDiscos = Integer.parseInt( vista.getNumdiscosTextField().getText() );
				hanoi = new HanoiModelo(numDiscos);
				String resultado = hanoi.getResultado();
				vista.getResultadoTextArea().setText(resultado);
				int numMovimientos = hanoi.getNumMovimientos();
				vista.getNummoviminetosTextField().setText(numMovimientos+"");
			}catch(Exception error){
				JOptionPane.showMessageDialog(vista, "Ingrese un valor numerico.");
			}
		}
	}
	
}
