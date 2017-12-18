package medicontact;

public class medico{
  private String nombre;
  private String apellidop;
  private String apellidom;
  private double cedula;

	/**
	* Returns value of nombre
	* @return
	*/
	public String getNombre() {
		return nombre;
	}

	/**
	* Returns value of apellidop
	* @return
	*/
	public String getApellidop() {
		return apellidop;
	}

	/**
	* Returns value of apellidom
	* @return
	*/
	public String getApellidom() {
		return apellidom;
	}

	/**
	* Returns value of cedula
	* @return
	*/
	public double getCedula() {
		return cedula;
	}

	/**
	* Sets new value of nombre
	* @param
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Sets new value of apellidop
	* @param
	*/
	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	/**
	* Sets new value of apellidom
	* @param
	*/
	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	/**
	* Sets new value of cedula
	* @param
	*/
	public void setCedula(double cedula) {
		this.cedula = cedula;
	}
}
