package corenlp;

import java.io.*;
import java.util.*;
import edu.stanford.nlp.io.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.util.*;

/** app for testing if Maven distribution is working properly */

public class StanfordCoreNLPEnglishTestApp {
	
	public static void main(String[] args)
    {
        String[] englishArgs = new String[]{"-file", "sample-english.txt", "-outputFormat", "text", "-props", "english.properties"};
        try {
			StanfordCoreNLP.main(englishArgs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	

}
