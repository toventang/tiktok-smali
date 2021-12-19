package com.ss.android.ugc.aweme.friends.i.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.recommend.f;
import h.f.b.l;
import h.n;
import h.p;
import h.v;

public final class a implements IFriendsService.d {

    /* renamed from: a  reason: collision with root package name */
    public static String f96852a;

    /* renamed from: b  reason: collision with root package name */
    public static a f96853b;

    /* renamed from: c  reason: collision with root package name */
    public static final C2336a f96854c = new C2336a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final Keva f96855d;

    /* renamed from: com.ss.android.ugc.aweme.friends.i.a.a$a  reason: collision with other inner class name */
    public static final class C2336a {
        static {
            Covode.recordClassIndex(61472);
        }

        private C2336a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!h.f.b.l.a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.friends.i.a.a a() {
            /*
                r3 = 11509(0x2cf5, float:1.6128E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                com.ss.android.ugc.aweme.friends.i.a.a r0 = com.ss.android.ugc.aweme.friends.i.a.a.f96853b
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.ss.android.ugc.aweme.friends.i.a.a.f96852a
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = h.f.b.l.a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.friends.i.a.a> r2 = com.ss.android.ugc.aweme.friends.i.a.a.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.friends.i.a.a.f96852a = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.friends.i.a.a r0 = new com.ss.android.ugc.aweme.friends.i.a.a     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.friends.i.a.a.f96853b = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.friends.i.a.a r0 = com.ss.android.ugc.aweme.friends.i.a.a.f96853b
                if (r0 != 0) goto L_0x0048
                h.f.b.l.b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.i.a.a.C2336a.a():com.ss.android.ugc.aweme.friends.i.a.a");
        }

        public /* synthetic */ C2336a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(61471);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        f96852a = g2.getCurUserId();
    }

    public a() {
        Keva repo = Keva.getRepo("recommend_friends_in_dm" + f96852a);
        l.b(repo, "");
        this.f96855d = repo;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.d
    public final p<Boolean, Long> a(f fVar) {
        l.d(fVar, "");
        int i2 = b.f96856a[fVar.ordinal()];
        if (i2 == 1) {
            return v.a(Boolean.valueOf(this.f96855d.getBoolean("should_hide_facebook_source_type", false)), Long.valueOf(this.f96855d.getLong("hide_facebook_time#", -1)));
        } else if (i2 == 2) {
            return v.a(Boolean.valueOf(this.f96855d.getBoolean("should_hide_contact_source_type", false)), Long.valueOf(this.f96855d.getLong("hide_contact_time#", -1)));
        } else {
            throw new n();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService.d
    public final void a(f fVar, p<Boolean, Long> pVar) {
        l.d(fVar, "");
        l.d(pVar, "");
        int i2 = b.f96857b[fVar.ordinal()];
        if (i2 == 1) {
            this.f96855d.storeBoolean("should_hide_facebook_source_type", pVar.getFirst().booleanValue());
            this.f96855d.storeLong("hide_facebook_time#", pVar.getSecond().longValue());
        } else if (i2 == 2) {
            this.f96855d.storeBoolean("should_hide_contact_source_type", pVar.getFirst().booleanValue());
            this.f96855d.storeLong("hide_contact_time#", pVar.getSecond().longValue());
        }
    }
}
