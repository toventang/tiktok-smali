package com.ss.android.ugc.musicprovider.c;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.bb;
import h.z;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class d {

    /* renamed from: j  reason: collision with root package name */
    public static final d f148585j = b.f148597a;

    /* renamed from: k  reason: collision with root package name */
    public static final a f148586k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public aj f148587a;

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f148588b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.musicprovider.a.a f148589c;

    /* renamed from: d  reason: collision with root package name */
    public long f148590d;

    /* renamed from: e  reason: collision with root package name */
    public String f148591e = "";

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.musicprovider.interfaces.b f148592f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.musicprovider.interfaces.a f148593g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.musicprovider.interfaces.c f148594h;

    /* renamed from: i  reason: collision with root package name */
    bb f148595i = new C4016d(this);

    /* renamed from: l  reason: collision with root package name */
    private Handler f148596l = new Handler(Looper.getMainLooper());

    public static final class a {
        static {
            Covode.recordClassIndex(97931);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final d f148597a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final b f148598b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(97932);
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.d$d  reason: collision with other inner class name */
    public static final class C4016d implements bb {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f148600a;

        static {
            Covode.recordClassIndex(97934);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2, int i3) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar, int i2) {
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$a */
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4016d f148601a;

            static {
                Covode.recordClassIndex(97935);
            }

            a(C4016d dVar) {
                this.f148601a = dVar;
            }

            public final void run() {
                com.ss.android.ugc.musicprovider.interfaces.a aVar = this.f148601a.f148600a.f148593g;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$d  reason: collision with other inner class name */
        static final class RunnableC4017d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4016d f148605a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ aj f148606b;

            static {
                Covode.recordClassIndex(97938);
            }

            RunnableC4017d(C4016d dVar, aj ajVar) {
                this.f148605a = dVar;
                this.f148606b = ajVar;
            }

            public final void run() {
                com.ss.android.ugc.musicprovider.interfaces.c cVar;
                aj ajVar = this.f148606b;
                if (ajVar != null && (cVar = this.f148605a.f148600a.f148594h) != null) {
                    cVar.a(ajVar.x);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$c */
        static final class c<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4016d f148604a;

            static {
                Covode.recordClassIndex(97937);
            }

            c(C4016d dVar) {
                this.f148604a = dVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String str;
                d dVar = this.f148604a.f148600a;
                long elapsedRealtime = SystemClock.elapsedRealtime() - dVar.f148590d;
                com.ss.android.ugc.musicprovider.a.a aVar = dVar.f148589c;
                if (aVar != null) {
                    String obj = aVar.f148532b.toString();
                    aj ajVar = dVar.f148587a;
                    String str2 = null;
                    if (ajVar != null) {
                        str = ajVar.r();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.music.ui.b.c.a(elapsedRealtime, obj, str, dVar.f148591e);
                    String str3 = aVar.f148536f;
                    String obj2 = aVar.f148532b.toString();
                    aj ajVar2 = dVar.f148587a;
                    if (ajVar2 != null) {
                        str2 = ajVar2.r();
                    }
                    com.ss.android.ugc.aweme.music.ui.b.b.a(str3, obj2, str2, Long.valueOf(elapsedRealtime));
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$b */
        static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4016d f148602a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.ttvideoengine.s.c f148603b;

            static {
                Covode.recordClassIndex(97936);
            }

            b(C4016d dVar, com.ss.ttvideoengine.s.c cVar) {
                this.f148602a = dVar;
                this.f148603b = cVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String str;
                d dVar = this.f148602a.f148600a;
                com.ss.ttvideoengine.s.c cVar = this.f148603b;
                long elapsedRealtime = SystemClock.elapsedRealtime() - dVar.f148590d;
                com.ss.android.ugc.musicprovider.a.a aVar = dVar.f148589c;
                if (!(aVar == null || cVar == null)) {
                    int i2 = cVar.f153260a;
                    String obj = aVar.f148532b.toString();
                    aj ajVar = dVar.f148587a;
                    String str2 = null;
                    if (ajVar != null) {
                        str = ajVar.r();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.music.ui.b.c.a(i2, elapsedRealtime, obj, str, cVar.f153263d, dVar.f148591e);
                    String str3 = aVar.f148536f;
                    String obj2 = aVar.f148532b.toString();
                    aj ajVar2 = dVar.f148587a;
                    if (ajVar2 != null) {
                        str2 = ajVar2.r();
                    }
                    com.ss.android.ugc.aweme.music.ui.b.b.a(str3, obj2, str2, cVar.f153263d);
                }
                dVar.a(new c(dVar));
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4016d(d dVar) {
            this.f148600a = dVar;
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar) {
            this.f148600a.a(new a(this));
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar) {
            i.b(new c(this), this.f148600a.f148588b);
            this.f148600a.a(new RunnableC4017d(this, ajVar));
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            i.b(new b(this, cVar), this.f148600a.f148588b);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f148599a;

        static {
            Covode.recordClassIndex(97933);
        }

        c(d dVar) {
            this.f148599a = dVar;
        }

        public final void run() {
            com.ss.android.ugc.musicprovider.interfaces.b bVar = this.f148599a.f148592f;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    static {
        Covode.recordClassIndex(97930);
    }

    public d() {
        ExecutorService a2 = g.a(l.a(o.SERIAL).a());
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.util.concurrent.ExecutorService");
        this.f148588b = a2;
    }

    public final void a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        h.f.b.l.b(mainLooper, "");
        if (currentThread == mainLooper.getThread()) {
            runnable.run();
        } else {
            this.f148596l.post(runnable);
        }
    }
}
