class Rational(x: Int, y: Int){
    def numer = x
    def denom = y

    def neg = new Rational(-this.numer, this.denom)
}

object Q1{
    def main(args: Array[String]):Unit = {
        val x:Rational = new Rational(3,4)

        var r:Rational = x.neg
        println("The Negative number of " +x.numer+ "/" + x.denom+ " is " + r.numer+ "/" + r.denom)
    }
}