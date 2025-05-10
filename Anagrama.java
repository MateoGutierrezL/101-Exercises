public class Anagrama {

    static boolean anagramTest(String word1, String word2 ){

        int countTrue = 0;

        for(int j = 0; j < word1.length(); j++) {



            for (int k = 0; k < word2.length(); k++) {

                if (word1.charAt(j) == word2.charAt(k)) {
                    countTrue++;
                }
            }
        }

        if (countTrue == word1.length() ){
            return true;
        }else {
            return false;
        }
    }

}
