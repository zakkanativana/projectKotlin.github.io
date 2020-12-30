package polymorphism2

class lion : hewan() {

    fun roar() {
        println("Suara aku mengaum besar seperti Roaarrrr")
    }

    override fun perkenalan() {
        println("Aku adalah raja hutan")
    }
}