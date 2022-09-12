class Rational(x:Int,y:Int) {
   var numer = x
   var denom = y

   def sub(r:Rational) = new Rational(this.numer*r.denom - r.numer*this.denom , this.denom*r.denom)
   
 }
     
object Q2{
   def main(args: Array[String]):Unit={
   
       val x:Rational = new Rational(3,4)
       val y:Rational = new Rational(5,8)
       val z:Rational = new Rational(2,7)
       
       var sub1:Rational = x.sub(y)
       var sub2:Rational = sub1.sub(z)

       println("Answer is: "+sub2.numer+"/"+sub2.denom)
      
   }
}