package medicontact;

public class paciente {
  private String nombre;
  private String apellidop;
  private String apellidom;
  private int edad;
  private double altura;
  private double peso;
  private char sexo;


	public String getNombre() {
		return nombre;
	}

	public String getApellidop() {
		return apellidop;
	}

	public String getApellidom() {
		return apellidom;
	}

	public int getEdad() {
		return edad;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public char getSexo() {
		return sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
