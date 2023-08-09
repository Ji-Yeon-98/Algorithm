class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        
        var x = listOf<Int>(0, 0, -1, 1)
        var y = listOf<Int>(1, -1, 0, 0)
        var direction = listOf<String>("up", "down", "left", "right")

        for ( key in keyinput){

            var idx = direction.indexOf(key)

            if (key == direction[idx]){

                val newX = answer[0] + x[idx]
                val newY = answer[1] + y[idx]

                if(newX <= board[0]/2 && board[0]/2 * -1 <= newX && newY <= board[1]/2 && board[1]/2 * -1 <= newY){
                    answer[0] = newX
                    answer[1] = newY
                }
            }

        }
        
        return answer
    }
}