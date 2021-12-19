package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "lynx_schema")
    private final c lynxSchema;
    @c(a = "status_code")
    private final int statusCode;
    @c(a = "status_msg")
    private final String statusMsg;

    static {
        Covode.recordClassIndex(45510);
    }

    public static int com_ss_android_ugc_aweme_commercialize_e_commerce_wishlist_model_WishListGeckoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ d copy$default(d dVar, int i2, String str, c cVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = dVar.statusCode;
        }
        if ((i3 & 2) != 0) {
            str = dVar.statusMsg;
        }
        if ((i3 & 4) != 0) {
            cVar = dVar.lynxSchema;
        }
        return dVar.copy(i2, str, cVar);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusMsg;
    }

    public final c component3() {
        return this.lynxSchema;
    }

    public final d copy(int i2, String str, c cVar) {
        return new d(i2, str, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.statusCode == dVar.statusCode && l.a(this.statusMsg, dVar.statusMsg) && l.a(this.lynxSchema, dVar.lynxSchema);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_e_commerce_wishlist_model_WishListGeckoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_e_commerce_wishlist_model_WishListGeckoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.statusCode) * 31;
        String str = this.statusMsg;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_e_commerce_wishlist_model_WishListGeckoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        c cVar = this.lynxSchema;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "WishListGeckoResponse(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", lynxSchema=" + this.lynxSchema + ")";
    }

    public final c getLynxSchema() {
        return this.lynxSchema;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public d(int i2, String str, c cVar) {
        this.statusCode = i2;
        this.statusMsg = str;
        this.lynxSchema = cVar;
    }
}
