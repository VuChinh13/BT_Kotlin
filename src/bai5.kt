fun main(args: Array<String>) {
    // Xét điều kiện a!= 0

    print("Nhập a: ")
    val a: Double? = readLine()?.toDouble()

    if (a == 0.toDouble()) {
        print("Hãy nhập a cho đúng")
        return
    }

    print("Nhập b: ")
    val b: Double? = readLine()?.toDouble()

    print("Nhập c: ")
    val c: Double? = readLine()?.toDouble()

    // tính delta


    if (a != null && b != null && c != null) {
        val delta: Double = (b * b) - (4 * a * c)


        if (delta == 0.toDouble()) {
            // phương trình có nghiệm kép
            print("Phương trình có nghiệm kép : ${-b / (2 * a)}")
        } else if (delta > 0) {
            // phương trình có 2 nghiệm
            println("Phương trình có 2 nghiệm")
            print("X1: ${(-b + Math.sqrt(delta)) / (2 * a)}, X2: ${(-b - Math.sqrt(delta)) / (2 * a)}")
        } else print("Phương trình vô nghiệm")

    }

}