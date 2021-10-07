package Day5;

public class Day5 {
    public static void main(String[] args) {


        String rawText = "Order number: 1020317\n"+
        "Click here for order details.";
       // System.out.println(rawText);

        String[] rawText1 = rawText.split("Order number");
        String secondPartText = rawText1[1];

        String[] rawOrderNum = secondPartText.split("Click here");

        String orderNum = rawOrderNum[0].trim();
        System.out.println(orderNum);


    }
    }

