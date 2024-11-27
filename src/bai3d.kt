fun main(args: Array<String>) {

    print("Nhập N : ")
    val N = readLine()?.toInt()
    val mang:MutableList<Int> = mutableListOf()

    for (i in 1..Math.sqrt(N!!.toDouble()).toInt()){
        if (N % i == 0) {
            mang.add(i)
            if (i != N / i) {
                mang.add(N / i)
            }
        }
    }


    val mangNT:MutableList<Int> = mutableListOf()
    for (i in mang){
        if(i > 1) {
            var danhDau = 0
            for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
                if (i % j == 0) {
                    // chỉ cần 1 số mà chia hết thì thoát luôn
                    danhDau = 1
                    break
                }
            }
            // thỏa mãn điều kiện
            if (danhDau == 0) {
                mangNT.add(i)
            }
        }
    }

    for (i in mangNT){
        print("$i, ")
    }

}