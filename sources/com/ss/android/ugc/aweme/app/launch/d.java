package com.ss.android.ugc.aweme.app.launch;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static long f66839a;

    /* renamed from: b  reason: collision with root package name */
    static long f66840b;

    static {
        Covode.recordClassIndex(41160);
    }

    public static final void a() {
        f.c().d(a.f66841a);
        f.d().d(b.f66842a);
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66842a = new b();

        static {
            Covode.recordClassIndex(41162);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            d.f66839a = System.currentTimeMillis();
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66841a = new a();

        static {
            Covode.recordClassIndex(41161);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            d.f66840b = System.currentTimeMillis();
            f.c cVar = new f.c();
            cVar.b((w) new ResumeTask());
            cVar.a();
        }
    }
}
