fun main(args: Array<String>) {
    var N:Int = 0
    print("Nhập N: ")
    var input:String? = readLine()
    if (input != null){
        N = input.toInt()
    }

    var mang:IntArray = IntArray(N)

    for (i in 0 until N){
        print("Nhập phần tử thứ $i: ")
        var input1:String? = readLine()
        if (input1 != null){
            mang[i] = input1.toInt()
        }
    }


    var max1:Int = 0
    var max2:Int = 0
    var index1:Int = 0
    var index2:Int = 0


    for (i in 0 until mang.size){
        if (mang[i] > max1){
            max2 = max1
            index2 = index1
            max1 = mang[i]
            index1 = i
        }else if (mang[i] > max2){
            max2 = mang[i]
            index2 = i
        }
    }

    print("Số lớn nhất : $max1:$index1, số lớn thứ hai : $max2:$index2")
}