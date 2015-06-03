public class Binary1Bits
{
    public int h(int n) {
        int count = 0;
            for(int i=1; i<33; i++){
                if(bit(n, i) == true){
                     count++;
                }
            }
            return count;
        }
     
    public boolean bit(int n, int i){
         return (n & (1 << i)) != 0;
    }
}