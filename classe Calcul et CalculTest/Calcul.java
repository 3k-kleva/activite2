/** Une classe.
 *
 * @author koffi kougblenou
 */
public final class Calcul {
  /** K est une constant entier. */
  static final int K = 10;
  /** Constructeur de la classe. */
  //private void Calcul() { }
  /** Calcul la somme de deux nombres.
   * @param a est un entier
   * @param b est un entier
   * @return a + b
   */
  public static int somme(final int a, final int b) {
    return a + b;
  }
  /**
   * @param a est un entier.
   * @param b est un entier
   * @return a / b si b superieur ou egale à 0 et b sinon
   */
  public static int maFonction(final int a, final int b) {
    if (b >= K) {
       return a / b;
    } else {
        return b;
      }
  }
  /**
   * @param a est un entier.
   * @param b est un entier
   * @return a / b si b != 0
   * @throws IllegalArgumentException si b == 0
   */
  public static int division(final int a, final int b) {
    if (b == 0) {
      throw new IllegalArgumentException("b ne doit pas etre 0");
    } else {
        return a / b;
      }
  }
}
