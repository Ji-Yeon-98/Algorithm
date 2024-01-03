class Solution {
    fun solution(s: String): String {
    
        var answer : String = ""
        var up = s.filter { it.isUpperCase() }.map { it }.sorted().reversed().joinToString("")
    var low = s.filter { it.isLowerCase() }.map { it }.sorted().reversed().joinToString("")
    answer = low + up
        
        return answer
    }
}