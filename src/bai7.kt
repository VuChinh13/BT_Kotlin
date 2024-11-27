open class DaGiac {
    private var soCanh: Int
    private var mangKichThuoc: IntArray

    constructor(soCanh: Int, mangKichThuoc: IntArray) {
        this.soCanh = soCanh
        this.mangKichThuoc = mangKichThuoc
    }


    fun getMangKichThuoc(): IntArray {
        return this.mangKichThuoc
    }


    open fun tinhChuVi(): Int {
        var tong: Int = 0
        for (i in this.mangKichThuoc) {
            tong += i
        }
        return tong
    }

    fun doDaiCacCanh(): String {
        var string: String = ""
        for (i in this.mangKichThuoc) {
            string = string + "$i       |"
        }

        return string
    }
}

class TamGiac : DaGiac {
    constructor(soCanh: Int, mangKichThuoc: IntArray) : super(soCanh, mangKichThuoc)

    override fun tinhChuVi(): Int {
        return super.tinhChuVi()
    }

    fun tinhDienTich(): Double {
        // Sử dụng công thức Heron
        var s1: Double = 0.0
        val a: Double = this.getMangKichThuoc()[0].toDouble()
        val b: Double = this.getMangKichThuoc()[1].toDouble()
        val c: Double = this.getMangKichThuoc()[2].toDouble()

        s1 = (a + b + c) / 2
        return Math.sqrt(s1 * (s1 - a) * (s1 - b) * (s1 - c))
    }
}

fun main(args: Array<String>) {
    // Khởi tạo mảng TamGiac với N phần tử
    val tamGiac: MutableList<TamGiac> = mutableListOf()


    while (true) {
        println("------------------------------")
        println("Lựa chọn các chức năng : ")
        println("1, Nhập vào n tam giác")
        println("2, Xuất thông tin của các tam giác")
        println("3, Hiển thị các cạnh của tam giác có diện tích lớn nhất")
        println("4, Tìm kiếm và in ra tam giác theo vị trí index")
        println("5, Xóa 1 tam giác")
        println("6, Sắp xếp theo diện tích tăng dần")
        println("7, Thoát chương trình")
        print("Nhập lựa chọn : ")
        val select = readLine()?.toInt()
        when (select) {

            1 -> {
                var N: Int
                print("Số tam giác muốn nhập: ")
                N = readLine()?.toInt()!!

                // Khởi tạo mảng tamGiac chứa N đối tượng TamGiac
                for (i in 0 until N) {
                    println("Tam giác $i: ")
                    print("Nhập cạnh a : ")
                    val a = readLine()?.toInt()!!
                    print("Nhập cạnh b : ")
                    val b = readLine()?.toInt()!!
                    print("Nhập cạnh c : ")
                    val c = readLine()?.toInt()!!

                    val soCanh = intArrayOf(a, b, c)
                    // khởi tạo 1 tam giác
                    val tamgiac = TamGiac(3, soCanh)
                    tamGiac.add(tamgiac)
                }
            }

            2 -> {
                // in ra thông tin của những tam giác theo dạng bảng
                println("--------Danh sách thông tin của tam giác----------")
                println("Số thứ tự | Cạnh a | Cạnh b | Cạnh c | Chu vi | Diện Tích")
                for (i in tamGiac.indices) {
                    println(
                        "$i         |${tamGiac.get(i).doDaiCacCanh()}  ${
                            tamGiac.get(i).tinhChuVi()
                        }     |${tamGiac.get(i).tinhDienTich()}"
                    )
                }
            }

            3 -> {
                println("Các cạnh của tam giác có diện tích lớn nhất ")
                var dtMax = tamGiac.get(0)
                for (i in tamGiac) {
                    if (i.tinhDienTich() > dtMax.tinhDienTich()) {
                        dtMax = i
                    }
                }
                println("Cạnh a | Cạnh b | Cạnh c ")
                println(
                    "${dtMax.getMangKichThuoc().get(0)}      |${
                        dtMax.getMangKichThuoc().get(1)
                    }       |${dtMax.getMangKichThuoc().get(2)}"
                )
            }

            4 -> {
                print("Hãy nhập vào vị trí tam giác muốn tìm kiếm : ")
                val index = readLine()?.toInt()!!
                if (index < 0 || index >= tamGiac.size) {
                    println("Vị trí không hợp lệ")
                } else {
                    println("Thông tin tam giác vị trí : $index")
                    println("Số thứ tự | Cạnh a | Cạnh b | Cạnh c | Chu vi | Diện Tích")
                    println(
                        "$index         |${tamGiac.get(index).doDaiCacCanh()}  ${
                            tamGiac.get(index).tinhChuVi()
                        }     |${tamGiac.get(index).tinhDienTich()}"
                    )

                }
            }

            5 -> {
                print("Nhập vị trí cần xóa của tam giác : ")
                val index1 = readLine()?.toInt()!!
                if (index1 < 0 || index1 >= tamGiac.size) {
                    println("Vị trí không hợp lệ")
                } else {
                    tamGiac.removeAt(index1)
                }
            }

            6 -> {
                for (i in 0 until tamGiac.size - 1) {
                    for (j in i + 1 until tamGiac.size) {
                        if (tamGiac[i].tinhDienTich() > tamGiac[j].tinhDienTich()) {
                            val tmp = tamGiac[i]
                            tamGiac[i] = tamGiac[j]
                            tamGiac[j] = tmp
                        }
                    }
                }
            }

            7 -> {
                break
            }
        }

    }
}



