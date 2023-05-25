package ejecutable;

import modelo.Libro;

public class Test{
    public static void main(String[] args) {
        Libro libro1 = new Libro("Rebeldes", "J.R.R. Tolkien", "1954", "No");
        System.out.println(libro1.toString());
    }
}