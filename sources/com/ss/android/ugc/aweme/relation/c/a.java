package com.ss.android.ugc.aweme.relation.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import h.f.b.l;

public final class a implements IFriendsService.b {

    /* renamed from: b  reason: collision with root package name */
    public static String f120364b;

    /* renamed from: c  reason: collision with root package name */
    public static a f120365c;

    /* renamed from: d  reason: collision with root package name */
    public static final C3111a f120366d = new C3111a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f120367a = Keva.getRepo("permission_dialog" + f120364b);

    /* renamed from: com.ss.android.ugc.aweme.relation.c.a$a  reason: collision with other inner class name */
    public static final class C3111a {
        static {
            Covode.recordClassIndex(78315);
        }

        private C3111a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!h.f.b.l.a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.relation.c.a a() {
            /*
                r3 = 11487(0x2cdf, float:1.6097E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                com.ss.android.ugc.aweme.relation.c.a r0 = com.ss.android.ugc.aweme.relation.c.a.f120365c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.ss.android.ugc.aweme.relation.c.a.f120364b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = h.f.b.l.a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.relation.c.a> r2 = com.ss.android.ugc.aweme.relation.c.a.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.a.f120364b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.a r0 = new com.ss.android.ugc.aweme.relation.c.a     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.a.f120365c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.relation.c.a r0 = com.ss.android.ugc.aweme.relation.c.a.f120365c
                if (r0 != 0) goto L_0x0048
                h.f.b.l.b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.c.a.C3111a.a():com.ss.android.ugc.aweme.relation.c.a");
        }

        public /* synthetic */ C3111a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.b
    public final void a() {
        this.f120367a.erase("after_login_permission_pop_up");
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.b
    public final boolean b() {
        return this.f120367a.getBoolean("after_login_permission_pop_up", false);
    }

    static {
        Covode.recordClassIndex(78314);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        f120364b = g2.getCurUserId();
    }
}
