package bibliotecaMuskiz;

public class Ejemplares {
    //Atributos
    private Libro libro;
    private int codigo;
    private Genero genero;
    //Metodo constructor
    public Ejemplares (Libro lib, int cod, Genero gen){
        this.libro=lib;
        this.codigo=cod;
        this.genero=gen;
    }
    public Ejemplares(){
        this.libro=new Libro();
        this.codigo=00000;
        this.genero=new Genero();
    }
    //otros metodos
    public boolean numcod(int cod){
        return (this.codigo==00000);
    }
    //getters y setters
    //libro
    public Libro getlibro(){
        return this.libro;
    }
    public void setlibro(Libro lib){
        this.libro=lib;
    }
    //codigo
    public int getcodigo(){
        return this.codigo;
    }
    public void setcodigo(int cod){
        this.codigo=cod;
    }
    //genero
    public Genero getgenero(){
        return this.genero;
    }
    public void setgenero(Genero gen){
        this.genero=gen;
    }
    //toString()
    	@Override
	public String toString() {
		return "Ejemplares [libro=" + libro + ", codigo=" + codigo + ", genero=" + genero + "]";
	}
    	//hasCode y Equals
	@Override
	public int hashCode() {
		return Objects.hash(codigo, genero, libro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejemplares other = (Ejemplares) obj;
		return codigo == other.codigo && Objects.equals(genero, other.genero) && Objects.equals(libro, other.libro);
	}
}
