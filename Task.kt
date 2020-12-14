fun main(){

    // Variabel
    val firstName1 = "Andi"
    val lastName1 = "Budiman"
    val age1 = 34

//    println(firstName1)
//    println(lastName1)
//    println(age1)

    val firstName2 = "Rudi"
    val lastName2 = "Setiawan"
    val age2 = 34

//    println(firstName2)
//    println(lastName2)
//    println(age2)


    // Array

    val firstName = arrayListOf<String>()
    val lastName = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstName.add("Andi")
    lastName.add("Budiman")
    age.add(34)

    firstName.add("Rudi")
    lastName.add("Setiawan")
    age.add(25)

//    for (first in firstName) {
//        println(first)
//    }
//
//    for (last in lastName) {
//        println(last)
//    }
//
//    for (age in age) {
//        println(age)
//    }


    // array v2
    val andiArray = arrayListOf<Any>()
    andiArray.add("Andi")
    andiArray.add("Budiman")
    andiArray.add(34)

//    for (andi in andiArray){
//        println(andi)
//    }

    // Array v3

    val mhsArray = arrayListOf<ArrayList<Any>>()
    mhsArray.add(andiArray)
    mhsArray.add(arrayListOf("Rudi", "Setiawan", 25))

//    for ( item in mhsArray ){
//        for ( i in item ) {
//            println(i)
//        }
//    }

    // Data Class
    // Merupakan sebuah wadah untuk menyimpan beberapa data menjadi satu kelompok data

    val andi = User("Andi", "Budiman", 34)
    val rudi = User ("Rudi", "Setiawan", 25)
    val dedi = User()
    dedi.age = 35
    dedi.firstName = "Dedi"

    // User.copy
    val andi2 = andi.copy(age = 40)

//    println(andi)
//    println(rudi)
//    println(dedi)
//    println(andi2)
//
//    println(andi.lastName)

    // Data Class Array

    val mhsAmikom = arrayListOf<User>()
    mhsAmikom.add(andi)
    mhsAmikom.add(rudi)
    mhsAmikom.add(dedi)

    // Menambahkan data baru
    mhsAmikom.add(User("Ferdi", "setiawan", 45))

    for (mhs in mhsAmikom) {
        println(mhs)
    }

     

}