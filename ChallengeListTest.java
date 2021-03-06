import java.util.Arrays;

public class ChallengeListTest{

  /**
  * Les tests sont Ã  Ã©crire ici.
  * Il peut y avoir plusieurs assert pour chaque methode testÃ©e.
  */


  public static void testMoyenne(){
    assertEquals("test de la moyenne", 5.0, ChallengeList.moyenne(4, 7));
  }

  public static void testPerimetreCarre(){
    assertEquals("test du périmetre carré", 8, ChallengeList.perimetreCarre(2));
  }

  public static void testCommenceFini(){
    assertTrue("test commence fini vrai", ChallengeList.commenceFini("KOALAKO"));
    assertFalse("test commence fini faux", ChallengeList.commenceFini("KAYAU"));
  }

  public static void testNonMonotone(){
    assertTrue("test non monotone", ChallengeList.nonMonotone("AAAHAR"));
  }

  public static void testTarif(){
    assertEquals("test tarif", "erreur", ChallengeList.tarif(-5));
  }

  public static void testCaGele(){
    assertEquals("test ca gele", "ca caille", ChallengeList.caGele(3));
  }

  public static void testFiltreShort(){
    String[] tableauTest = {"Dupont", "Smith", "Martin"};
    String[] tableauTeste = {"Ya", "Dupont", "Smith", "S", "Mo", "Martin", "T"};
    assertEquals("test filtre mot court", tableauTest, ChallengeList.filtreShort(tableauTeste));
  }

  public static void testFiltreLetter(){
    String[] tableauTest = {"Cedric", "Coco"};
    String[] tableauTeste = {"Cedric", "Yoyo", "Coco", "Tutu", "Kiki", "Sam"};
    assertEquals("test filtre letter", tableauTest, ChallengeList.filtreLetter(tableauTeste, 'C'));
  }


  /**
  * un exemple de test
  */
  public static void testSquareDigits(){
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.squareDigits(4));
    assertEquals("SquareDigits plusieurs chiffres", 811181, ChallengeList.squareDigits(9119));
  }


  /****************************************************************************
  * NE PAS TOUCHER CE QUI SUIT
  **/
  public static void main(String[] args){
    testMoyenne();
    testPerimetreCarre();
    testCommenceFini();
    testNonMonotone();
    testSquareDigits();
    testTarif();
    testCaGele();
    testFiltreShort();
    testFiltreLetter();
  }

  public static void assertEquals(String message, String[] expected, String[] res){
    if (java.util.Arrays.deepEquals(expected, res)) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+Arrays.toString(expected)+", res : "+Arrays.toString(res)+")");
    }
  }

  public static void assertEquals(String message, String expected, String res){
    if (expected.equals(res)) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, double expected, double res){
    if (Math.abs(expected-res) < 0.0001) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, int expected, int res){
    if (expected == res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertTrue(String message, boolean res){
    if (res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (res : "+res+")");
    }
  }

  public static void assertFalse(String message, boolean res){
    assertTrue(message, !res);
  }
}
