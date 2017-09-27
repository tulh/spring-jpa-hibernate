package com.higgsup.sample.repositories.impl;


import com.higgsup.sample.entites.PurchaseOrder;
import com.higgsup.sample.repositories.PurchaseOrderRepoCustom;
import com.higgsup.sample.utils.JpaResultConverter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Administrator on 5/5/2017.
 */

class PurchaseOrderRepoImpl implements PurchaseOrderRepoCustom {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<PurchaseOrder> getPurchaseOrders() {
        Query query = em.createNativeQuery("SELECT o.PO_customer_fullname, o.PO_waste_type, p.FP_address, o.PO_created_timestamp FROM purchase_order o, mobileskips_franchisee_profile p WHERE o.PO_territory_name = p.FP_franchisee_name AND p.FP_franchisee_name= \"bentest\"\n");
        return JpaResultConverter.getResultList(query, PurchaseOrder.class);
    }

    public List<String> getCurrentCompleteAndPaid(String First_Day_Of_Month, String Last_Day_Of_Month, String franchiseeName) {
        Query query = em.createNativeQuery("SELECT PO_id FROM purchase_order a, purchase_order_customer_info b WHERE a.PO_id=b.PO_CI_id AND a.PO_paid_status='1' AND b.CI_payment_date<= :Last_Day_Of_Month AND a.PO_completed_timestamp >= :First_Day_Of_Month AND a.PO_completed_timestamp<= :Last_Day_Of_Month AND a.PO_status = 'Completed' AND PO_territory_name = :franchiseeName ORDER BY a.PO_completed_timestamp,b.CI_payment_date");
        query.setParameter("First_Day_Of_Month", First_Day_Of_Month);
        query.setParameter("Last_Day_Of_Month", Last_Day_Of_Month);
        query.setParameter("franchiseeName", franchiseeName);
        return query.getResultList();
    }

    public List<String> getPreviousCompleteAndPaid(String First_Day_Of_Month, String Last_Day_Of_Month, String franchiseeName) {
        Query query = em.createNativeQuery("SELECT PO_id FROM purchase_order a, purchase_order_customer_info b WHERE a.PO_id=b.PO_CI_id AND a.PO_paid_status='1' AND b.CI_payment_date>= :startPaymentDate AND b.CI_payment_date<= :endPaymentDate AND a.PO_completed_timestamp< :completeDate AND a.PO_status = 'Completed' AND PO_territory_name = :franchiseeName ORDER BY a.PO_completed_timestamp,b.CI_payment_date");
        query.setParameter("startPaymentDate", First_Day_Of_Month);
        query.setParameter("endPaymentDate", Last_Day_Of_Month);
        query.setParameter("completeDate", First_Day_Of_Month);
        query.setParameter("franchiseeName", franchiseeName);
        return query.getResultList();
    }
}