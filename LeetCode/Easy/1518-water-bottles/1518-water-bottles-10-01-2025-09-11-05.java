class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result=numBottles;
        while(numBottles>=numExchange){
            int newBottles = numBottles / numExchange;
            int remainder = numBottles % numExchange;
            result += newBottles;
            numBottles = newBottles + remainder;
        }
        return result;
    }
}