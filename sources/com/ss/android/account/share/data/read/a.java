package com.ss.android.account.share.data.read;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f58214a;

    /* renamed from: b  reason: collision with root package name */
    public String f58215b;

    /* renamed from: c  reason: collision with root package name */
    public final String f58216c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f58217d;

    /* renamed from: e  reason: collision with root package name */
    public final String f58218e;

    /* renamed from: f  reason: collision with root package name */
    public int f58219f;

    static {
        Covode.recordClassIndex(36180);
    }

    public final String toString() {
        return "ReadResult(isSuccess=" + this.f58217d + ", errorMsg='" + this.f58218e + "', readType=" + this.f58219f + ", fromPkg='" + this.f58216c + "', key='" + this.f58214a + "', value='" + this.f58215b + "')";
    }

    public a(String str, boolean z, String str2, int i2) {
        l.c(str, "");
        l.c(str2, "");
        this.f58216c = str;
        this.f58217d = z;
        this.f58218e = str2;
        this.f58219f = i2;
        this.f58214a = "";
        this.f58215b = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, boolean z, String str2, int i2, byte b2) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str2, 0);
    }
}
