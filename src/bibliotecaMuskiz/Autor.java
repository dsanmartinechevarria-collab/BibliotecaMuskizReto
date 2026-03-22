package bibliotecaMuskiz;

public class Autor {
    //Atributos
    private String nombre;
    private int codigo;
    private int edad;
    private Genero genero;
    private String editorial;
    //Metodo constructor
    public Autor (String nom,int cod, int age, Genero gen, String edit){
        this.nombre=nom;
        this.codigo=cod;
        this.edad=age;
        this.genero=gen;
        this.editorial=edit;
    }
    public Autor (){
        this.nombre="";
        this.codigo=0000;
        this.edad=0;
        this.genero=new Genero ("neutro",0);
        this.editorial="editorial blanca";
    }
    //otros metodos
    public boolean edadautor(int edad){
        return(edad>50);
    }
    //getters y setters
    //nombre
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String nom){
        this.nombre=nom;
    }
    //codigo
    public int getcodigo(){
        return this.codigo;
    }
    public void setcodigo(int cod){
        this.codigo=cod;
    }
    //edad
    public int getedad(){
        return this.edad;
    }
    public void setedad(int age){
        this.edad=age;
    }
    //Genero
    public Genero getgenero(){
        return this.genero;
    }
    public void setgenero(Genero gen){
        this.genero=gen;
    }
    //editorial
    public String geteditorial(){
        return this.editorial;
    }
    public void seteditorial(String edit){
        this.editorial=edit;
    }
        //toString()
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", codigo=" + codigo + ", edad=" + edad + ", genero=" + genero
				+ ", editorial=" + editorial + "]";
    }
    	//hasCode y Equals
	@Override
	public int hashCode() {
		return Objects.hash(codigo, edad, editorial, genero, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return codigo == other.codigo && edad == other.edad && Objects.equals(editorial, other.editorial)
				&& Objects.equals(genero, other.genero) && Objects.equals(nombre, other.nombre);
	}
}
