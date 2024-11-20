fun main(args: Array<String>) {
    // chia đến căn mà thôi
    // lấy 36 / 1 = 36
    // lấy 36 / 2 = 18
    // lấy 36 / 12 = 3
    // lấy 36 / 4 = 9
    // lấy 36 / 6 = 6
    // -> các ước là 1,36,2,18,3,12,4,9,6
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

    for (i in mang){
        print("$i, ")
    }

}