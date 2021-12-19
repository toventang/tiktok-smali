package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class PurchaseHistoryRecord {

    /* renamed from: a  reason: collision with root package name */
    public final String f5778a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5779b;

    static {
        Covode.recordClassIndex(2422);
    }

    public int hashCode() {
        return this.f5778a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f5778a);
        if (valueOf.length() != 0) {
            return "PurchaseHistoryRecord. Json: ".concat(valueOf);
        }
        return new String("PurchaseHistoryRecord. Json: ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (!TextUtils.equals(this.f5778a, purchaseHistoryRecord.f5778a) || !TextUtils.equals(this.f5779b, purchaseHistoryRecord.f5779b)) {
            return false;
        }
        return true;
    }
}
