package com.ss.android.ugc.aweme.specact.pendant.f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Aweme f134251a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<com.ss.android.ugc.aweme.specact.pendant.g.b> f134252b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    static final Handler f134253c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    static final Runnable f134254d = RunnableC3489c.f134261a;

    /* renamed from: e  reason: collision with root package name */
    public static final c f134255e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f134256f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f134257g;

    /* renamed from: h  reason: collision with root package name */
    private static final h.f.a.a<z> f134258h = a.f134259a;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f134260a;

        static {
            Covode.recordClassIndex(87809);
        }

        b(h.f.a.a aVar) {
            this.f134260a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f134260a.invoke(), "");
        }
    }

    private c() {
    }

    public static void c() {
        if (f134256f) {
            f134256f = false;
            f134253c.removeCallbacks(f134254d);
        }
    }

    static final class a extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f134259a = new a();

        static {
            Covode.recordClassIndex(87808);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Iterator<T> it = c.f134252b.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            c.a();
            return z.f158842a;
        }
    }

    public static void b() {
        if (!f134256f) {
            f134256f = true;
            f134253c.postDelayed(f134254d, 1000);
        }
        if (!f134257g) {
            f134257g = true;
            a();
        }
    }

    static {
        Covode.recordClassIndex(87807);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.specact.pendant.f.c$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            int r2 = com.ss.android.ugc.aweme.specact.pendant.h.k.a()
            long r4 = com.ss.android.ugc.aweme.specact.pendant.h.k.b()
            r0 = 86400(0x15180, double:4.26873E-319)
            long r4 = r4 + r0
            long r0 = (long) r2
            long r4 = r4 - r0
            android.os.Handler r3 = com.ss.android.ugc.aweme.specact.pendant.f.c.f134253c
            h.f.a.a<h.z> r2 = com.ss.android.ugc.aweme.specact.pendant.f.c.f134258h
            if (r2 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.specact.pendant.f.c$b r0 = new com.ss.android.ugc.aweme.specact.pendant.f.c$b
            r0.<init>(r2)
            r2 = r0
        L_0x001a:
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            r3.postDelayed(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.pendant.f.c.a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.c$c  reason: collision with other inner class name */
    static final class RunnableC3489c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final RunnableC3489c f134261a = new RunnableC3489c();

        static {
            Covode.recordClassIndex(87810);
        }

        RunnableC3489c() {
        }

        public final void run() {
            Aweme a2;
            String str;
            i O = v.O();
            l.b(O, "");
            if (O.o() && (a2 = com.ss.android.ugc.aweme.specact.pendant.h.c.a()) != null) {
                String aid = a2.getAid();
                Aweme aweme = c.f134251a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(aid, str)) {
                    for (T t : c.f134252b) {
                        if (a2 == null) {
                            l.b();
                        }
                        t.a(a2);
                    }
                }
            }
            c.f134253c.postDelayed(c.f134254d, 1000);
        }
    }

    public static void a(com.ss.android.ugc.aweme.specact.pendant.g.b bVar) {
        l.d(bVar, "");
        List<com.ss.android.ugc.aweme.specact.pendant.g.b> list = f134252b;
        if (!list.contains(bVar)) {
            list.add(bVar);
            if (!list.isEmpty()) {
                b();
            }
        }
    }

    public static void b(com.ss.android.ugc.aweme.specact.pendant.g.b bVar) {
        l.d(bVar, "");
        List<com.ss.android.ugc.aweme.specact.pendant.g.b> list = f134252b;
        list.remove(bVar);
        if (list.isEmpty()) {
            c();
        }
    }
}
