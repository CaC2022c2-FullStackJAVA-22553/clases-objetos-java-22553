
package clasesobjetos;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        //p1.presentarse(true);
        
        p1.nombre = "Alan";
        p1.apellido = "Turing";
        
        p1.presentarse(false);
        
        Persona p2 = new Persona();
        p2.nombre = "Ada";
        p2.apellido = "Lovelace";
        
        p2.presentarse(true);
        
        System.out.println(p1);
        System.out.println(p2);
        
        ////////////////
        System.out.println("PROBEMOS....");
        p1 = p2;
        System.out.println(p1);
        System.out.println(p2);
        p1.presentarse(true); // ¿Alan Turing o Ada Lovelace?
        
        /*
            ¿Qué pasó con Alan Turing?
            Sigue ahí, pero no tengo forma de llegar a él.
            Entonces se lo lleva el GC (Garbage Collector)
        */
        
        /*Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();*/
    }

}
