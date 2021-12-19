package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class BindInfoItem {
    @c(a = "payment_method_bind_url")
    private final String paymentMethodBindUrl;
    @c(a = "payment_method_id")
    private final String paymentMethodId;

    static {
        Covode.recordClassIndex(53367);
    }

    public BindInfoItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ BindInfoItem copy$default(BindInfoItem bindInfoItem, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bindInfoItem.paymentMethodId;
        }
        if ((i2 & 2) != 0) {
            str2 = bindInfoItem.paymentMethodBindUrl;
        }
        return bindInfoItem.copy(str, str2);
    }

    public final String component1() {
        return this.paymentMethodId;
    }

    public final String component2() {
        return this.paymentMethodBindUrl;
    }

    public final BindInfoItem copy(String str, String str2) {
        return new BindInfoItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindInfoItem)) {
            return false;
        }
        BindInfoItem bindInfoItem = (BindInfoItem) obj;
        return l.a(this.paymentMethodId, bindInfoItem.paymentMethodId) && l.a(this.paymentMethodBindUrl, bindInfoItem.paymentMethodBindUrl);
    }

    public final int hashCode() {
        String str = this.paymentMethodId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.paymentMethodBindUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BindInfoItem(paymentMethodId=" + this.paymentMethodId + ", paymentMethodBindUrl=" + this.paymentMethodBindUrl + ")";
    }

    public final String getPaymentMethodBindUrl() {
        return this.paymentMethodBindUrl;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public BindInfoItem(String str, String str2) {
        this.paymentMethodId = str;
        this.paymentMethodBindUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindInfoItem(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
