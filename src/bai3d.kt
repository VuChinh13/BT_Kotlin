fun main(args: Array<String>) {
    // chia đến căn mà thôi
    // lấy 36 / 1 = 36
    // lấy 36 / 2 = 18
    // lấy 36 / 4 = 9
    // -> các ước là 1 ,2 ,4 , 36, 18
    // điều kiện là chia đến khi mà số chia = thương
    print("Nhập N : ")
    val N = readLine()?.toInt()
    var mang:MutableList<Int> = mutableListOf()

    for (i in 1..Math.sqrt(N!!.toDouble()).toInt()){
        if (N % i == 0){
            if (i!=Math.sqrt(N.toDouble()).toInt()){
                mang.add(i)
                mang.add(N/i)
            }else{
                mang.add(i)
            }
        }
    }


    var mangNT:MutableList<Int> = mutableListOf()
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