object Q5 extends App{
    def sumEven(n:Int):Int =n match{
        case n if (n%2==0 && n==0) => 0
        case n if (n%2==0) => n+sumEven(n-1)
        case _ => sumEven(n-1)
    }

    println(sumEven(5))
}