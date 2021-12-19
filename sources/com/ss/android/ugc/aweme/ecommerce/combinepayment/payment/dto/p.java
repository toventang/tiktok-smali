package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class p implements Serializable {
    @c(a = "payment_method_id")
    private final String id;
    @c(a = "is_choose_save")
    private final Boolean isChooseSave;
    @c(a = "payment_elements")
    private List<m> paymentElements;
    @c(a = "payment_method_token")
    private final String token;

    static {
        Covode.recordClassIndex(53388);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p copy$default(p pVar, String str, String str2, List list, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pVar.id;
        }
        if ((i2 & 2) != 0) {
            str2 = pVar.token;
        }
        if ((i2 & 4) != 0) {
            list = pVar.paymentElements;
        }
        if ((i2 & 8) != 0) {
            bool = pVar.isChooseSave;
        }
        return pVar.copy(str, str2, list, bool);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.token;
    }

    public final List<m> component3() {
        return this.paymentElements;
    }

    public final Boolean component4() {
        return this.isChooseSave;
    }

    public final p copy(String str, String str2, List<m> list, Boolean bool) {
        return new p(str, str2, list, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l.a(this.id, pVar.id) && l.a(this.token, pVar.token) && l.a(this.paymentElements, pVar.paymentElements) && l.a(this.isChooseSave, pVar.isChooseSave);
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.token;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<m> list = this.paymentElements;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.isChooseSave;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PaymentMethodInfo(id=" + this.id + ", token=" + this.token + ", paymentElements=" + this.paymentElements + ", isChooseSave=" + this.isChooseSave + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final List<m> getPaymentElements() {
        return this.paymentElements;
    }

    public final String getToken() {
        return this.token;
    }

    public final Boolean isChooseSave() {
        return this.isChooseSave;
    }

    public final void setPaymentElements(List<m> list) {
        this.paymentElements = list;
    }

    public p(String str, String str2, List<m> list, Boolean bool) {
        this.id = str;
        this.token = str2;
        this.paymentElements = list;
        this.isChooseSave = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, String str2, List list, Boolean bool, int i2, g gVar) {
        this(str, str2, (i2 & 4) != 0 ? null : list, bool);
    }
}
