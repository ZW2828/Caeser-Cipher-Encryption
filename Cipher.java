
/**
 * Write a description of class Cipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cipher
{
       public static String encrypt(String str)//"encrypt"
    {
        String newStr ="";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int AorgCh = (int)ch;
            if (AorgCh == (int)' '){
                String newCh = Character.toString((char)AorgCh);
                newStr = newStr + newCh;
            }

            else{
            int AnewCh = AorgCh+3;
            if(AnewCh > (int)'z'||(AnewCh>(int)'Z'&& AnewCh<(int)'a')){
                    AnewCh -= 26;
                    String newCh = Character.toString((char)AnewCh);
                    newStr = newStr + newCh;
            }
                else{
                    String newCh = Character.toString((char)AnewCh);
                    newStr = newStr + newCh;
                }
            }
        }
        System.out.println(newStr);
        return newStr;
    }
}
