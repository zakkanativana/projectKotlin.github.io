package inheritance

import polymorphism.Orang

class Mahasiswa : Orang() {

    var nim: String = ""
    var prodi: String = ""

    fun belajar() {
        println("Saya belajar di prodi $prodi")
    }
}