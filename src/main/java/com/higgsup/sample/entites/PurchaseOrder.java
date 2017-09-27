package com.higgsup.sample.entites;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by tulh on 9/1/2017
 */
@Entity
@Table(name = "purchase_order")
@IdClass(PurchaseOrderPK.class)
public class PurchaseOrder {
    private String poId;
    private int poRevision;
    private Timestamp poRevisionTimestamp;
    private String poStatus = "";
    private String poPaidStatus = "0";
    private String poRefundStatus;
    private Timestamp poCreatedTimestamp;
    private Timestamp poAllocatedTimestamp;
    private Timestamp poCompletedTimestamp;
    private Timestamp poCancelledTimestamp;
    private String poOriginalBookingType;
    private String poBookByUsername = "";
    private String poBookByUsertype = "";
    private String poEditByUsername = "";
    private String poEditByUsertype = "";
    private String poPostcode;
    private String poTerritoryName;
    private String poAddress;
    private String poProducts = "";
    private String poAdditionalProducts = "";
    private String poPromotionCode;
    private String poWasteType;
    private Timestamp poDeliveryDate;
    private String poDeliveryTimeslot;
    private Timestamp poPickupDate;
    private String poPoNumber;
    private String poBarcode = "";
    private String poBunningsStoreName;
    private String poBunningsTeamMember;
    private String poAgencyId;
    private String poCustomerReference;
    private String poExtraDayCharge;
    private String poAmount;
    private String poCustomerFullName;
    private String poCost = "0";
    private Timestamp poTimeStamp;
    @Id
    @Column(name = "PO_id", nullable = false, length = 100)
    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    @Id
    @Column(name = "PO_revision", nullable = false)
    public int getPoRevision() {
        return poRevision;
    }

    public void setPoRevision(int poRevision) {
        this.poRevision = poRevision;
    }

    @Basic
    @Column(name = "PO_revision_timestamp", nullable = false)
    public Timestamp getPoRevisionTimestamp() {
        return poRevisionTimestamp;
    }

    public void setPoRevisionTimestamp(Timestamp poRevisionTimestamp) {
        this.poRevisionTimestamp = poRevisionTimestamp;
    }

    @Basic
    @Column(name = "PO_status", nullable = true, length = 100)
    public String getPoStatus() {
        return poStatus;
    }

    public void setPoStatus(String poStatus) {
        this.poStatus = poStatus;
    }

    @Basic
    @Column(name = "PO_paid_status", nullable = true, length = 100)
    public String getPoPaidStatus() {
        return poPaidStatus;
    }

    public void setPoPaidStatus(String poPaidStatus) {
        this.poPaidStatus = poPaidStatus;
    }

    @Basic
    @Column(name = "PO_refund_status", nullable = true, length = 100)
    public String getPoRefundStatus() {
        return poRefundStatus;
    }

    public void setPoRefundStatus(String poRefundStatus) {
        this.poRefundStatus = poRefundStatus;
    }

    @Basic
    @Column(name = "PO_created_timestamp", nullable = false)
    public Timestamp getPoCreatedTimestamp() {
        return poCreatedTimestamp;
    }

    public void setPoCreatedTimestamp(Timestamp poCreatedTimestamp) {
        this.poCreatedTimestamp = poCreatedTimestamp;
    }

    @Basic
    @Column(name = "PO_allocated_timestamp", nullable = true)
    public Timestamp getPoAllocatedTimestamp() {
        return poAllocatedTimestamp;
    }

    public void setPoAllocatedTimestamp(Timestamp poAllocatedTimestamp) {
        this.poAllocatedTimestamp = poAllocatedTimestamp;
    }

    @Basic
    @Column(name = "PO_completed_timestamp", nullable = true)
    public Timestamp getPoCompletedTimestamp() {
        return poCompletedTimestamp;
    }

    public void setPoCompletedTimestamp(Timestamp poCompletedTimestamp) {
        this.poCompletedTimestamp = poCompletedTimestamp;
    }

    @Basic
    @Column(name = "PO_cancelled_timestamp", nullable = true)
    public Timestamp getPoCancelledTimestamp() {
        return poCancelledTimestamp;
    }

