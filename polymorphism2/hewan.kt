package polymorphism2

open class hewan {

    var jenisPemakan: String = ""
    var namaJenis: String = ""

    open fun perkenalan() {
        println("Hai, saya hewan $namaJenis, saya Jenis Pemakan $jenisPemakan")
    }
}