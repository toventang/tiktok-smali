package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f14435a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14436b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14437c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14438d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14439e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14440f;

    /* renamed from: g  reason: collision with root package name */
    public final Throwable f14441g;

    static {
        Covode.recordClassIndex(8000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14435a == aVar.f14435a && l.a(this.f14436b, aVar.f14436b) && this.f14437c == aVar.f14437c && l.a(this.f14438d, aVar.f14438d) && l.a(this.f14439e, aVar.f14439e) && l.a(this.f14440f, aVar.f14440f) && l.a(this.f14441g, aVar.f14441g);
    }

    public final int hashCode() {
        int i2 = this.f14435a * 31;
        String str = this.f14436b;
        int i3 = 0;
        int hashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f14437c) * 31;
        String str2 = this.f14438d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14439e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14440f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Throwable th = this.f14441g;
        if (th != null) {
            i3 = th.hashCode();
        }
        return hashCode4 + i3;
    }

    public final String toString() {
        return "FetchReportModel(httpStatusCode=" + this.f14435a + ", httpStatusMsg=" + this.f14436b + ", businessErrorCode=" + this.f14437c + ", businessErrorMsg=" + this.f14438d + ", requestUrl=" + this.f14439e + ", requestLogId=" + this.f14440f + ", exception=" + this.f14441g + ")";
    }

    private /* synthetic */ a() {
        this(0, null, 0, null, null, null, null);
    }

    public a(int i2, String str, int i3, String str2, String str3, String str4, Throwable th) {
        this.f14435a = i2;
        this.f14436b = str;
        this.f14437c = i3;
        this.f14438d = str2;
        this.f14439e = str3;
        this.f14440f = str4;
        this.f14441g = th;
    }
}
