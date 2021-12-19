package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.f.q;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.bb;
import com.ss.ttvideoengine.bf;
import h.z;

public final class a implements g, i, q.a, bb, bf {

    /* renamed from: i  reason: collision with root package name */
    public static final C1288a f58820i = new C1288a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Context f58821a;

    /* renamed from: b  reason: collision with root package name */
    public h f58822b;

    /* renamed from: c  reason: collision with root package name */
    public aj f58823c;

    /* renamed from: d  reason: collision with root package name */
    public b f58824d;

    /* renamed from: e  reason: collision with root package name */
    boolean f58825e;

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f58826f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ad.splash.f.q f58827g;

    /* renamed from: h  reason: collision with root package name */
    public HandlerThread f58828h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f58829j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f58830k;

    /* renamed from: l  reason: collision with root package name */
    private long f58831l;

    /* renamed from: m  reason: collision with root package name */
    private Handler f58832m;

    static {
        Covode.recordClassIndex(36418);
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(aj ajVar) {
        h.f.b.l.c(ajVar, "");
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(aj ajVar, int i2, int i3) {
        h.f.b.l.c(ajVar, "");
    }

    @Override // com.ss.ttvideoengine.bf
    public final boolean a(com.ss.ttvideoengine.j.p pVar) {
        h.f.b.l.c(pVar, "");
        return false;
    }

    @Override // com.ss.ttvideoengine.bb
    public final void b(aj ajVar) {
        h.f.b.l.c(ajVar, "");
    }

    @Override // com.ss.ttvideoengine.bb
    public final void b(aj ajVar, int i2) {
        h.f.b.l.c(ajVar, "");
    }

    @Override // com.ss.android.ad.splash.core.video2.i
    public final boolean b(SurfaceTexture surfaceTexture) {
        h.f.b.l.c(surfaceTexture, "");
        return false;
    }

    @Override // com.ss.ttvideoengine.bb
    public final void c(aj ajVar, int i2) {
        h.f.b.l.c(ajVar, "");
    }

    @Override // com.ss.ttvideoengine.bb
    public final void d(aj ajVar, int i2) {
        h.f.b.l.c(ajVar, "");
    }

    /* renamed from: com.ss.android.ad.splash.core.video2.a$a  reason: collision with other inner class name */
    public static final class C1288a {
        static {
            Covode.recordClassIndex(36419);
        }

        private C1288a() {
        }

        public /* synthetic */ C1288a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58833a = new c();

        static {
            Covode.recordClassIndex(36421);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final boolean a(String str, String str2) {
        h.f.b.l.c(str, "");
        if (str.length() == 0 || this.f58822b == null) {
            return false;
        }
        this.f58832m.post(new n(this, str, str2));
        this.f58829j = false;
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void a(boolean z) {
        this.f58832m.post(new r(this, z));
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(com.ss.ttvideoengine.s.c cVar) {
        h.f.b.l.c(cVar, "");
        this.f58827g.post(new e(this));
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(36420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a();
            return z.f158842a;
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f58841a;

        static {
            Covode.recordClassIndex(36426);
        }

        h(b bVar) {
            this.f58841a = bVar;
        }

        public final void run() {
            this.f58841a.j();
        }
    }

    private /* synthetic */ a() {
        this(null);
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aj f58835b;

        static {
            Covode.recordClassIndex(36422);
        }

        d(a aVar, aj ajVar) {
            this.f58834a = aVar;
            this.f58835b = ajVar;
        }

        public final void run() {
            b bVar = this.f58834a.f58824d;
            if (bVar != null) {
                bVar.a(this.f58835b.x);
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58836a;

        static {
            Covode.recordClassIndex(36423);
        }

        e(a aVar) {
            this.f58836a = aVar;
        }

        public final void run() {
            b bVar = this.f58836a.f58824d;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f58838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f58839b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58840c;

        static {
            Covode.recordClassIndex(36425);
        }

        g(b bVar, a aVar, int i2) {
            this.f58838a = bVar;
            this.f58839b = aVar;
            this.f58840c = i2;
        }

        public final void run() {
            this.f58838a.c(this.f58839b.f());
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58842a;

        static {
            Covode.recordClassIndex(36427);
        }

        i(a aVar) {
            this.f58842a = aVar;
        }

        public final void run() {
            b bVar = this.f58842a.f58824d;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aj f58844b;

        static {
            Covode.recordClassIndex(36428);
        }

        j(a aVar, aj ajVar) {
            this.f58843a = aVar;
            this.f58844b = ajVar;
        }

        public final void run() {
            b bVar = this.f58843a.f58824d;
            if (bVar != null) {
                bVar.b(this.f58844b.x);
            }
        }
    }

    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58847a;

        static {
            Covode.recordClassIndex(36430);
        }

        l(a aVar) {
            this.f58847a = aVar;
        }

        public final void run() {
            b bVar = this.f58847a.f58824d;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58848a;

        static {
            Covode.recordClassIndex(36431);
        }

        m(a aVar) {
            this.f58848a = aVar;
        }

        public final void run() {
            aj ajVar = this.f58848a.f58823c;
            if (ajVar != null) {
                ajVar.l();
            }
        }
    }

    static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58855a;

        static {
            Covode.recordClassIndex(36436);
        }

        q(a aVar) {
            this.f58855a = aVar;
        }

        public final void run() {
            aj ajVar = this.f58855a.f58823c;
            if (ajVar != null) {
                ajVar.k();
            }
        }
    }

    static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f58857b;

        static {
            Covode.recordClassIndex(36437);
        }

        r(a aVar, boolean z) {
            this.f58856a = aVar;
            this.f58857b = z;
        }

        public final void run() {
            aj ajVar = this.f58856a.f58823c;
            if (ajVar != null) {
                ajVar.g(this.f58857b);
            }
        }
    }

    static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f58859b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f58860c;

        static {
            Covode.recordClassIndex(36438);
        }

        s(a aVar, float f2, float f3) {
            this.f58858a = aVar;
            this.f58859b = f2;
            this.f58860c = f3;
        }

        public final void run() {
            aj ajVar = this.f58858a.f58823c;
            if (ajVar != null) {
                ajVar.a(this.f58859b, this.f58860c);
            }
        }
    }

    static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58862a;

        static {
            Covode.recordClassIndex(36440);
        }

        u(a aVar) {
            this.f58862a = aVar;
        }

        public final void run() {
            aj ajVar = this.f58862a.f58823c;
            if (ajVar != null) {
                ajVar.m();
            }
        }
    }

    public final void a() {
        aj ajVar = this.f58823c;
        if (ajVar != null) {
            this.f58832m.post(new o(ajVar));
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final float c() {
        aj ajVar = this.f58823c;
        if (ajVar != null) {
            return ajVar.f();
        }
        return 0.0f;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final float d() {
        aj ajVar = this.f58823c;
        if (ajVar != null) {
            return ajVar.e();
        }
        return 0.0f;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final boolean e() {
        aj ajVar = this.f58823c;
        if (ajVar == null || ajVar.v != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final int f() {
        aj ajVar = this.f58823c;
        if (ajVar != null) {
            return ajVar.s();
        }
        return 0;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final int g() {
        aj ajVar = this.f58823c;
        if (ajVar != null) {
            return ajVar.x;
        }
        return 0;
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58837a;

        static {
            Covode.recordClassIndex(36424);
        }

        f(a aVar) {
            this.f58837a = aVar;
        }

        public final void run() {
            b bVar = this.f58837a.f58824d;
            if (bVar != null) {
                bVar.f(this.f58837a.f(), this.f58837a.g());
            }
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Surface f58846b;

        static {
            Covode.recordClassIndex(36429);
        }

        k(a aVar, Surface surface) {
            this.f58845a = aVar;
            this.f58846b = surface;
        }

        public final void run() {
            aj ajVar = this.f58845a.f58823c;
            if (ajVar != null) {
                ajVar.a(this.f58846b);
            }
            this.f58845a.f58826f.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f58853a;

        static {
            Covode.recordClassIndex(36434);
        }

        o(aj ajVar) {
            this.f58853a = ajVar;
        }

        public final void run() {
            try {
                this.f58853a.h(false);
                this.f58853a.k();
                h.q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                h.q.m223constructorimpl(h.r.a(th));
            }
        }
    }

    static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58861a;

        static {
            Covode.recordClassIndex(36439);
        }

        t(a aVar) {
            this.f58861a = aVar;
        }

        public final void run() {
            b bVar = this.f58861a.f58824d;
            if (bVar != null) {
                bVar.a(this.f58861a.f(), this.f58861a.g());
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void b() {
        if (!this.f58829j) {
            this.f58827g.post(new t(this));
            this.f58832m.post(new u(this));
            this.f58829j = true;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void h() {
        if (e()) {
            this.f58832m.post(new m(this));
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void i() {
        aj ajVar = this.f58823c;
        if (ajVar != null && ajVar.v == 2) {
            this.f58832m.post(new q(this));
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void j() {
        h hVar = this.f58822b;
        if (hVar != null) {
            hVar.a();
        }
        this.f58832m.post(new p(this));
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58854a;

        static {
            Covode.recordClassIndex(36435);
        }

        p(a aVar) {
            this.f58854a = aVar;
        }

        public final void run() {
            aj ajVar = this.f58854a.f58823c;
            if (ajVar != null) {
                ajVar.a((bb) null);
                ajVar.a((bf) null);
                ajVar.n();
            }
            this.f58854a.f58823c = null;
            this.f58854a.f58824d = null;
            int i2 = Build.VERSION.SDK_INT;
            this.f58854a.f58828h.quitSafely();
        }
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f58849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58850b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58851c;

        static {
            Covode.recordClassIndex(36432);
        }

        n(a aVar, String str, String str2) {
            this.f58849a = aVar;
            this.f58850b = str;
            this.f58851c = str2;
        }

        public final void run() {
            Surface surface;
            a aVar = this.f58849a;
            String str = this.f58850b;
            String str2 = this.f58851c;
            aj ajVar = aVar.f58823c;
            if (ajVar != null) {
                ajVar.n();
            }
            aj ajVar2 = new aj(aVar.f58821a, 0);
            boolean z = true;
            ajVar2.g(true);
            ajVar2.aI = "splash_ad";
            ajVar2.a((bb) aVar);
            ajVar2.a((bf) aVar);
            ajVar2.f(4, 2);
            ajVar2.f(str);
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z && str2 != null) {
                ajVar2.a(str2);
            }
            ajVar2.a(0);
            aVar.f58823c = ajVar2;
            h hVar = this.f58849a.f58822b;
            if (hVar == null || (surface = hVar.getSurface()) == null || !surface.isValid()) {
                this.f58849a.f58827g.post(new Runnable(this) {
                    /* class com.ss.android.ad.splash.core.video2.a.n.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ n f58852a;

                    static {
                        Covode.recordClassIndex(36433);
                    }

                    {
                        this.f58852a = r1;
                    }

                    public final void run() {
                        h hVar = this.f58852a.f58849a.f58822b;
                        if (hVar != null) {
                            hVar.setSurfaceViewVisibility(0);
                        }
                    }
                });
                a aVar2 = this.f58849a;
                if (aVar2.f58825e) {
                    aVar2.a();
                } else {
                    aVar2.f58826f = new b(aVar2);
                }
            } else {
                aj ajVar3 = this.f58849a.f58823c;
                if (ajVar3 != null) {
                    ajVar3.a(surface);
                }
                this.f58849a.a();
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void a(b bVar) {
        h.f.b.l.c(bVar, "");
        this.f58824d = bVar;
    }

    @Override // com.ss.ttvideoengine.bb
    public final void c(aj ajVar) {
        h.f.b.l.c(ajVar, "");
        this.f58827g.post(new j(this, ajVar));
    }

    @Override // com.ss.ttvideoengine.bb
    public final void d(aj ajVar) {
        h.f.b.l.c(ajVar, "");
        this.f58827g.post(new d(this, ajVar));
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(int i2) {
        this.f58827g.post(new l(this));
    }

    public a(h hVar) {
        this.f58826f = c.f58833a;
        this.f58827g = new com.ss.android.ad.splash.f.q(this);
        HandlerThread handlerThread = new HandlerThread("player_thread", 0);
        this.f58828h = handlerThread;
        try {
            handlerThread.start();
            h.q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            h.q.m223constructorimpl(h.r.a(th));
        }
        this.f58832m = new Handler(this.f58828h.getLooper());
        if (hVar != null) {
            h.f.b.l.c(hVar, "");
            this.f58821a = hVar.getApplicationContext();
            hVar.setVideoViewCallback(this);
            this.f58822b = hVar;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.i
    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface;
        h.f.b.l.c(surfaceTexture, "");
        this.f58825e = true;
        h hVar = this.f58822b;
        if (hVar == null || (surface = hVar.getSurface()) == null) {
            surface = new Surface(surfaceTexture);
        }
        this.f58832m.post(new k(this, surface));
    }

    @Override // com.ss.android.ad.splash.f.q.a
    public final void a(Message message) {
        h.f.b.l.c(message, "");
        if (message.what == 1000 && this.f58823c != null) {
            if (e()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j2 = this.f58831l;
                long j3 = uptimeMillis - j2;
                long j4 = 100;
                if (j2 != 0 && j3 > 100) {
                    j4 = 100 - (j3 % 100);
                }
                this.f58827g.sendMessageDelayed(this.f58827g.obtainMessage(1000), j4);
                this.f58831l = uptimeMillis;
            } else {
                this.f58831l = 0;
            }
            if (g() > 0) {
                this.f58827g.post(new f(this));
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void a(float f2, float f3) {
        this.f58832m.post(new s(this, f2, f3));
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(aj ajVar, int i2) {
        b bVar;
        h.f.b.l.c(ajVar, "");
        if (this.f58830k && (bVar = this.f58824d) != null) {
            if (i2 == 1) {
                this.f58827g.post(new h(bVar));
            } else if (i2 == 2) {
                this.f58827g.post(new g(bVar, this, i2));
            }
        }
        if (e()) {
            if (!this.f58830k) {
                this.f58830k = true;
                this.f58827g.post(new i(this));
            }
            this.f58827g.removeMessages(1000);
            this.f58827g.sendEmptyMessage(1000);
        }
    }
}
