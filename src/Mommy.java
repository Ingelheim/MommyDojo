import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;

/**
 * Created by lingelhe on 29/01/2014.
 */
public class Mommy {

    public String mommify(String input) {
        String answer = "";
        String letter;
        double wordCount = input.length();
        double vowelCount = 0;
        boolean lastLetterConsonant = true;

        for (char character : input.toCharArray()) {
            letter = String.valueOf(character);

            if (isVowel(letter) && lastLetterConsonant) {
                answer+="mommy";
                vowelCount++;
                lastLetterConsonant = false;
            } else if (isVowel(letter) && !lastLetterConsonant){
                answer+="";
                vowelCount++;
                lastLetterConsonant = false;
            } else {
                answer+=letter;
                lastLetterConsonant = true;
            }
        }

        return isMommyfiable(vowelCount, wordCount) ? answer : input;
    }

    private boolean isVowel(String input) {
        String vowels = "AEIOUaeiou";
        return vowels.contains(input);
    }

    private boolean isMommyfiable(double vowelCount, double wordCount) {
        return (vowelCount / wordCount) >= 0.3;
    }
}
