package nombre;

import operation.exception.OutOfCapicityException;

/**
 * Encapsule un nombre constant entier<br>
 *
 * @author B.L.
 * @version : 1.0
 */


public class Nombre {
    private int valeurNombre; // Entier encapsulé
    /**
     * Constructeur
     *
     * @param uneValeur valeur entière qui sera encapsulé par Nombre
     */
    public Nombre(int uneValeur) {
        super();

        this.valeurNombre = uneValeur;
    }

    /**
     * Evalue la valeur du Nombre
     *
     * @return (int) valeur encapsulé par Nombre
     */
    public int valeurNombre() {

        return this.valeurNombre;
    }

    /**
     * Représentation du Nombre courant sous forme d'une chaîne de caractères
     *
     * @return (String) chaine de caractères représentant le nombre
     */
    public String toString() {
        return Integer.toString(this.valeurNombre);
    }

}
// fin classe partie_1.correction_partie_1.Nombre
