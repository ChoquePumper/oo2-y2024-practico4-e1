package ar.unrn.tp4.ejercicio1.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Observable {
	private final List<Observer> observadores = new ArrayList<>();

	public void agregarObservador(Observer observador) {
		observadores.add(observador);
	}

	protected void notificar(Map<String, Object> params) {
		for (Observer observador : observadores)
			observador.avisarNuevoRegistro(params);
	}
}

