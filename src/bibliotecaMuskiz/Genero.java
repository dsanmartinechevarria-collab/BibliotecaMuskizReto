package bibliotecaMuskiz;

public class Genero {
    //Atributos
    private String nombre;  
    private int edadMinima;
    //Metodo contructor
    public Genero (String name, int agemin){
        this.nombre=name;
        this.edadMinima=agemin;
    }
    public Genero (){
        this.nombre="neutro";
        this.edadMinima=18;
    }
    //otros metodos
    public boolean edad(int edadMinima){
        return(this.edadMinima>18);
    }
    //getters y setters
    //nombre
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String name){
        this.nombre=name;
    }
    //edadminima
    public int geteedadMinima(){
        return this.edadMinima;
    }
    public void setedadMinima(int agemin){
        this.edadMinima=agemin;
    }
    //toString()
	@Override
	public String toString() {
		return "Genero [nombre=" + nombre + ", edadMinima=" + edadMinima + "]";
	}
    //hasCode y Equals
	@Override
	public int hashCode() {
		return Objects.hash(edadMinima, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return edadMinima == other.edadMinima && Objects.equals(nombre, other.nombre);
	}
	
}
