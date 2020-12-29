package polymorphism

class Dosen : Karyawan() {

    var prodi: String = ""

    fun mengajar() {
        println("Saya mengajar di prodi $prodi")
    }

    override fun perkenalan() {
        println("Perkenalan, nama saya $nama, alamat saya di $alamat")
    }
}