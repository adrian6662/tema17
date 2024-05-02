package Clase;

class Alumno {
    private String nombre;
    private String apellido;
    private String direccion;
    private String asignatura;
    private double nota;

    public Alumno(String nombre, String apellido, String direccion, String asignatura, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAsignatura() {
        return asignatura;
    }

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
    
}
