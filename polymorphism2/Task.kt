package polymorphism2

fun main() {

    val burung = bird()
    burung.jenisPemakan = "Biji-Bijian"
    burung.namaJenis = "burung pelatuk"
    burung.kicau()
    burung.perkenalan()

    val kucing = cat()
    kucing.jenisPemakan = "Ikan"
    kucing.namaJenis = "Kucing Anggora"
    kucing.meow()
    kucing.perkenalan()

    val ayam = chicken()
    ayam.jenisPemakan = "Pakan Beras"
    ayam.namaJenis = "Ayam Negeri"
    ayam.petok()
    ayam.perkenalan()

    val sapi = cow()
    sapi.jenisPemakan = "Rumput"
    sapi.namaJenis = "Sapi Eropa"
    sapi.moo()
    sapi.perkenalan()

    val anjing = dog()
    anjing.jenisPemakan = "Daging"
    anjing.namaJenis = "Anjing chihuahua"
    anjing.guk()
    anjing.perkenalan()

    val katak = frog()
    katak.jenisPemakan = "Serangga"
    katak.namaJenis = "Katak Bankong"
    katak.webek()
    katak.perkenalan()

    val kambing = goat()
    kambing.jenisPemakan = "Rumput"
    kambing.namaJenis = "Kambing qurban"
    kambing.mbee()
    kambing.perkenalan()

    val singa = lion()
    singa.jenisPemakan = "Daging"
    singa.namaJenis = "Singa Lion King"
    singa.roar()
    singa.perkenalan()

    val serigala = wolf()
    serigala.jenisPemakan = "Daging"
    serigala.namaJenis = "Serigala Kutub"
    serigala.auu()
    serigala.perkenalan()

}