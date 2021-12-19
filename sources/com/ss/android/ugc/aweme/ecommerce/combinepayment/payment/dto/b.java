package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;

public final class b {
    @c(a = "cvv_length")

    /* renamed from: a  reason: collision with root package name */
    public final int[] f85275a;
    @c(a = "card_brand_regex")

    /* renamed from: b  reason: collision with root package name */
    public final String f85276b;
    @c(a = "card_brand_length")

    /* renamed from: c  reason: collision with root package name */
    public final int[] f85277c;
    @c(a = "card_brand_display_name")

    /* renamed from: d  reason: collision with root package name */
    public final String f85278d;
    @c(a = "card_brand")

    /* renamed from: e  reason: collision with root package name */
    public final String f85279e;
    @c(a = "payment_method_id")

    /* renamed from: f  reason: collision with root package name */
    public final String f85280f;

    static {
        Covode.recordClassIndex(53373);
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f85275a;
        int i7 = 0;
        if (iArr != null) {
            i2 = Arrays.hashCode(iArr);
        } else {
            i2 = 0;
        }
        int i8 = i2 * 31;
        String str = this.f85276b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        int[] iArr2 = this.f85277c;
        if (iArr2 != null) {
            i4 = Arrays.hashCode(iArr2);
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str2 = this.f85278d;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str3 = this.f85279e;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        String str4 = this.f85280f;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BankCardRule");
        int[] iArr = this.f85275a;
        if (iArr != null) {
            int[] iArr2 = ((b) obj).f85275a;
            if (iArr2 == null || !Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (((b) obj).f85275a != null) {
            return false;
        }
        b bVar = (b) obj;
        if (!l.a((Object) this.f85276b, (Object) bVar.f85276b)) {
            return false;
        }
        int[] iArr3 = this.f85277c;
        if (iArr3 != null) {
            int[] iArr4 = bVar.f85277c;
            if (iArr4 == null || !Arrays.equals(iArr3, iArr4)) {
                return false;
            }
        } else if (bVar.f85277c != null) {
            return false;
        }
        if (!(!l.a((Object) this.f85278d, (Object) bVar.f85278d)) && !(!l.a((Object) this.f85279e, (Object) bVar.f85279e)) && !(!l.a((Object) this.f85280f, (Object) bVar.f85280f))) {
            return true;
        }
        return false;
    }
}
