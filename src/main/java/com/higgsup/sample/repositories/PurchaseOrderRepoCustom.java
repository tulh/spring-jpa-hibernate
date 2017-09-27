package com.higgsup.sample.repositories;


import com.higgsup.sample.entites.PurchaseOrder;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Administrator on 5/5/2017.
 */
public interface PurchaseOrderRepoCustom {
    List<PurchaseOrder> getPurchaseOrders();
    List<String> getCurrentCompleteAndPaid(String First_Day_Of_Month, String Last_Day_Of_Month, String franchiseeName);
    List<String> getPreviousCompleteAndPaid(String First_Day_Of_Month, String Last_Day_Of_Month, String franchiseeName);
}