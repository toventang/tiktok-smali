package com.bytedance.ies.im.core.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.h;
import com.bytedance.im.core.i.d;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;

public final class f extends h implements com.bytedance.ies.im.core.api.g.b, com.bytedance.im.core.i.b {

    /* renamed from: b  reason: collision with root package name */
    public static final f f33937b;

    /* renamed from: c  reason: collision with root package name */
    private static final h.h f33938c = i.a((h.f.a.a) a.f33941a);

    /* renamed from: d  reason: collision with root package name */
    private static long f33939d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static final am f33940e = an.a(bf.f159040a);

    private static CopyOnWriteArraySet<com.bytedance.im.core.i.b> b() {
        return (CopyOnWriteArraySet) f33938c.getValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<CopyOnWriteArraySet<com.bytedance.im.core.i.b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33941a = new a();

        static {
            Covode.recordClassIndex(20174);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<com.bytedance.im.core.i.b> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    static {
        Covode.recordClassIndex(20173);
        f fVar = new f();
        f33937b = fVar;
        com.bytedance.im.core.i.f a2 = com.bytedance.im.core.i.f.a();
        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager registerStrangerBoxObserver", (Throwable) null);
        a2.f38153c = fVar;
        com.bytedance.ies.im.core.api.a.c().a(fVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.h
    public final void a() {
        boolean a2 = com.bytedance.ies.im.core.api.a.c().a();
        com.bytedance.ies.im.core.api.a.b().b("StrangerBoxModel", "refreshStrangerBox: ".concat(String.valueOf(a2)));
        if (a2) {
            a(0);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.h
    public final void a(com.bytedance.im.core.i.b bVar) {
        l.d(bVar, "");
        b().add(bVar);
    }

    @Override // com.bytedance.im.core.i.b
    public final void a(d dVar) {
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            it.next().a(dVar);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.h
    public final void b(com.bytedance.im.core.i.b bVar) {
        l.d(bVar, "");
        b().remove(bVar);
    }

    static final class b extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ long $delayTime;
        int label;

        static {
            Covode.recordClassIndex(20175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(long j2, h.c.d dVar) {
            super(2, dVar);
            this.$delayTime = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$delayTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = h.c.a.a.COROUTINE_SUSPENDED
                int r0 = r5.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0034
                h.r.a(r6)
            L_0x000f:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0012:
                h.r.a(r6)
                long r0 = r5.$delayTime
                r5.label = r2
                java.lang.Object r0 = kotlinx.coroutines.ay.a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                h.r.a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.o.f159148a
                com.bytedance.ies.im.core.a.f$b$1 r1 = new com.bytedance.ies.im.core.a.f$b$1
                r0 = 0
                r1.<init>(r0)
                r5.label = r3
                java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.im.core.a.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static void a(int i2) {
        long uptimeMillis = SystemClock.uptimeMillis() - f33939d;
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("refreshStrangerBoxInternal: ").append(i2).append(", ").append(uptimeMillis).append(", ");
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.b(a2, "");
        b2.b("StrangerBoxModel", append.append(a2.f37564d).toString());
        if (uptimeMillis >= 10000) {
            com.bytedance.im.core.a.d a3 = com.bytedance.im.core.a.d.a();
            l.b(a3, "");
            if (a3.f37564d) {
                com.bytedance.ies.im.core.api.a.b().b("StrangerBoxModel", "refreshStrangerBoxInternal real");
                f33939d = SystemClock.uptimeMillis();
                com.bytedance.im.core.i.f.a().b();
            }
        }
    }

    @Override // com.bytedance.ies.im.core.api.g.b
    public final void a(com.bytedance.ies.im.core.api.g.d dVar) {
        l.d(dVar, "");
        boolean a2 = com.bytedance.ies.im.core.api.a.c().a();
        com.bytedance.ies.im.core.api.a.b().b("StrangerBoxModel", "onNetworkStateChanged: ".concat(String.valueOf(a2)));
        if (a2) {
            com.bytedance.ies.im.core.api.a.f();
            a(1);
        }
    }
}
