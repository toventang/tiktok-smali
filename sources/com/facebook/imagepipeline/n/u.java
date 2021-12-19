package com.facebook.imagepipeline.n;

import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.ag;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class u extends c<t> {

    /* renamed from: a  reason: collision with root package name */
    int f48394a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f48395b;

    static {
        Covode.recordClassIndex(29179);
    }

    public u() {
        this(a());
    }

    private static ExecutorService a() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 3;
        return g.a(a2.a());
    }

    public u(int i2) {
        this(a());
        this.f48394a = i2;
    }

    private u(ExecutorService executorService) {
        this.f48395b = executorService;
    }

    @Override // com.facebook.imagepipeline.n.ag
    public final t createFetchState(k<e> kVar, al alVar) {
        return new t(kVar, alVar);
    }

    static String a(String str, Object... objArr) {
        return a.a(Locale.getDefault(), str, objArr);
    }

    @Override // com.facebook.imagepipeline.n.ag
    public final void fetch(final t tVar, final ag.a aVar) {
        final Future<?> submit = this.f48395b.submit(new Runnable() {
            /* class com.facebook.imagepipeline.n.u.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29180);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x0118, code lost:
                r1 = null;
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x008a A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x012d A[SYNTHETIC, Splitter:B:80:0x012d] */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0132 A[DONT_GENERATE] */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x00f7 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 322
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.u.AnonymousClass1.run():void");
            }
        });
        tVar.f48390e.a(new e() {
            /* class com.facebook.imagepipeline.n.u.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29181);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                if (submit.cancel(false)) {
                    aVar.a();
                }
            }
        });
    }
}
