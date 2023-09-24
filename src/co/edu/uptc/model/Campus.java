package co.edu.uptc.model;

public class Campus {
	
	private String name;

	public Campus(String nombre) {
		this.name = nombre;
	}

	public String getNombre() {
		return name;
	}

	@Override
	public String toString() {
		return "Campus [name=" + name + "]";
	}
	
}
