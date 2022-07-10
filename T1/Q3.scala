object   Q3{
  def main(args: Array[String]){

    var a = 2
    var b = 3
    var c = 4
    val d:Int = 5
    val k:Float = 4.3f

    
    println({
      b -= 1
      b*a+c*d
      })

    
    println({
      a += 1
      a
    })

    println(-2*(d-k)+c)

    println(c)
    c += 1

    
    println({
      c += 1
      c*a
    })

    a += 1
    

  }
}
