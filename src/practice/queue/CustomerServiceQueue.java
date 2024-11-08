package practice.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerServiceQueue {
    private Queue<String> customerList = new LinkedList<>();

    // 고객 요청 추가 (큐에 저장)
    public void addCustomer(String customer){
        customerList.add(customer);
        System.out.println("요청 추가(큐): " + customer);
    }

    // 고객 요청 처리
    public void customerProcess(){
        if(!customerList.isEmpty()){
            String cutomer = customerList.poll();
            System.out.println("처리고객: " + cutomer);
        } else {
            System.out.println("고객 요청이 없습니다.");
        }
    }
}
