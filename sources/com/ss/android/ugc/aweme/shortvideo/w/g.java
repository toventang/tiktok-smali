package com.ss.android.ugc.aweme.shortvideo.w;

import android.content.Context;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.g;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.u;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.an;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.dw;
import com.ss.android.ugc.aweme.shortvideo.eb;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.w.b;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.tools.view.widget.j;
import com.ss.android.vesdk.aj;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class g<T extends com.bytedance.creativex.recorder.b.a.m> extends com.bytedance.als.j<T> implements com.bytedance.creativex.recorder.b.a.m, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f132677a = {new h.f.b.y(g.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0), new h.f.b.y(g.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
    public static final a p = new a((byte) 0);
    private final com.bytedance.als.k<h.z> A;
    private final com.bytedance.als.k<h.z> B;
    private final com.bytedance.als.k<com.ss.android.ugc.aweme.tools.m> C;
    private final com.bytedance.als.l<com.bytedance.creativex.recorder.b.a.t> D;
    private final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.x> E;
    private final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.x> F;
    private final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.x> G;
    private final com.bytedance.als.k<TimeSpeedModelExtension> H;
    private final com.bytedance.als.k<h.z> I;
    private final com.bytedance.als.k<h.z> J;
    private final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.j> K;
    private final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.o> L;
    private final com.bytedance.als.l<Boolean> M;
    private final com.bytedance.als.l<Boolean> N;
    private final com.bytedance.als.l<Boolean> O;
    private final com.bytedance.als.l<Boolean> P;
    private final com.bytedance.als.k<h.z> Q;
    private final com.bytedance.als.k<h.z> R;
    private final com.bytedance.als.k<Object> S;
    private final com.bytedance.als.l<Boolean> T;
    private boolean U;
    private final boolean V;
    private final h.h W;
    private final h.h X;
    private final h.h Y;
    private final h.h Z;
    private final com.bytedance.als.g<TimeSpeedModelExtension> aA;
    private final com.bytedance.als.g<a> aB;
    private final com.bytedance.als.g<h.z> aC;
    private final com.bytedance.o.f aD;
    private final h.h aa;
    private final T ab;
    private final f.a.l.c<com.bytedance.creativex.recorder.b.a.g> ac;
    private final com.bytedance.als.g<h.z> ad;
    private final com.bytedance.als.g<h.z> ae;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.w> af;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.w> ag;
    private final com.bytedance.als.h<Boolean> ah;
    private final com.bytedance.als.h<Boolean> ai;
    private final com.bytedance.als.h<Boolean> aj;
    private final h.h ak;
    private final com.bytedance.als.g<Long> al;
    private final com.bytedance.als.g<h.z> am;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.y> an;
    private final com.bytedance.als.g<h.z> ao;
    private final com.bytedance.als.g<h.z> ap;
    private final f.a.l.c<com.bytedance.creativex.recorder.b.a.u> aq;
    private final com.bytedance.als.g<com.ss.android.ugc.aweme.tools.m> ar;
    private final com.bytedance.als.g<h.z> as;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.j> at;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.x> au;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.o> av;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.x> aw;
    private final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.x> ax;
    private final com.bytedance.als.g<h.z> ay;
    private final com.bytedance.als.h<com.bytedance.creativex.recorder.b.a.t> az;

    /* renamed from: b  reason: collision with root package name */
    public final b f132678b;

    /* renamed from: c  reason: collision with root package name */
    public final CameraComponentModel f132679c;

    /* renamed from: d  reason: collision with root package name */
    public final SafeHandler f132680d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.w> f132681e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.als.k<h.z> f132682f;

    /* renamed from: g  reason: collision with root package name */
    public long f132683g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<? extends Object>, com.bytedance.creativex.recorder.b.a.n> f132684h;

    /* renamed from: i  reason: collision with root package name */
    public Class<? extends Object> f132685i;

    /* renamed from: j  reason: collision with root package name */
    public String f132686j;

    /* renamed from: k  reason: collision with root package name */
    public final f f132687k;

    /* renamed from: l  reason: collision with root package name */
    public int f132688l;

    /* renamed from: m  reason: collision with root package name */
    public h.f.a.a<Boolean> f132689m;
    public final com.bytedance.als.h<Boolean> n;
    public final com.bytedance.als.l<Boolean> o;
    private final h.h.d q;
    private final h.h.d r;
    private final com.bytedance.als.k<h.z> s;
    private final com.bytedance.als.k<h.z> t;
    private final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.w> u;
    private final com.bytedance.als.k<a> v;
    private final h.h w;
    private final com.bytedance.als.k<Long> x;
    private final com.bytedance.als.k<h.z> y;
    private final com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.y> z;

    static {
        Covode.recordClassIndex(86816);
    }

    private final eb V() {
        return (eb) this.Z.getValue();
    }

    public final com.bytedance.creativex.recorder.b.a.d H() {
        return (com.bytedance.creativex.recorder.b.a.d) this.r.a(this, f132677a[1]);
    }

    public final com.bytedance.als.l<Boolean> I() {
        return (com.bytedance.als.l) this.w.getValue();
    }

    public final g<T>.c J() {
        return (c) this.W.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.o K() {
        return (com.ss.android.ugc.aweme.shortvideo.o) this.X.getValue();
    }

    public final dw L() {
        return (dw) this.Y.getValue();
    }

    public final androidx.appcompat.app.d ct_() {
        return (androidx.appcompat.app.d) this.q.a(this, f132677a[0]);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.h<Boolean> q() {
        return (com.bytedance.als.h) this.ak.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86817);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> A() {
        return this.ap;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.ss.android.ugc.aweme.tools.m> C() {
        return this.ar;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> D() {
        return this.as;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.j> E() {
        return this.at;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.o> F() {
        return this.av;
    }

    /* renamed from: M */
    public T getApiComponent() {
        return this.ab;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final f a() {
        return this.f132687k;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> b() {
        return this.aC;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.h<Boolean> c() {
        return this.n;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.h<Boolean> d() {
        return this.ah;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final /* bridge */ /* synthetic */ com.bytedance.als.h e() {
        return this.o;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> g() {
        return this.ad;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.aD;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.w> h() {
        return this.af;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.w> i() {
        return this.ag;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> j() {
        return this.ae;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.x> k() {
        return this.au;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.x> l() {
        return this.aw;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.x> m() {
        return this.ax;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> n() {
        return this.ay;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.h<com.bytedance.creativex.recorder.b.a.t> o() {
        return this.az;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<a> p() {
        return this.aB;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<Long> r() {
        return this.al;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<TimeSpeedModelExtension> s() {
        return this.aA;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> t() {
        return this.am;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.y> u() {
        return this.an;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final com.bytedance.als.g<h.z> w() {
        return this.ao;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(Class<? extends Object> cls) {
        h.f.b.l.d(cls, "");
        this.f132685i = cls;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(Class<? extends Object> cls, com.bytedance.creativex.recorder.b.a.n nVar) {
        h.f.b.l.d(cls, "");
        h.f.b.l.d(nVar, "");
        this.f132684h.put(cls, nVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(h.f.a.a<Boolean> aVar) {
        h.f.b.l.d(aVar, "");
        this.f132689m = aVar;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(com.bytedance.creativex.recorder.b.a.w wVar) {
        h.f.b.l.d(wVar, "");
        a(this, false, 3);
        this.s.a((h.z) null);
        if (H().D().getMediaController().a()) {
            com.ss.android.ugc.tools.c.f149151f.d("startRecording but is pre playing wait for preplay stop");
            H().D().getMediaController().h().observe(this, new ae(this, wVar));
            return;
        }
        b(wVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(Class<? extends Object> cls, com.bytedance.creativex.recorder.b.a.i iVar) {
        com.bytedance.creativex.recorder.b.a.n nVar;
        h.f.b.l.d(cls, "");
        h.f.b.l.d(iVar, "");
        if (this.f132684h.containsKey(cls) && (nVar = this.f132684h.get(cls)) != null) {
            nVar.a(iVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(boolean z2) {
        d(true);
        this.v.a(new a(z2));
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public void a(com.bytedance.creativex.recorder.b.a.x xVar) {
        h.f.b.l.d(xVar, "");
        if (!h.a.n.b(5, 4, 6, 7).contains(Integer.valueOf(xVar.f28214a))) {
            this.E.a(xVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(com.ss.android.ugc.aweme.tools.h hVar) {
        h.f.b.l.d(hVar, "");
        if (!h.f.b.l.a((Object) this.O.a(), (Object) true)) {
            f fVar = this.f132687k;
            String str = hVar.f140200a;
            h.f.b.l.b(str, "");
            fVar.a(str);
            this.U = false;
            this.O.b(true);
            if (!this.P.a().booleanValue()) {
                this.P.a(this);
                this.P.a(this, new n(this, hVar));
                return;
            }
            com.bytedance.creativex.recorder.b.a.n nVar = this.f132684h.get(this.f132685i);
            if (nVar == null) {
                h.f.b.l.b();
            }
            nVar.a(hVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(boolean z2, boolean z3) {
        a(z2 ? com.bytedance.creativex.recorder.b.a.aa.FORM_60S : com.bytedance.creativex.recorder.b.a.aa.FORM_15S, z3);
        this.f132679c.s = !z3;
    }

    public final void a(TimeSpeedModelExtension timeSpeedModelExtension) {
        this.H.a(timeSpeedModelExtension);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(String str) {
        Boolean a2 = this.n.a();
        h.f.b.l.b(a2, "");
        if (a2.booleanValue()) {
            a(new com.ss.android.ugc.aweme.tools.h("click_next"));
            return;
        }
        com.bytedance.creativex.recorder.b.a.x a3 = new com.bytedance.creativex.recorder.b.a.x(str).a(4);
        h.f.b.l.b(a3, "");
        b(a3);
    }

    static final class ab extends h.f.b.m implements h.f.a.a<g<T>.c> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g<T>.c invoke() {
            return new c();
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<com.bytedance.als.l<Boolean>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.als.l<Boolean> invoke() {
            return this.this$0.I();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f132734a = new t();

        static {
            Covode.recordClassIndex(86853);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    public final void P() {
        this.I.a(h.z.f158842a);
    }

    @Override // com.bytedance.als.j
    public void onPause() {
        super.onPause();
        Q();
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void x() {
        this.A.a(h.z.f158842a);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void y() {
        this.t.a(h.z.f158842a);
    }

    public final class c implements com.ss.android.ugc.asve.recorder.i {

        /* renamed from: a  reason: collision with root package name */
        long f132713a = -100;

        /* renamed from: b  reason: collision with root package name */
        long f132714b;

        static {
            Covode.recordClassIndex(86832);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f132716a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f132717b;

            static {
                Covode.recordClassIndex(86833);
            }

            a(c cVar, long j2) {
                this.f132716a = cVar;
                this.f132717b = j2;
            }

            public final void run() {
                g.this.d(this.f132717b);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 == aj.y) {
                long j2 = (long) (f2 / 1000.0f);
                if (j2 != this.f132713a && j2 != 0) {
                    if (g.this.f132678b.o > 0 && ((double) g.this.T().value()) >= 1.0d) {
                        long e2 = g.this.e(j2);
                        if (!g.this.c(e2) && !g.this.f(e2)) {
                            long j3 = this.f132714b;
                            if (j3 != 0 && j2 - j3 < ((long) g.this.f132678b.o)) {
                                return;
                            }
                        }
                        this.f132714b = j2;
                    }
                    this.f132713a = j2;
                    g.this.f132680d.post(new a(this, j2));
                }
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.o> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.o invoke() {
            g gVar = this.this$0;
            return new com.ss.android.ugc.aweme.shortvideo.o(gVar, gVar.f132679c, this.this$0.f132678b.f132694a);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ com.bytedance.creativex.recorder.b.a.x $event;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar, com.bytedance.creativex.recorder.b.a.x xVar) {
            super(0);
            this.this$0 = gVar;
            this.$event = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            Runnable runnable = this.$event.f28219f;
            if (runnable != null) {
                this.this$0.f132680d.post(runnable);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ int $countDownValue;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar, int i2) {
            super(0);
            this.this$0 = gVar;
            this.$countDownValue = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.b(this.$countDownValue);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132729a;

        static {
            Covode.recordClassIndex(86848);
        }

        o(g gVar) {
            this.f132729a = gVar;
        }

        public final void run() {
            this.f132729a.a(new com.ss.android.ugc.aweme.tools.h("stop_record"));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132730a;

        static {
            Covode.recordClassIndex(86849);
        }

        p(g gVar) {
            this.f132730a = gVar;
        }

        public final void run() {
            this.f132730a.a(new com.ss.android.ugc.aweme.tools.h("click_next"));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132731a;

        static {
            Covode.recordClassIndex(86850);
        }

        q(g gVar) {
            this.f132731a = gVar;
        }

        public final void run() {
            this.f132731a.a(new com.ss.android.ugc.aweme.tools.h("record_full"));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132732a;

        static {
            Covode.recordClassIndex(86851);
        }

        r(g gVar) {
            this.f132732a = gVar;
        }

        public final void run() {
            this.f132732a.a(new com.ss.android.ugc.aweme.tools.h("stop_record"));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132733a;

        static {
            Covode.recordClassIndex(86852);
        }

        s(g gVar) {
            this.f132733a = gVar;
        }

        public final void run() {
            this.f132733a.a(new com.ss.android.ugc.aweme.tools.h("stop_record"));
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<com.bytedance.als.l<Boolean>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.als.l<Boolean> invoke() {
            return new com.bytedance.als.l(Boolean.valueOf(this.this$0.f132678b.q));
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final f.a.t<com.bytedance.creativex.recorder.b.a.u> B() {
        f.a.t<com.bytedance.creativex.recorder.b.a.u> c2 = this.aq.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    public final com.ss.android.ugc.aweme.tools.extract.o N() {
        return H().H();
    }

    public final void O() {
        this.f132680d.post(new m(this));
    }

    public final int R() {
        return H().N();
    }

    public final ASCameraView S() {
        return H().D();
    }

    public final com.ss.android.ugc.aweme.tools.i T() {
        return H().K();
    }

    public final void U() {
        this.O.b(false);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final f.a.t<com.bytedance.creativex.recorder.b.a.g> f() {
        f.a.t<com.bytedance.creativex.recorder.b.a.g> c2 = this.ac.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void z() {
        a(0);
        this.B.a(h.z.f158842a);
    }

    static final class af extends h.f.b.m implements h.f.a.a<dw> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dw invoke() {
            androidx.appcompat.app.d ct_ = this.this$0.ct_();
            com.bytedance.creativex.recorder.b.a.d H = this.this$0.H();
            g gVar = this.this$0;
            return new dw(ct_, H, gVar, gVar.f132678b);
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.a<eb> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ eb invoke() {
            com.bytedance.creativex.recorder.b.a.d H = this.this$0.H();
            g gVar = this.this$0;
            return new eb(H, gVar, gVar.f132678b, this.this$0.f132680d, this.this$0.f132678b.f132701h);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public b f132694a;

        /* renamed from: b  reason: collision with root package name */
        public j f132695b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f132696c;

        /* renamed from: d  reason: collision with root package name */
        public h.f.a.a<Boolean> f132697d;

        /* renamed from: e  reason: collision with root package name */
        public e f132698e;

        /* renamed from: f  reason: collision with root package name */
        public l f132699f;

        /* renamed from: g  reason: collision with root package name */
        public h.f.a.b<? super CameraComponentModel, Integer> f132700g;

        /* renamed from: h  reason: collision with root package name */
        public com.ss.android.ugc.aweme.shortvideo.record.a f132701h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f132702i;

        /* renamed from: j  reason: collision with root package name */
        public com.bytedance.creativex.recorder.b.a.v f132703j;

        /* renamed from: k  reason: collision with root package name */
        public h.f.a.b<? super CameraComponentModel, Boolean> f132704k;

        /* renamed from: l  reason: collision with root package name */
        public h.f.a.b<? super CameraComponentModel, Boolean> f132705l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f132706m;
        public h.f.a.a<Boolean> n;
        public int o;
        public h.f.a.a<Boolean> p;
        public boolean q;

        static {
            Covode.recordClassIndex(86825);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.f.b.l.a(this.f132694a, bVar.f132694a) && h.f.b.l.a(this.f132695b, bVar.f132695b) && this.f132696c == bVar.f132696c && h.f.b.l.a(this.f132697d, bVar.f132697d) && h.f.b.l.a(this.f132698e, bVar.f132698e) && h.f.b.l.a(this.f132699f, bVar.f132699f) && h.f.b.l.a(this.f132700g, bVar.f132700g) && h.f.b.l.a(this.f132701h, bVar.f132701h) && this.f132702i == bVar.f132702i && h.f.b.l.a(this.f132703j, bVar.f132703j) && h.f.b.l.a(this.f132704k, bVar.f132704k) && h.f.b.l.a(this.f132705l, bVar.f132705l) && this.f132706m == bVar.f132706m && h.f.b.l.a(this.n, bVar.n) && this.o == bVar.o && h.f.b.l.a(this.p, bVar.p) && this.q == bVar.q;
        }

        public final int hashCode() {
            b bVar = this.f132694a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            j jVar = this.f132695b;
            int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
            boolean z = this.f132696c;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (hashCode2 + i4) * 31;
            h.f.a.a<Boolean> aVar = this.f132697d;
            int hashCode3 = (i7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            e eVar = this.f132698e;
            int hashCode4 = (hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            l lVar = this.f132699f;
            int hashCode5 = (hashCode4 + (lVar != null ? lVar.hashCode() : 0)) * 31;
            h.f.a.b<? super CameraComponentModel, Integer> bVar2 = this.f132700g;
            int hashCode6 = (hashCode5 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
            com.ss.android.ugc.aweme.shortvideo.record.a aVar2 = this.f132701h;
            int hashCode7 = (hashCode6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            boolean z2 = this.f132702i;
            if (z2) {
                z2 = true;
            }
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = (hashCode7 + i8) * 31;
            com.bytedance.creativex.recorder.b.a.v vVar = this.f132703j;
            int hashCode8 = (i11 + (vVar != null ? vVar.hashCode() : 0)) * 31;
            h.f.a.b<? super CameraComponentModel, Boolean> bVar3 = this.f132704k;
            int hashCode9 = (hashCode8 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
            h.f.a.b<? super CameraComponentModel, Boolean> bVar4 = this.f132705l;
            int hashCode10 = (hashCode9 + (bVar4 != null ? bVar4.hashCode() : 0)) * 31;
            boolean z3 = this.f132706m;
            if (z3) {
                z3 = true;
            }
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = z3 ? 1 : 0;
            int i15 = (hashCode10 + i12) * 31;
            h.f.a.a<Boolean> aVar3 = this.n;
            int hashCode11 = (((i15 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.o) * 31;
            h.f.a.a<Boolean> aVar4 = this.p;
            if (aVar4 != null) {
                i2 = aVar4.hashCode();
            }
            int i16 = (hashCode11 + i2) * 31;
            if (!this.q) {
                i3 = 0;
            }
            return i16 + i3;
        }

        public final String toString() {
            return "Config(maxDurationCalculator=" + this.f132694a + ", recordControlSetting=" + this.f132695b + ", enableAutoRetryRecord=" + this.f132696c + ", enableTitan=" + this.f132697d + ", reactionModelCallback=" + this.f132698e + ", shutterSoundProcessor=" + this.f132699f + ", hardEncodeVerify=" + this.f132700g + ", asCameraViewDecorator=" + this.f132701h + ", enableAudioCapture=" + this.f132702i + ", startCommandAudioControlStrategy=" + this.f132703j + ", enableMicControl=" + this.f132704k + ", isForceEnableAudio=" + this.f132705l + ", enableMicWithMusicAB=" + this.f132706m + ", updateProgressByVECallback=" + this.n + ", progressUpdateInterval=" + this.o + ", enableNoLastRecordFrame=" + this.p + ", enableRecordBtnBeforeCamInit=" + this.q + ")";
        }

        public /* synthetic */ b() {
            this(new b.a(), new j(), AnonymousClass1.f132707a, AnonymousClass2.f132708a, com.ss.android.ugc.aweme.shortvideo.record.a.f130005a, AnonymousClass3.f132709a, AnonymousClass4.f132710a, AnonymousClass5.f132711a, AnonymousClass6.f132712a);
        }

        public final void a(com.ss.android.ugc.aweme.shortvideo.record.a aVar) {
            h.f.b.l.d(aVar, "");
            this.f132701h = aVar;
        }

        public final void b(h.f.a.b<? super CameraComponentModel, Boolean> bVar) {
            h.f.b.l.d(bVar, "");
            this.f132704k = bVar;
        }

        public final void a(b bVar) {
            h.f.b.l.d(bVar, "");
            this.f132694a = bVar;
        }

        public final void a(j jVar) {
            h.f.b.l.d(jVar, "");
            this.f132695b = jVar;
        }

        public final void a(h.f.a.a<Boolean> aVar) {
            h.f.b.l.d(aVar, "");
            this.n = aVar;
        }

        public final void a(h.f.a.b<? super CameraComponentModel, Integer> bVar) {
            h.f.b.l.d(bVar, "");
            this.f132700g = bVar;
        }

        private b(b bVar, j jVar, h.f.a.a<Boolean> aVar, h.f.a.b<? super CameraComponentModel, Integer> bVar2, com.ss.android.ugc.aweme.shortvideo.record.a aVar2, h.f.a.b<? super CameraComponentModel, Boolean> bVar3, h.f.a.b<? super CameraComponentModel, Boolean> bVar4, h.f.a.a<Boolean> aVar3, h.f.a.a<Boolean> aVar4) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(jVar, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            h.f.b.l.d(bVar3, "");
            h.f.b.l.d(bVar4, "");
            h.f.b.l.d(aVar3, "");
            h.f.b.l.d(aVar4, "");
            this.f132694a = bVar;
            this.f132695b = jVar;
            this.f132696c = true;
            this.f132697d = aVar;
            this.f132698e = null;
            this.f132699f = null;
            this.f132700g = bVar2;
            this.f132701h = aVar2;
            this.f132702i = false;
            this.f132703j = null;
            this.f132704k = bVar3;
            this.f132705l = bVar4;
            this.f132706m = false;
            this.n = aVar3;
            this.o = 0;
            this.p = aVar4;
            this.q = false;
        }
    }

    public final class d implements Runnable {
        static {
            Covode.recordClassIndex(86834);
        }

        public final void run() {
            SafeHandler safeHandler = g.this.f132680d;
            if (g.this.d(g.this.S().getEndFrameTimeUS() / 1000) && safeHandler != null) {
                safeHandler.post(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<an> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ an invoke() {
            com.bytedance.creativex.recorder.b.a.d H = this.this$0.H();
            g gVar = this.this$0;
            return new an(H, gVar, gVar.f132679c, this.this$0.f132678b);
        }
    }

    @Override // com.bytedance.als.j
    public void onResume() {
        super.onResume();
        this.O.b(false);
        this.U = true;
    }

    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132726a;

        static {
            Covode.recordClassIndex(86846);
        }

        m(g gVar) {
            this.f132726a = gVar;
        }

        public final void run() {
            if (this.f132726a.f132678b.n.invoke().booleanValue()) {
                g gVar = this.f132726a;
                gVar.S().b(gVar.J());
                g<T>.c J = this.f132726a.J();
                J.f132713a = -100;
                J.f132714b = 0;
            }
            this.f132726a.f132682f.a(h.z.f158842a);
        }
    }

    static final class ac implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132690a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f132691b;

        static {
            Covode.recordClassIndex(86820);
        }

        ac(g gVar, int i2) {
            this.f132690a = gVar;
            this.f132691b = i2;
        }

        public final void run() {
            int i2;
            Context applicationContext = this.f132690a.ct_().getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            g gVar = this.f132690a;
            int i3 = gVar.f132688l;
            gVar.f132688l = i3 + 1;
            if (i3 < 2) {
                i2 = R.string.fep;
            } else {
                i2 = R.string.feq;
            }
            j.a.a(applicationContext, i2, 0).a();
            com.bytedance.creativex.recorder.b.a.x a2 = new com.bytedance.creativex.recorder.b.a.x("process running error, error code: " + this.f132691b).a(1);
            g gVar2 = this.f132690a;
            h.f.b.l.b(a2, "");
            gVar2.b(a2);
        }
    }

    public final void Q() {
        com.ss.android.ugc.tools.c.f149151f.a("forceStopRecord() called");
        if (this.n.a().booleanValue()) {
            Boolean a2 = this.ai.a();
            h.f.b.l.b(a2, "");
            if (!a2.booleanValue()) {
                return;
            }
        }
        com.ss.android.ugc.tools.c.f149151f.a("real forceStopRecord() called");
        com.bytedance.creativex.recorder.b.a.x a3 = new com.bytedance.creativex.recorder.b.a.x("forceStopRecord").a();
        h.f.b.l.b(a3, "");
        b(a3);
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        H().ac().a(ct_(), new v(this));
        this.M.a(this, new w(this));
        this.T.a(this, new x(this));
        H().r().a(ct_(), new y(this));
        H().B().a(ct_(), new z(this));
        ASCameraView S2 = S();
        aa aaVar = new aa(this);
        h.f.b.l.d(aaVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = S2.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.a(aaVar);
        this.O.b(false);
        this.U = true;
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void v() {
        int Q2;
        a(this, true, 2);
        if (H().W()) {
            Q2 = H().S();
        } else {
            Q2 = H().Q();
        }
        if (R() == 1) {
            if (Q2 == 0) {
                this.z.a(new com.bytedance.creativex.recorder.b.a.y(false));
            } else if (Q2 == 1) {
                this.z.a(new com.bytedance.creativex.recorder.b.a.y(true));
            } else if (Q2 == 2) {
                this.z.a(new com.bytedance.creativex.recorder.b.a.y(true));
            }
        } else if (Q2 == 0) {
            this.z.a(new com.bytedance.creativex.recorder.b.a.y(false));
        } else if (Q2 == 1) {
            this.z.a(new com.bytedance.creativex.recorder.b.a.y(H().T()));
        } else if (Q2 == 2) {
            this.z.a(new com.bytedance.creativex.recorder.b.a.y(H().T()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<Integer, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f132719a = new f();

        static {
            Covode.recordClassIndex(86836);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            num.intValue();
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Integer, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f132725a = new l();

        static {
            Covode.recordClassIndex(86845);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            num.intValue();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<T> implements com.bytedance.als.m<h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132735a;

        static {
            Covode.recordClassIndex(86855);
        }

        v(g gVar) {
            this.f132735a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(h.z zVar) {
            this.f132735a.Q();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y<T> implements com.bytedance.als.m<h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132738a;

        static {
            Covode.recordClassIndex(86858);
        }

        y(g gVar) {
            this.f132738a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(h.z zVar) {
            this.f132738a.b(-1L);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(long j2) {
        this.f132683g = j2;
    }

    public final void b(int i2) {
        com.bytedance.creativex.recorder.b.a.w wVar = new com.bytedance.creativex.recorder.b.a.w(T());
        wVar.f28212b = i2;
        a(wVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void e(boolean z2) {
        this.T.b(Boolean.valueOf(z2));
    }

    public final void f_(boolean z2) {
        this.M.b(Boolean.valueOf(z2));
    }

    public final void h(boolean z2) {
        this.N.b(Boolean.valueOf(!z2));
    }

    /* access modifiers changed from: package-private */
    public static final class w<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132736a;

        static {
            Covode.recordClassIndex(86856);
        }

        w(g gVar) {
            this.f132736a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            com.bytedance.creativex.recorder.b.a.d H = this.f132736a.H();
            h.f.b.l.b(bool2, "");
            H.f(bool2.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132737a;

        static {
            Covode.recordClassIndex(86857);
        }

        x(g gVar) {
            this.f132737a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            com.bytedance.creativex.recorder.b.a.d H = this.f132737a.H();
            h.f.b.l.b(bool2, "");
            H.g(bool2.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z<T> implements com.bytedance.als.m<h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132739a;

        static {
            Covode.recordClassIndex(86859);
        }

        z(g gVar) {
            this.f132739a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(h.z zVar) {
            if (!this.f132739a.n.a().booleanValue()) {
                this.f132739a.Q();
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(int i2) {
        l lVar = this.f132678b.f132699f;
        if (lVar != null) {
            ASCameraView S2 = S();
            new k(this, i2);
            lVar.a(S2);
        }
        b(i2);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void b(com.bytedance.creativex.recorder.b.a.x xVar) {
        h.f.b.l.d(xVar, "");
        V().onEvent(xVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void c(com.bytedance.creativex.recorder.b.a.x xVar) {
        h.f.b.l.d(xVar, "");
        ((an) this.aa.getValue()).onEvent(xVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void f(boolean z2) {
        this.P.b(Boolean.valueOf(z2));
    }

    /* access modifiers changed from: package-private */
    public static final class aa extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            int intValue = num.intValue();
            g gVar = this.this$0;
            gVar.a(new g.a(intValue));
            if (gVar.f132678b.f132696c) {
                gVar.f132680d.post(new ac(gVar, intValue));
            }
            return h.z.f158842a;
        }
    }

    public static final class ae implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.creativex.recorder.b.a.w f132693b;

        static {
            Covode.recordClassIndex(86822);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            com.ss.android.ugc.tools.c.f149151f.d("startRecording StopPrePlayState:".concat(String.valueOf(booleanValue)));
            if (booleanValue) {
                this.f132692a.b(this.f132693b);
                this.f132692a.H().D().getMediaController().h().removeObserver(this);
            }
        }

        ae(g gVar, com.bytedance.creativex.recorder.b.a.w wVar) {
            this.f132692a = gVar;
            this.f132693b = wVar;
        }
    }

    public static final class j implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.creativex.recorder.b.a.g f132724b;

        static {
            Covode.recordClassIndex(86843);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                this.f132723a.H().j().a(this);
                this.f132723a.L().a(((g.e) this.f132724b).f28189a);
            }
        }

        j(g gVar, com.bytedance.creativex.recorder.b.a.g gVar2) {
            this.f132723a = gVar;
            this.f132724b = gVar2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f132727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.h f132728b;

        static {
            Covode.recordClassIndex(86847);
        }

        n(g gVar, com.ss.android.ugc.aweme.tools.h hVar) {
            this.f132727a = gVar;
            this.f132728b = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (!bool.booleanValue()) {
                return;
            }
            if (this.f132727a.f132684h.get(this.f132727a.f132685i) != null) {
                com.bytedance.creativex.recorder.b.a.n nVar = this.f132727a.f132684h.get(this.f132727a.f132685i);
                if (nVar == null) {
                    h.f.b.l.b();
                }
                nVar.a(this.f132728b);
                return;
            }
            com.ss.android.ugc.tools.c.f149151f.d("RecordControl goNext nextActionMap curActionType is null");
        }
    }

    public final void b(long j2) {
        long j3;
        if (this.f132679c.f124714i) {
            j3 = this.f132679c.f124715j;
        } else {
            j3 = this.f132679c.f124712g;
        }
        if (j2 > 0) {
            j3 += TimeSpeedModelExtension.calculateRealTime(j2, (double) T().value());
        }
        b(com.bytedance.creativex.recorder.b.a.t.a(this.f132679c.d(), j3));
    }

    public final boolean c(long j2) {
        long j3 = this.f132683g;
        if (j3 <= 0 || j3 >= this.f132679c.k() || j2 <= j3) {
            return false;
        }
        return true;
    }

    public final long e(long j2) {
        long calculateRealTime;
        long h2;
        if (this.f132679c.u == 1) {
            calculateRealTime = TimeSpeedModelExtension.calculateRealTime(j2, (double) com.ss.android.ugc.aweme.tools.i.NORMAL.value());
            h2 = this.f132679c.h();
        } else {
            calculateRealTime = TimeSpeedModelExtension.calculateRealTime(j2, (double) T().value());
            h2 = this.f132679c.h();
        }
        return calculateRealTime + h2;
    }

    /* access modifiers changed from: protected */
    public final boolean f(long j2) {
        if (j2 >= this.f132679c.k()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$g  reason: collision with other inner class name */
    static final class C3437g extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ com.bytedance.creativex.recorder.b.a.x $event;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(86837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3437g(g gVar, com.bytedance.creativex.recorder.b.a.x xVar) {
            super(1);
            this.this$0 = gVar;
            this.$event = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            num.intValue();
            if (this.$event.f28214a == 4) {
                this.this$0.f132680d.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.w.g.C3437g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C3437g f132720a;

                    static {
                        Covode.recordClassIndex(86838);
                    }

                    {
                        this.f132720a = r1;
                    }

                    public final void run() {
                        this.f132720a.this$0.a(new com.ss.android.ugc.aweme.tools.h("click_next"));
                    }
                });
            } else if (this.$event.f28214a == 2) {
                this.this$0.f132680d.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.w.g.C3437g.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C3437g f132721a;

                    static {
                        Covode.recordClassIndex(86839);
                    }

                    {
                        this.f132721a = r1;
                    }

                    public final void run() {
                        this.f132721a.this$0.a(new com.ss.android.ugc.aweme.tools.h("record_full"));
                    }
                });
            } else if (this.$event.f28214a == 5) {
                this.this$0.f132680d.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.w.g.C3437g.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C3437g f132722a;

                    static {
                        Covode.recordClassIndex(86840);
                    }

                    {
                        this.f132722a = r1;
                    }

                    public final void run() {
                        this.f132722a.this$0.a(new com.ss.android.ugc.aweme.tools.h("stop_record"));
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    public final void a(com.bytedance.creativex.recorder.b.a.g gVar) {
        h.f.b.l.d(gVar, "");
        this.ac.onNext(gVar);
        if (gVar instanceof g.e) {
            H().j().a(ct_(), new j(this, gVar));
        }
    }

    public final void b(com.bytedance.creativex.recorder.b.a.t tVar) {
        this.D.b(tVar);
        if (tVar != null) {
            if (tVar.f28206b > 0 || this.f132679c.f124714i) {
                this.o.b(true);
            }
            tVar.a();
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void c(boolean z2) {
        d(z2);
        if (this.f132678b.f132704k.invoke(this.f132679c).booleanValue()) {
            H().a(new com.ss.android.ugc.aweme.tools.j(3));
        }
        K().a();
        b(com.bytedance.creativex.recorder.b.a.t.a((List<TimeSpeedModelExtension>) h.a.z.INSTANCE, 0L, true));
        a(this.f132679c.t, false);
        this.O.b(false);
        this.y.a(h.z.f158842a);
        if (!this.f132679c.f124714i) {
            this.o.b(false);
        }
    }

    public final void d(com.bytedance.creativex.recorder.b.a.x xVar) {
        h.f.b.l.d(xVar, "");
        S().a(new C3437g(this, xVar), new h(this, xVar));
        com.ss.android.ugc.asve.a.a().a().c("StopRecordingCommandEvent, recordState=" + xVar.f28214a);
        com.ss.android.ugc.asve.d a2 = com.ss.android.ugc.asve.a.a().a();
        String stackTraceString = Log.getStackTraceString(new Throwable());
        h.f.b.l.b(stackTraceString, "");
        a2.c(stackTraceString);
    }

    private final void i(boolean z2) {
        int Q2;
        if (H().W()) {
            Q2 = H().S();
        } else {
            Q2 = H().Q();
        }
        if (R() == 1 || !H().T()) {
            if (R() != 1 || !H().V()) {
                if (R() != 1 && !H().T() && Q2 == 3) {
                    H().a(z2, this.z);
                }
            } else if (Q2 == 1) {
                H().U();
            } else if (Q2 == 2) {
                H().U();
            } else if (Q2 == 3) {
                H().a(z2, this.z);
            }
        } else if (Q2 != 3) {
            H().a(Q2);
        } else {
            H().a(z2, this.z);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(com.bytedance.creativex.recorder.b.a.j jVar) {
        h.f.b.l.d(jVar, "");
        this.K.a(jVar);
    }

    public final void b(com.bytedance.creativex.recorder.b.a.w wVar) {
        com.ss.android.ugc.tools.c.f149151f.d("startRecordingAfterPrePlayStopped");
        L().onEvent(wVar);
        a(this.f132679c.t, true);
        H().a(new com.ss.android.ugc.aweme.tools.j(4));
        this.u.a(wVar);
        this.o.b(true);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void d(boolean z2) {
        a(u.a.f28209a);
        this.f132679c.f124713h.f();
        com.ss.android.ugc.aweme.tools.extract.o N2 = N();
        if (z2) {
            dt d2 = this.f132679c.d();
            h.f.b.l.b(d2, "");
            int size = d2.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.ss.android.ugc.asve.d a2 = com.ss.android.ugc.asve.a.a().a();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                h.f.b.l.b(stackTraceString, "");
                a2.c(stackTraceString);
                S().a(f.f132719a, (h.f.a.a<h.z>) null);
            }
            Workspace workspace = this.f132679c.f124713h;
            h.f.b.l.b(workspace, "");
            File e2 = workspace.e();
            h.f.b.l.b(e2, "");
            com.ss.android.ugc.tools.utils.i.a(new File(e2.getPath()));
            if (this.f132679c.f124706a != 1 && !this.f132679c.f124714i) {
                N2.e().removeFileAndResetData();
            }
        }
        this.f132679c.d().clear();
        this.f132679c.a(0);
        N2.b();
    }

    private final void f(com.bytedance.creativex.recorder.b.a.x xVar) {
        long endFrameTimeUS = S().getEndFrameTimeUS() / 1000;
        com.ss.android.ugc.tools.c.f149151f.a("handleEventRecordState,durationSDK:" + endFrameTimeUS + ",eventState:" + xVar.f28214a + ",reason:" + xVar.f28220g + ",lastRecordFrameNum:" + S().getLastRecordFrameNum() + ",enableNoLastRecordFrame:" + this.f132678b.p.invoke().booleanValue());
        if (xVar.f28214a == 1) {
            c(xVar);
            this.f132679c.f124710e = this.f132678b.f132700g.invoke(this.f132679c).intValue();
        } else if ((0 > endFrameTimeUS || 10 < endFrameTimeUS) && (S().getLastRecordFrameNum() > 0 || this.f132678b.p.invoke().booleanValue())) {
            b(com.bytedance.creativex.recorder.b.a.t.a(this.f132679c.d(), this.f132679c.h()));
            if (xVar.f28214a == 4) {
                this.f132680d.post(new p(this));
            } else if (xVar.f28214a == 2) {
                this.f132680d.post(new q(this));
            } else if (xVar.f28214a == 5) {
                this.f132680d.post(new r(this));
            } else if (xVar.f28214a == 7) {
                this.f132680d.post(new s(this));
            }
        } else if (xVar.f28214a == 5) {
            this.f132680d.post(new o(this));
        } else {
            c(xVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(com.bytedance.creativex.recorder.b.a.o oVar) {
        h.f.b.l.d(oVar, "");
        this.L.a(oVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void b(boolean z2) {
        I().b(Boolean.valueOf(z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
        if (r7 != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(long r10) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.w.g.d(long):boolean");
    }

    public final void e(com.bytedance.creativex.recorder.b.a.x xVar) {
        List<String> list;
        List<String> list2;
        SavePhotoStickerInfo savePhotoStickerInfo;
        h.f.b.l.d(xVar, "");
        if (H().T()) {
            H().a(0);
        }
        H().c(true);
        this.F.a(xVar);
        long endFrameTimeUS = S().getEndFrameTimeUS() / 1000;
        if (endFrameTimeUS >= 0) {
            dt d2 = this.f132679c.d();
            com.bytedance.creativex.recorder.b.a.s sVar = xVar.f28217d;
            if (sVar != null) {
                list = sVar.f28201a;
            } else {
                list = null;
            }
            com.bytedance.creativex.recorder.b.a.s sVar2 = xVar.f28217d;
            if (sVar2 != null) {
                list2 = sVar2.f28202b;
            } else {
                list2 = null;
            }
            com.bytedance.creativex.recorder.b.a.s sVar3 = xVar.f28217d;
            if (sVar3 != null) {
                savePhotoStickerInfo = sVar3.f28203c;
            } else {
                savePhotoStickerInfo = null;
            }
            long end = d2.end(endFrameTimeUS, null, list, list2, savePhotoStickerInfo, this.f132679c.r, H().H().f(), xVar.f28218e);
            Float value = H().p().getValue();
            if (value != null && (true ^ h.f.b.l.a((Object) value, (Object) Float.valueOf(-1.0f)))) {
                CameraComponentModel cameraComponentModel = this.f132679c;
                h.f.b.l.b(value, "");
                cameraComponentModel.A = value.floatValue();
            }
            com.ss.android.ugc.tools.c.f149151f.a("stopRecord: video: duration of this segment: ".concat(String.valueOf(end)));
            CameraComponentModel cameraComponentModel2 = this.f132679c;
            cameraComponentModel2.a(cameraComponentModel2.h() + end);
            com.ss.android.ugc.tools.c.f149151f.a("stopRecord: video: curShootingTotalTime: " + this.f132679c.h());
            if (end == -1) {
                try {
                    com.ss.android.ugc.tools.c.f149151f.c("deleteLastFrag for VE without changing segments for client.reason:" + xVar.f28220g + ",recordState:" + xVar.f28214a + ", segments: " + this.f132679c.d().toString());
                    S().a(l.f132725a, (h.f.a.a<h.z>) null);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.G.a(xVar);
                a(xVar);
            }
        } else {
            a(new g.c(endFrameTimeUS));
        }
        f(xVar);
        this.G.a(xVar);
        a(xVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(com.bytedance.creativex.recorder.b.a.t tVar) {
        h.f.b.l.d(tVar, "");
        b(tVar);
    }

    public final void a(com.bytedance.creativex.recorder.b.a.u uVar) {
        h.f.b.l.d(uVar, "");
        this.aq.onNext(uVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.m
    public final void a(com.bytedance.creativex.recorder.b.a.aa aaVar, boolean z2) {
        boolean z3;
        h.f.b.l.d(aaVar, "");
        com.bytedance.als.k<com.ss.android.ugc.aweme.tools.m> kVar = this.C;
        if (aaVar == com.bytedance.creativex.recorder.b.a.aa.FORM_60S) {
            z3 = true;
        } else {
            z3 = false;
        }
        kVar.a(new com.ss.android.ugc.aweme.tools.m(z3, z2));
    }

    public g(com.bytedance.o.f fVar, h.f.a.b<? super b, h.z> bVar) {
        h.f.b.l.d(fVar, "");
        this.aD = fVar;
        b bVar2 = new b();
        this.f132678b = bVar2;
        if (bVar != null) {
            bVar.invoke(bVar2);
        }
        this.q = com.bytedance.o.b.a.a(getDiContainer(), androidx.appcompat.app.d.class);
        this.r = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f132679c = H().e();
        this.f132680d = new SafeHandler(this);
        com.bytedance.als.k<h.z> kVar = new com.bytedance.als.k<>();
        this.s = kVar;
        com.bytedance.als.k<h.z> kVar2 = new com.bytedance.als.k<>();
        this.t = kVar2;
        com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.w> kVar3 = new com.bytedance.als.k<>();
        this.f132681e = kVar3;
        com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.w> kVar4 = new com.bytedance.als.k<>();
        this.u = kVar4;
        this.v = new com.bytedance.als.k<>();
        this.w = h.i.a((h.f.a.a) new u(this));
        com.bytedance.als.k<Long> kVar5 = new com.bytedance.als.k<>();
        this.x = kVar5;
        com.bytedance.als.k<h.z> kVar6 = new com.bytedance.als.k<>();
        this.y = kVar6;
        com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.y> kVar7 = new com.bytedance.als.k<>();
        this.z = kVar7;
        com.bytedance.als.k<h.z> kVar8 = new com.bytedance.als.k<>();
        this.A = kVar8;
        com.bytedance.als.k<h.z> kVar9 = new com.bytedance.als.k<>();
        this.B = kVar9;
        com.bytedance.als.k<com.ss.android.ugc.aweme.tools.m> kVar10 = new com.bytedance.als.k<>();
        this.C = kVar10;
        this.D = new com.bytedance.als.l<>(null);
        com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.x> kVar11 = new com.bytedance.als.k<>();
        this.E = kVar11;
        com.bytedance.a aVar = new com.bytedance.a();
        this.F = aVar;
        com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.x> kVar12 = new com.bytedance.als.k<>();
        this.G = kVar12;
        com.bytedance.als.k<h.z> kVar13 = new com.bytedance.als.k<>();
        this.f132682f = kVar13;
        com.bytedance.als.k<TimeSpeedModelExtension> kVar14 = new com.bytedance.als.k<>();
        this.H = kVar14;
        com.bytedance.als.k<h.z> kVar15 = new com.bytedance.als.k<>();
        this.I = kVar15;
        com.bytedance.als.k<h.z> kVar16 = new com.bytedance.als.k<>();
        this.J = kVar16;
        com.bytedance.a aVar2 = new com.bytedance.a();
        this.K = aVar2;
        com.bytedance.als.k<com.bytedance.creativex.recorder.b.a.o> kVar17 = new com.bytedance.als.k<>();
        this.L = kVar17;
        com.bytedance.als.l<Boolean> lVar = new com.bytedance.als.l<>(true);
        this.M = lVar;
        com.bytedance.als.l<Boolean> lVar2 = new com.bytedance.als.l<>(false);
        this.N = lVar2;
        com.bytedance.als.l<Boolean> lVar3 = new com.bytedance.als.l<>(false);
        this.O = lVar3;
        this.P = new com.bytedance.als.l<>(true);
        this.Q = new com.bytedance.als.k<>();
        this.R = new com.bytedance.als.k<>();
        this.S = new com.bytedance.als.k<>();
        com.bytedance.als.l<Boolean> lVar4 = new com.bytedance.als.l<>(false);
        this.T = lVar4;
        this.f132684h = new HashMap();
        this.f132685i = com.bytedance.creativex.recorder.b.a.p.class;
        this.U = true;
        this.V = true;
        this.f132687k = new f();
        this.W = h.i.a((h.f.a.a) new ab(this));
        this.X = h.i.a((h.f.a.a) new e(this));
        this.Y = h.i.a((h.f.a.a) new af(this));
        this.Z = h.i.a((h.f.a.a) new ag(this));
        this.aa = h.i.a((h.f.a.a) new i(this));
        this.ab = this;
        this.f132689m = t.f132734a;
        f.a.l.c<com.bytedance.creativex.recorder.b.a.g> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.ac = cVar;
        this.ad = kVar;
        this.ae = kVar2;
        this.af = kVar4;
        this.ag = kVar3;
        this.n = lVar;
        this.ah = lVar2;
        this.o = new com.bytedance.als.l<>(false);
        this.ai = lVar4;
        this.aj = lVar3;
        this.ak = h.i.a((h.f.a.a) new ad(this));
        this.al = kVar5;
        this.am = kVar6;
        this.an = kVar7;
        this.ao = kVar8;
        this.ap = kVar9;
        f.a.l.c<com.bytedance.creativex.recorder.b.a.u> cVar2 = new f.a.l.c<>();
        h.f.b.l.b(cVar2, "");
        this.aq = cVar2;
        this.ar = kVar10;
        this.as = kVar16;
        this.at = aVar2;
        this.au = kVar11;
        this.av = kVar17;
        this.aw = aVar;
        this.ax = kVar12;
        this.ay = kVar13;
        this.az = this.D;
        this.aA = kVar14;
        this.aB = this.v;
        this.aC = kVar15;
    }

    private static /* synthetic */ void a(g gVar, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        gVar.i(z2);
    }
}
