fun main() {

    val zakkan: Human = Human("Zakkan Ativana")
    val andi: Human = Human("Andi")

    zakkan.email = "zakkanativana@gmail.com"
    zakkan.address = "CondongCatur, Sleman, Yogyakarta"

    zakkan.talk()
    zakkan.introduce()

    println(zakkan.verify("zakkan@gmail.com"))
}