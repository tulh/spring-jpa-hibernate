package com.higgsup.sample.services;

import com.higgsup.sample.entites.PurchaseOrder;

/**
 * Created by tulh on 9/26/2017
 */
public interface PurchaseOrderService {
    PurchaseOrder findById(String poId);
}
