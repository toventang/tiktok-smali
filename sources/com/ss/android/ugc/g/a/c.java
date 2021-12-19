package com.ss.android.ugc.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.NetechoConfig;
import com.ss.android.ugc.g.a.a.d;
import com.ss.android.ugc.g.a.c.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static ConcurrentHashMap<Long, b> f145621a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final c f145622b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static volatile AtomicLong f145623c = new AtomicLong(10);

    private c() {
    }

    static {
        Covode.recordClassIndex(95635);
        NetechoConfig.INSTANCE.setLoadLibrary(AnonymousClass1.f145624a);
    }

    public static void a(long j2) {
        b bVar = f145621a.get(Long.valueOf(j2));
        if (bVar != null) {
            bVar.a();
            f145621a.remove(Long.valueOf(j2));
        }
        d.a(j2);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<Long, z> {
        final /* synthetic */ h.f.a.m $callback;
        final /* synthetic */ h.f.a.b $callback2;
        final /* synthetic */ long $id;
        final /* synthetic */ d $localParam;
        final /* synthetic */ com.ss.android.ugc.g.a.a.b $param;

        static {
            Covode.recordClassIndex(95637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j2, com.ss.android.ugc.g.a.a.b bVar, d dVar, h.f.a.m mVar, h.f.a.b bVar2) {
            super(1);
            this.$id = j2;
            this.$param = bVar;
            this.$localParam = dVar;
            this.$callback = mVar;
            this.$callback2 = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
            if (r1 <= r9.f145585f) goto L_0x0071;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0044 A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5 A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc A[Catch:{ all -> 0x00df }] */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(java.lang.Long r17) {
            /*
            // Method dump skipped, instructions count: 226
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.g.a.c.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static long a(com.ss.android.ugc.g.a.a.b bVar, d dVar, h.f.a.m<? super b, ? super HashMap<String, HashMap<String, Object>>, z> mVar, h.f.a.b<? super HashMap<String, Object>, z> bVar2) {
        l.c(bVar, "");
        l.c(dVar, "");
        l.c(mVar, "");
        l.c(bVar2, "");
        long incrementAndGet = f145623c.incrementAndGet();
        f145621a.put(Long.valueOf(incrementAndGet), a(incrementAndGet, bVar, dVar, mVar, bVar2));
        return incrementAndGet;
    }

    private static b a(long j2, com.ss.android.ugc.g.a.a.b bVar, d dVar, h.f.a.m<? super b, ? super HashMap<String, HashMap<String, Object>>, z> mVar, h.f.a.b<? super HashMap<String, Object>, z> bVar2) {
        b bVar3 = new b();
        bVar3.a((long) bVar.f145580a, new a(j2, bVar, dVar, mVar, bVar2));
        return bVar3;
    }
}
