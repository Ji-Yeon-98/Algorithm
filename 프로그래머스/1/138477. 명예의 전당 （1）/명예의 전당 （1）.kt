class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var result : MutableList<Int> = mutableListOf()
        val min : MutableList<Int> = mutableListOf()

        for(s in score){
            min.add(s)

            if(min.size <= k){
                result.add(min.sorted().get(0))
            }else{
                result.add(min.sorted().get(min.size-k))
            }
        }

        return result.toIntArray()
    }
}