package com.higgsup.sample.entites;

import java.io.Serializable;

/**
 * Created by tulh on 9/1/2017
 */
public class PurchaseOrderPK implements Serializable {
    private String poId;
    private int poRevision;

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    public int getPoRevision() {
        return poRevision;
    }

    public void setPoRevision(int poRevision) {
        this.poRevision = poRevision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PurchaseOrderPK that = (PurchaseOrderPK) o;

        if (poRevision != that.poRevision) return false;
        if (poId != null ? !poId.equals(that.poId) : that.poId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = poId != null ? poId.hashCode() : 0;
        result = 31 * result + poRevision;
        return result;
    }
}
