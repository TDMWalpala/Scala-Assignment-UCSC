object Q5 extends App{

    def easy(e:Int)=e*8;
    def tempo(t:Int)=t*7;
    def total()=easy(2)+tempo(3)+easy(2);
    
    printf("Total running time = %d minutes",total());
}