fun main(){
 var myhippo = Hippo()
    myhippo .eat()
    myhippo .roam()
    myhippo .makeNoise()
    myhippo .sleep()
    //สร้างแมวของเรา
    var mycat = Cat()
    mycat.eat()
    mycat .roam()
    mycat .makeNoise()
    mycat .sleep()
}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = 10

    open fun makeNoise(){
        println("The Animal is making a noise")
    }
    open fun eat(){
        println("The Animal is eating")
    }
    open fun roam(){
        println("The Animal is roaming")
    }
    open fun  sleep(){
        println("The Animel is sleep")
    }
}

class Hippo : Animal() {
    //สร้างคลาส Hippo แต่ยังไม่ได้ทำอะไร
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }


    override fun eat() {
        println("The Hippo eat $food")
    }


}
class Cat : Animal() {
    override val image = "Cat.jpg"
    override val food = "rat"
    override val habitat = "Home"

    override fun makeNoise() {
        println("เหมียว เหมียว")
    }

    override fun eat() {
        println("The Cat eat $food")
    }
}

