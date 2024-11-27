fun main(args: Array<String>) {

    // ý tưởng là chia cho 10
    // 130 / 10 = 13 -> dư 0
    // 13 / 10 = 1 -> dư 3
    // 1 / 10 = 0 -> dư 1
    // cộng các số dư -> tổng
    print("Nhập vào 1 số nguyên dương : ")
    var N = readLine()?.toIntOrNull()


        var thuong: Int = 1
        var du: Int = 0
        var tong: Int = 0



        while (thuong != 0) {
            thuong = N!! / 10
            du = N % 10
            tong += du
            N = thuong
        }

        println("Tổng các chữ số của số : $tong")
    
}
