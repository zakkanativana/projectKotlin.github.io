package polymorphism

fun main() {

    val zakkan = Dosen()
    zakkan.nama = "Zakkan Ativana"
    zakkan.alamat = "Condong Catur"
    zakkan.perkenalan()

    zakkan.gaji = 100000
    zakkan.bekerja()

    zakkan.prodi = "Sistem Informasi"
    zakkan.mengajar()

    val ziee = Mahasiswa()
    ziee.nama = "Ziedan"
    ziee.alamat = "Yogyakarta"
    ziee.perkenalan()

    ziee.prodi = "Sistem Informasi"
    ziee.belajar()

    val budi = Satpam()
    budi.nama = "Budi ratnasari"
    budi.alamat = "Tangerang"
    budi.perkenalan()

    budi.gaji = 500000
    budi.bekerja()

    budi.pos = "Pos Barat"
    budi.menjaga()
}