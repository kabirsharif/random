import java.util.LinkedList;

public class ClassList {

    LinkedList<Integer> priceList=new LinkedList<>();
    LinkedList<String> customerList=new LinkedList<>();

    int[] prices;
    String[] customers;

    public void assignValuesInt(int[] prices, LinkedList<Integer> priceList) {
        this.prices=prices;
        this.priceList=priceList;

        for (int i = 0; i < prices.length; i++) {
            this.priceList.add(i,prices[i]);
        }
    }

    public void assignValuesString(String[] customers, LinkedList<String> customerList) {
        this.customers=customers;
        this.customerList=customerList;

        for (int i = 0; i < customers.length; i++) {
            this.customerList.add(i,customers[i]);
        }
    }

    public static void main(String[] args) {
        int[] prices = {10,20,30,40,50,60,70,80,90};
        String[] customers = {"Ahmed","Mahmud","Hamid","Hammad"};


        LinkedList<Integer> priceList=new LinkedList<>();
        LinkedList<String> customerList=new LinkedList<>();

        ClassList cl=new ClassList();

        cl.assignValuesInt(prices,priceList);
        cl.assignValuesString(customers,customerList);

        System.out.println(priceList);
        System.out.println(customerList);
    }

}

