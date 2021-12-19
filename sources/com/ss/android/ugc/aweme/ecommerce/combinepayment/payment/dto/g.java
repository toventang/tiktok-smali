package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class g {
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public final String f85305a;
    @c(a = "val")

    /* renamed from: b  reason: collision with root package name */
    public final String f85306b;
    @c(a = StringSet.name)

    /* renamed from: c  reason: collision with root package name */
    public final String f85307c;
    @c(a = "notification_url")

    /* renamed from: d  reason: collision with root package name */
    public final String f85308d;
    @c(a = "icon_url")

    /* renamed from: e  reason: collision with root package name */
    public final String f85309e;

    static {
        Covode.recordClassIndex(53379);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f85305a, gVar.f85305a) && l.a(this.f85306b, gVar.f85306b) && l.a(this.f85307c, gVar.f85307c) && l.a(this.f85308d, gVar.f85308d) && l.a(this.f85309e, gVar.f85309e);
    }

    public final int hashCode() {
        String str = this.f85305a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85306b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85307c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f85308d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f85309e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "Option(key=" + this.f85305a + ", value=" + this.f85306b + ", name=" + this.f85307c + ", notificationUrl=" + this.f85308d + ", iconUrl=" + this.f85309e + ")";
    }
}
