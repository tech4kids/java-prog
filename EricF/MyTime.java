import java.util.Scanner; 
public class MyTime {
   private int mHour;     
   private int mMinute;   
   private int mSecond;
   public void MyTime(int hour, int minute, int second) {
      setHour(hour);
      setMinute(minute);
      setSecond(second);
   }
   
    public void setTime(int hour, int minute, int second) {
      setHour(hour);
      setMinute(minute);
      setSecond(second);
   }
 
    private void setHour(int hour) {
      if (hour >= 0 && hour <= 23) {
         this.mHour = hour;
      } 
      else {
         this.mHour = 00;
      }
   }
 
   private void setMinute(int minute) {
      if (minute >= 0 && minute <= 59) {
         this.mMinute = minute;
      } 
      else {
         this.mMinute = 00;
      }
   }
 
   private void setSecond(int second) {
     if (second >= 0 && second <= 59) {
         this.mSecond = second;
      } 
      else {
         this.mSecond = 00;
      }
      
      if (mHour < 0 || mHour > 23 || mMinute < 0 || mMinute >59 || mSecond < 0 ||  mSecond > 59){
 
      mHour = 00;
      mMinute = 00;
      mSecond = 00;
     }          
   }
   
   public int getHour() {
      return mHour;
   }
 
   public int getMinute() {
      return mMinute;
   }
 
   public int getSecond() {
      return mSecond;
   }
   
   public boolean equals (MyTime other)
   {
        if (mHour == other.mHour && mMinute == other.mMinute && mSecond == other.mSecond)
        {
                return true;
        }
        return false;
        }
     
   public String toString()
      {
        String result;
        result = mHour + ":" + mMinute + ":" + mSecond;
        int newHour; 
 
        if (mHour >= 1 && mHour <= 11)
        {
                result += " AM";
        }
        else if (mHour >= 13 && mHour <= 23)
        {
                newHour = mHour - 12;
                result = newHour + ":" + mMinute + ":" + mSecond + " PM";
        }
        else 
        {
                newHour = 12;
                result = newHour + ":" + mMinute + ":" + mSecond + " AM";
        }
        return result;
      }
   
   public String toUniversalString()
      {
        String result = " ";
 
        if (mHour >= 0 && mHour <= 11)
        {
                result = mHour + ":" + mMinute + ":" + mSecond;
        }
        else if (mHour >= 12 && mHour <= 23)
        {
                result = mHour + ":" + mMinute + ":" + mSecond;
        }
        return result;
      }
   
   private String twoDigits(int value)
      {
        String result = " ";
        Integer.toString(value);
 
        if (value < 10)
      {
        result = "0" + result;
      }
        return result;
      }
 
}
 
