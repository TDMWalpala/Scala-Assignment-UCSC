object Q4a extends App{

   def NormalHoursWorkSalary(hours:Int):Int =hours*250
   
   def OTsalary(hours:Int):Int = hours*85
   
   def TotalSalary(work:Int,ot:Int):Int = NormalHoursWorkSalary(work) + OTsalary(ot)
   
   def Tax(totalSalary:Int):Double = totalSalary*.12
   
   def TakeHomeSalary(workingHours:Int, otHours:Int):Double = TotalSalary(workingHours, otHours) - Tax(TotalSalary(workingHours,otHours));
   
      printf("Rs %.2f",TakeHomeSalary(40,30))  
}

