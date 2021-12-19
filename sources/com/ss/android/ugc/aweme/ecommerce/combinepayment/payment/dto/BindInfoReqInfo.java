package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class BindInfoReqInfo implements Serializable {
    @c(a = "payment_method_id")
    private final String paymentMethodId;

    static {
        Covode.recordClassIndex(53368);
    }

    public BindInfoReqInfo() {
        this(null, 1, null);
    }

    public static /* synthetic */ BindInfoReqInfo copy$default(BindInfoReqInfo bindInfoReqInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bindInfoReqInfo.paymentMethodId;
        }
        return bindInfoReqInfo.copy(str);
    }

    public final String component1() {
        return this.paymentMethodId;
    }

    public final BindInfoReqInfo copy(String str) {
        return new BindInfoReqInfo(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BindInfoReqInfo) && l.a(this.paymentMethodId, ((BindInfoReqInfo) obj).paymentMethodId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.paymentMethodId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BindInfoReqInfo(paymentMethodId=" + this.paymentMethodId + ")";
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public BindInfoReqInfo(String str) {
        this.paymentMethodId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindInfoReqInfo(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str);
    }
}
