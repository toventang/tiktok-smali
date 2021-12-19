package com.ss.android.ugc.aweme.player;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.experiment.c;
import com.ss.android.ugc.aweme.video.v;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static f.a.b.a f115097a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f115098b;

    /* renamed from: c  reason: collision with root package name */
    public static long f115099c = 30000;

    /* renamed from: d  reason: collision with root package name */
    public static f.a.g.b<Long> f115100d;

    /* renamed from: e  reason: collision with root package name */
    public static final f f115101e = new f();

    public static final class a extends f.a.g.b<Long> {
        static {
            Covode.recordClassIndex(73981);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        a() {
        }

        @Override // f.a.z
        public final void onComplete() {
            if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
                v.O().C();
            }
        }

        @Override // f.a.z
        public final /* synthetic */ void onNext(Object obj) {
            ((Number) obj).longValue();
        }
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(73980);
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f115102a = new b();

        static {
            Covode.recordClassIndex(73982);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean c2 = c.c();
            if (booleanValue && !c2) {
                if (f.f115100d != null) {
                    f.a.g.b<Long> bVar = f.f115100d;
                    if (bVar == null) {
                        l.b();
                    }
                    bVar.dispose();
                    f.f115100d = null;
                }
                f.f115100d = (f.a.g.b) t.b(f.f115099c, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).c(new a());
            } else if (f.f115100d != null) {
                f.a.g.b<Long> bVar2 = f.f115100d;
                if (bVar2 == null) {
                    l.b();
                }
                bVar2.dispose();
                f.f115100d = null;
            }
        }
    }
}
