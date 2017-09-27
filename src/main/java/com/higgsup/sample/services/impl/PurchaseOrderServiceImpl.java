package com.higgsup.sample.services.impl;

import com.higgsup.sample.entites.PurchaseOrder;
import com.higgsup.sample.repositories.PurchaseOrderRepo;
import com.higgsup.sample.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tulh on 9/26/2017
 */
@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService{

    @Autowired
    private PurchaseOrderRepo purchaseOrderRepo;

    @Override
    public PurchaseOrder findById(String poId) {
        return purchaseOrderRepo.findById(poId);
    }
}
