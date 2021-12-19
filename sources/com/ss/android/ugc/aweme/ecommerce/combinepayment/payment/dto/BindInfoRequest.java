package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class BindInfoRequest implements Serializable {
    @c(a = "payment_method_list")
    private final List<BindInfoReqInfo> paymentMethodList;

    static {
        Covode.recordClassIndex(53369);
    }

    public BindInfoRequest() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindInfoRequest copy$default(BindInfoRequest bindInfoRequest, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = bindInfoRequest.paymentMethodList;
        }
        return bindInfoRequest.copy(list);
    }

    public final List<BindInfoReqInfo> component1() {
        return this.paymentMethodList;
    }

    public final BindInfoRequest copy(List<BindInfoReqInfo> list) {
        return new BindInfoRequest(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BindInfoRequest) && l.a(this.paymentMethodList, ((BindInfoRequest) obj).paymentMethodList);
        }
        return true;
    }

    public final int hashCode() {
        List<BindInfoReqInfo> list = this.paymentMethodList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BindInfoRequest(paymentMethodList=" + this.paymentMethodList + ")";
    }

    public final List<BindInfoReqInfo> getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public BindInfoRequest(List<BindInfoReqInfo> list) {
        this.paymentMethodList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindInfoRequest(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list);
    }
}
