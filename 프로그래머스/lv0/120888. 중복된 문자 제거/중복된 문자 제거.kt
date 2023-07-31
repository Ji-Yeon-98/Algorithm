class Solution {
    fun solution(my_string: String): String {

        var answer:String = ""
        var idx = 0

        for (my_char in my_string){
            if (answer.substring(0,idx).contains(my_char)){
                continue
            }else{
                answer = answer + my_char
            }
            idx ++
        }
        
        return answer
    }
}