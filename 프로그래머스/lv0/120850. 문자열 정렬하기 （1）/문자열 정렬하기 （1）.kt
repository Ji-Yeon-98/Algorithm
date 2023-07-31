class Solution {
    fun solution(my_string: String): IntArray {
        var answer:IntArray = intArrayOf()

        for (my_char in my_string){
            if(my_char.isDigit()){
                answer = answer.plus(Integer.parseInt(my_char.toString()))
            }
        }

        return answer.sorted().toIntArray()
    }
}