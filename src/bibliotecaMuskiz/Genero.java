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

}
