package com.ss.android.ugc.asve.recorder.camera;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.camera.b;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.asve.a.b;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.au;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.ac;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.p;
import h.f.a.q;
import h.f.b.l;
import h.n;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class VECameraController implements d, au {
    public static int K;
    public static final a L = new a((byte) 0);
    public int A;
    public final List<f> B;
    public ax.r C;
    q<? super Integer, ? super Integer, ? super String, z> D;
    public int E;
    public SparseIntArray F;
    public final Context G;
    public final m H;
    public final ax I;
    public final com.ss.android.ugc.asve.recorder.camera.c.a J;
    private final boolean M = true;
    private final int[] N = {720, 1280};
    private final h.h O;
    private boolean P;
    private int Q;
    private boolean R;
    private final com.ss.android.ugc.asve.recorder.d S;
    private final com.ss.android.ugc.asve.context.c T;
    private final boolean U;
    private final boolean V;

    /* renamed from: a  reason: collision with root package name */
    final CopyOnWriteArrayList<Object> f62170a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    final CopyOnWriteArrayList<b.a> f62171b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<com.ss.android.medialib.camera.a> f62172c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f62173d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.medialib.presenter.b f62174e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.asve.a.b f62175f;

    /* renamed from: g  reason: collision with root package name */
    final int f62176g = 720;

    /* renamed from: h  reason: collision with root package name */
    final int f62177h = 1280;

    /* renamed from: i  reason: collision with root package name */
    public boolean f62178i;

    /* renamed from: j  reason: collision with root package name */
    public int f62179j = -1;

    /* renamed from: k  reason: collision with root package name */
    public final Object f62180k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public boolean f62181l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f62182m;
    public boolean n;
    public final p o = new p();
    public VECameraSettings p;
    public float q;
    boolean r;
    public boolean s;
    public boolean t;
    final List<Integer> u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public int z;

    static final class e implements ax.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECameraController f62186a;

        static {
            Covode.recordClassIndex(38219);
        }

        e(VECameraController vECameraController) {
            this.f62186a = vECameraController;
        }
    }

    static {
        Covode.recordClassIndex(38213);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final com.ss.android.ugc.asve.recorder.camera.c.b e() {
        return (com.ss.android.ugc.asve.recorder.camera.c.b) this.O.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38215);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int a() {
        return this.f62179j;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int b() {
        return this.f62176g;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int c() {
        return this.f62177h;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean f() {
        return this.f62178i;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int g() {
        return this.E;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int i() {
        return K;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final float k() {
        return this.q;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final List<Integer> l() {
        return this.u;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(float[] fArr, double d2) {
        l.d(fArr, "");
        this.I.a(fArr, d2);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(ax.r rVar) {
        this.C = rVar;
        this.o.a(rVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_body_beauty", z2);
        this.o.a(bundle);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean a(int i2, int i3, float f2, float[] fArr) {
        l.d(fArr, "");
        if (fArr.length >= 2 && this.o.a(i2, i3, f2, (int) fArr[0], (int) fArr[1]) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean a(ac acVar) {
        l.d(acVar, "");
        return this.o.a(acVar) == 0;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(boolean z2, PrivacyCert privacyCert) {
        MethodCollector.i(11820);
        com.ss.android.ugc.asve.f.f.a("ACTION_NAME_CLOSE_CAMERA", "async: " + z2 + ", policyPlaceholder: " + privacyCert);
        synchronized (this.f62180k) {
            try {
                this.n = false;
                this.o.c();
                com.ss.android.ugc.asve.a.b bVar = this.f62175f;
                if (bVar != null) {
                    bVar.g();
                }
            } finally {
                MethodCollector.o(11820);
            }
        }
        this.o.a(z2, privacyCert);
        com.ss.android.ugc.asve.a.b bVar2 = this.f62175f;
        if (bVar2 != null) {
            bVar2.c();
        }
        this.o.a((VEListener.k) null);
        this.o.a((ax.k) null);
        this.o.a((ax.r) null);
        this.f62172c.clear();
        this.f62178i = false;
        this.f62179j = -1;
        if (b.f62211b) {
            b.f62210a = -1;
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f62173d = aVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(h.f.a.b<? super float[], z> bVar) {
        l.d(bVar, "");
        this.o.a(new g(bVar));
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean a(float f2) {
        float f3;
        if (!n()) {
            return false;
        }
        com.ss.android.ugc.asve.b.f61927a.d("ZOOM startZoom newZoom = " + f2 + ", currentZoom = " + this.w + ", shouldUseShaderZoom:" + h.a(this) + ", isFrontCamera:" + this.R);
        com.ss.android.ugc.asve.recorder.camera.c.b e2 = e();
        float f4 = this.q;
        d();
        float a2 = e2.a(f4);
        e();
        d();
        float max = Math.max(Math.min(this.q, f2), 0.0f);
        com.ss.android.ugc.asve.b.f61927a.d("ZOOM startZoom zoomUpperLimit:" + a2 + ", zoomBottomLimit:0.0, maxZoom:" + this.q + ", zoomTemp:" + max);
        if (max < 0.0f || max > a2) {
            return false;
        }
        if (!h.a(this) || !this.R) {
            f3 = max;
        } else {
            float f5 = this.q;
            f3 = ((max / f5) * (f5 - 1.0f)) + 1.0f;
        }
        d(f3);
        this.w = max;
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean a(float f2, float f3) {
        if (!n() || !o()) {
            return false;
        }
        if (h.b(this)) {
            return c(f3);
        }
        com.ss.android.ugc.asve.b.f61927a.c("ZOOM scaleCamera distanceDelta = ".concat(String.valueOf(f2)));
        return a(Math.max(0.0f, ((this.q / 1000.0f) * f2) + this.w));
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(VEBaseRecorderLensParams vEBaseRecorderLensParams, ax.q qVar) {
        l.d(vEBaseRecorderLensParams, "");
        l.d(qVar, "");
        this.I.a(vEBaseRecorderLensParams, qVar);
    }

    public final void a(q<? super Integer, ? super Integer, ? super String, z> qVar) {
        l.d(qVar, "");
        this.D = qVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(int[] iArr) {
        l.d(iArr, "");
        VECameraSettings.a aVar = new VECameraSettings.a(this.p);
        aVar.a(iArr);
        VECameraSettings vECameraSettings = aVar.f150749a;
        l.b(vECameraSettings, "");
        this.p = vECameraSettings;
    }

    public static final class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECameraController f62192a;

        static {
            Covode.recordClassIndex(38225);
        }

        @Override // com.ss.android.ugc.asve.a.b.a
        public final void a() {
            this.f62192a.o.l();
        }

        @Override // com.ss.android.ugc.asve.a.b.a
        public final void b() {
            this.f62192a.o.k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(VECameraController vECameraController) {
            this.f62192a = vECameraController;
        }
    }

    public static final class j implements ax.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECameraController f62193a;

        static {
            Covode.recordClassIndex(38226);
        }

        @Override // com.ss.android.vesdk.ax.k
        public final boolean a() {
            return this.f62193a.r;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ int $cameraType;
            final /* synthetic */ boolean $stopped;
            final /* synthetic */ float $zoomValue;
            final /* synthetic */ j this$0;

            static {
                Covode.recordClassIndex(38227);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar, float f2, int i2, boolean z) {
                super(0);
                this.this$0 = jVar;
                this.$zoomValue = f2;
                this.$cameraType = i2;
                this.$stopped = z;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f62193a.x = this.$zoomValue;
                Iterator<T> it = this.this$0.f62193a.B.iterator();
                while (it.hasNext()) {
                    it.next().a(this.$cameraType, this.$zoomValue, this.$stopped);
                }
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ int $cameraType;
            final /* synthetic */ float $maxZoom;
            final /* synthetic */ List $ratios;
            final /* synthetic */ boolean $supportSmooth;
            final /* synthetic */ boolean $supportZoom;
            final /* synthetic */ j this$0;

            static {
                Covode.recordClassIndex(38228);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(j jVar, float f2, List list, int i2, boolean z, boolean z2) {
                super(0);
                this.this$0 = jVar;
                this.$maxZoom = f2;
                this.$ratios = list;
                this.$cameraType = i2;
                this.$supportZoom = z;
                this.$supportSmooth = z2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                if (!c.f62254a || !h.b(this.this$0.f62193a)) {
                    this.this$0.f62193a.q = this.$maxZoom;
                } else {
                    VECameraController vECameraController = this.this$0.f62193a;
                    float f2 = this.$maxZoom;
                    if (f2 > 10.0f) {
                        f2 = 10.0f;
                    }
                    vECameraController.q = f2;
                }
                com.ss.android.ugc.asve.b.f61927a.d("ZOOM maxZoom:" + this.this$0.f62193a.q);
                this.this$0.f62193a.u.clear();
                List list = this.$ratios;
                if (list != null) {
                    this.this$0.f62193a.u.addAll(list);
                }
                Iterator<T> it = this.this$0.f62193a.B.iterator();
                while (it.hasNext()) {
                    it.next().a(this.$cameraType, this.$supportZoom, this.$supportSmooth, this.$maxZoom, this.$ratios);
                }
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(VECameraController vECameraController) {
            this.f62193a = vECameraController;
        }

        @Override // com.ss.android.vesdk.ax.k
        public final void a(int i2, float f2, boolean z) {
            boolean z2;
            VECameraController vECameraController = this.f62193a;
            if (f2 > 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            vECameraController.y = z2;
            com.ss.android.ugc.asve.f.g.a(new a(this, f2, i2, z));
        }

        @Override // com.ss.android.vesdk.ax.k
        public final void a(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
            com.ss.android.ugc.asve.f.g.a(new b(this, f2, list, i2, z, z2));
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int j() {
        return this.o.g();
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean p() {
        return this.o.j();
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final l.d q() {
        return this.o.i();
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ f $zoomListener;
        final /* synthetic */ VECameraController this$0;

        static {
            Covode.recordClassIndex(38224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VECameraController vECameraController, f fVar) {
            super(0);
            this.this$0 = vECameraController;
            this.$zoomListener = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.B.remove(this.$zoomListener);
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.camera.c.c> {
        final /* synthetic */ VECameraController this$0;

        static {
            Covode.recordClassIndex(38229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VECameraController vECameraController) {
            super(0);
            this.this$0 = vECameraController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.camera.c.c invoke() {
            Context context = this.this$0.G;
            VECameraController vECameraController = this.this$0;
            return new com.ss.android.ugc.asve.recorder.camera.c.c(context, vECameraController, vECameraController.J);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int d() {
        return this.p.f150740l.ordinal();
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int h() {
        return this.F.get(this.E);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final Bundle s() {
        Bundle a2 = this.o.a(this.G);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean n() {
        if (this.q != -1.0f && !this.u.isEmpty()) {
            return true;
        }
        return false;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f62178i || this.U) {
            a(this.T.f(), com.ss.android.ugc.asve.c.b.f61940c);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean r() {
        if (!this.t) {
            return false;
        }
        return this.o.b(this.G, this.p);
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ f $zoomListener;
        final /* synthetic */ VECameraController this$0;

        static {
            Covode.recordClassIndex(38216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VECameraController vECameraController, f fVar) {
            super(0);
            this.this$0 = vECameraController;
            this.$zoomListener = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.B.add(this.$zoomListener);
            if (this.this$0.q > 0.0f && this.this$0.f62179j > 0 && this.this$0.f62178i) {
                this.$zoomListener.a(this.this$0.f62179j, true, this.this$0.r, this.this$0.q, this.this$0.u);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void m() {
        com.ss.android.ugc.asve.b.f61927a.c("ZOOM [" + System.identityHashCode(this) + "] scaleEnd");
        this.v = 0.0f;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean o() {
        boolean z2;
        if (!n()) {
            return false;
        }
        if (this.P) {
            com.ss.android.ugc.asve.recorder.camera.c.b e2 = e();
            if (d() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (e2.b(z2)) {
                return false;
            }
        }
        return true;
    }

    public static final class g implements VEListener.k {

        /* renamed from: a  reason: collision with root package name */
        public int f62189a = -9999;

        /* renamed from: b  reason: collision with root package name */
        public String f62190b = "";

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VECameraController f62191c;

        static {
            Covode.recordClassIndex(38221);
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ int $cameraType;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(38222);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, int i2) {
                super(0);
                this.this$0 = gVar;
                this.$cameraType = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f62191c.f62178i = false;
                this.this$0.f62191c.f62179j = -1;
                if (b.f62211b) {
                    b.f62210a = -1;
                }
                this.this$0.f62191c.v = 0.0f;
                this.this$0.f62191c.w = 0.0f;
                com.ss.android.ugc.asve.a.b bVar = this.this$0.f62191c.f62175f;
                if (bVar != null) {
                    bVar.a(this.this$0.f62189a, this.this$0.f62190b);
                }
                Iterator<T> it = this.this$0.f62191c.f62172c.iterator();
                while (it.hasNext()) {
                    it.next().a(this.$cameraType, this.this$0.f62189a, this.this$0.f62190b);
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.vesdk.VEListener.l
        public final void a() {
            MethodCollector.i(10153);
            com.ss.android.ugc.asve.a.b bVar = this.f62191c.f62175f;
            if (bVar != null) {
                bVar.b();
            }
            VECameraController vECameraController = this.f62191c;
            com.ss.android.medialib.presenter.b bVar2 = vECameraController.f62174e;
            if (bVar2 != null) {
                bVar2.a(vECameraController.f62176g, vECameraController.f62177h);
            }
            synchronized (vECameraController.f62180k) {
                try {
                    vECameraController.n = true;
                    if (vECameraController.f62181l) {
                        if (vECameraController.f62182m) {
                            vECameraController.o.b();
                        } else {
                            vECameraController.f62182m = true;
                            vECameraController.I.a(vECameraController.o);
                            com.ss.android.ugc.asve.a.b bVar3 = vECameraController.f62175f;
                            if (bVar3 != null) {
                                bVar3.e();
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(10153);
                }
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ int $ext;
            final /* synthetic */ int $infoType;
            final /* synthetic */ String $msg;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(38223);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar, int i2, int i3, String str) {
                super(0);
                this.this$0 = gVar;
                this.$infoType = i2;
                this.$ext = i3;
                this.$msg = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                com.ss.android.ugc.asve.a.b bVar;
                VECameraController vECameraController = this.this$0.f62191c;
                int i2 = this.$infoType;
                int i3 = this.$ext;
                String str = this.$msg;
                if (i2 == 2) {
                    vECameraController.f62179j = i3;
                }
                q<? super Integer, ? super Integer, ? super String, z> qVar = vECameraController.D;
                if (qVar != null) {
                    qVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3), str);
                }
                if (i2 == 0) {
                    com.ss.android.ugc.asve.a.b bVar2 = vECameraController.f62175f;
                    if (bVar2 != null) {
                        bVar2.f();
                    }
                    Iterator<T> it = vECameraController.f62170a.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    vECameraController.o.a(new d(vECameraController));
                } else if (i2 == 2) {
                    vECameraController.f62178i = true;
                    vECameraController.v = 0.0f;
                    vECameraController.w = 0.0f;
                    if (b.f62211b) {
                        b.f62210a = i3;
                    }
                    if (h.a(vECameraController)) {
                        vECameraController.o.e();
                    }
                    vECameraController.o.b(h.b(vECameraController));
                    vECameraController.e().a(vECameraController.f62179j);
                    Iterator<T> it2 = vECameraController.f62172c.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(vECameraController.f62179j);
                    }
                    vECameraController.o.a(new e(vECameraController));
                } else if (i2 == 3) {
                    Iterator<T> it3 = vECameraController.f62171b.iterator();
                    while (it3.hasNext()) {
                        it3.next().a();
                    }
                } else if (i2 == 4) {
                    com.ss.android.ugc.asve.a.b bVar3 = vECameraController.f62175f;
                    if (bVar3 != null) {
                        bVar3.h();
                    }
                } else if (i2 == 5 && (bVar = vECameraController.f62175f) != null) {
                    bVar.d();
                }
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(VECameraController vECameraController) {
            this.f62191c = vECameraController;
        }

        @Override // com.ss.android.vesdk.VEListener.l
        public final void a(int i2) {
            com.ss.android.ugc.asve.f.g.a(new a(this, i2));
        }

        @Override // com.ss.android.vesdk.VEListener.k
        public final void a(int i2, String str) {
            com.ss.android.ugc.asve.a.b bVar;
            this.f62189a = i2;
            if (str != null) {
                this.f62190b = str;
            }
            if ((i2 == -417 || i2 == -416) && (bVar = this.f62191c.f62175f) != null) {
                if (str == null) {
                    str = "";
                }
                bVar.d(i2, str);
            }
        }

        @Override // com.ss.android.vesdk.VEListener.k
        public final void a(int i2, int i3, String str) {
            h.f.a.a<z> aVar;
            if (i2 == 5 && (aVar = this.f62191c.f62173d) != null) {
                aVar.invoke();
            }
            com.ss.android.ugc.asve.f.g.a(new b(this, i2, i3, str));
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void d(int i2) {
        K = i2;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void b(b.a aVar) {
        if (aVar != null) {
            this.f62171b.remove(aVar);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void c(int i2) {
        this.E = i2;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void e(int i2) {
        this.o.a(i2);
    }

    static final class d implements l.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECameraController f62185a;

        static {
            Covode.recordClassIndex(38218);
        }

        d(VECameraController vECameraController) {
            this.f62185a = vECameraController;
        }

        @Override // com.ss.android.ttvecamera.l.h
        public final void a(int[] iArr) {
            this.f62185a.A = iArr[0];
            this.f62185a.z = iArr[1];
        }
    }

    public static final class f implements com.ss.android.medialib.camera.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECameraController f62187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.medialib.camera.a f62188b;

        static {
            Covode.recordClassIndex(38220);
        }

        @Override // com.ss.android.medialib.camera.a
        public final void a(int i2) {
            com.ss.android.medialib.camera.a aVar = this.f62188b;
            if (aVar != null) {
                aVar.a(i2);
            }
            this.f62187a.b(this);
        }

        f(VECameraController vECameraController, com.ss.android.medialib.camera.a aVar) {
            this.f62187a = vECameraController;
            this.f62188b = aVar;
        }

        @Override // com.ss.android.medialib.camera.a
        public final void a(int i2, int i3, String str) {
            com.ss.android.medialib.camera.a aVar = this.f62188b;
            if (aVar != null) {
                aVar.a(i2, i3, str);
            }
            this.f62187a.b(this);
        }
    }

    private final boolean c(float f2) {
        if (!n()) {
            return false;
        }
        this.o.b(f2);
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("body_beauty_level", i2);
        this.o.a(bundle);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void b(PrivacyCert privacyCert) {
        a(this.T.f(), privacyCert);
    }

    public static final class c implements com.ss.android.medialib.camera.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECameraController f62183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.medialib.camera.a f62184b;

        static {
            Covode.recordClassIndex(38217);
        }

        @Override // com.ss.android.medialib.camera.a
        public final void a(int i2) {
            this.f62183a.b(this);
            this.f62183a.v = 0.0f;
            this.f62183a.w = 0.0f;
            com.ss.android.medialib.camera.a aVar = this.f62184b;
            if (aVar != null) {
                aVar.a(i2);
            }
        }

        c(VECameraController vECameraController, com.ss.android.medialib.camera.a aVar) {
            this.f62183a = vECameraController;
            this.f62184b = aVar;
        }

        @Override // com.ss.android.medialib.camera.a
        public final void a(int i2, int i3, String str) {
            this.f62183a.b(this);
            this.f62183a.v = 0.0f;
            this.f62183a.w = 0.0f;
            com.ss.android.medialib.camera.a aVar = this.f62184b;
            if (aVar != null) {
                aVar.a(i2, i3, str);
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final int a(PrivacyCert privacyCert) {
        int i2 = 1;
        if (d() == 1) {
            i2 = e().b();
        } else {
            e();
        }
        b(i2, null, privacyCert);
        return i2;
    }

    public final void b(com.ss.android.medialib.camera.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f62172c.remove(aVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void c(PrivacyCert privacyCert) {
        this.o.b(privacyCert);
    }

    private final void d(float f2) {
        if (!h.a(this) || !this.R) {
            com.ss.android.ugc.asve.b.f61927a.d("ZOOM veStartZoom zoom:".concat(String.valueOf(f2)));
            this.o.a(f2);
            return;
        }
        com.ss.android.ugc.asve.b.f61927a.d("ZOOM veStartShaderZoom zoom:".concat(String.valueOf(f2)));
        this.I.a(f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(com.ss.android.medialib.camera.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f62172c.add(aVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void b(f fVar) {
        h.f.b.l.d(fVar, "");
        com.ss.android.ugc.asve.f.g.a(new h(this, fVar));
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void b(int i2) {
        VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode;
        com.ss.android.ugc.asve.a.b bVar;
        com.ss.android.ugc.asve.b.f61927a.c("Flash:switchFlashMode,mode:".concat(String.valueOf(i2)));
        if (i2 == 0) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF;
        } else if (i2 == 1) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON;
        } else if (i2 == 2) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH;
        } else if (i2 == 3) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO;
        } else if (i2 == 4) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE;
        } else {
            throw new IllegalStateException();
        }
        if (camera_flash_mode != VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            this.o.a(camera_flash_mode);
        } else {
            this.o.a(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF);
        }
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            com.ss.android.ugc.asve.a.b bVar2 = this.f62175f;
            if (bVar2 != null) {
                bVar2.o();
            }
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF && (bVar = this.f62175f) != null) {
            bVar.p();
        }
        this.E = i2;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(b.a aVar) {
        if (aVar != null) {
            this.f62171b.add(aVar);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(com.ss.android.medialib.presenter.b bVar) {
        this.f62174e = bVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void b(boolean z2) {
        VECameraSettings.a aVar = new VECameraSettings.a(this.p);
        aVar.a(z2);
        aVar.a(this.T.e());
        VECameraSettings vECameraSettings = aVar.f150749a;
        h.f.b.l.b(vECameraSettings, "");
        this.p = vECameraSettings;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final boolean b(float f2) {
        if (!n() || !o()) {
            return false;
        }
        if (h.b(this)) {
            float f3 = this.q - 1.0f;
            if (this.x <= 0.0f) {
                this.x = 1.0f;
            }
            if (f2 <= 0.0f) {
                return false;
            }
            float f4 = (((f2 - this.v) * f3) / this.x) + 1.0f;
            this.v = f2;
            com.ss.android.ugc.asve.b.f61927a.c("ZOOM scaleCamera factor = ".concat(String.valueOf(f4)));
            com.ss.android.ugc.asve.b.f61927a.c("ZOOM scaleCamera zoomV2CurrentZoom = " + this.x);
            float f5 = this.x;
            if (f5 * f4 >= this.q || (!this.y && f4 <= 1.0f)) {
                return false;
            }
            this.x = f5 * f4;
            return c(f4);
        }
        com.ss.android.ugc.asve.b.f61927a.c("ZOOM [" + System.identityHashCode(this) + "] scaleCameraByRatio ratio = " + f2);
        if (((double) f2) <= 0.05d) {
            f2 /= 4.0f;
        }
        float max = Math.max(0.0f, ((f2 - this.v) * this.q) + this.w);
        this.v = f2;
        return a(max);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(com.ss.android.ugc.asve.a.b bVar) {
        this.f62175f = bVar;
        if (bVar != null) {
            bVar.a(new i(this));
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(f fVar) {
        h.f.b.l.d(fVar, "");
        com.ss.android.ugc.asve.f.g.a(new b(this, fVar));
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(l.a aVar, PrivacyCert privacyCert) {
        this.o.a(aVar, privacyCert);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(float f2, float f3, float f4) {
        this.I.a(f2, f3, f4);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void a(int i2, com.ss.android.medialib.camera.a aVar, PrivacyCert privacyCert) {
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        this.R = z2;
        this.p.f150740l = i.a(i2);
        if (c.f62254a && h.b(this)) {
            VECameraSettings.a aVar2 = new VECameraSettings.a(this.p);
            aVar2.b();
            com.ss.android.ugc.asve.b.f61927a.c("ZOOM enableMaxZoomOptimized");
            VECameraSettings vECameraSettings = aVar2.f150749a;
            h.f.b.l.b(vECameraSettings, "");
            this.p = vECameraSettings;
        }
        p pVar = this.o;
        Context applicationContext = this.G.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        pVar.a(applicationContext, this.p);
        a(new f(this, aVar));
        this.o.a(new j(this));
        this.o.a(new g(this));
        this.o.a(privacyCert);
        com.ss.android.ugc.asve.a.b bVar = this.f62175f;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.d
    public final void b(int i2, com.ss.android.medialib.camera.a aVar, PrivacyCert privacyCert) {
        if (h.a(this) && this.R) {
            d(1.0f);
        }
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        this.R = z2;
        a(new c(this, aVar));
        VECameraSettings.a aVar2 = new VECameraSettings.a(this.p);
        aVar2.a(i.a(i2));
        aVar2.a(this.T.e());
        VECameraSettings vECameraSettings = aVar2.f150749a;
        h.f.b.l.b(vECameraSettings, "");
        this.p = vECameraSettings;
        this.o.a(vECameraSettings, privacyCert);
    }

    public VECameraController(Context context, m mVar, ax axVar, com.ss.android.ugc.asve.recorder.d dVar, com.ss.android.ugc.asve.context.c cVar, com.ss.android.ugc.asve.recorder.camera.c.a aVar, boolean z2, boolean z3) {
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        VECameraSettings.CAMERA_OUTPUT_MODE camera_output_mode;
        h.f.b.l.d(context, "");
        h.f.b.l.d(axVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(cVar, "");
        this.G = context;
        this.H = mVar;
        this.I = axVar;
        this.S = dVar;
        this.T = cVar;
        this.J = aVar;
        this.U = z2;
        this.V = z3;
        h.f.b.l.d(cVar, "");
        VECameraSettings.a aVar2 = new VECameraSettings.a();
        if (!b.f62211b) {
            aVar2.a(cVar.b());
            aVar2.b(cVar.c());
        } else {
            aVar2.a();
        }
        com.ss.android.ugc.asve.b.c a2 = cVar.a();
        h.f.b.l.d(a2, "");
        int i2 = com.ss.android.ugc.asve.b.e.f61932a[a2.ordinal()];
        if (i2 == 1) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        } else if (i2 == 2) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        } else if (i2 == 3) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
        } else {
            throw new n();
        }
        aVar2.a(camera_facing_id);
        aVar2.a(cVar.d());
        if (cVar.k()) {
            camera_output_mode = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        } else {
            com.ss.android.ugc.asve.a.a();
            camera_output_mode = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        }
        aVar2.a(camera_output_mode);
        aVar2.a(cVar.e());
        aVar2.b(cVar.h());
        PreviewSize n2 = com.ss.android.ugc.asve.a.a().n();
        if (n2 != null) {
            aVar2.a(n2.getWidth(), n2.getHeight());
        }
        VECameraSettings vECameraSettings = aVar2.f150749a;
        vECameraSettings.D = cVar.m();
        h.f.b.l.b(vECameraSettings, "");
        this.p = vECameraSettings;
        this.q = -1.0f;
        this.O = h.i.a((h.f.a.a) new k(this));
        this.P = true;
        this.u = new ArrayList();
        this.x = 1.0f;
        this.y = true;
        this.Q = -1;
        this.z = -1;
        this.A = 1;
        this.B = new ArrayList();
        com.ss.android.ugc.asve.f.g.a(new h.f.a.a<z>(this) {
            /* class com.ss.android.ugc.asve.recorder.camera.VECameraController.AnonymousClass1 */
            final /* synthetic */ VECameraController this$0;

            static {
                Covode.recordClassIndex(38214);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                androidx.lifecycle.i lifecycle;
                m mVar = this.this$0.H;
                if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                    lifecycle.a(this.this$0);
                }
                return z.f158842a;
            }
        });
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.F = sparseIntArray;
    }
}
