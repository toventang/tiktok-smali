package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class r {
    @c(a = "payment_methods")

    /* renamed from: a  reason: collision with root package name */
    public final List<o> f85349a;
    @c(a = "recommend_payment_method")

    /* renamed from: b  reason: collision with root package name */
    public final o f85350b = null;
    @c(a = "stored_methods")

    /* renamed from: c  reason: collision with root package name */
    public final List<o> f85351c;
    @c(a = "bank_card_rules")

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f85352d;
    @c(a = "payment_policy")

    /* renamed from: e  reason: collision with root package name */
    public final q f85353e;
    @c(a = "stored_method_show_count")

    /* renamed from: f  reason: collision with root package name */
    public final Integer f85354f;
    @c(a = "encode_key")

    /* renamed from: g  reason: collision with root package name */
    public final String f85355g;
    @c(a = "pipo_host")

    /* renamed from: h  reason: collision with root package name */
    public final String f85356h;
    @c(a = "methods_text")

    /* renamed from: i  reason: collision with root package name */
    public final String f85357i;
    @c(a = "methods_photos")

    /* renamed from: j  reason: collision with root package name */
    public final t f85358j;

    /* renamed from: k  reason: collision with root package name */
    private o f85359k;

    static {
        Covode.recordClassIndex(53390);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f85349a, rVar.f85349a) && l.a(this.f85350b, rVar.f85350b) && l.a(this.f85351c, rVar.f85351c) && l.a(this.f85352d, rVar.f85352d) && l.a(this.f85353e, rVar.f85353e) && l.a(this.f85354f, rVar.f85354f) && l.a(this.f85355g, rVar.f85355g) && l.a(this.f85356h, rVar.f85356h) && l.a(this.f85357i, rVar.f85357i) && l.a(this.f85358j, rVar.f85358j);
    }

    public final int hashCode() {
        List<o> list = this.f85349a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        o oVar = this.f85350b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        List<o> list2 = this.f85351c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<b> list3 = this.f85352d;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        q qVar = this.f85353e;
        int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        Integer num = this.f85354f;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f85355g;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85356h;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85357i;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        t tVar = this.f85358j;
        if (tVar != null) {
            i2 = tVar.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "PaymentMethodsData(paymentMethods=" + this.f85349a + ", recommendPaymentMethod=" + this.f85350b + ", storedMethods=" + this.f85351c + ", bankCardRules=" + this.f85352d + ", paymentPolicy=" + this.f85353e + ", storedMethodShowCount=" + this.f85354f + ", encodeKey=" + this.f85355g + ", pipoHost=" + this.f85356h + ", paymentMethodsText=" + this.f85357i + ", methodsPhotos=" + this.f85358j + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r1 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o a() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f85359k
            if (r0 != 0) goto L_0x0051
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f85350b
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.d()
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L_0x0056
            java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> r0 = r4.f85351c
            if (r0 == 0) goto L_0x0030
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o) r0
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0019
        L_0x002c:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r1 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o) r1
            if (r1 != 0) goto L_0x004f
        L_0x0030:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> r0 = r4.f85349a
            if (r0 == 0) goto L_0x004e
            java.util.Iterator r2 = r0.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o) r0
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0038
            r3 = r1
        L_0x004c:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r3 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o) r3
        L_0x004e:
            r1 = r3
        L_0x004f:
            r4.f85359k = r1
        L_0x0051:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f85359k
            return r0
        L_0x0054:
            r1 = r3
            goto L_0x002c
        L_0x0056:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r4.f85350b
            r4.f85359k = r0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r.a():com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o");
    }

    public r(List<o> list, List<o> list2, List<b> list3, q qVar, Integer num, String str, String str2, String str3, t tVar) {
        this.f85349a = list;
        this.f85351c = list2;
        this.f85352d = list3;
        this.f85353e = qVar;
        this.f85354f = num;
        this.f85355g = str;
        this.f85356h = str2;
        this.f85357i = str3;
        this.f85358j = tVar;
    }
}
