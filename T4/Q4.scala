import scala.io.StdIn.readInt
object Q4 extends App{
    def patternMatching(x:Int):String = if(x<=0) "Negative/Zero" else (if(x%2 == 0) "Even" else "Odd")

    printf("Enter Integer : ");
    var x=readInt();
    println(patternMatching(x))
}