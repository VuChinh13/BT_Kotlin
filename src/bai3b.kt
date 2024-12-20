fun main(args: Array<String>) {
    // đầu tiên tìm các số nguyên tố từ số đó trở xuống
    // ví dụ tìm những số nguyên tố từ số 30 trở xuống và chia lần lượt cho các số
    // 30 / 2 = 15
    // 15 / 3 = 5
    // 5 / 5 = 1
    // 30 = 2 * 3 * 5

    print("Nhập số : ")
    var N = readLine()?.toInt()
    val mangPT: MutableList<Int> = mutableListOf()

    while (N != 1) {
        // tìm các số nguyên tố
        val mangNT: MutableList<Int> = mutableListOf()
        for (i in 2..N!!) {
            var danhdau: Int = 0
            for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
                if (i % j == 0) {
                    danhdau = 1
                    break
                }
            }
            if (danhdau == 0) {
                mangNT.add(i)
            }
        }
        // sau khi mà tìm được các số nguyên tố thì thực hiện phép chia
        for (i in mangNT) {
            if (N!! % i == 0) {
                mangPT.add(i)
                N = N / i
                break
            }
        }
    }
    for (i in mangPT) {
        print("$i ")
    }
}