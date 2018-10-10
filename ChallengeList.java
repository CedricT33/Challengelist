public class ChallengeList {

  /**
  * retourne la moyenne de a et de b
  */
  public static double moyenne(int a, int b){
    return (a + b) / 2;
  }

  /**
  * retourn le perimetre d'un carre de cÃ´tÃ© a
  */
  public static int perimetreCarre(int a){
    int carre = a * 4;
    return carre;
  }

  /**
  * retourne vrai si les 2 lettres du dÃ©but et de la fin sont les mÃªmes
  * ex "ABCDDFAB" : true
  */
  public static boolean commenceFini(String mot){
    char debut = mot.charAt(0);
    char fin = mot.charAt(mot.length()-1);
    if (debut == fin){
      return true;
    }
    else {
      return false;
    }

  }

  /**
  * retourne vrai si le mot contient des lettres différentes
  * ex "AAAAAA" : false
  * "AAAHAA" : true
  */
  public static boolean nonMonotone(String mot){

  }

  /**
  * retourne le tarif associÃ© Ã  l'Ã¢ge :
  * "gratuit" pour les moins de 3 ans
  * "reduit" pour les 3 Ã  12 ans
  * "plein" pour les autres
  * "erreur" si age nÃ©gatif
  **/
  public static String tarif(int age){
    String tarif;
    if (age < 3){
      tarif = "gratuit";
    }
    else if (age >= 3 && age <= 12){
      tarif = "reduit";
    }
    else if (age < 0){
      tarif = "erreur";
    }
    else {
      tarif = "plein";
    }
    return tarif;
  }

  /**
  * retourne un message correspondant Ã  la tempÃ©rature :
  * "Ã§a gÃ¨le" si la temperature est nÃ©gative
  * "Ã§a caille" pour une temperature entre 0 et 5
  * "RAS" pour une temperature en 5 et 90
  * "Ã§a bouille" si la tempÃ©rature est supÃ©rieure Ã  90
  * "erreur" si la tempÃ©rature est infÃ©rieure Ã  -274
  **/
  public static String caGele(int temperature){
    // TODO @B
    return null;
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui ont une longueur > 2
  **/
  public static String[] filtreShort(String[] noms){
    int nombreEntrees = 0;
    int increment = 0;
    for (int i = 0; i < noms.length; i++){
      if (noms[i].length() > 2){
        nombreEntrees++;
      }
    }
    String[] tableauResultat = new String[nombreEntrees];
    for (int i = 0; i < noms.length; i++){
      if (noms[i].length() > 2){
        tableauResultat[increment]
        increment++;
      }
    }
    return tableauResultat;
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui commencent par lettre
  **/
  public static String[] filtreLetter(String[] noms, char lettre){
    // TODO @B
    return null;
  }


  /**
  * un exemple
  **/
  public static int squareDigits(int n) {
    String res="";
    for (char digit : (n+"").toCharArray()){
      int d = Character.getNumericValue(digit);
      res = res + (d*d);
    }
    return Integer.parseInt(res);
  }


}
