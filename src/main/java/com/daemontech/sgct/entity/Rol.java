package com.daemontech.sgct.entity;

public enum Rol {
	
	ADMINISTRADOR("Administrador"), ENCARGADO("Encargado"), PERSONAL("Personal");
	// ver como implementar esto

	private Rol(String nombre) {
		this.nombre = nombre;
	}
	
	private String nombre;

	@Override
	public String toString() {

		return nombre;
	}
	
}
