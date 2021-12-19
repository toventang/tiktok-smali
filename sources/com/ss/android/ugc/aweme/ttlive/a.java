package com.ss.android.ugc.aweme.ttlive;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "edibility_birthdate_type")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f141455a;
    @c(a = "default_birthdate")

    /* renamed from: b  reason: collision with root package name */
    public final String f141456b;
    @c(a = "notification_msg")

    /* renamed from: c  reason: collision with root package name */
    public final String f141457c;
    @c(a = "appeal_url")

    /* renamed from: d  reason: collision with root package name */
    public final String f141458d;
    @c(a = "upper_bound_date")

    /* renamed from: e  reason: collision with root package name */
    public final String f141459e;
    @c(a = "desc_type")

    /* renamed from: f  reason: collision with root package name */
    public final Integer f141460f;

    static {
        Covode.recordClassIndex(92386);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f141455a, aVar.f141455a) && l.a(this.f141456b, aVar.f141456b) && l.a(this.f141457c, aVar.f141457c) && l.a(this.f141458d, aVar.f141458d) && l.a(this.f141459e, aVar.f141459e) && l.a(this.f141460f, aVar.f141460f);
    }

    public final int hashCode() {
        Integer num = this.f141455a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f141456b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141457c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141458d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f141459e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num2 = this.f141460f;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode5 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DoBStatus(type=" + this.f141455a + ", defaultDoB=" + this.f141456b + ", msg=" + this.f141457c + ", appealUrl=" + this.f141458d + ", upperBoundDate=" + this.f141459e + ", descType=" + this.f141460f + ")";
    }

    private /* synthetic */ a() {
        this(0, "", "", "", "", 0);
    }

    private a(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        this.f141455a = num;
        this.f141456b = str;
        this.f141457c = str2;
        this.f141458d = str3;
        this.f141459e = str4;
        this.f141460f = num2;
    }
}
