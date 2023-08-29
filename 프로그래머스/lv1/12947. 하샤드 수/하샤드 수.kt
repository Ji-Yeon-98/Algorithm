class Solution {
    fun solution(x: Int): Boolean {
        var result = 0

        x.toString().forEach { it -> result += Integer.parseInt(it.toString()) }

        if(x%result == 0){
            return true
        }else{
            return false
        }
    }
}