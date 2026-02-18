package bibliotecaMuskiz;

public class Usuario {
    //Atributos
    private String nombre;
    private int edad;
    private int numpenalizacion;
    private Genero generofav;
    //metodo constructor
    public Usuario(String nom, int age, int numpena,Genero genfav){
        this.nombre=nom;
        this.edad=age;
        this.numpenalizacion=numpena;
        this.generofav=genfav;
    }
    public Usuario(){
        this.nombre="";
        this.edad=0;
        this.numpenalizacion=0;
        this.generofav=new Genero ("neutro",0);
    }
    //otros metodos
    public boolean numpen(int numpenalizacion){
        return (numpenalizacion>3 );
    }
    //getters y setters
    //nombre
        public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String nom){
        this.nombre=nom;
    }
    //edad
    public int getedad(){
        return this.edad;
    }
    public void setedad(int age){
        this.edad=age;
    }
    //numero de penalizaziones
    public int getnumpena(){
        return this.numpenalizacion;
    }
    public void setnumepena(int numpena){
        this.numpenalizacion=numpena;
    }
        //Genero
    public Genero getgenero(){
        return this.generofav;
    }
    public void setgenero(Genero gen){
        this.generofav=gen;
    }
}
