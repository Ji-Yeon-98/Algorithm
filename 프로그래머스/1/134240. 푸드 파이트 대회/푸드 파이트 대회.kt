class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
    
        food.forEachIndexed { index, i -> if(index != 0 && i != 1) {for(j in 0 until i/2) answer += index.toString()} }
    
        var reversed = answer.reversed()
    
        food.forEachIndexed { index, i -> if(index == 0 && i == 1) answer += 0 }
    
        return answer + reversed
    }
}