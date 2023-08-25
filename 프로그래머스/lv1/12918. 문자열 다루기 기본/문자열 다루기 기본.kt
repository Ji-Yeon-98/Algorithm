class Solution {
    fun solution(s: String): Boolean {
        
        if(s.length == 4 || s.length == 6){
            val s1 = s.toCharArray().map { it -> it.isDigit() }
            if(s1.contains(false)){
                return false
            }else{
                return true
            }
        }else{
            return false
        }
    }
}