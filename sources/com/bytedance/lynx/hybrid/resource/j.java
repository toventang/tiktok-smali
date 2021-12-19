package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.d.e;
import h.f.b.l;
import java.io.InputStream;

public final class j extends e {

    /* renamed from: a  reason: collision with root package name */
    public String f41213a;

    /* renamed from: b  reason: collision with root package name */
    public String f41214b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41215c;

    /* renamed from: d  reason: collision with root package name */
    public String f41216d;

    /* renamed from: e  reason: collision with root package name */
    public String f41217e;

    /* renamed from: f  reason: collision with root package name */
    public String f41218f;

    /* renamed from: g  reason: collision with root package name */
    public String f41219g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f41220h;

    static {
        Covode.recordClassIndex(25246);
    }

    @Override // com.bytedance.lynx.hybrid.resource.d.e
    public final InputStream a() {
        InputStream a2 = super.a();
        if (a2 == null) {
            return null;
        }
        if (a2 instanceof k) {
            return a2;
        }
        return new k(this, a2);
    }

    public final void a(String str) {
        l.c(str, "");
        this.f41216d = str;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f41217e = str;
    }

    public final void c(String str) {
        l.c(str, "");
        this.f41218f = str;
    }

    public final void d(String str) {
        l.c(str, "");
        this.f41219g = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private j(Uri uri, boolean z, String str, long j2) {
        super(uri, null, null, null, false, 0, z, null, null, str, j2);
        l.c(uri, "");
        l.c(str, "");
        this.f41216d = "";
        this.f41217e = "";
        this.f41218f = "";
        this.f41219g = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Uri uri, boolean z, String str, long j2, int i2) {
        this(uri, (i2 & 64) != 0 ? true : z, (i2 & 512) != 0 ? "" : str, (i2 & 1024) != 0 ? 0 : j2);
    }
}
