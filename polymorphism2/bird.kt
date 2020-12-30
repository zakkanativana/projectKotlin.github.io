package polymorphism2

class bird : hewan() {

    fun kicau(){
        println("Suara ku berkicau indah")
    }

    override fun perkenalan() {
        println("Hai biasanya aku berada di alam bebas, terbang bebas dan berbunyi siul indah")
    }
}