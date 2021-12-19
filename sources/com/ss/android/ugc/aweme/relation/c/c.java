package com.ss.android.ugc.aweme.relation.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import h.f.b.l;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static String f120369b;

    /* renamed from: c  reason: collision with root package name */
    public static c f120370c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f120371d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f120372a;

    public static final class a {
        static {
            Covode.recordClassIndex(78318);
        }

        private a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!h.f.b.l.a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.relation.c.c a() {
            /*
                r3 = 10517(0x2915, float:1.4737E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                com.ss.android.ugc.aweme.relation.c.c r0 = com.ss.android.ugc.aweme.relation.c.c.f120370c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.ss.android.ugc.aweme.relation.c.c.f120369b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = h.f.b.l.a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.relation.c.c> r2 = com.ss.android.ugc.aweme.relation.c.c.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.c.f120369b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.c r0 = new com.ss.android.ugc.aweme.relation.c.c     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.c.f120370c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.relation.c.c r0 = com.ss.android.ugc.aweme.relation.c.c.f120370c
                if (r0 != 0) goto L_0x0048
                h.f.b.l.b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.c.c.a.a():com.ss.android.ugc.aweme.relation.c.c");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(78317);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        f120369b = g2.getCurUserId();
    }

    public c() {
        Keva repo = Keva.getRepo("social_relation" + f120369b);
        l.b(repo, "");
        this.f120372a = repo;
    }

    public final void a(int i2, int i3) {
        d(i2, i3);
        a(i2, i3, System.currentTimeMillis());
    }

    public final boolean b(int i2, int i3) {
        return this.f120372a.getBoolean("go_through_social_recommend_flow" + i2 + i3, false);
    }

    public final long c(int i2, int i3) {
        return this.f120372a.getLong("go_through_time_ms" + i2 + i3, -1);
    }

    private final void d(int i2, int i3) {
        this.f120372a.storeBoolean("go_through_social_recommend_flow".concat(String.valueOf(i2)), true);
        this.f120372a.storeBoolean("go_through_social_recommend_flow" + i2 + i3, true);
    }

    private final void a(int i2, int i3, long j2) {
        this.f120372a.storeLong("go_through_time_ms".concat(String.valueOf(i2)), j2);
        this.f120372a.storeLong("go_through_time_ms" + i2 + i3, j2);
    }
}
