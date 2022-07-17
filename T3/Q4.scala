import scala.io.StdIn.readInt
object Q4 extends App{

    def price(p:Int):Double=p*24.95;
    def discount(price:Double):Double=price*0.4;
    def shippingCost(s:Int):Double=50*3+(s-50)*0.75;
    def totalCost(x:Int)=price(x)-discount(price(x))+shippingCost(x);

    printf("Enter number of books : ");
    var x = readInt();

    printf("Total wholesale cost = Rs. %.2f",totalCost(x));
}