package com.ss.android.ugc.aweme.utils;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class hz {

    /* renamed from: a  reason: collision with root package name */
    public static final hz f143082a = new hz();

    private hz() {
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Runnable $r;

        static {
            Covode.recordClassIndex(93657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Runnable runnable) {
            super(0);
            this.$r = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$r.run();
            return z.f158842a;
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143083a;

        static {
            Covode.recordClassIndex(93658);
        }

        b(h.f.a.a aVar) {
            this.f143083a = aVar;
        }

        public final void run() {
            this.f143083a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(93656);
    }

    public static final boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        return l.a(mainLooper.getThread(), Thread.currentThread());
    }

    public static final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        a(new b(aVar));
    }

    public static final void a(Runnable runnable) {
        l.d(runnable, "");
        hx.a(0, new a(runnable));
    }
}
