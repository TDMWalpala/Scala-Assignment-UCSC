object Q2 extends App {
   final case class ShoppingCartItem(name: String, price: Double, qtyBought: Int)
  
   val item1 = ShoppingCartItem("vanilla ice cream", 3.99, 13)
   val item2 = ShoppingCartItem("chocolate biscuits", 4, 6)
   val item3 = ShoppingCartItem("cupcakes", 7.77, 7)
   val basket = List(item1, item2, item3)
  
   def printCartItems(basket: List[ShoppingCartItem]): Unit = {
     basket.foreach { item =>
       println(s"${item.qtyBought} ${item.name} at Rs ${item.price} each")
     }
   }
  
   printCartItems(basket)
  
  
   def printIceCream(basket: List[ShoppingCartItem]): Unit = {
     basket.foreach { {
       case ShoppingCartItem("vanilla ice cream", _, _) => println(s"Found a vanilla ice cream  product.")
       case ShoppingCartItem(_,_,_) => println("Found another item.")
       }
     }
   }
  
   printIceCream(basket)
}