import scala.io.StdIn.readInt
object Q3 extends App{

    def volume(r:Int)=math.Pi*r*r*r*4/3;

    printf("Enter radius of the sphere : ");
    var r =readInt();
    
    printf("Volume of the sphere = %f",volume(r));
}