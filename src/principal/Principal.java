
package principal;

public class Principal {

    public static void main(String[] args) {
       
        Libros objeto = new Libros();
        
        objeto.setNombre("La biblia de los caidos");
        objeto.setAutor("Fernando Trujillo");
        objeto.setAño(2010);
        objeto.setGenero("Ficcion paranormal");
        
        System.out.println(objeto.getNombre());
        System.out.println(objeto.getAutor());
        System.out.println(objeto.getAño());
        System.out.println(objeto.getGenero());
    }
    
}
