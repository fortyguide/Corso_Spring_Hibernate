package dependency_injection;
import org.springframework.beans.factory.annotation.Autowired;

public class MainDependencyInjection {

    /* L'annotation @Autowired va sopra la dichiarazione
     * dell'istanza di una classe annotata precedentemente
     * con l'annotation @Component. In questo modo non
     * abbiamo bisogno di inizializzare l'istanza con new,
     * dato che lo fa già Spring dietro le quinte/
     */
    @Autowired
    static Persona p;

    public static void main(String[] args) {
        p.nome = "";
        p.cognome = "";
    }
}
