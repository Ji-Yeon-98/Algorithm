import java.util.*

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0

        var stack = Stack<Int>()

        for(i in ingredient){
            stack.push(i)

            val index = stack.size
            if(stack.size >= 4 && stack[index-1] == 1 && stack[index-2] == 3 && stack[index-3] == 2 && stack[index-4] == 1){
                answer += 1
                repeat(4){stack.pop()}
            }
        }
    
        return answer
    }
}