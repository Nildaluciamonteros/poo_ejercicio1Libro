
package entidades;

/*Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos }
al usuario y luego informar
mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.*/
public class Libro {
    public int isnb;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(int isnb, String titulo, String autor, int paginas) {
        this.isnb = isnb;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getIsnb() {
        return isnb;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isnb=" + isnb + '}';
    }


    
    
    
}
