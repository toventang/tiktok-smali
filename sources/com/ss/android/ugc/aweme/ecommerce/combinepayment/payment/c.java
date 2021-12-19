package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.s;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class c {

    /* renamed from: k  reason: collision with root package name */
    public static final b f85259k = new b((byte) 0);
    @com.google.gson.a.c(a = "current_progress")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f85260a;
    @com.google.gson.a.c(a = "total_progress")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f85261b;
    @com.google.gson.a.c(a = "button_type")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f85262c;
    @com.google.gson.a.c(a = "payment_data")

    /* renamed from: d  reason: collision with root package name */
    public final r f85263d;
    @com.google.gson.a.c(a = "price")

    /* renamed from: e  reason: collision with root package name */
    public final String f85264e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f85265f;
    @com.google.gson.a.c(a = "payment_info")

    /* renamed from: g  reason: collision with root package name */
    public final n f85266g;
    @com.google.gson.a.c(a = "track_params")

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, Object> f85267h;
    @com.google.gson.a.c(a = "payment_price")

    /* renamed from: i  reason: collision with root package name */
    public final List<s> f85268i;
    @com.google.gson.a.c(a = "shipping_address")

    /* renamed from: j  reason: collision with root package name */
    public final Address f85269j;

    public enum a {
        NEXT,
        CONTINUE,
        PAY_NOW;

        static {
            Covode.recordClassIndex(53364);
        }
    }

    static {
        Covode.recordClassIndex(53363);
    }

    public c() {
        this(null, null, null, null, null, false, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f85260a, cVar.f85260a) && l.a(this.f85261b, cVar.f85261b) && l.a(this.f85262c, cVar.f85262c) && l.a(this.f85263d, cVar.f85263d) && l.a(this.f85264e, cVar.f85264e) && this.f85265f == cVar.f85265f && l.a(this.f85266g, cVar.f85266g) && l.a(this.f85267h, cVar.f85267h) && l.a(this.f85268i, cVar.f85268i) && l.a(this.f85269j, cVar.f85269j);
    }

    public final int hashCode() {
        Integer num = this.f85260a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f85261b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f85262c;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        r rVar = this.f85263d;
        int hashCode4 = (hashCode3 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        String str = this.f85264e;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f85265f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        n nVar = this.f85266g;
        int hashCode6 = (i6 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        HashMap<String, Object> hashMap = this.f85267h;
        int hashCode7 = (hashCode6 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<s> list = this.f85268i;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Address address = this.f85269j;
        if (address != null) {
            i2 = address.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "EnterParams(currentProgress=" + this.f85260a + ", totalProgress=" + this.f85261b + ", buttonType=" + this.f85262c + ", paymentData=" + this.f85263d + ", price=" + this.f85264e + ", isHalfScreen=" + this.f85265f + ", paymentInfo=" + this.f85266g + ", trackParams=" + this.f85267h + ", paymentPrice=" + this.f85268i + ", shippingAddress=" + this.f85269j + ")";
    }

    public static final class b {
        static {
            Covode.recordClassIndex(53365);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private c(Integer num, Integer num2, Integer num3, r rVar, String str, boolean z, n nVar, HashMap<String, Object> hashMap, List<s> list, Address address) {
        this.f85260a = num;
        this.f85261b = num2;
        this.f85262c = num3;
        this.f85263d = rVar;
        this.f85264e = str;
        this.f85265f = z;
        this.f85266g = nVar;
        this.f85267h = hashMap;
        this.f85268i = list;
        this.f85269j = address;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Integer num, Integer num2, Integer num3, r rVar, String str, boolean z, n nVar, HashMap hashMap, List list, Address address, int i2) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : num3, (i2 & 8) != 0 ? null : rVar, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : nVar, (i2 & 128) != 0 ? null : hashMap, (i2 & 256) != 0 ? null : list, (i2 & 512) == 0 ? address : null);
    }
}
