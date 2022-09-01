object Q2 extends App{
    def GCD(a:Int,b:Int):Int=b match{
        case 0 => a
        case b if b>a => GCD(b,a)
        case _ => GCD(b,a%b)
    }

    def prime(p:Int,n:Int=2):Boolean= n match {
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }

    def primeSeq(n:Int,i:Int):Unit={
        if(n==i){
            return
        }
        if(prime(i)){
            print(i)
            print(" ")
        }
        primeSeq(n,i+1)
    }

    primeSeq(10,2)
}
