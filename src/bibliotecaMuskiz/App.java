package bibliotecaMuskiz;

public class App {
    public static void main(String[] args) {

        // ================= GENEROS =================
        Genero g1 = new Genero("Terror",18);
        Genero g2 = new Genero("Fantasia",12);
        Genero g3 = new Genero("Romance",16);
        Genero g4 = new Genero("Ciencia Ficcion",14);
        Genero g5 = new Genero("Misterio",15);

        // ================= AUTORES =================
        Autor a1 = new Autor("Autor1",1001,60,g1,"Editorial A");
        Autor a2 = new Autor("Autor2",1002,45,g2,"Editorial B");
        Autor a3 = new Autor("Autor3",1003,55,g3,"Editorial C");
        Autor a4 = new Autor("Autor4",1004,35,g4,"Editorial D");
        Autor a5 = new Autor("Autor5",1005,70,g5,"Editorial E");

        // ================= LIBROS =================
        Libro l11 = new Libro("Libro1_A1",2001,a1,150,"Editorial A",g1);
        Libro l12 = new Libro("Libro2_A1",2002,a1,250,"Editorial A",g1);
        Libro l13 = new Libro("Libro3_A1",2003,a1,350,"Editorial A",g1);
        Libro l14 = new Libro("Libro4_A1",2004,a1,450,"Editorial A",g1);
        Libro l15 = new Libro("Libro5_A1",2005,a1,550,"Editorial A",g1);

        Libro l21 = new Libro("Libro1_A2",2011,a2,200,"Editorial B",g2);
        Libro l22 = new Libro("Libro2_A2",2012,a2,300,"Editorial B",g2);
        Libro l23 = new Libro("Libro3_A2",2013,a2,400,"Editorial B",g2);
        Libro l24 = new Libro("Libro4_A2",2014,a2,500,"Editorial B",g2);
        Libro l25 = new Libro("Libro5_A2",2015,a2,600,"Editorial B",g2);

        Libro l31 = new Libro("Libro1_A3",2021,a3,120,"Editorial C",g3);
        Libro l32 = new Libro("Libro2_A3",2022,a3,220,"Editorial C",g3);
        Libro l33 = new Libro("Libro3_A3",2023,a3,320,"Editorial C",g3);
        Libro l34 = new Libro("Libro4_A3",2024,a3,420,"Editorial C",g3);
        Libro l35 = new Libro("Libro5_A3",2025,a3,520,"Editorial C",g3);

        Libro l41 = new Libro("Libro1_A4",2031,a4,180,"Editorial D",g4);
        Libro l42 = new Libro("Libro2_A4",2032,a4,280,"Editorial D",g4);
        Libro l43 = new Libro("Libro3_A4",2033,a4,380,"Editorial D",g4);
        Libro l44 = new Libro("Libro4_A4",2034,a4,480,"Editorial D",g4);
        Libro l45 = new Libro("Libro5_A4",2035,a4,580,"Editorial D",g4);

        Libro l51 = new Libro("Libro1_A5",2041,a5,160,"Editorial E",g5);
        Libro l52 = new Libro("Libro2_A5",2042,a5,260,"Editorial E",g5);
        Libro l53 = new Libro("Libro3_A5",2043,a5,360,"Editorial E",g5);
        Libro l54 = new Libro("Libro4_A5",2044,a5,460,"Editorial E",g5);
        Libro l55 = new Libro("Libro5_A5",2045,a5,560,"Editorial E",g5);

        // ================= USUARIOS =================
        Usuario u1 = new Usuario("Usuario1",20,1,g1);
        Usuario u2 = new Usuario("Usuario2",25,4,g2);

        // ================= EJEMPLARES =================
        Ejemplares e1 = new Ejemplares(l21,1234,g2);
        Ejemplares e2 = new Ejemplares(l22,4321,g2);
        Ejemplares e3 = new Ejemplares(l23,1111,g2);

        // ================= PENALIZACIONES =================
        Penalizaciones p1 = new Penalizaciones("grave",2,u1);
        Penalizaciones p2 = new Penalizaciones("leve",4,u2);

        // ================= OPERACIONES =================

        //1. Total libros (manual)
        int totalLibros = 25;
        System.out.println("Total de libros: " + totalLibros);

        //2. Media paginas Autor1
        int mediaA1 = (l11.getnumeroPaginas() + l12.getnumeroPaginas() +
                       l13.getnumeroPaginas() + l14.getnumeroPaginas() +
                       l15.getnumeroPaginas()) / 5;
        System.out.println("Media paginas Autor1: " + mediaA1);

        //3. Autores mayores de 50
        System.out.println("Autores mayores de 50:");
        if(a1.edadautor(a1.getedad())) System.out.println(a1.getnombre());
        if(a2.edadautor(a2.getedad())) System.out.println(a2.getnombre());
        if(a3.edadautor(a3.getedad())) System.out.println(a3.getnombre());
        if(a4.edadautor(a4.getedad())) System.out.println(a4.getnombre());
        if(a5.edadautor(a5.getedad())) System.out.println(a5.getnombre());

        //4. Libros con mas de 500 paginas
        System.out.println("Libros con mas de 500 paginas:");
        if(l11.numeroDePaginas(l11.getnumeroPaginas())) System.out.println(l11.gettitulo());
        if(l12.numeroDePaginas(l12.getnumeroPaginas())) System.out.println(l12.gettitulo());


        //5. Usuarios con 3 o mas penalizaciones
        System.out.println("Usuarios con muchas penalizaciones:");
        if(p1.numpenalizaciones(p1.getnumpena()))
            System.out.println(p1.getusuario().getnombre());

        if(p2.numpenalizaciones(p2.getnumpena()))
            System.out.println(p2.getusuario().getnombre());
    }
}
