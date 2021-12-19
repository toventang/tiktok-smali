package com.bytedance.helios.sdk.c;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.m;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f30839a = new f();

    private f() {
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f30840a;

        static {
            Covode.recordClassIndex(17915);
        }

        public a(n nVar) {
            this.f30840a = nVar;
        }

        public final void run() {
            o.a(this.f30840a, false);
        }
    }

    static {
        Covode.recordClassIndex(17914);
    }

    public static final void a(n nVar) {
        com.bytedance.helios.api.b.a aVar;
        l.c(nVar, "");
        if (nVar.f30679h && nVar.t == 0) {
            o.a(nVar, false);
        } else if (nVar.t == 1 && ((!l.a((Object) nVar.f30680i, (Object) com.bytedance.helios.sdk.d.n.f30907d[0])) || (aVar = nVar.A) == null || aVar.f30642a != 0)) {
            o.a(nVar, false);
        } else if (HeliosEnvImpl.INSTANCE.isTestEnv()) {
            o.a(nVar, true);
        }
    }

    public static final void a(String str, long j2) {
        l.c(str, "");
        a(str, j2, false);
    }

    public static final void a(String str, long j2, boolean z) {
        l.c(str, "");
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis <= 1) {
            return;
        }
        if (b.a("sky_eye_apm_log") || z) {
            o.a(new m(str, currentTimeMillis));
        }
    }
}
