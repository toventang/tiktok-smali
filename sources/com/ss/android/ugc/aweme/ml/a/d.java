package com.ss.android.ugc.aweme.ml.a;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f110302a = new d();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ExecutorService f110303a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f110304b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(70818);
            l.a a2 = l.a(o.SERIAL);
            a2.f79177f = 600;
            ExecutorService a3 = g.a(a2.a());
            h.f.b.l.b(a3, "");
            f110303a = a3;
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(70817);
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f110305a;

        static {
            Covode.recordClassIndex(70819);
        }

        b(Runnable runnable) {
            this.f110305a = runnable;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            this.f110305a.run();
            return null;
        }
    }

    public static void a(Runnable runnable) {
        h.f.b.l.d(runnable, "");
        a.f110303a.execute(runnable);
    }

    public static void a(Runnable runnable, long j2) {
        h.f.b.l.d(runnable, "");
        if (j2 <= 0) {
            a(runnable);
        } else {
            i.a(j2).a(new b(runnable), a.f110303a, null);
        }
    }
}
