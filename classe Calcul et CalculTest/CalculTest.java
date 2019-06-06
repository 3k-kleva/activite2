import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
/** Tests unitaire pour la classe Calcul.
 *
 * @author koffi kougblenou
 */
public final class CalculTest {
  /** Déclaration de variable static. */
  static final int M = 3;
  /** Déclaration de variable static. */
  static final int Z = 8;
  /** Déclaration de variable static. */
  static final int S = 5;
  /** Déclaration de variable static. */
  static final int A = 2;
  /** Déclaration de variable static. */
  static final int B = 4;
  /** Déclaration de variable static. */
  static final int C = 0;
  /** Déclaration de variable static. */
  static final int P = 16;
  /** Test du constructeur . */
  @Test
  public void testConstructeur() {
    assertNotNull(new Calcul());
  }
  /** Test de la methode qui fait la somme . */
  @Test
  public void testSomme() {
    assertEquals(S, Calcul.somme(A, M));
  }
  /** Déclaration de l'exception. */
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  /** Test de la methode division cas ou b vaut 0. */
  @Test
  public void testDivisionParZero() { 
	thrown.expect(IllegalArgumentException.class);
	thrown.expectMessage("b ne doit pas etre 0");
	Calcul.division(Z, C);
  }
  /** Test de la methode la division cas ou b différent de 0. */
  @Test
  public void testDivision() { 
	assertEquals(B, Calcul.division(Z, A));
  }
  /** Test de la méthode maFonction. */
  @Test
  public void testMaFonction() {
    assertEquals(C, Calcul.maFonction(Z, P));
	assertEquals(B, Calcul.maFonction(Z, B));
  }
}
