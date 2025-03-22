import java.util.ArrayList;
import java.util.Scanner;

public class BiasDetector {
    public static ArrayList<String> found = new ArrayList<String>();

    static void dectector(String[][] words, String input){
        for (int i = 0; i<words.length; i++){
            for (int j = 0; j < words[i].length; j++){
                if (input.indexOf(words[i][j]) != -1){
                    found.add(words[i][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        String[][] biasKeyword = {
            /*confirmation bias*/{"confirm", "support", "agree", "bias", "belief"},
            /*availability bias*/{"easily", "remember", "vivid", "recent", "availability"},
            /*Anchoring bias*/{"first impression", "initial", "anchor", "starting point"},
            /*Hindsight bias*/{"knew it", "obvious", "expected", "hindsight"},
            /*overconfidence bias*/{"sure", "certain", "guaranteed", "overconfident"},
            /*Framing effect*/{"perspective", "framed", "viewpoint", "context"}};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input your text here");
        String text = input.nextLine();

        dectector(biasKeyword, text.toLowerCase());

        if (found.size() != 0){
            //String placeholder = "";
            for(int i = 0; i < found.size(); i++){
                //placeholder = placeholder + found.get(i) + ", ";
                System.out.println("the following words might be bias: " + found);
            }
        }
        else{
            System.out.println("Bias was not found");
        }

        input.close();
    }
}
