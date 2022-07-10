import scala.io.StdIn.readInt;
object Q4b extends App{

    def Profit(ticketPrice:Int, numOfAttendance:Int):Int = ticketPrice*numOfAttendance

    def AttendanceChange(ticketPrice:Int):Int = ((15 - ticketPrice)/5) * (20)
    
    def totalAttendance(ticketPrice:Int):Int = AttendanceChange(ticketPrice) + 120

    def NetProfit(ticketPrice:Int, numOfAttendance:Int):Int = Profit(ticketPrice,numOfAttendance)  - (500 + 3*(numOfAttendance))
    
    printf("Enter a ticket price :")
    var ticketPrice = readInt()

    if(totalAttendance(ticketPrice)>0) printf("Profit : " + NetProfit(ticketPrice,totalAttendance(ticketPrice))) else printf("No one comes to the theater");

}