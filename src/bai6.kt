open class Canbo {
    var hoTen: String = ""
    var tuoi: Int = 0
    var gioiTinh: String = ""
    var diaChi: String = ""

    constructor(hoTen: String, tuoi: Int, gioiTinh: String, diaChi: String) {
        this.hoTen = hoTen
        this.tuoi = tuoi
        this.gioiTinh = gioiTinh
        this.diaChi = diaChi
    }


    open fun hienThiThongTin() {
        print("Họ tên: $hoTen, Tuổi: $tuoi, Giới tính: $gioiTinh, Địa chỉ: $diaChi, ")
    }
}

class CongNhan : Canbo {
    var bac: Int = 0

    constructor(hoTen: String, tuoi: Int, gioiTinh: String, diaChi: String, bac: Int) : super(
        hoTen, tuoi, gioiTinh, diaChi
    ) {
        this.bac = bac
    }

    // Hiển thị thông tin công nhân, bao gồm cả bậc
    override fun hienThiThongTin() {
        super.hienThiThongTin()
        println("Bậc: $bac")
    }
}

class KySu : Canbo {
    var nganhDaoTao: String = ""

    constructor(hoTen: String, tuoi: Int, gioiTinh: String, diaChi: String, nganhDaoTao: String) : super(
        hoTen, tuoi, gioiTinh, diaChi
    ) {
        this.nganhDaoTao = nganhDaoTao
    }

    override fun hienThiThongTin() {
        super.hienThiThongTin()
        println("Ngành đào tạo: $nganhDaoTao")
    }
}

class NhanVien : Canbo {
    var congViec: String = ""

    constructor(hoTen: String, tuoi: Int, gioiTinh: String, diaChi: String, congViec: String) : super(
        hoTen, tuoi, gioiTinh, diaChi
    ) {
        this.congViec = congViec
    }

    override fun hienThiThongTin() {
        super.hienThiThongTin()
        println("Công việc: $congViec")
    }
}

class QLCB {
    var danhSachCanBo: MutableList<Canbo> = mutableListOf()

    fun themMoiCanBo() {
        // khi mà thêm mới thì có thể thêm mới CongNhan, KySu, NhanVien
        print("Bạn muốn thêm mới 1:Công Nhân, 2:Kỹ Sư, 3:Nhân Viên  : ")
        val select = readLine()?.toInt()
        when (select) {

            1 -> {
                print("Họ tên : ")
                val hoTen = readLine().toString()
                print("Tuổi : ")
                val tuoi = readLine()?.toInt()!!
                print("Giới tính: ")
                val gioiTinh = readLine().toString()
                print("Địa chỉ : ")
                val diaChi = readLine().toString()
                print("Bậc : ")
                val bac = readLine()?.toInt()!!

                val congNhan = CongNhan(hoTen,tuoi,gioiTinh,diaChi,bac)
                danhSachCanBo.add(congNhan)
            }

            2 -> {

                print("Họ tên : ")
                val hoTen = readLine().toString()
                print("Tuổi : ")
                val tuoi = readLine()?.toInt()!!
                print("Giới tính: ")
                val gioiTinh = readLine().toString()
                print("Địa chỉ : ")
                val diaChi = readLine().toString()
                print("Ngành đào tạo : ")
                val nganhDaoTao = readLine().toString()

                val kySu = KySu(hoTen,tuoi,gioiTinh,diaChi,nganhDaoTao)
                danhSachCanBo.add(kySu)
            }

            3 -> {

                print("Họ tên : ")
                val hoTen = readLine().toString()
                print("Tuổi : ")
                val tuoi = readLine()?.toInt()!!
                print("Giới tính: ")
                val gioiTinh = readLine().toString()
                print("Địa chỉ : ")
                val diaChi = readLine().toString()
                print("Công việc : ")
                val congViec = readLine().toString()

                val nhanVien = NhanVien(hoTen,tuoi,gioiTinh,diaChi,congViec)
                danhSachCanBo.add(nhanVien)
            }
        }


    }

    fun timKiemTheoHoTen(){
        print("Nhập vào họ tên cán bộ cần tìm kiếm :")
        val hoTen = readLine().toString()

        // tìm kiếm trong danh sách
        for (i in this.danhSachCanBo){
             if (i.hoTen == hoTen){
                 // in ra thông tin của cán bộ
                 i.hienThiThongTin()
             }
        }

    }

    fun hienThiDanhSach(){
        for (i in this.danhSachCanBo){
            i.hienThiThongTin()
            println("--------------")
        }
    }

    fun thoatChuongTrinh(){
        print("Đã thoát chương trình")
        return
    }
}

fun main(args: Array<String>) {
    val qlcb = QLCB()
    while(true){
        println("Lựa chọn các chức năng : ")
        println("1, Thêm mới cán bộ")
        println("2, Tìm kiếm theo họ tên")
        println("3, Hiển thị thông tin danh sách cán bộ")
        println("4, Thoát chương trình")
        print("Nhập lựa chọn : ")
        val select = readLine()?.toInt()
        when(select){

            1->{
                qlcb.themMoiCanBo()
            }

            2->{
                qlcb.timKiemTheoHoTen()
            }

            3->{
                qlcb.hienThiDanhSach()
            }

            4->{
                qlcb.thoatChuongTrinh()
                break
            }
        }

    }
}








