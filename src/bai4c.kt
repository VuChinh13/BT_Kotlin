fun main(args: Array<String>) {
    // Giả sử mảng đã được sắp xếp rồi
    // 1 2 5 7 8 9 10

    var mang: MutableList<Int> = mutableListOf()
    print("Số phần tử có trong mảng : ")
    val N = readLine()?.toInt()
    println("Hãy nhập vào 1 mảng tăng dần  ")
        for (i in 0 until N!!){
            print("Nhập phần tử thứ $i: ")
            var input1:String? = readLine()
            if (input1 != null){
                mang.add(input1.toInt())
            }
        }


    print("Nhập vào số cần chèn : ")
    val x = readLine()?.toInt()
    var danhDau = false

    // Tìm vị trí chèn phần tử vào mảng đã sắp xếp
    for (i in 0 until mang.size - 1) {
        if (x!! > mang[i] && x < mang[i + 1]) {
            // Chèn phần tử vào vị trí i + 1
            mang.add(i + 1, x)
            danhDau = true
            break  // Dừng vòng lặp sau khi chèn phần tử
        }
    }

    // kiểm tra xem là đã đánh dấu hay chưa
    // Nếu mà chưa chèn được thì là kiểm tra so với phần tử đầu và phần tử cuối
    if (danhDau==false){
        if (x!! < mang[0]){
            mang.add(0,x)
        }else{
            mang.add(x)
        }
    }

    for (i in mang){
        print("$i, ")
    }
}
