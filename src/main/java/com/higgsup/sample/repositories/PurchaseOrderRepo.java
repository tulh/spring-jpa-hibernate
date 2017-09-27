package com.higgsup.sample.repositories;

import com.higgsup.sample.entites.PurchaseOrder;
import com.higgsup.sample.entites.PurchaseOrderPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by lent on 22-Mar-17.
 */
@Repository
public interface PurchaseOrderRepo extends PagingAndSortingRepository<PurchaseOrder, PurchaseOrderPK>, PurchaseOrderRepoCustom {

    @Query(value = "SELECT SUM(PO_amount) FROM purchase_order WHERE PO_territory_name = :franchiseeId " +
            " AND PO_status = 'Completed' and YEAR(PO_completed_timestamp) = :year group by MONTH(PO_completed_timestamp) order by PO_completed_timestamp ASC", nativeQuery = true)
    List<Double> countMobileSkipseMothsSale(@Param("franchiseeId") String franchiseeId, @Param("year") String year);

    @Query(value = "SELECT count(*) FROM purchase_order WHERE PO_territory_name = :franchiseeId " +
            " AND PO_status = 'Completed' AND YEAR(PO_completed_timestamp) = :year group by MONTH(PO_completed_timestamp) order by PO_completed_timestamp ASC", nativeQuery = true)
    List<BigInteger>  countMobileSkipseHires(@Param("franchiseeId") String franchiseeId, @Param("year") String year);

    @Query(value = "SELECT po.* " +
            "FROM purchase_order po, purchase_order_customer_info ci " +
            "WHERE po.PO_id=ci.PO_CI_po_id AND po.PO_paid_status='1' AND po.PO_status = 'Completed' AND po.PO_territory_name = :franchiseeId", nativeQuery = true)
    List<PurchaseOrder> purchaseOrderByCustomer(@Param("franchiseeId") String franchiseeId);

    @Query(value = "SELECT * FROM purchase_order order by PO_created_timestamp ASC LIMIT 1", nativeQuery = true)
    PurchaseOrder findFirstOrderDate();

    @Query(value = "SELECT * FROM purchase_order where PO_territory_name = :franchisee_id order by PO_created_timestamp ASC LIMIT 1 ", nativeQuery = true)
    PurchaseOrder findFirstOrderByFranchiseeId(@Param("franchisee_id") String franchiseeId);

    @Query(value = "SELECT * FROM purchase_order WHERE PO_completed_timestamp BETWEEN :dateFrom AND :dateTo AND PO_status='Completed' AND PO_paid_status = :paymentStatus AND PO_territory_name = :franchiseeName ORDER BY PO_completed_timestamp", nativeQuery = true)
    List<PurchaseOrder> findByCompletedDateBetween(@Param("dateFrom") String dateFrom, @Param("dateTo") String dateTo, @Param("paymentStatus") String paymentStatus, @Param("franchiseeName") String franchiseeName);

    @Query(value = "SELECT * FROM purchase_order WHERE PO_completed_timestamp <= :dateFrom AND PO_status='Completed' AND PO_paid_status = :paymentStatus AND PO_territory_name = :franchiseeName ORDER BY PO_completed_timestamp", nativeQuery = true)
    List<PurchaseOrder> findByCompletedDateBefore(@Param("dateFrom") String dateFrom, @Param("paymentStatus") String paymentStatus, @Param("franchiseeName") String franchiseeName);

    @Query(value = "SELECT * FROM purchase_order WHERE PO_id = :poId order by PO_revision_timestamp desc limit 1", nativeQuery = true)
    PurchaseOrder findById(@Param("poId") String poId);

    @Query(value = "SELECT SUM(a.PO_amount) " +
            "FROM purchase_order a INNER JOIN mobileskips_agencies_profile b\n" +
            "    ON a.PO_agency_id = b.AGP_username AND b.AGP_type = 'Bunnings' AND a.PO_status NOT IN ('Cancelled', 'INCOMPLETE')\n" +
            "WHERE a.PO_created_timestamp BETWEEN :startDate AND :endDate", nativeQuery = true)
    Double countSalesByBunningsInDateRange(@Param("startDate") String startDate, @Param("endDate") String endDate);

    @Query(value = "SELECT SUM(a.PO_amount) " +
            "FROM purchase_order a INNER JOIN mobileskips_agencies_profile b\n" +
            "    ON a.PO_agency_id = b.AGP_username AND b.AGP_type = 'Bunnings' AND a.PO_status NOT IN ('Cancelled', 'INCOMPLETE')\n" +
            "WHERE a.PO_created_timestamp = :orderedDate", nativeQuery = true)
    Double countDailySalesByBunnings(@Param("orderedDate") String date);
}
