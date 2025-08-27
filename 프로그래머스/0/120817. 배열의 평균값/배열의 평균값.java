class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int avg = 0;
        
        for(int i : numbers) avg += i;
        answer = ((double)avg / numbers.length);
        return answer;
    }
}