class Account(idNo: String, accNo: Int, balance: Double){
    val nic:String = idNo
    val accountNo:Int = accNo
    var accBalance: Double = balance

    override def toString = "["+nic+":"+accountNo +":"+ accBalance+"]"

}



object Q4{
    def main(args:Array[String]):Unit = {
        val acc1:Account = new Account("20001967v", 1000, 45000)
        val acc2:Account = new Account("20001968v", 2000, -500)
        val acc3:Account = new Account("20001970v", 3000, 45000)
        val acc4:Account = new Account("20001071v", 4000, -10000)
        val acc5:Account = new Account("20001972v", 5000, 105000)

        var bank:List[Account] = List(acc1,acc2,acc3,acc4,acc5)

        val negAccBalance = bank.filter(acc=> acc.accBalance < 0)
        
        println("Negative balance accounts : " + negAccBalance)

        val totalBalance = bank.map(acc=> acc.accBalance).reduce((x,y) =>x+y)

        println("Sum of all account balances : " + totalBalance)

        bank.map(acc=> if(acc.accBalance>0) acc.accBalance=acc.accBalance*1.05 else acc.accBalance=acc.accBalance*1.1)

        println("Account balance With Interest :"+ bank);

    }

}
   