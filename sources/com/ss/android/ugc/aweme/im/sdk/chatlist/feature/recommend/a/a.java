package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import h.f.b.l;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static String f101956b;

    /* renamed from: c  reason: collision with root package name */
    public static a f101957c;

    /* renamed from: d  reason: collision with root package name */
    public static final C2542a f101958d = new C2542a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f101959a;

    /* renamed from: e  reason: collision with root package name */
    private long f101960e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f101961f;

    /* renamed from: g  reason: collision with root package name */
    private long f101962g = -1;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a$a  reason: collision with other inner class name */
    public static final class C2542a {
        static {
            Covode.recordClassIndex(65242);
        }

        private C2542a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!h.f.b.l.a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a a() {
            /*
                r3 = 6247(0x1867, float:8.754E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a r0 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.f101957c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.f101956b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = h.f.b.l.a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a> r2 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.f101956b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a r0 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.f101957c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a r0 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.f101957c
                if (r0 != 0) goto L_0x0048
                h.f.b.l.b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.C2542a.a():com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a");
        }

        public /* synthetic */ C2542a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(65241);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        f101956b = g2.getCurUserId();
    }

    public a() {
        Keva repo = Keva.getRepo("recommend_friends_in_dm" + f101956b);
        l.b(repo, "");
        this.f101959a = repo;
    }

    public final void a(int i2) {
        this.f101961f = i2;
        this.f101959a.storeInt("session_count", i2);
    }

    public final void b(long j2) {
        this.f101962g = j2;
        this.f101959a.storeLong("next_session_time_ms", j2);
    }

    public final void a(long j2) {
        this.f101960e = j2;
        this.f101959a.storeLong("last_session_time_ms", j2);
    }
}
