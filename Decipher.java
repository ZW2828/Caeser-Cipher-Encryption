
/**
 * Write a description of class Decipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Decipher
{
    public static String decrypt(String str)//"encrypt"
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
                int AnewCh = AorgCh-3;
                if((AnewCh < (int)'a'&&AnewCh>(int)'Z')||(AnewCh<(int)'A')){
                    AnewCh += 26;
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