    public void setPoCancelledTimestamp(Timestamp poCancelledTimestamp) {
        this.poCancelledTimestamp = poCancelledTimestamp;
    }

    @Basic
    @Column(name = "PO_original_booking_type", nullable = true, length = 100)
    public String getPoOriginalBookingType() {
        return poOriginalBookingType;
    }

    public void setPoOriginalBookingType(String poOriginalBookingType) {
        this.poOriginalBookingType = poOriginalBookingType;
    }

    @Basic
    @Column(name = "PO_book_by_username", nullable = true, length = 100)
    public String getPoBookByUsername() {
        return poBookByUsername;
    }

    public void setPoBookByUsername(String poBookByUsername) {
        this.poBookByUsername = poBookByUsername;
    }

    @Basic
    @Column(name = "PO_book_by_usertype", nullable = true, length = 100)
    public String getPoBookByUsertype() {
        return poBookByUsertype;
    }

    public void setPoBookByUsertype(String poBookByUsertype) {
        this.poBookByUsertype = poBookByUsertype;
    }

    @Basic
    @Column(name = "PO_edit_by_username", nullable = true, length = 100)
    public String getPoEditByUsername() {
        return poEditByUsername;
    }

    public void setPoEditByUsername(String poEditByUsername) {
        this.poEditByUsername = poEditByUsername;
    }

    @Basic
    @Column(name = "PO_edit_by_usertype", nullable = true, length = 100)
    public String getPoEditByUsertype() {
        return poEditByUsertype;
    }

    public void setPoEditByUsertype(String poEditByUsertype) {
        this.poEditByUsertype = poEditByUsertype;
    }

    @Basic
    @Column(name = "PO_postcode", nullable = true, length = 100)
    public String getPoPostcode() {
        return poPostcode;
    }

    public void setPoPostcode(String poPostcode) {
        this.poPostcode = poPostcode;
    }

    @Basic
    @Column(name = "PO_territory_name", nullable = true, length = 100)
    public String getPoTerritoryName() {
        return poTerritoryName;
    }

    public void setPoTerritoryName(String poTerritoryName) {
        this.poTerritoryName = poTerritoryName;
    }

    @Basic
    @Column(name = "PO_address", nullable = true, length = -1)
    public String getPoAddress() {
        return poAddress;
    }

    public void setPoAddress(String poAddress) {
        this.poAddress = poAddress;
    }

    @Basic
    @Column(name = "PO_products", nullable = true, length = 100)
    public String getPoProducts() {
        return poProducts;
    }

    public void setPoProducts(String poProducts) {
        this.poProducts = poProducts;
    }

    @Basic
    @Column(name = "PO_additional_products", nullable = true, length = 100)
    public String getPoAdditionalProducts() {
        return poAdditionalProducts;
    }

    public void setPoAdditionalProducts(String poAdditionalProducts) {
        this.poAdditionalProducts = poAdditionalProducts;
    }

    @Basic
    @Column(name = "PO_promotion_code", nullable = true, length = 100)
    public String getPoPromotionCode() {
        return poPromotionCode;
    }

    public void setPoPromotionCode(String poPromotionCode) {
        this.poPromotionCode = poPromotionCode;
    }

    @Basic
    @Column(name = "PO_waste_type", nullable = true, length = 100)
    public String getPoWasteType() {
        return poWasteType;
    }

    public void setPoWasteType(String poWasteType) {
        this.poWasteType = poWasteType;
    }

    @Basic
    @Column(name = "PO_delivery_date", nullable = false)
    public Timestamp getPoDeliveryDate() {
        return poDeliveryDate;
    }

    public void setPoDeliveryDate(Timestamp poDeliveryDate) {
        this.poDeliveryDate = poDeliveryDate;
    }

    @Basic
    @Column(name = "PO_delivery_timeslot", nullable = false, length = 100)
    public String getPoDeliveryTimeslot() {
        return poDeliveryTimeslot;
    }

    public void setPoDeliveryTimeslot(String poDeliveryTimeslot) {
        this.poDeliveryTimeslot = poDeliveryTimeslot;
    }

    @Basic
    @Column(name = "PO_pickup_date", nullable = false)
    public Timestamp getPoPickupDate() {
        return poPickupDate;
    }

    public void setPoPickupDate(Timestamp poPickupDate) {
        this.poPickupDate = poPickupDate;
    }

