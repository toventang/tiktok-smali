package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f43816a;

    /* renamed from: b  reason: collision with root package name */
    public String f43817b;

    /* renamed from: c  reason: collision with root package name */
    public String f43818c;

    /* renamed from: d  reason: collision with root package name */
    public long f43819d;

    static {
        Covode.recordClassIndex(26796);
    }

    public f() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f43816a, fVar.f43816a) && l.a(this.f43817b, fVar.f43817b) && l.a(this.f43818c, fVar.f43818c) && this.f43819d == fVar.f43819d;
    }

    public final int hashCode() {
        String str = this.f43816a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f43817b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43818c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        long j2 = this.f43819d;
        return ((hashCode2 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ImgReWriterStatus(status=" + this.f43816a + ", originResUrl=" + this.f43817b + ", offlineResUrl=" + this.f43818c + ", duration=" + this.f43819d + ")";
    }

    public final void a(String str) {
        l.c(str, "");
        this.f43816a = str;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f43818c = str;
    }

    private f(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f43816a = str;
        this.f43817b = str2;
        this.f43818c = str3;
        this.f43819d = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? "fail" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3);
    }
}
