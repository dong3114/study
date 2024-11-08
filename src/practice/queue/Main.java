package practice.queue;

public class Main {
    public static void main(String[] args) {
        String[] customer = {"고객1", "고객2", "고객3"};

        CustomerServiceQueue serviceQueue = new CustomerServiceQueue();

        for(int i = 0; i < customer.length; i++){
            serviceQueue.addCustomer(customer[i]);
        }

        // 순차적으로 고객 처리
        serviceQueue.customerProcess();
        serviceQueue.customerProcess();
        serviceQueue.customerProcess();
        serviceQueue.customerProcess();
    }
}
