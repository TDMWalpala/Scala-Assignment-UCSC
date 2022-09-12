class Account(idNo: String, accNo: Int, balance: Double){
    val nic:String = idNo
    val accountNo:Int = accNo
    var accBalance: Double = balance

    def transfer(acc:Account,amount:Double) = {
        if(this.accBalance - amount < this.accBalance){
            this.accBalance = this.accBalance - amount
            acc.accBalance = acc.accBalance + amount
        }else{
            println("Insufficient account balance")
        }
    }
}



object Q3{
    def main(args:Array[String]):Unit = {
        val acc1:Account = new Account("2000237v", 1000, 45000)
        val acc2:Account = new Account("2000566v", 2000, 67000)

        acc1.transfer(acc2, 10000)

        println("Account 1 balance :" + acc1.accBalance)
        println("Account 2 balance :" +acc2.accBalance)
    }
}