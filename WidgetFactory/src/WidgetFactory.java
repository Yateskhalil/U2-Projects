import javax.swing.*;
import java.text.DecimalFormat;


public class WidgetFactory {
static  double widPayday=16.50;
static int widPay=10;
static int workers=5;
static int shift=16;

    public static void main(String[] args) {
        int widNum=Integer.parseInt(JOptionPane.showInputDialog("How many Widgets did you want to make out of 10's?"));
        DecimalFormat round= new DecimalFormat("##");



        widgetDay(widNum,widPay);
        laborProfit(widNum);
        WidgetProfit(widNum);
        totalProfit(widNum);

    JOptionPane.showMessageDialog(null,"To make : "+widNum+" Widgets it would take "+round.format(+widgetDay(widNum,widPay))+" days, making  $"+WidgetProfit( widNum)+" in production profit, costing  $" +
            laborProfit(widNum)+  " but making the total profit of $" +totalProfit(widNum)+"");



        System.exit(0);


    }
    public static double WidgetProfit(int widNum){

        return widNum*10;



    }

    public static double widgetDay(int widNum, int widPay){

        double dayTime=widPay*16;


        return widNum/dayTime+1;


    }
    public static double laborProfit(int widNum){

        double dayTime=widPay*16;
        double dayNeed=widNum/dayTime+1;
        double hoursNeed=dayNeed*shift;

   double totalPay=workers*widPayday;

        return hoursNeed*totalPay;



    }
    public static double totalProfit(int widNum){
        int widProf=widNum*10;
        double dayTime=widPay*16;
        double dayNeed=widNum/dayTime+1;
        double hoursNeed=dayNeed*shift;

        double totalPay=workers*widPayday;
        double laborProfit=hoursNeed*totalPay;

        return widProf-laborProfit;
    }
}
 /* You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.
Lessons L1 - L3
    Specific Details:
            - 10 Widgets are made each hour
        - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
        - each worker makes $16.50 an hour
        - each widget sells for $10

    Programming Details:
            - prompt the user for the number of widgets using pop-up boxes
        - display # of widgets, # of days, Cost of production, Cost of widgets and profit
        - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
        - only WHOLE number of days, no half or partial days.
        - Output should be in proper currency form

    Example Run:

    Number of Widgets: 1000
            # of Days: 7
    Cost of Widgets: $10,000.00
    Cost of Production: $9,240.00
    Profit: $760.00

            */