    @Basic
    @Column(name = "PO_po_number", nullable = true, length = 100)
    public String getPoPoNumber() {
        return poPoNumber;
    }

    public void setPoPoNumber(String poPoNumber) {
        this.poPoNumber = poPoNumber;
    }

    @Basic
    @Column(name = "PO_barcode", nullable = true, length = 100)
    public String getPoBarcode() {
        return poBarcode;
    }

    public void setPoBarcode(String poBarcode) {
        this.poBarcode = poBarcode;
    }

    @Basic
    @Column(name = "PO_bunnings_store_name", nullable = true, length = 100)
    public String getPoBunningsStoreName() {
        return poBunningsStoreName;
    }

    public void setPoBunningsStoreName(String poBunningsStoreName) {
        this.poBunningsStoreName = poBunningsStoreName;
    }

    @Basic
    @Column(name = "PO_bunnings_team_member", nullable = true, length = 100)
    public String getPoBunningsTeamMember() {
        return poBunningsTeamMember;
    }

    public void setPoBunningsTeamMember(String poBunningsTeamMember) {
        this.poBunningsTeamMember = poBunningsTeamMember;
    }

    @Basic
    @Column(name = "PO_agency_id", nullable = true, length = 100)
    public String getPoAgencyId() {
        return poAgencyId;
    }

    public void setPoAgencyId(String poAgencyId) {
        this.poAgencyId = poAgencyId;
    }

    @Basic
    @Column(name = "PO_customer_reference", nullable = true, length = 100)
    public String getPoCustomerReference() {
        return poCustomerReference;
    }

    public void setPoCustomerReference(String poCustomerReference) {
        this.poCustomerReference = poCustomerReference;
    }


    @Basic
    @Column(name = "PO_extra_day_charge", nullable = true, length = 100)
    public String getPoExtraDayCharge() {
        return poExtraDayCharge;
    }

    public void setPoExtraDayCharge(String poExtraDayCharge) {
        this.poExtraDayCharge = poExtraDayCharge;
    }

    @Basic
    @Column(name = "PO_amount", nullable = true, length = 100)
    public String getPoAmount() {
        return poAmount;
    }

    public void setPoAmount(String poAmount) {
        this.poAmount = poAmount;
    }


    @Basic
    @Column(name = "PO_customer_fullname", nullable = true, length = 100)
    public String getPoCustomerFullName() {
        return poCustomerFullName;
    }

    public void setPoCost(String poCost) {
        this.poCost = poCost;
    }

    @Basic
    @Column(name = "PO_cost", nullable = true, length = 100)
    public String getPoCost() {
        return poCost;
    }

    @Basic
    @Column(name = "PO_timestamp", nullable = true, length = 100)
    public Timestamp getPoTimeStamp() {
        return poTimeStamp;
    }

    public void setPoTimeStamp(Timestamp poTimeStamp) {
        this.poTimeStamp = poTimeStamp;
    }

