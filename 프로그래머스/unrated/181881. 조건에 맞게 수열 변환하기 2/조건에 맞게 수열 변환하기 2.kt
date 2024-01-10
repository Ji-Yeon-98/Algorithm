class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        
        var new: MutableList<Int> = arr.toMutableList()
        var old: MutableList<Int> = MutableList(arr.size){0}
        
        while(new != old){
            old = new
            new = new.map{ it -> if(it>=50 && it%2==0) it/2 else if(it<50 && it%2 == 1) it*2+1 else it }.toMutableList()
            answer += 1
        }
        
        return answer - 1
    }
}