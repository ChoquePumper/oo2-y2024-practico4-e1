package ar.unrn.tp4.ejercicio1.dominio;

import java.util.Objects;

public class Nombre {

	private final String nombre;

	public Nombre(String nombre) {
		nombre = Objects.requireNonNullElse(nombre, "").trim();
		if (nombre.isBlank())
			throw new RuntimeException("Debe cargar un nombre");
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
