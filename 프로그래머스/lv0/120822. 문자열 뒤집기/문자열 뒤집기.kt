class Solution {
    fun solution(my_string: String): String {
        var answer:String = ""

        for(i in my_string.length -1 downTo 0){
            answer += my_string[i]
        }

        return answer
    }
}