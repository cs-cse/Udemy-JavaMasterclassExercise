public class MinutesToYearDaysCalculator {
    public static void printYearsAndDays(long minutes){

        if (minutes<0)
            System.out.println("Invalid Value");
        else
        {
            long x,y,z;
             x=minutes/525600;
             y=minutes%525600;
             z=y/1440;


            System.out.println(minutes + " min" +" = " + x + " y" + " and "+z + " d");




        }

                                                       }
                                          }
