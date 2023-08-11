class Solution {
    fun solution(board: Array<IntArray>): Int {
        var mx = listOf<Int>(-1, 1, 0, 0, -1, -1, 1, 1)
        var my = listOf<Int>(0, 0, -1, 1, 1, -1, 1, -1)


        for (i in 0 until board.size){
            for(j in 0 until board.size){
                if(board[i][j] == 1){

                    for(l in 0 until mx.size){
                        var x = i + mx[l]
                        var y = j + my[l]

                        if(x >= 0 && x < board.size && y >= 0 && y < board.size){
                            if(board[x][y] == 0){
                                board[x][y] = -1
                            }
                        }

                    }

                }
            }
        }




        return board.sumBy{ it -> it.count{ it == 0 }}
    }
}