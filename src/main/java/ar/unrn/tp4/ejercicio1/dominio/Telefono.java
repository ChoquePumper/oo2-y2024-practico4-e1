package ar.unrn.tp4.ejercicio1.dominio;

public class Telefono {
	private String tel;

	public Telefono(String telefono) {
		if (telefono == null)
			throw new RuntimeException("Debe cargar un telefono");
		if (!esValido(telefono))
			throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");
		this.tel = telefono;
	}

	private static boolean esValido(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

	@Override
	public String toString() {
		return tel;
	}
}
