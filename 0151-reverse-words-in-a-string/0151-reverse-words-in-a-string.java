class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i>=0){
            //remove all the tralling spaces
            while(i>-0 && s.charAt(i) == ' '){
                i--;
            }
            //check value of i
            if(i<0){
                break;
            }
            int j = i;
            //find the start index of the word
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            //jaise hi j space wale index pr aye toh rukh jayaga
            //ab iss word ka apna ans append krdena
            ans.append(s.substring(j+1, i+1));
            //remove faltu k space wher j is standing and add a space in ans

            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            //j < 0, iska mtlb first word k uper needed
            //j >= 0, space needed
            if(j>=0){
                ans.append(' ');
            }
            //place i at last index of the remainging string
            i = j;
        }
        return ans.toString();
    }
}