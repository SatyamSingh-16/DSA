class Solution {
    public boolean isCircularSentence(String sentence) {
        char start = sentence.charAt(0);
        char end = sentence.charAt(sentence.length()-1);
        if(start != end){
            return false;
        }
        
        for(int i = 0;i<sentence.length()-1;i++){
            if(sentence.charAt(i+1)== ' '){
                char e = sentence.charAt(i);
                char s = sentence.charAt(i+2);
                if(e != s){
                    return false;
                }
            }
            
        }
        return true;
    }
}