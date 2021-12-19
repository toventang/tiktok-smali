package com.ss.android.ugc.asve.recorder;

import android.app.Application;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.context.h;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.runtime.e;
import h.f.b.l;
import h.p;
import h.z;

public final class a implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final C1355a f62125e = new C1355a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f62126a;

    /* renamed from: b  reason: collision with root package name */
    public final m f62127b;

    /* renamed from: c  reason: collision with root package name */
    public final d f62128c;

    /* renamed from: d  reason: collision with root package name */
    public final h f62129d;

    /* renamed from: f  reason: collision with root package name */
    private final p<Integer, Integer> f62130f;

    /* renamed from: g  reason: collision with root package name */
    private final String f62131g;

    /* renamed from: h  reason: collision with root package name */
    private final String f62132h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f62133i;

    /* renamed from: j  reason: collision with root package name */
    private final String f62134j;

    /* renamed from: k  reason: collision with root package name */
    private final String f62135k;

    public enum b {
        CUSTOM,
        REACTION,
        DUET;

        static {
            Covode.recordClassIndex(38187);
        }
    }

    static {
        Covode.recordClassIndex(38185);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(Context context) {
        l.d(context, "");
        this.f62128c.a(context);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(com.ss.android.medialib.listener.b bVar) {
        l.d(bVar, "");
        this.f62128c.a(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(ax.j jVar) {
        this.f62128c.a(jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(r rVar) {
        this.f62128c.a(rVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(e eVar, String str) {
        l.d(eVar, "");
        l.d(str, "");
        this.f62128c.a(eVar, str);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(h.f.a.b<? super Integer, z> bVar) {
        l.d(bVar, "");
        this.f62128c.a(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(h.f.a.r<? super Integer, ? super Integer, ? super String, ? super ax, z> rVar) {
        l.d(rVar, "");
        this.f62128c.a(rVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.a.a b() {
        return this.f62128c.b();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void b(com.ss.android.medialib.listener.b bVar) {
        l.d(bVar, "");
        this.f62128c.b(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.camera.d c() {
        return this.f62128c.c();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.b.a d() {
        return this.f62128c.d();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.effect.a e() {
        return this.f62128c.e();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.c.a f() {
        return this.f62128c.f();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.reaction.a g() {
        return this.f62128c.g();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.d.a h() {
        return this.f62128c.h();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a$a  reason: collision with other inner class name */
    public static final class C1355a {
        static {
            Covode.recordClassIndex(38186);
        }

        private C1355a() {
        }

        public /* synthetic */ C1355a(byte b2) {
            this();
        }

        public static a a(m mVar, h hVar, com.ss.android.ugc.asve.recorder.camera.c.a aVar) {
            l.d(hVar, "");
            Application b2 = com.ss.android.ugc.asve.a.b();
            l.d(b2, "");
            l.d(hVar, "");
            return new a(mVar, new VERecorderImpl(b2, hVar, mVar, aVar), hVar);
        }
    }

    public final void a() {
        String str;
        a(com.ss.android.ugc.asve.a.b());
        com.ss.android.ugc.asve.recorder.c.a f2 = f();
        int b2 = c().b();
        int c2 = c().c();
        String absolutePath = this.f62129d.e().b().getAbsolutePath();
        l.b(absolutePath, "");
        int intValue = this.f62130f.getSecond().intValue();
        int intValue2 = this.f62130f.getFirst().intValue();
        boolean j2 = this.f62129d.j();
        f2.a(b2, c2, absolutePath, intValue, intValue2, "", j2 ? 1 : 0, this.f62129d.g());
        boolean z = true;
        f().a(true);
        f();
        this.f62129d.p();
        e().b(3);
        e();
        if (this.f62126a == b.DUET) {
            com.ss.android.ugc.asve.b.f61927a.d("initDuet() called");
            int d2 = this.f62129d.l().d();
            int e2 = this.f62129d.l().e();
            if (this.f62129d.l().a()) {
                str = null;
            } else {
                str = this.f62132h;
            }
            double d3 = (double) d2;
            Double.isNaN(d3);
            if (d3 * 1.3333333333333333d <= ((double) e2)) {
                z = false;
            }
            if (!this.f62129d.k().invoke().booleanValue()) {
                f().a(str, 0L, 0L, false);
            }
            d().a(this.f62131g, str, z);
        }
        if (this.f62126a == b.REACTION) {
            com.ss.android.ugc.asve.b.f61927a.d("initReaction() called");
            if (!this.f62129d.k().invoke().booleanValue()) {
                f().a(this.f62135k, 0L, 0L, false);
            }
            g().d();
        }
    }

    public static final class c implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62137a;

        static {
            Covode.recordClassIndex(38188);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            l.d(surfaceHolder, "");
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.a$c$a  reason: collision with other inner class name */
        static final class C1356a extends h.f.b.m implements h.f.a.b<Integer, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1356a f62145a = new C1356a();

            static {
                Covode.recordClassIndex(38189);
            }

            C1356a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Integer num) {
                num.intValue();
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f62137a = aVar;
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
            this.f62137a.a();
            com.ss.android.ugc.asve.recorder.c.a f2 = this.f62137a.f62128c.f();
            Surface surface = surfaceHolder.getSurface();
            l.b(surface, "");
            f2.a(surface, "", C1356a.f62145a);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
            this.f62137a.f62128c.f().c();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f62148a = new d();

        static {
            Covode.recordClassIndex(38190);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            num.intValue();
            return z.f158842a;
        }
    }

    public a(m mVar, d dVar, h hVar) {
        b bVar;
        Surface surface;
        l.d(dVar, "");
        l.d(hVar, "");
        this.f62127b = mVar;
        this.f62128c = dVar;
        this.f62129d = hVar;
        this.f62130f = hVar.f();
        String c2 = hVar.l().c();
        this.f62131g = c2;
        String b2 = hVar.l().b();
        this.f62132h = b2;
        this.f62133i = hVar.l().f();
        String b3 = hVar.m().b();
        this.f62134j = b3;
        String a2 = hVar.m().a();
        this.f62135k = a2;
        if (b3.length() > 0 && a2.length() > 0) {
            bVar = b.REACTION;
        } else if (c2.length() <= 0 || b2.length() <= 0) {
            bVar = b.CUSTOM;
        } else {
            bVar = b.DUET;
        }
        this.f62126a = bVar;
        if (hVar.c()) {
            SurfaceHolder d2 = hVar.d();
            if (d2 != null) {
                d2.addCallback(new c(this));
            }
            SurfaceHolder d3 = hVar.d();
            if (d3 != null && (surface = d3.getSurface()) != null && surface.isValid()) {
                a();
                dVar.f().a(surface, "", d.f62148a);
            }
        }
    }
}
