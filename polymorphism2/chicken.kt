package polymorphism2

class chicken : hewan() {

    fun petok(){
        println("Suara ku tok tok petok")
    }

    override fun perkenalan() {
        println("Hai biasanya aku berada dikandang dan dipasar, aku bertelur dan biasa jadi pangan")
    }
}