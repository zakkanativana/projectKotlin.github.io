package polymorphism2

class dog : hewan() {

    fun guk() {
        println("Suara ku guk guk")
    }

    override fun perkenalan() {
        println("Hai biasanya aku berada di rumah rumah, dan biasanya aku disuruh menjaga rumah")
    }
}