    public void setPoCustomerFullName(String poCustomerFullName) {
        this.poCustomerFullName = poCustomerFullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PurchaseOrder that = (PurchaseOrder) o;

        if (poRevision != that.poRevision) return false;
        if (poId != null ? !poId.equals(that.poId) : that.poId != null) return false;
        if (poRevisionTimestamp != null ? !poRevisionTimestamp.equals(that.poRevisionTimestamp) : that.poRevisionTimestamp != null)
            return false;
        if (poStatus != null ? !poStatus.equals(that.poStatus) : that.poStatus != null) return false;
        if (poPaidStatus != null ? !poPaidStatus.equals(that.poPaidStatus) : that.poPaidStatus != null) return false;
        if (poRefundStatus != null ? !poRefundStatus.equals(that.poRefundStatus) : that.poRefundStatus != null)
            return false;
        if (poCreatedTimestamp != null ? !poCreatedTimestamp.equals(that.poCreatedTimestamp) : that.poCreatedTimestamp != null)
            return false;
        if (poAllocatedTimestamp != null ? !poAllocatedTimestamp.equals(that.poAllocatedTimestamp) : that.poAllocatedTimestamp != null)
            return false;
        if (poCompletedTimestamp != null ? !poCompletedTimestamp.equals(that.poCompletedTimestamp) : that.poCompletedTimestamp != null)
            return false;
        if (poCancelledTimestamp != null ? !poCancelledTimestamp.equals(that.poCancelledTimestamp) : that.poCancelledTimestamp != null)
            return false;
        if (poOriginalBookingType != null ? !poOriginalBookingType.equals(that.poOriginalBookingType) : that.poOriginalBookingType != null)
            return false;
        if (poBookByUsername != null ? !poBookByUsername.equals(that.poBookByUsername) : that.poBookByUsername != null)
            return false;
        if (poBookByUsertype != null ? !poBookByUsertype.equals(that.poBookByUsertype) : that.poBookByUsertype != null)
            return false;
        if (poEditByUsername != null ? !poEditByUsername.equals(that.poEditByUsername) : that.poEditByUsername != null)
            return false;
        if (poEditByUsertype != null ? !poEditByUsertype.equals(that.poEditByUsertype) : that.poEditByUsertype != null)
            return false;
        if (poPostcode != null ? !poPostcode.equals(that.poPostcode) : that.poPostcode != null) return false;
        if (poTerritoryName != null ? !poTerritoryName.equals(that.poTerritoryName) : that.poTerritoryName != null)
            return false;
        if (poAddress != null ? !poAddress.equals(that.poAddress) : that.poAddress != null) return false;
        if (poProducts != null ? !poProducts.equals(that.poProducts) : that.poProducts != null) return false;
        if (poAdditionalProducts != null ? !poAdditionalProducts.equals(that.poAdditionalProducts) : that.poAdditionalProducts != null)
            return false;
        if (poPromotionCode != null ? !poPromotionCode.equals(that.poPromotionCode) : that.poPromotionCode != null)
            return false;
        if (poWasteType != null ? !poWasteType.equals(that.poWasteType) : that.poWasteType != null) return false;
        if (poDeliveryDate != null ? !poDeliveryDate.equals(that.poDeliveryDate) : that.poDeliveryDate != null)
            return false;
        if (poDeliveryTimeslot != null ? !poDeliveryTimeslot.equals(that.poDeliveryTimeslot) : that.poDeliveryTimeslot != null)
            return false;
        if (poPickupDate != null ? !poPickupDate.equals(that.poPickupDate) : that.poPickupDate != null) return false;
        if (poPoNumber != null ? !poPoNumber.equals(that.poPoNumber) : that.poPoNumber != null) return false;
        if (poBarcode != null ? !poBarcode.equals(that.poBarcode) : that.poBarcode != null) return false;
        if (poBunningsStoreName != null ? !poBunningsStoreName.equals(that.poBunningsStoreName) : that.poBunningsStoreName != null)
            return false;
        if (poBunningsTeamMember != null ? !poBunningsTeamMember.equals(that.poBunningsTeamMember) : that.poBunningsTeamMember != null)
            return false;
        if (poAgencyId != null ? !poAgencyId.equals(that.poAgencyId) : that.poAgencyId != null) return false;
        if (poCustomerReference != null ? !poCustomerReference.equals(that.poCustomerReference) : that.poCustomerReference != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = poId != null ? poId.hashCode() : 0;
        result = 31 * result + poRevision;
        result = 31 * result + (poRevisionTimestamp != null ? poRevisionTimestamp.hashCode() : 0);
        result = 31 * result + (poStatus != null ? poStatus.hashCode() : 0);
        result = 31 * result + (poPaidStatus != null ? poPaidStatus.hashCode() : 0);
        result = 31 * result + (poRefundStatus != null ? poRefundStatus.hashCode() : 0);
        result = 31 * result + (poCreatedTimestamp != null ? poCreatedTimestamp.hashCode() : 0);
        result = 31 * result + (poAllocatedTimestamp != null ? poAllocatedTimestamp.hashCode() : 0);
        result = 31 * result + (poCompletedTimestamp != null ? poCompletedTimestamp.hashCode() : 0);
        result = 31 * result + (poCancelledTimestamp != null ? poCancelledTimestamp.hashCode() : 0);
        result = 31 * result + (poOriginalBookingType != null ? poOriginalBookingType.hashCode() : 0);
        result = 31 * result + (poBookByUsername != null ? poBookByUsername.hashCode() : 0);
        result = 31 * result + (poBookByUsertype != null ? poBookByUsertype.hashCode() : 0);
        result = 31 * result + (poEditByUsername != null ? poEditByUsername.hashCode() : 0);
        result = 31 * result + (poEditByUsertype != null ? poEditByUsertype.hashCode() : 0);
        result = 31 * result + (poPostcode != null ? poPostcode.hashCode() : 0);
        result = 31 * result + (poTerritoryName != null ? poTerritoryName.hashCode() : 0);
        result = 31 * result + (poAddress != null ? poAddress.hashCode() : 0);
        result = 31 * result + (poProducts != null ? poProducts.hashCode() : 0);
        result = 31 * result + (poAdditionalProducts != null ? poAdditionalProducts.hashCode() : 0);
        result = 31 * result + (poPromotionCode != null ? poPromotionCode.hashCode() : 0);
        result = 31 * result + (poWasteType != null ? poWasteType.hashCode() : 0);
        result = 31 * result + (poDeliveryDate != null ? poDeliveryDate.hashCode() : 0);
        result = 31 * result + (poDeliveryTimeslot != null ? poDeliveryTimeslot.hashCode() : 0);
        result = 31 * result + (poPickupDate != null ? poPickupDate.hashCode() : 0);
        result = 31 * result + (poPoNumber != null ? poPoNumber.hashCode() : 0);
        result = 31 * result + (poBarcode != null ? poBarcode.hashCode() : 0);
        result = 31 * result + (poBunningsStoreName != null ? poBunningsStoreName.hashCode() : 0);
        result = 31 * result + (poBunningsTeamMember != null ? poBunningsTeamMember.hashCode() : 0);
        result = 31 * result + (poAgencyId != null ? poAgencyId.hashCode() : 0);
        result = 31 * result + (poCustomerReference != null ? poCustomerReference.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "poId='" + poId + '\'' +
                ", poRevision=" + poRevision +
                ", poRevisionTimestamp=" + poRevisionTimestamp +
                ", poStatus='" + poStatus + '\'' +
                ", poPaidStatus='" + poPaidStatus + '\'' +
                ", poRefundStatus='" + poRefundStatus + '\'' +
                ", poCreatedTimestamp=" + poCreatedTimestamp +
                ", poAllocatedTimestamp=" + poAllocatedTimestamp +
                ", poCompletedTimestamp=" + poCompletedTimestamp +
                ", poCancelledTimestamp=" + poCancelledTimestamp +
                ", poOriginalBookingType='" + poOriginalBookingType + '\'' +
                ", poBookByUsername='" + poBookByUsername + '\'' +
                ", poBookByUsertype='" + poBookByUsertype + '\'' +
                ", poEditByUsername='" + poEditByUsername + '\'' +
                ", poEditByUsertype='" + poEditByUsertype + '\'' +
                ", poPostcode='" + poPostcode + '\'' +
                ", poTerritoryName='" + poTerritoryName + '\'' +
                ", poAddress='" + poAddress + '\'' +
                ", poProducts='" + poProducts + '\'' +
                ", poAdditionalProducts='" + poAdditionalProducts + '\'' +
                ", poPromotionCode='" + poPromotionCode + '\'' +
                ", poWasteType='" + poWasteType + '\'' +
                ", poDeliveryDate=" + poDeliveryDate +
                ", poDeliveryTimeslot='" + poDeliveryTimeslot + '\'' +
                ", poPickupDate=" + poPickupDate +
                ", poPoNumber='" + poPoNumber + '\'' +
                ", poBarcode='" + poBarcode + '\'' +
                ", poBunningsStoreName='" + poBunningsStoreName + '\'' +
                ", poBunningsTeamMember='" + poBunningsTeamMember + '\'' +
                ", poAgencyId='" + poAgencyId + '\'' +
                ", poCustomerReference='" + poCustomerReference + '\'' +
                ", poExtraDayCharge='" + poExtraDayCharge + '\'' +
                ", poAmount='" + poAmount + '\'' +
                ", poCustomerFullName='" + poCustomerFullName + '\'' +
                ", poCost='" + poCost + '\'' +
                ", poTimeStamp=" + poTimeStamp +
                '}';
    }
}
