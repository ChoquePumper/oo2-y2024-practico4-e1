package oo2.practico4.ejercicio1;

import ar.unrn.tp4.AgregarParticipante;

import java.awt.EventQueue;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AgregarParticipante();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}
