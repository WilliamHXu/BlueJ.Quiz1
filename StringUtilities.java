
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String answer = "";
        for (int i = valueToBeReversed.length() - 1; i >= 0; i--) {
            answer = answer + valueToBeReversed.charAt(i);
        }
        return answer;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char mid = ' ';
        if (word.length() % 2 == 0) {
        mid = word.charAt((word.length()/2)-1);
    }
        if (word.length() % 2 == 1) {
        mid = word.charAt(((word.length()-1)/2));
    }
        return mid;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String answer = "";
        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) != charToRemove) {
                answer = answer + value.charAt(i);
            }
        }
        return answer;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        return sentenceArray[sentenceArray.length - 1];
    }
}
