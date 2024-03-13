package lian_xi;

public class CustomeDataChart {
    private CustomerDataRetriever customer;

     public void CustomerDataChart (CustomerDataRetriever customerDataRetriever) {
         this.customer = customerDataRetriever;
     }

    public static void createChart(){
        System.out.println("创建图表");
    }

    public static void displayChart(){
        System.out.println("显示图表");
    }

}
