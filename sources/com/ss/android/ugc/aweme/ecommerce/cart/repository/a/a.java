package com.ss.android.ugc.aweme.ecommerce.cart.repository.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import h.f.b.l;

public final class a {
    @c(a = "cart_item_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f84682a;
    @c(a = "exception_ux")

    /* renamed from: b  reason: collision with root package name */
    public final ExceptionUX f84683b;
    @c(a = "cart_entry")

    /* renamed from: c  reason: collision with root package name */
    public final CartEntry f84684c;
    @c(a = "pre_sku_count")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f84685d;
    @c(a = "post_sku_count")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f84686e;

    static {
        Covode.recordClassIndex(52884);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f84682a, aVar.f84682a) && l.a(this.f84683b, aVar.f84683b) && l.a(this.f84684c, aVar.f84684c) && l.a(this.f84685d, aVar.f84685d) && l.a(this.f84686e, aVar.f84686e);
    }

    public final int hashCode() {
        String str = this.f84682a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ExceptionUX exceptionUX = this.f84683b;
        int hashCode2 = (hashCode + (exceptionUX != null ? exceptionUX.hashCode() : 0)) * 31;
        CartEntry cartEntry = this.f84684c;
        int hashCode3 = (hashCode2 + (cartEntry != null ? cartEntry.hashCode() : 0)) * 31;
        Integer num = this.f84685d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f84686e;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AddItemToCartData(cartItemId=" + this.f84682a + ", exceptionUX=" + this.f84683b + ", cartEntry=" + this.f84684c + ", preSkuCount=" + this.f84685d + ", postSkuCount=" + this.f84686e + ")";
    }
}
