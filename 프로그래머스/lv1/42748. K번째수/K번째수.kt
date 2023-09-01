class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        for(i in 0 until  commands.size){
            var result = array.filterIndexed { index, int -> index >= commands[i][0] - 1 && index < commands[i][1] }.sorted()[commands[i][2]-1]
            answer = answer.plus(result)
        }
        
        return answer
    }
}