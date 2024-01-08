class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        var n = n
        var reversed = mutableListOf<Int>()

        while(n != 0){
            reversed.add(n%3)
            n = n / 3
        }

        for(i in 0 .. reversed.size-1){
            answer = answer * 3 + (reversed[i] - 0)
        }
    
        return answer
    }
}