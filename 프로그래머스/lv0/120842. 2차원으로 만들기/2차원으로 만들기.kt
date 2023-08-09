class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        var b_answer = intArrayOf()

        for ( num in num_list){

            b_answer = b_answer.plus(num)

            if (b_answer.size == n){
                answer = answer.plus(b_answer)
                b_answer = intArrayOf()
            }
        }
        
        return answer
    }
}