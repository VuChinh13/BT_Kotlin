fun main(args: Array<String>) {
    var mang:MutableList<Int> = mutableListOf()
    for (i in 10..200){
      if (i%7 == 0 && i%5 != 0){
          mang.add(i)
      }
    }

    for (i in 0 until mang.size){
        if (i == mang.size-1){
            print("${mang[i]}")
        }else{
            print("${mang[i]},")
        }
    }

}
