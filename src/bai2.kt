fun kiemTraNguyenTo(value: Int): Boolean {
    if (value == 1 || value == 0) {
        return false
    }
    for (i in 2..Math.sqrt(value.toDouble()).toInt()) {
        if (value % i == 0) {
            return false
        }
    }
    return true
}
// ý tưởng là lấy 2 số cuối trong mảng xong cộng với nhau
fun Fibonacci(N: Int) {
    var result: MutableList<Int> = mutableListOf(0, 1)
    var size = result.size
    while ((result.get(size-1) + result.get(size- 2)) < N) {
        result.add(result.get(size-1) + result.get(size- 2))
        size = result.size
    }

    print("Số Fibonacci nguyên tố mà nhỏ hơn $N là : ")
    for (i in result){
        if (kiemTraNguyenTo(i)){
            print("$i, ")
        }
    }
}


fun main(args: Array<String>) {
    print("Hãy nhập vào 1 số nguyên dương : ")
    val N:Int? = readLine()?.toInt()
    if (N!=null){
        if (N>1){
            Fibonacci(N)
        }else return
    }
}