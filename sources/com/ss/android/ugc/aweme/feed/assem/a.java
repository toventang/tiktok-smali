package com.ss.android.ugc.aweme.feed.assem;

import android.os.Handler;
import android.view.Display;
import androidx.core.h.v;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.assem.arch.extensions.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.experiment.ab;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f91966a;

    /* renamed from: b  reason: collision with root package name */
    public static int f91967b;

    /* renamed from: c  reason: collision with root package name */
    static long f91968c = -1;

    /* renamed from: d  reason: collision with root package name */
    static final Runnable f91969d = c.f91982a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f91970e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static int f91971f;

    /* renamed from: g  reason: collision with root package name */
    private static final h f91972g = i.a((h.f.a.a) b.f91981a);

    public static C2216a a() {
        return (C2216a) f91972g.getValue();
    }

    private a() {
    }

    static final class b extends m implements h.f.a.a<C2216a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f91981a = new b();

        static {
            Covode.recordClassIndex(57910);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ C2216a invoke() {
            return new C2216a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.a$a  reason: collision with other inner class name */
    public static final class C2216a implements l {

        /* renamed from: a  reason: collision with root package name */
        private Object f91973a;

        /* renamed from: b  reason: collision with root package name */
        private long f91974b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f91975c;

        /* renamed from: d  reason: collision with root package name */
        private final h f91976d = i.a((h.f.a.a) b.f91979a);

        /* renamed from: e  reason: collision with root package name */
        private final h f91977e = i.a((h.f.a.a) new C2217a(this));

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.a$a$c */
        final /* synthetic */ class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.a f91980a;

            static {
                Covode.recordClassIndex(57909);
            }

            c(h.f.a.a aVar) {
                this.f91980a = aVar;
            }

            public final /* synthetic */ void run() {
                h.f.b.l.b(this.f91980a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(57906);
        }

        public final long a() {
            return ((Number) this.f91976d.getValue()).longValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.a$a$a  reason: collision with other inner class name */
        static final class C2217a extends m implements h.f.a.a<Long> {
            final /* synthetic */ C2216a this$0;

            static {
                Covode.recordClassIndex(57907);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2217a(C2216a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Long invoke() {
                return Long.valueOf(this.this$0.a() * 2);
            }
        }

        public final void c() {
            this.f91973a = null;
            this.f91974b = 0;
            this.f91975c = false;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.a$a$b */
        static final class b extends m implements h.f.a.a<Long> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f91979a = new b();

            static {
                Covode.recordClassIndex(57908);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Long invoke() {
                if (a.f91968c < 0) {
                    a.f91968c = 16;
                }
                return Long.valueOf(a.f91968c * 25);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!this.f91975c) {
                this.f91975c = true;
                p.a().removeCallbacks(a.f91969d);
                p.a().postDelayed(a.f91969d, this.f91974b + a.f91968c);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
            if (r8 == 3) goto L_0x0018;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
            if (r0 != false) goto L_0x0018;
         */
        @Override // com.bytedance.assem.arch.extensions.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(int r8, java.lang.Object r9, h.f.a.a<h.z> r10) {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.a.C2216a.a(int, java.lang.Object, h.f.a.a):boolean");
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f91982a = new c();

        static {
            Covode.recordClassIndex(57911);
        }

        c() {
        }

        public final void run() {
            com.bytedance.monitor.collector.d.f41460d = false;
            a.f91966a = false;
            a.a().c();
            j.f25651f = null;
        }
    }

    static {
        Covode.recordClassIndex(57905);
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final d f91983a = new d();

        static {
            Covode.recordClassIndex(57912);
        }

        d() {
        }

        public final void run() {
            long j2;
            com.bytedance.monitor.collector.d.f41460d = true;
            com.bytedance.monitor.collector.d.f41462f = 0;
            if (ab.a()) {
                p.a().removeCallbacks(a.f91969d);
                if (com.ss.android.ugc.aweme.performance.i.a()) {
                    j2 = 1500;
                } else {
                    j2 = 1100;
                }
                p.a().postDelayed(a.f91969d, j2);
            }
        }
    }

    public static void b() {
        if (f91971f >= 2 && ab.a()) {
            Handler a2 = p.a();
            Runnable runnable = f91969d;
            a2.removeCallbacks(runnable);
            runnable.run();
            f91966a = true;
            j.f25651f = a();
            p.a().postAtFrontOfQueue(d.f91983a);
        }
    }

    public static final void a(VerticalViewPager verticalViewPager, int i2) {
        h.f.b.l.d(verticalViewPager, "");
        f91971f = i2;
        if (f91968c < 0) {
            h.f.b.l.d(verticalViewPager, "");
            float f2 = 60.0f;
            Display z = v.z(verticalViewPager);
            if (!verticalViewPager.isInEditMode() && z != null) {
                float refreshRate = z.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            f91968c = (long) ((int) (1000.0f / f2));
        }
        if (!f91966a || j.f25651f == null) {
            a().c();
            j.f25651f = null;
        } else {
            a().b();
        }
        f91966a = false;
        f91967b = 0;
    }
}
