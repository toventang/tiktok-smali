package com.ss.android.ugc.asve.recorder;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.ugc.aweme.au;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.ax;
import h.f.a.r;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class VERecorderImpl implements d, au {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Integer, z> f62108a;

    /* renamed from: b  reason: collision with root package name */
    public r<? super Integer, ? super Integer, ? super String, ? super ax, z> f62109b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f62110c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.asve.context.h f62111d;

    /* renamed from: e  reason: collision with root package name */
    public final m f62112e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.asve.recorder.camera.c.a f62113f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f62114g = h.i.a((h.f.a.a) new i(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f62115h = h.i.a((h.f.a.a) new a(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f62116i = h.i.a((h.f.a.a) new c(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f62117j = h.i.a((h.f.a.a) new d(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f62118k = h.i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f62119l = h.i.a((h.f.a.a) new j(this));

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.asve.d.b f62120m;
    private final h.h n;
    private final h.h o;
    private final h.h p;

    /* access modifiers changed from: package-private */
    public static final class e implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        public static final e f62122a = new e();

        static {
            Covode.recordClassIndex(38178);
        }

        e() {
        }

        @Override // com.ss.android.vesdk.VEListener.j
        public final void a(int i2) {
        }
    }

    static {
        Covode.recordClassIndex(38171);
    }

    public final VECameraController a() {
        return (VECameraController) this.f62114g.getValue();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(Context context) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.a.a b() {
        return (com.ss.android.ugc.asve.recorder.a.a) this.f62115h.getValue();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.b.a d() {
        return (com.ss.android.ugc.asve.recorder.b.a) this.f62116i.getValue();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.effect.a e() {
        return (com.ss.android.ugc.asve.recorder.effect.a) this.f62117j.getValue();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.c.a f() {
        return (com.ss.android.ugc.asve.recorder.c.a) this.o.getValue();
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.recorder.reaction.a g() {
        return (com.ss.android.ugc.asve.recorder.reaction.a) this.p.getValue();
    }

    /* renamed from: i */
    public final VECameraController c() {
        return (VECameraController) this.f62118k.getValue();
    }

    public final ax j() {
        return (ax) this.f62119l.getValue();
    }

    public final CopyOnWriteArrayList<com.ss.android.medialib.listener.b> k() {
        return (CopyOnWriteArrayList) this.n.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            release();
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final com.ss.android.ugc.asve.d.a h() {
        return this.f62120m;
    }

    static final class b extends h.f.b.m implements h.f.a.a<VECameraController> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VECameraController invoke() {
            return this.this$0.a();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<CopyOnWriteArrayList<com.ss.android.medialib.listener.b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f62123a = new g();

        static {
            Covode.recordClassIndex(38180);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArrayList<com.ss.android.medialib.listener.b> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.a.c> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.a.c invoke() {
            return new com.ss.android.ugc.asve.recorder.a.c(this.this$0.j(), this.this$0.f62111d);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.b.b> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.b.b invoke() {
            return new com.ss.android.ugc.asve.recorder.b.b(this.this$0.j());
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        if (this.f62111d.h()) {
            b().b();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.effect.b> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.effect.b invoke() {
            return new com.ss.android.ugc.asve.recorder.effect.b(this.this$0.j(), this.this$0.f62111d.x());
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.c.b> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.c.b invoke() {
            return new com.ss.android.ugc.asve.recorder.c.b(this.this$0.j(), this.this$0.f62111d, this.this$0.a().p);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.reaction.b> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.reaction.b invoke() {
            ax j2 = this.this$0.j();
            Context context = this.this$0.f62110c;
            VERecorderImpl vERecorderImpl = this.this$0;
            return new com.ss.android.ugc.asve.recorder.reaction.b(j2, context, vERecorderImpl, vERecorderImpl.f62111d.f(), this.this$0.f62111d.m());
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void release() {
        com.ss.android.ugc.asve.b.f61927a.c("camera ON_DESTROY ");
        com.ss.android.ugc.asve.a.b bVar = c().f62175f;
        if (bVar != null) {
            bVar.q();
        }
        j().o();
    }

    static final class j extends h.f.b.m implements h.f.a.a<ax> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ax invoke() {
            l lVar = new l(this.this$0.f62111d.e());
            Context applicationContext = this.this$0.f62110c.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return new ax(lVar, applicationContext);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<VECameraController> {
        final /* synthetic */ VERecorderImpl this$0;

        static {
            Covode.recordClassIndex(38182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VERecorderImpl vERecorderImpl) {
            super(0);
            this.this$0 = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VECameraController invoke() {
            Context context = this.this$0.f62110c;
            m mVar = this.this$0.f62112e;
            ax j2 = this.this$0.j();
            VERecorderImpl vERecorderImpl = this.this$0;
            VECameraController vECameraController = new VECameraController(context, mVar, j2, vERecorderImpl, vERecorderImpl.f62111d.o(), this.this$0.f62113f, this.this$0.f62111d.v(), this.this$0.f62111d.z());
            vECameraController.s = this.this$0.f62111d.a();
            vECameraController.t = this.this$0.f62111d.b();
            if (this.this$0.f62111d.y()) {
                SparseIntArray sparseIntArray = new SparseIntArray(3);
                sparseIntArray.put(0, 2);
                sparseIntArray.put(2, 3);
                sparseIntArray.put(3, 0);
                l.d(sparseIntArray, "");
                vECameraController.F = sparseIntArray;
            }
            return vECameraController;
        }
    }

    public final void l() {
        if (this.f62111d.B()) {
            j().a(k.a(this.f62111d), k.a(), k.b(this.f62111d));
        } else {
            j().a(k.a(this.f62111d), k.a(), k.b(this.f62111d), c().r());
        }
        if (this.f62111d.w()) {
            j().a((Surface) null, e.f62122a);
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f62111d.h()) {
            com.ss.android.ugc.asve.context.h hVar = this.f62111d;
            l.d(this, "");
            l.d(hVar, "");
            if (hVar.k().invoke().booleanValue()) {
                j();
                b().a().a((com.ss.android.vesdk.audio.h) null);
            } else {
                b().a().a(com.ss.android.vesdk.audio.g.INSTANCE);
            }
            b().a("record");
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(com.ss.android.medialib.listener.b bVar) {
        l.d(bVar, "");
        k().add(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void b(com.ss.android.medialib.listener.b bVar) {
        l.d(bVar, "");
        k().remove(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(ax.j jVar) {
        j().a(jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(com.ss.android.vesdk.r rVar) {
        j().a(rVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(h.f.a.b<? super Integer, z> bVar) {
        l.d(bVar, "");
        this.f62108a = bVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(r<? super Integer, ? super Integer, ? super String, ? super ax, z> rVar) {
        l.d(rVar, "");
        this.f62109b = rVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.d
    public final void a(com.ss.android.vesdk.runtime.e eVar, String str) {
        l.d(eVar, "");
        l.d(str, "");
        j().a(eVar);
        e().d();
    }

    public VERecorderImpl(Context context, com.ss.android.ugc.asve.context.h hVar, m mVar, com.ss.android.ugc.asve.recorder.camera.c.a aVar) {
        l.d(context, "");
        l.d(hVar, "");
        this.f62110c = context;
        this.f62111d = hVar;
        this.f62112e = mVar;
        this.f62113f = aVar;
        this.f62120m = new com.ss.android.ugc.asve.d.b(j(), hVar);
        this.n = h.i.a((h.f.a.a) g.f62123a);
        com.ss.android.ugc.asve.f.g.a(new h.f.a.a<z>(this) {
            /* class com.ss.android.ugc.asve.recorder.VERecorderImpl.AnonymousClass1 */
            final /* synthetic */ VERecorderImpl this$0;

            static {
                Covode.recordClassIndex(38172);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                androidx.lifecycle.i lifecycle;
                m mVar = this.this$0.f62112e;
                if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                    lifecycle.a(this.this$0);
                }
                return z.f158842a;
            }
        });
        VEVolumeParam vEVolumeParam = new VEVolumeParam();
        hVar.n();
        vEVolumeParam.f150869b = 1.0f;
        vEVolumeParam.f150870c = hVar.n().a();
        j().a(vEVolumeParam);
        j().a(hVar.g());
        j().a(new VEListener.ah(this) {
            /* class com.ss.android.ugc.asve.recorder.VERecorderImpl.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VERecorderImpl f62121a;

            static {
                Covode.recordClassIndex(38173);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f62121a = r1;
            }

            @Override // com.ss.android.vesdk.VEListener.ai
            public final void a(int i2) {
                Iterator<T> it = this.f62121a.k().iterator();
                while (it.hasNext()) {
                    it.next().a(i2);
                }
                if (i2 == 0) {
                    this.f62121a.j().a(new com.ss.android.ugc.asve.a.a());
                }
            }

            @Override // com.ss.android.vesdk.VEListener.ai
            public final void a(boolean z) {
                for (T t : this.f62121a.k()) {
                    if (this.f62121a.f62111d.k().invoke().booleanValue()) {
                        t.a(!z ? 1 : 0, 1);
                    } else {
                        t.a(z ? 1 : 0, 1);
                    }
                }
            }

            @Override // com.ss.android.vesdk.VEListener.ah
            public final void a(int i2, String str) {
                l.d(str, "");
                h.f.a.b<? super Integer, z> bVar = this.f62121a.f62108a;
                if (bVar == null) {
                    l.a("runningErrorCallback");
                }
                bVar.invoke(Integer.valueOf(i2));
            }

            @Override // com.ss.android.vesdk.VEListener.ah
            public final void a(int i2, int i3, String str) {
                MethodCollector.i(10800);
                boolean z = false;
                if (i2 == 1000) {
                    VECameraController i4 = this.f62121a.c();
                    if (i4 != null) {
                        synchronized (i4.f62180k) {
                            try {
                                i4.f62181l = true;
                                if (i4.n) {
                                    i4.I.a(i4.o);
                                    com.ss.android.ugc.asve.a.b bVar = i4.f62175f;
                                    if (bVar != null) {
                                        bVar.e();
                                    }
                                    z = true;
                                }
                                i4.f62182m = z;
                            } catch (Throwable th) {
                                MethodCollector.o(10800);
                                throw th;
                            }
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                        MethodCollector.o(10800);
                        throw nullPointerException;
                    }
                } else if (i2 == 1001) {
                    VECameraController i5 = this.f62121a.c();
                    if (i5 != null) {
                        synchronized (i5.f62180k) {
                            try {
                                i5.f62181l = false;
                                if (i5.f62182m) {
                                    i5.I.k();
                                    i5.f62182m = false;
                                }
                            } catch (Throwable th2) {
                                MethodCollector.o(10800);
                                throw th2;
                            }
                        }
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                        MethodCollector.o(10800);
                        throw nullPointerException2;
                    }
                } else if (i2 == 1040) {
                    j.f62303a = Integer.valueOf(i3);
                } else if (i2 == 1041) {
                    j.f62304b = Integer.valueOf(i3);
                }
                r<? super Integer, ? super Integer, ? super String, ? super ax, z> rVar = this.f62121a.f62109b;
                if (rVar != null) {
                    rVar.a(Integer.valueOf(i2), Integer.valueOf(i3), str, this.f62121a.j());
                    MethodCollector.o(10800);
                    return;
                }
                MethodCollector.o(10800);
            }
        });
        j().f(hVar.h());
        l();
        this.o = h.i.a((h.f.a.a) new f(this));
        this.p = h.i.a((h.f.a.a) new h(this));
    }
}
