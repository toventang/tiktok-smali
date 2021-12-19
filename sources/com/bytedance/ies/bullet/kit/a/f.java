package com.bytedance.ies.bullet.kit.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.ap;
import h.f.b.l;
import java.io.InputStream;

public final class f extends ap {

    /* renamed from: a  reason: collision with root package name */
    public String f32240a;

    /* renamed from: b  reason: collision with root package name */
    public String f32241b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32242c;

    /* renamed from: d  reason: collision with root package name */
    public String f32243d;

    /* renamed from: e  reason: collision with root package name */
    public String f32244e;

    /* renamed from: f  reason: collision with root package name */
    public String f32245f;

    /* renamed from: g  reason: collision with root package name */
    public String f32246g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f32247h;

    static {
        Covode.recordClassIndex(18906);
    }

    @Override // com.bytedance.ies.bullet.service.base.ap
    public final InputStream a() {
        InputStream a2 = super.a();
        if (a2 == null) {
            return null;
        }
        if (a2 instanceof i) {
            return a2;
        }
        return new i(this, a2);
    }

    public final void a(String str) {
        l.c(str, "");
        this.f32243d = str;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f32244e = str;
    }

    public final void c(String str) {
        l.c(str, "");
        this.f32245f = str;
    }

    public final void d(String str) {
        l.c(str, "");
        this.f32246g = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Uri uri, boolean z, String str, long j2) {
        super(uri, null, null, null, false, 0, z, null, null, str, j2);
        l.c(uri, "");
        l.c(str, "");
        this.f32243d = "";
        this.f32244e = "";
        this.f32245f = "";
        this.f32246g = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Uri uri, boolean z, String str, long j2, int i2) {
        this(uri, (i2 & 64) != 0 ? true : z, (i2 & 512) != 0 ? "" : str, (i2 & 1024) != 0 ? 0 : j2);
    }
}
