class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int finscore=0;
        int left=0;
        int right = tokens.length-1;
        Arrays.sort(tokens);
        int score=0;
        while(left<=right){
          
            if(power>=tokens[left]){
                score++;
                power-=tokens[left];
                left++;
                finscore = Math.max(finscore,score);
            }else if(score>=1){
                power+=tokens[right];
                right--;
                score--;
            }
            else{
                break;
            }
            
        }return finscore;
    }

}