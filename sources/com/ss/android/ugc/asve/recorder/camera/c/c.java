package com.ss.android.ugc.asve.recorder.camera.c;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.f.a;
import com.ss.android.ugc.asve.recorder.camera.d;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f62263a;

    /* renamed from: b  reason: collision with root package name */
    private a f62264b;

    static {
        Covode.recordClassIndex(38254);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final float a(float f2) {
        return f2;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final int b() {
        return this.f62264b.a();
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final boolean c() {
        return this.f62264b.f62259d;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final boolean d() {
        return this.f62264b.f62260e;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final boolean f() {
        return this.f62264b.b();
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final boolean e() {
        if (!this.f62264b.f62259d || !a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final boolean a() {
        if (!this.f62264b.b()) {
            a(false);
            return false;
        }
        int a2 = a.C1354a.a(this.f62263a).a();
        if (a2 == 0) {
            com.ss.android.ugc.asve.a.a();
            a(false);
            return false;
        } else if (a2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(Context context) {
        if (a.C1354a.a(context).a() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final boolean c(boolean z) {
        return this.f62264b.b(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final void a(int i2) {
        if (this.f62264b.f62262g != null) {
            this.f62264b.f62262g.a(i2);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final boolean b(boolean z) {
        if (!this.f62264b.b(z) || !a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final void a(PrivacyCert privacyCert) {
        this.f62264b.a(com.ss.android.ugc.asve.a.b(), privacyCert);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.b
    public final void a(boolean z) {
        int i2;
        a a2 = a.C1354a.a(this.f62263a);
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        a2.a(i2);
    }

    public c(Context context, d dVar, a aVar) {
        this.f62263a = context;
        if (aVar != null) {
            this.f62264b = aVar;
        } else {
            this.f62264b = new a();
        }
        this.f62264b.f62256a = this;
        this.f62264b.f62257b = dVar;
        this.f62264b.f62258c = context;
        this.f62264b.a(a());
    }
}
