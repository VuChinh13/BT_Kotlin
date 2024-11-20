fun main(args: Array<String>) {

    print("Nhập vào 1 số nguyên dương : ")
    var N = readLine()?.toInt()  // N là Int?

    var thuong: Int = 1
    var du: Int = 0
    var tong: Int = 0

    // Lưu lại giá trị ban đầu của N để in kết quả sau này
    val originalN = N

    while (thuong != 0) {
            thuong = N!! / 10
            du = N % 10

        tong += du
        N = thuong  // Cập nhật N để tiếp tục chia
    }

    println("Tổng các chữ số của số : $tong")
}
