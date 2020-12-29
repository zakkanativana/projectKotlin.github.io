package inheritance

import polymorphism.Karyawan

class Satpam : Karyawan() {

    var pos: String = ""

    fun menjaga() {
        println("Saya mengajar di prodi $pos")
    }
}