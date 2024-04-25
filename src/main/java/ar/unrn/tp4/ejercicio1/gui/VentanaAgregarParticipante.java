package ar.unrn.tp4.ejercicio1.gui;

import ar.unrn.tp4.ejercicio1.dominio.Participante;
import ar.unrn.tp4.ejercicio1.dominio.Persistencia;
import ar.unrn.tp4.ejercicio1.dominio.Region;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarParticipante extends JFrame {
	private JTextField nombre;
	private JTextField telefono;
	private JTextField region;
	private Persistencia persistencia;

	public VentanaAgregarParticipante(Persistencia persistencia) {
		this.persistencia = persistencia;
		setupUIComponents();
	}

	private void setupUIComponents() {
		setTitle("Add Participant");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.nombre = new JTextField(10);
		this.telefono = new JTextField(10);
		this.region = new JTextField(10);
		this.nombre.setText("");
		this.telefono.setText("");
		this.region.setText("China");
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JLabel("Nombre: "));
		contentPane.add(nombre);
		contentPane.add(new JLabel("Telefono: "));
		contentPane.add(telefono);
		contentPane.add(new JLabel("Region: "));
		contentPane.add(region);
		JButton botonCargar = new JButton("Cargar");
		botonCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onBotonCargar();
			}
		});
		contentPane.add(botonCargar);
		setContentPane(contentPane);
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pack();
		setVisible(true);
	}

	private void onBotonCargar() {
		try {
			Participante p = new Participante(nombre.getText(), telefono.getText(), Region.CHINA);
			persistencia.agregarParticipante(p);
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error al cargar participante", JOptionPane.ERROR_MESSAGE);
		}
		dispose();
	}
}
