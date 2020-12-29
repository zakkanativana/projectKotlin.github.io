package polymorphism

class Satpam : Karyawan() {

    var pos: String = ""

    fun menjaga() {
        println("Saya mengajar di prodi $pos")
        println(pos)
        println(this.perkenalan())

        println(nama)
        println(super.nama)
    }

    override fun perkenalan() {
        println("Siap dan 86, saya $nama dari $alamat")
    }
}