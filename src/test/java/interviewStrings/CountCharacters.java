package interviewStrings;

public class CountCharacters {

  //  Count of characters in string

    public static int countCharactersInAString(String str){

        int count = 0;
        for(int i=0; i< str.length(); i++){
            count ++;
        }
        return(count);
    }

    public static void main(String[] args) {
        String str = "sdhvdklvdsvjdlvjsd/v;dl";
        int countCharacters = countCharactersInAString(str);
        System.out.println(countCharacters);
    }
}
