import scala.io.StdIn.readInt
object Q2 extends App{

    def celsiusToFahrenheit(c:Double)=c*1.8+32.0;

    printf("Enter temperature in Celsius : ");
    var cel = readInt();

    printf("Temperature in Fahrenheit = %f",celsiusToFahrenheit(cel));
} 