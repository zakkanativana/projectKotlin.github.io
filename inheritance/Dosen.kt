package inheritance

import polymorphism.Karyawan

class Dosen : Karyawan() {


    var prodi: String = ""



    fun mengajar() {
        println("Saya mengajar di prodi $prodi")
    }
}