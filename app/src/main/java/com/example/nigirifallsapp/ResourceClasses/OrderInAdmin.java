package com.example.nigirifallsapp.ResourceClasses;

import java.util.ArrayList;
import java.util.List;

public class OrderInAdmin {

    private String orderId;
    private String pickUpTime;
    private String status;
    private String name;
    private String phone;
    private List<String> dishList = new ArrayList<>();

    public OrderInAdmin(String orderInfo){

        String[] elementsInOrderInfo = orderInfo.split("\\|");
        this.orderId = elementsInOrderInfo[0];
        this.pickUpTime = elementsInOrderInfo[1];
        this.status = elementsInOrderInfo[2];
        this.phone = elementsInOrderInfo[3];
        this.name = elementsInOrderInfo[4];
        // The format of the list is dish|quantity|dish|quantity|dish...
        for (int i = 5; i < elementsInOrderInfo.length; i++){
            this.dishList.add(elementsInOrderInfo[i]);
        }
    }

    public String getOrderId(){
        return this.orderId;
    }

    public String getPickUpTime(){
        return this.pickUpTime;
    }

    public String getStatus(){return this.status;}

    public String getName(){ return this.name;}

    public String getPhone(){return this.phone;}

    public List<String> getDishList(){ return this.dishList;}

}
