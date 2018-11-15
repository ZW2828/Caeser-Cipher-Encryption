
/**
 * Write a description of class ImitationGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ImitationGame
{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the string you want to encrypt");
        String toBeEncrypted = read.nextLine();
        Cipher.encrypt(toBeEncrypted);
        String toBeDecrypted = Cipher.encrypt(toBeEncrypted);
        Decipher.decrypt(toBeDecrypted);
    }
}
