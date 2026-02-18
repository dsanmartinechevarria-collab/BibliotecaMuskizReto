package bibliotecaMuskiz;

public class Penalizaciones {
    //Atributos
    private String gravedad;
    private int numpena;
    private Usuario usuario;
    //Metodo constructor
    public Penalizaciones (String grav, int numpe, Usuario usu){
        this.gravedad=grav;
        this.numpena=numpe;
        this.usuario=usu;
    }
    public Penalizaciones (){
        this.gravedad="";
        this.numpena=0;
        this.usuario=new Usuario();
    }
    //otros metodos
    public boolean numpenalizaciones(int numpena){
        return (this.numpena>=3);
    }

    //getters y setters
    //gravedad
    public String getgravedad(){
        return this.gravedad;
    }
    public void setgravedad(String grav){
        this.gravedad=grav;
    }
    //numpena
    public int getnumpena(){
        return this.numpena;
    }
    public void setnumpena(int numpe){
        this.numpena=numpe;
    }
    //usuario
    public Usuario getusuario(){
        return this.usuario;
    }
    public void setusuario(Usuario usu){
        this.usuario=usu;
    }
}
