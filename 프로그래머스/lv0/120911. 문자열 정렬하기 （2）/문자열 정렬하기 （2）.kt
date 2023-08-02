class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        
        for(my_char in my_string){
            if(my_char.isUpperCase()){
                answer = answer + my_char.toLowerCase()
            }else{
                answer = answer + my_char
            }
            println(answer)
        }
        
        return answer.toCharArray().sortedArray().joinToString("")
    }
}

//return my_string.toLowerCase().toCharArray().sortedArray().joinToString("")