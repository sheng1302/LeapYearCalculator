import java.util.Scanner;
class Leapyear{

   public static void main(String[] args){
   //Scanner keyboard = new Scanner(System.in); 
   int userYear     = 0;
   int userMonth    = 0;
   int userDay      = 0;
   int yearType     = 0;                         // 365 = Normal Year, 366 = Lunar Year/ Leap Year.
   int endMonth     = 0;

      System.out.println("Announcement: no year less than '1900', month should in between the range of '1-12', and days from '1-30' or '1-31' depends on the month. ");
      while(!(userYear >= 1900))
         userYear = getYear();
      while(!(userMonth >= 1 && userMonth <= 12))
         userMonth = getMonth();         
      yearType = getYearType(userYear);
      endMonth = getEndMonth(userMonth,yearType);
      while(!(userDay >= 1 && userDay <= endMonth))
         userDay = getDay();
      System.out.println("There are: " + yearType + " days in year of " + userYear);
      System.out.println("Days in this month: " + endMonth);
      System.out.println(userMonth + "/" + userDay + "/" + userYear);
   }
   
   static int getYear(){
   Scanner keyboard = new Scanner(System.in); 
   int userYear = 0;
      
      System.out.println("What is the year? > ");
      userYear = keyboard.nextInt();
      
      return userYear;
   }

   static int getMonth(){
   Scanner keyboard = new Scanner(System.in); 
   int userMonth = 0;
      
      System.out.println("What is the month? > ");
      userMonth = keyboard.nextInt();
      
      return userMonth;
   }

   static int getDay(){
   Scanner keyboard = new Scanner(System.in); 
   int userDay = 0;
      
      System.out.println("What is the day? > ");
      userDay = keyboard.nextInt();
      
      return userDay;
   }
   
   static int getYearType(int userYear){
   int yearTypeResult = 0;
   
      yearTypeResult = userYear % 4;
      if (yearTypeResult > 0)
         yearTypeResult = 365;
      else
         yearTypeResult = 366;
         
      return yearTypeResult;
   
   }
   
   static int getEndMonth(int month, int yearType){
   int endResult;
      if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
         endResult = 31;
      else if (month == 4 || month == 6 || month == 9 || month == 10)
         endResult = 30;
      else
         if(yearType == 365)
            endResult = 28;
         else
            endResult = 29;
            
      return endResult;
   }
}