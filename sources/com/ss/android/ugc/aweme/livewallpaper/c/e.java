package com.ss.android.ugc.aweme.livewallpaper.c;

import com.bytedance.covode.number.Covode;

public class e {

    /* renamed from: e  reason: collision with root package name */
    private static int f108806e = 12375;

    /* renamed from: f  reason: collision with root package name */
    private static int f108807f = 12374;

    /* renamed from: a  reason: collision with root package name */
    protected d f108808a;

    /* renamed from: b  reason: collision with root package name */
    private Object f108809b;

    /* renamed from: c  reason: collision with root package name */
    private int f108810c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f108811d = -1;

    static {
        Covode.recordClassIndex(69697);
    }

    public final int b() {
        int i2 = this.f108810c;
        if (i2 < 0) {
            return this.f108808a.a(this.f108809b, f108806e);
        }
        return i2;
    }

    public final int c() {
        int i2 = this.f108811d;
        if (i2 < 0) {
            return this.f108808a.a(this.f108809b, f108807f);
        }
        return i2;
    }

    public final void e() {
        d dVar = this.f108808a;
        dVar.f108805a.c(this.f108809b);
    }

    public final boolean f() {
        d dVar = this.f108808a;
        return dVar.f108805a.d(this.f108809b);
    }

    public final void a() {
        if (this.f108809b == null) {
            this.f108809b = this.f108808a.f108805a.a(1, 1);
            this.f108810c = 1;
            this.f108811d = 1;
            return;
        }
        throw new IllegalStateException("surface already created");
    }

    public final void d() {
        d dVar = this.f108808a;
        dVar.f108805a.a(this.f108809b);
        this.f108809b = null;
        this.f108810c = -1;
        this.f108811d = -1;
    }

    protected e(d dVar) {
        this.f108808a = dVar;
    }

    public final void a(long j2) {
        d dVar = this.f108808a;
        dVar.f108805a.a(this.f108809b, j2);
    }

    public final void a(Object obj) {
        if (this.f108809b == null) {
            this.f108809b = this.f108808a.f108805a.b(obj);
            return;
        }
        throw new IllegalStateException("surface already created");
    }
}
