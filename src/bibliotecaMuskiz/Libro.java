package bibliotecaMuskiz;

public class Libro {
    //Atributos
    private String titulo;
    private int codigo;
    private Autor autor;
    private int numeroPaginas;
    private String editorial;
    private Genero genero;
    //Metodo constructor
    public Libro(String tit,int cod,Autor aut, int numpag, String edit, Genero gen){
        this.titulo=tit;
        this.codigo=cod;
        this.autor=aut;
        this.numeroPaginas=numpag;
        this.editorial=edit;
        this.genero=gen;
    }
    public Libro(){
        this.titulo="";
        this.codigo=00000;
        this.autor=new Autor ("",0000,0,new Genero("",0),"");
        this.numeroPaginas=250;
        this.editorial="";
        this.genero=new Genero ("",18);
    }
    //otros metodo
    public boolean numeroDePaginas(int numeroPaginas){
        return (this.numeroPaginas>500);
    }
    //getter y setters//
    //titulo
    public String gettitulo(){
        return this.titulo;
    }
    public void settitulo(String tit){
        this.titulo=tit;
    }
    //codigo
    public int getcodigo(){
        return this.codigo;
    }
    public void setcodigo(int cod){
        this.codigo=cod;
    }
    //autor
    public Autor getautor(){
        return this.autor;
    }
    public void setautor(Autor aut){
        this.autor=aut;
    }
    //numeropaginas
        public int getnumeroPaginas(){
        return this.numeroPaginas;
    }
    public void setnumeroPaginas(int numpag){
        this.numeroPaginas=numpag;
    }
    //editorial
        public String geteditorial(){
        return this.editorial;
    }
    public void seteditorial(String edit){
        this.editorial=edit;
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
		return "Libro [titulo=" + titulo + ", codigo=" + codigo + ", autor=" + autor + ", numeroPaginas="
				+ numeroPaginas + ", editorial=" + editorial + ", genero=" + genero + "]";
	}
    //hasCode y Equals
	@Override
	public int hashCode() {
		return Objects.hash(autor, codigo, editorial, genero, numeroPaginas, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && codigo == other.codigo
				&& Objects.equals(editorial, other.editorial) && Objects.equals(genero, other.genero)
				&& numeroPaginas == other.numeroPaginas && Objects.equals(titulo, other.titulo);
	}
	
}
