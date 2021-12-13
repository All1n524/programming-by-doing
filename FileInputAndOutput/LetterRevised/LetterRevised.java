//File Input and Output Letter Revisited 40 points Allen Hung
import java.io.*;
public class LetterRevised{
	public static void main(String args[]) throws IOException{
	File letter = new File("letter.txt");
	FileWriter fw =new FileWriter(letter);
	PrintWriter pw = new PrintWriter(fw);
		pw.println("+-------------------------------------------------------------+");
		pw.println("|                                                        #### |");
		pw.println("|                                                        #### |");
		pw.println("|                                                        #### |");
		pw.println("|                                                             |");
		pw.println("|                            Allen Hung                       |");
		pw.println("|                            PacificAmericanSchool            |");
		pw.println("|                            Fuxing Road                      |");
		pw.println("|                                                             |");
		pw.println("+-------------------------------------------------------------+");
		pw.close();
	}
}
