class Solution {
    public int solution(int n, int k) {
        int sheep = 12000 * n;
        int drink = 2000;

        for(int i = 10; i <= n; i+=10) {
            if( n >= 10 ) k -= 1;
        }
        
        drink = drink * k;
        return sheep + drink;
    }
}