package ar.unrn.tp4.ejercicio1.dominio;

import java.util.Objects;

public record Participante(Nombre nombre, Telefono telefono, Region region) {

	public Participante {
		Objects.requireNonNull(nombre, "Nombre no especificado.");
		Objects.requireNonNull(telefono, "Teléfono no especificado.");
		Objects.requireNonNull(region, "Región no especificada.");
	}

	public Participante(String nombre, String telefono, Region region) {
		this(new Nombre(nombre), new Telefono(telefono), region);
	}
}
