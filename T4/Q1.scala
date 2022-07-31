import scala.io.StdIn.readInt
object Q1 extends App{
    def flatAmount(x:Int):Double = {
        if(x>20000){
            if(x>200000){
                if(x>2000000){
                    if(x>20000000) return x*0.065 else return x*0.035
                }else{return x*0.04}
            }else{return x*0.02}
        }else{return 0}
    }

    def totalAmount(d:Int):Double = d + flatAmount(d)

    printf("Enter  deposit amount : ");
    var x=readInt();
    printf("Total amount = %.2f/-",totalAmount(x));
}