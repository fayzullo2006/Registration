import java.util.*

class Registrations(
        var name: String,  var phoneNumber: Int,
        var password: String) {


        fun show(){


            println("Name $name ")
            println("Phone $phoneNumber ")

        }

    }

    fun main() {

        var registration:Registration
        var scanner = Scanner(System.`in`)
        val user = arrayOfNulls<Registration>(100)
        var count :Int = 0


        while (true) {
            println("Sign up -> 1")
            println("Sign in -> 2")
            println("User List -> 3")
            print("= ")
            var n = scanner.nextInt();

            when (n) {
                1 -> {


                    print("Name ")
                    val name: String = scanner.next()
                    scanner = Scanner(System.`in`)
                    print("Phone:+998  ")
                    val phone: Int = scanner.nextInt()
                    print("Password ")
                    val password: String = scanner.next()

                    registration = Registration(name, phone, password)
                    user[count] = registration
                    count++

                }
                2 -> {

                }
                3 -> {
                    for (list in 0 .. count){
                        println(user[list]!!.show())
                    }
                }
            }

        }


    }
