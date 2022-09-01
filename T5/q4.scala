object Q4 extends App{
    def oddEven(n:Int):String = n match{
        case 0 => return "Even"
        case 1 => return "Odd"
        case _ => oddEven(n%2)
    }

    println(oddEven(5))
}