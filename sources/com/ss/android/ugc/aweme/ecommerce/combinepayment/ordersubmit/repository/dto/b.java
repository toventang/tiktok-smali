package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f;
import h.f.b.l;
import java.util.List;

public final class b {
    @c(a = "order_ids")

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f84931a;
    @c(a = "jump_schema_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f84932b;
    @c(a = "cashier")

    /* renamed from: c  reason: collision with root package name */
    public final o f84933c;
    @c(a = "exception_ux")

    /* renamed from: d  reason: collision with root package name */
    public final ExceptionUX f84934d;
    @c(a = "new_pay_info")

    /* renamed from: e  reason: collision with root package name */
    public final f f84935e;
    @c(a = "combo_id")

    /* renamed from: f  reason: collision with root package name */
    public final String f84936f;
    @c(a = "miss_cashback")

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f84937g;

    static {
        Covode.recordClassIndex(53121);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f84931a, bVar.f84931a) && l.a(this.f84932b, bVar.f84932b) && l.a(this.f84933c, bVar.f84933c) && l.a(this.f84934d, bVar.f84934d) && l.a(this.f84935e, bVar.f84935e) && l.a(this.f84936f, bVar.f84936f) && l.a(this.f84937g, bVar.f84937g);
    }

    public final int hashCode() {
        List<String> list = this.f84931a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f84932b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        o oVar = this.f84933c;
        int hashCode3 = (hashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        ExceptionUX exceptionUX = this.f84934d;
        int hashCode4 = (hashCode3 + (exceptionUX != null ? exceptionUX.hashCode() : 0)) * 31;
        f fVar = this.f84935e;
        int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str2 = this.f84936f;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f84937g;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "CreateOrderData(orderIds=" + this.f84931a + ", jumpSchema_url=" + this.f84932b + ", cashier=" + this.f84933c + ", exceptionUX=" + this.f84934d + ", newPayInfo=" + this.f84935e + ", comboId=" + this.f84936f + ", missCashback=" + this.f84937g + ")";
    }
}
