import scala.io.StdIn.readInt
object Q1 extends App{

    def area(r:Int)=math.Pi*r*r;

    printf("Enter radius of the disk : ");
    var x=readInt();
    printf("Area = %f",area(x));
}