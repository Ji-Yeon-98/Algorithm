class Solution {
    fun solution(my_string: String): String {
        var answer:String = ""
        var idx = 0

        for (my_char in my_string){
            if (my_char.isUpperCase()){
                answer = answer + my_char.toLowerCase()
            }else{
                answer = answer + my_char.toUpperCase()
            }
        }
        
        return answer
    }
}