package edu.unipiloto.softwarecomputacion.torreshanoi.vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista extends JFrame{
	
	private JTextField numdiscosTextField = new JTextField("");
	private JTextField nummoviminetosTextField = new JTextField("");
	private JTextArea resultadoTextArea = new JTextArea();
	private JButton calcularButton = new JButton("Calcular");	
	
	public Vista(){
		super("Torres de Hanoi");
		this.setLayout(new GridBagLayout());
		iniciarVista();
		setSize(700, 500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void iniciarVista() {
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridy = 0;
		gbc.gridx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(numdiscosTextField,gbc);
		
		gbc.gridy = 0;
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(calcularButton,gbc);
		
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(nummoviminetosTextField,gbc);
		
		gbc.gridy = 1;
		gbc.gridx = 0;
		gbc.weighty = 8;
		gbc.weightx = 8;
		gbc.fill = GridBagConstraints.BOTH;
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(resultadoTextArea);
		add(scrollPane,gbc);
	}
	
	public JTextField getNummoviminetosTextField() {
		return nummoviminetosTextField;
	}

	public void setNummoviminetosTextField(JTextField nummoviminetosTextField) {
		this.nummoviminetosTextField = nummoviminetosTextField;
	}

	public JTextField getNumdiscosTextField() {
		return numdiscosTextField;
	}

	public void setNumdiscosTextField(JTextField numdiscosTextField) {
		this.numdiscosTextField = numdiscosTextField;
	}

	public JTextArea getResultadoTextArea() {
		return resultadoTextArea;
	}

	public void setResultadoTextArea(JTextArea resultadoTextArea) {
		this.resultadoTextArea = resultadoTextArea;
	}

	public JButton getCalcularButton() {
		return calcularButton;
	}

	public void setCalcularButton(JButton calcularButton) {
		this.calcularButton = calcularButton;
	}
	
}
