fun main(args: Array<String>) {
    //sử dụng bubble sort

    var N:Int = 0
    print("Nhập N: ")
    val input:String? = readLine()
    if (input != null){
        N = input.toInt()
    }

    val mang:IntArray = IntArray(N)

    for (i in 0 until N){
        print("Nhập phần tử thứ $i: ")
        val input1:String? = readLine()
        if (input1 != null){
            mang[i] = input1.toInt()
        }
    }


    for (i in 0 until mang.size - 1){
        for (j in i + 1 until mang.size) {
            if (mang[i] > mang[j]) {
                val tmp = mang[i]
                mang[i] = mang[j]
                mang[j] = tmp
            }
        }
    }

    for (i in mang){
         print("$i, ")
    }
}