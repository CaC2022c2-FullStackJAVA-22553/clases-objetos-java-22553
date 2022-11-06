
package clasesobjetos;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona {
    String nombre;
    String apellido;
    String colorDePelo;
    double altura;
    int edad;
    Auto auto;
    
    String nombreCompleto () {
        return this.nombre + " " + this.apellido;
    }
    
    void presentarse(boolean conEntusiasmo) {
        String saludo = "Hola, soy " + this.nombreCompleto() + ", un gusto";
        if (conEntusiasmo) {
            saludo = saludo + "!!!";
        }
        System.out.println(saludo);
    }
}
