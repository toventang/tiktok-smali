package com.ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import h.f.b.l;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static String f120107b;

    /* renamed from: c  reason: collision with root package name */
    public static r f120108c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f120109d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f120110a;

    public static final class a {
        static {
            Covode.recordClassIndex(78066);
        }

        private a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!h.f.b.l.a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.recommend.r a() {
            /*
                r3 = 11029(0x2b15, float:1.5455E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                com.ss.android.ugc.aweme.recommend.r r0 = com.ss.android.ugc.aweme.recommend.r.f120108c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.ss.android.ugc.aweme.recommend.r.f120107b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = h.f.b.l.a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.recommend.r> r2 = com.ss.android.ugc.aweme.recommend.r.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.b.g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.recommend.r.f120107b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.recommend.r r0 = new com.ss.android.ugc.aweme.recommend.r     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.recommend.r.f120108c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.recommend.r r0 = com.ss.android.ugc.aweme.recommend.r.f120108c
                if (r0 != 0) goto L_0x0048
                h.f.b.l.b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.r.a.a():com.ss.android.ugc.aweme.recommend.r");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(78065);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        f120107b = g2.getCurUserId();
    }

    public r() {
        Keva repo = Keva.getRepo("i18n_recommmend_user_" + f120107b);
        l.b(repo, "");
        this.f120110a = repo;
    }

    public final boolean a() {
        if (this.f120110a.getInt("dialog_close_without_action_in_times", 0) < 2) {
            return false;
        }
        long j2 = this.f120110a.getLong("dialog_close_without_action_in_times_maximum_timestamp", 0);
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        if (instance.getTimeInMillis() < j2) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        long millis = TimeUnit.DAYS.toMillis((long) q.a());
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        if (instance.getTimeInMillis() < this.f120110a.getLong("dialog_last_shown_timestamp", 0) + millis) {
            return true;
        }
        return false;
    }
}
