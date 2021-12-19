package com.ss.android.ugc.asve;

import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.recorder.c;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.am;
import com.ss.android.vesdk.ba;
import com.ss.android.vesdk.runtime.d;
import com.ss.android.vesdk.u;
import com.ss.android.vesdk.x;
import h.f.b.l;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f61973a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f61974b;

    private e() {
    }

    static {
        Covode.recordClassIndex(38108);
    }

    public final synchronized void a() {
        MethodCollector.i(12278);
        if (f61974b) {
            MethodCollector.o(12278);
            return;
        }
        f61974b = true;
        com.ss.android.ugc.asve.context.e a2 = a.a();
        d a3 = a.a().a();
        a3.d("AVEnv initVESDK start");
        Map<String, Object> q = a.a().q();
        u a4 = u.a();
        for (Map.Entry<String, Object> entry : q.entrySet()) {
            a4.b(entry.getKey(), entry.getValue());
        }
        d b2 = d.b();
        a.a();
        b2.f151441a = false;
        ResourceFinder d2 = a2.d();
        if (d2 != null) {
            ba.a(d2);
        }
        l.d(a2, "");
        VEListener.d c2 = a2.c();
        if (c2 != null) {
            ba.a(c2);
        }
        ba.a();
        ba.a(a.b(), a2.e().getAbsolutePath());
        ba.c(a2.p());
        ba.c();
        int f2 = a2.f();
        if (f2 > 0) {
            x.c(f2);
        }
        if (true ^ l.a((Object) a2.o(), (Object) "")) {
            ba.a(a2.o());
        }
        ba.a(false);
        ba.a(a2.g(), a2.h());
        ba.b(a2.g());
        ba.b();
        ba.b(a2.i(), a2.j());
        ba.a(a2.i(), a2.k(), a2.l());
        ba.b(a2.i(), a2.j());
        ba.a(a2.i(), a2.k(), a2.l());
        ba.d();
        ba.a((am) new a(a3), false);
        ba.a(new b(a2));
        a3.d("AVEnv initVESDK end");
        ba.a(a2.m());
        ba.a(a2.b());
        MethodCollector.o(12278);
    }

    static final class b implements VEListener.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.context.e f61979a;

        static {
            Covode.recordClassIndex(38110);
        }

        b(com.ss.android.ugc.asve.context.e eVar) {
            this.f61979a = eVar;
        }

        @Override // com.ss.android.vesdk.VEListener.u
        public final void a(Throwable th) {
            c b2 = this.f61979a.b();
            if (b2 != null) {
                l.b(th, "");
                b2.a(th, "vesdk");
            }
        }
    }

    static final class a implements am {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f61977a;

        static {
            Covode.recordClassIndex(38109);
        }

        a(d dVar) {
            this.f61977a = dVar;
        }

        @Override // com.ss.android.vesdk.am
        public final /* synthetic */ void a(int i2, String str) {
            if (i2 == 0) {
                d dVar = this.f61977a;
                l.b(str, "");
                dVar.c(str);
            } else if (i2 == 1) {
                d dVar2 = this.f61977a;
                l.b(str, "");
                dVar2.c(str);
            } else if (i2 == 2) {
                d dVar3 = this.f61977a;
                l.b(str, "");
                dVar3.d(str);
            } else if (i2 == 3) {
                d dVar4 = this.f61977a;
                l.b(str, "");
                dVar4.a(str);
            } else if (i2 == 4) {
                d dVar5 = this.f61977a;
                l.b(str, "");
                dVar5.b(str);
            }
        }
    }
}
