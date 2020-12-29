package polymorphism

open class Orang {

    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    open fun perkenalan() {
        println("Halo, Nama saya $nama, alamat saya di $alamat")
    }
}