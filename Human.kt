class Human( val name: String) {
    // Property / atribut / field

    var email: String = ""
    var address: String = ""


    // Method / Function
    fun talk() {
        println("Alamat email saya adalah $email")
    }

    fun verify(email: String) : Boolean {
        return email == this.email
    }

    fun introduce() {
        println("Perkenalkan, nama saya adalah $name")
    }
}