package com.ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.ugc.asve.recorder.a;
import com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.p;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.libsdl.app.AudioRecorderInterface;

public final class ASCameraView extends FrameLayout {
    private String A;

    /* renamed from: a  reason: collision with root package name */
    public androidx.lifecycle.m f62342a;

    /* renamed from: b  reason: collision with root package name */
    public TextureView f62343b;

    /* renamed from: c  reason: collision with root package name */
    public View f62344c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.asve.recorder.a f62345d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArrayList<r<Integer, Integer, String, ax, z>> f62346e;

    /* renamed from: f  reason: collision with root package name */
    public final r<Integer, Integer, String, ax, z> f62347f;

    /* renamed from: g  reason: collision with root package name */
    private SurfaceView f62348g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Boolean f62349h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f62350i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f62351j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f62352k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f62353l;

    /* renamed from: m  reason: collision with root package name */
    private final a.b f62354m;
    private final h.h n;
    private final h.h o;
    private final com.ss.android.ugc.asve.recorder.b p;
    private boolean q;
    private volatile boolean r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private final h.h v;
    private final h.h w;
    private Runnable x;
    private String y;
    private String z;

    public static final class f implements ax.q {
        static {
            Covode.recordClassIndex(38310);
        }

        @Override // com.ss.android.vesdk.ax.q
        public final void a(int i2, float f2, int i3) {
        }
    }

    public static final class o implements com.ss.android.ugc.asve.context.h {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.asve.context.c f62360a;

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.asve.context.g f62361b;

        /* renamed from: c  reason: collision with root package name */
        public final a f62362c = new a(this);

        /* renamed from: d  reason: collision with root package name */
        public final b f62363d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ASCameraView f62364e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.context.h f62365f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f62366g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f62367h;

        /* renamed from: i  reason: collision with root package name */
        private final /* synthetic */ com.ss.android.ugc.asve.context.h f62368i;

        static {
            Covode.recordClassIndex(38321);
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean A() {
            return this.f62368i.A();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean B() {
            return this.f62368i.B();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean a() {
            return this.f62368i.a();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean c() {
            return this.f62368i.c();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final SurfaceHolder d() {
            return this.f62368i.d();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final com.ss.android.ugc.asve.recorder.e e() {
            return this.f62368i.e();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final p<Integer, Integer> f() {
            return this.f62368i.f();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean g() {
            return this.f62368i.g();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean i() {
            return this.f62368i.i();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean j() {
            return this.f62368i.j();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final h.f.a.a<Boolean> k() {
            return this.f62368i.k();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final com.ss.android.ugc.asve.context.f l() {
            return this.f62368i.l();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final com.ss.android.ugc.asve.context.d n() {
            return this.f62368i.n();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean p() {
            return this.f62368i.p();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean q() {
            return this.f62368i.q();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean r() {
            return this.f62368i.r();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final long s() {
            return this.f62368i.s();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean t() {
            return this.f62368i.t();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final int u() {
            return this.f62368i.u();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean v() {
            return this.f62368i.v();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean w() {
            return this.f62368i.w();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean x() {
            return this.f62368i.x();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean y() {
            return this.f62368i.y();
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean z() {
            return this.f62368i.z();
        }

        public static final class a implements com.ss.android.ugc.asve.context.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f62369a;

            /* renamed from: b  reason: collision with root package name */
            private final int f62370b;

            /* renamed from: c  reason: collision with root package name */
            private final /* synthetic */ com.ss.android.ugc.asve.context.c f62371c;

            static {
                Covode.recordClassIndex(38322);
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final com.ss.android.ugc.asve.b.c a() {
                return this.f62371c.a();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final VECameraSettings.CAMERA_TYPE b() {
                return this.f62371c.b();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean c() {
                return this.f62371c.c();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final byte d() {
                return this.f62371c.d();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int e() {
                return this.f62371c.e();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean f() {
                return this.f62371c.f();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int h() {
                return this.f62371c.h();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int[] j() {
                return this.f62371c.j();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean k() {
                return this.f62371c.k();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final VEDisplaySettings l() {
                return this.f62371c.l();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean m() {
                return this.f62371c.m();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean n() {
                return this.f62371c.n();
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int i() {
                return this.f62370b;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(o oVar) {
                int i2;
                this.f62369a = oVar;
                this.f62371c = oVar.f62360a;
                if (oVar.f62360a.i() != 0) {
                    i2 = oVar.f62360a.i();
                } else {
                    i2 = oVar.f62364e.getAttrsHelper().f62376a;
                }
                this.f62370b = i2;
            }
        }

        public static final class b implements com.ss.android.ugc.asve.context.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f62372a;

            /* renamed from: b  reason: collision with root package name */
            private final int f62373b;

            /* renamed from: c  reason: collision with root package name */
            private final int f62374c;

            /* renamed from: d  reason: collision with root package name */
            private final /* synthetic */ com.ss.android.ugc.asve.context.g f62375d;

            static {
                Covode.recordClassIndex(38323);
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final String a() {
                return this.f62375d.a();
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final String b() {
                return this.f62375d.b();
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final float c() {
                return this.f62375d.c();
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final boolean d() {
                return this.f62375d.d();
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final int g() {
                return this.f62375d.g();
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final int e() {
                return this.f62373b;
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final int f() {
                return this.f62374c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(o oVar) {
                int i2;
                int i3;
                this.f62372a = oVar;
                this.f62375d = oVar.f62361b;
                if (oVar.f62361b.e() != 0) {
                    i2 = oVar.f62361b.e();
                } else {
                    i2 = oVar.f62364e.getAttrsHelper().f62377b;
                }
                this.f62373b = i2;
                if (oVar.f62361b.f() != 0) {
                    i3 = oVar.f62361b.f();
                } else {
                    i3 = oVar.f62364e.getAttrsHelper().f62378c;
                }
                this.f62374c = i3;
            }
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean b() {
            return this.f62366g;
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final boolean h() {
            return this.f62367h;
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.asve.context.g m() {
            return this.f62363d;
        }

        @Override // com.ss.android.ugc.asve.context.h
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.asve.context.c o() {
            return this.f62362c;
        }

        public o(ASCameraView aSCameraView, com.ss.android.ugc.asve.context.h hVar) {
            this.f62364e = aSCameraView;
            this.f62365f = hVar;
            this.f62368i = hVar;
            this.f62360a = hVar.o();
            this.f62361b = hVar.m();
            this.f62366g = hVar.b();
            this.f62367h = hVar.h();
            this.f62363d = new b(this);
        }
    }

    static {
        Covode.recordClassIndex(38304);
    }

    public ASCameraView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public ASCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final com.ss.android.ugc.asve.recorder.h getOnRecordInfoListenerDispatcher() {
        return (com.ss.android.ugc.asve.recorder.h) this.v.getValue();
    }

    public final a getAttrsHelper() {
        return (a) this.n.getValue();
    }

    public final com.ss.android.ugc.asve.recorder.a.a getAudioController() {
        return (com.ss.android.ugc.asve.recorder.a.a) this.f62353l.getValue();
    }

    public final com.ss.android.ugc.asve.recorder.camera.d getCameraController() {
        return (com.ss.android.ugc.asve.recorder.camera.d) this.f62351j.getValue();
    }

    public final com.ss.android.ugc.asve.recorder.camera.b.b getCameraViewHelper$lib_asve_release() {
        return (com.ss.android.ugc.asve.recorder.camera.b.b) this.s.getValue();
    }

    public final com.ss.android.ugc.asve.recorder.effect.a getEffectController() {
        return (com.ss.android.ugc.asve.recorder.effect.a) this.f62350i.getValue();
    }

    public final g getGestureDispatcher() {
        return (g) this.w.getValue();
    }

    public final com.ss.android.ugc.asve.recorder.c.a getMediaController() {
        return (com.ss.android.ugc.asve.recorder.c.a) this.f62352k.getValue();
    }

    public final com.ss.android.ugc.asve.recorder.f getOnFrameAvailableListenerDispatcher() {
        return (com.ss.android.ugc.asve.recorder.f) this.u.getValue();
    }

    public final com.ss.android.ugc.asve.recorder.reaction.a.b getReactionViewHelper$lib_asve_release() {
        return (com.ss.android.ugc.asve.recorder.reaction.a.b) this.t.getValue();
    }

    public final b getTouchHelper() {
        return (b) this.o.getValue();
    }

    public final String getBeautyFaceRes() {
        return this.y;
    }

    public final Runnable getDataSourceVideoCompleteListener() {
        return this.x;
    }

    public final String getFaceMakeUpRes() {
        return this.A;
    }

    public final a.b getMode() {
        return this.f62354m;
    }

    public final String getReshapeRes() {
        return this.z;
    }

    public final void a(boolean z2) {
        getTouchHelper().a(z2);
    }

    public final void a(com.ss.android.vesdk.runtime.e eVar, String str) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(str, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.a(eVar, str);
    }

    public final void a(r<? super Integer, ? super Integer, ? super String, ? super ax, z> rVar) {
        h.f.b.l.d(rVar, "");
        this.f62346e.add(rVar);
    }

    public final void a(com.ss.android.medialib.listener.b bVar) {
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.a(bVar);
    }

    public final void a(com.ss.android.ugc.asve.recorder.g gVar) {
        MethodCollector.i(11483);
        h.f.b.l.d(gVar, "");
        com.ss.android.ugc.asve.recorder.f onFrameAvailableListenerDispatcher = getOnFrameAvailableListenerDispatcher();
        h.f.b.l.d(gVar, "");
        synchronized (onFrameAvailableListenerDispatcher) {
            try {
                if (onFrameAvailableListenerDispatcher.f62298a.contains(gVar)) {
                    onFrameAvailableListenerDispatcher.f62298a.remove(gVar);
                    if (onFrameAvailableListenerDispatcher.f62298a.isEmpty()) {
                        if (onFrameAvailableListenerDispatcher.f62300c) {
                            onFrameAvailableListenerDispatcher.f62299b.c().b(onFrameAvailableListenerDispatcher);
                        } else {
                            onFrameAvailableListenerDispatcher.f62299b.a((ax.j) null);
                        }
                    }
                    MethodCollector.o(11483);
                }
            } finally {
                MethodCollector.o(11483);
            }
        }
    }

    public final void a(com.ss.android.ugc.asve.recorder.i iVar) {
        h.f.b.l.d(iVar, "");
        com.ss.android.ugc.asve.recorder.h onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        h.f.b.l.d(iVar, "");
        if (onRecordInfoListenerDispatcher.f62301a.isEmpty()) {
            onRecordInfoListenerDispatcher.f62302b.a(onRecordInfoListenerDispatcher);
        }
        onRecordInfoListenerDispatcher.f62301a.add(iVar);
    }

    public final void a(int i2, com.ss.android.medialib.camera.a aVar, PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.recorder.a aVar2 = this.f62345d;
        if (aVar2 == null) {
            h.f.b.l.a("recorder");
        }
        aVar2.c().a(i2, aVar, privacyCert);
    }

    public final void a(com.ss.android.ugc.asve.recorder.camera.f fVar) {
        h.f.b.l.d(fVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().a(fVar);
    }

    public final void a(PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().a(privacyCert);
    }

    public final void a(Surface surface, String str, h.f.a.b<? super Integer, z> bVar) {
        h.f.b.l.d(surface, "");
        h.f.b.l.d(str, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().b(surface, str, bVar);
    }

    public final void a(boolean z2, h.f.a.b<? super Integer, z> bVar) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(z2, bVar);
    }

    public final void a(Surface surface) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(surface);
    }

    public final void a(String str, long j2, long j3, boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(str, j2, j3, z2);
    }

    public final void a(String str, double d2, h.f.a.b<? super Integer, z> bVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(str, d2, bVar);
    }

    public final void a(h.f.a.b<? super Integer, z> bVar) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(bVar);
    }

    public final void a(h.f.a.b<? super Integer, z> bVar, h.f.a.a<z> aVar) {
        com.ss.android.ugc.asve.recorder.a aVar2 = this.f62345d;
        if (aVar2 == null) {
            h.f.b.l.a("recorder");
        }
        aVar2.f().a(bVar, aVar);
    }

    public final void a(boolean z2, PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        if (!aVar.f62129d.k().invoke().booleanValue()) {
            Boolean bool = this.f62349h;
            this.f62349h = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        }
        if (!h.f.b.l.a(Boolean.valueOf(z2), this.f62349h)) {
            this.f62349h = Boolean.valueOf(z2);
            com.ss.android.ugc.asve.recorder.a aVar2 = this.f62345d;
            if (aVar2 == null) {
                h.f.b.l.a("recorder");
            }
            aVar2.f().a(z2, privacyCert);
        }
    }

    public final void a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        h.f.b.l.d(onARTextContentCallback, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().a(onARTextContentCallback);
    }

    static final class a extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(38305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.$context);
        }
    }

    public final int getFPS() {
        return this.p.f62149a;
    }

    public final boolean getIsExposureSeekBarShowing() {
        return getCameraViewHelper$lib_asve_release().f62222b;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        k();
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.a.a> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.a.a invoke() {
            return ASCameraView.a(this.this$0).b();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e(ASCameraView.a(this.this$0).c());
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f(ASCameraView.a(this.this$0).e());
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return this.this$0.getTouchHelper().f62380a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<h> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h(ASCameraView.a(this.this$0).f());
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.h> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.h invoke() {
            return new com.ss.android.ugc.asve.recorder.h(ASCameraView.a(this.this$0));
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ASCameraView aSCameraView, Context context) {
            super(0);
            this.this$0 = aSCameraView;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            Context context = this.$context;
            ASCameraView aSCameraView = this.this$0;
            return new b(context, aSCameraView, ASCameraView.a(aSCameraView));
        }
    }

    public final void b() {
        com.ss.android.ugc.asve.recorder.h onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        onRecordInfoListenerDispatcher.f62301a.clear();
        onRecordInfoListenerDispatcher.f62302b.a((com.ss.android.vesdk.r) null);
    }

    public final void c() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c();
    }

    public final l.d getCameraECInfo() {
        return getCameraController().q();
    }

    public final androidx.lifecycle.m getLifecycleOwner() {
        androidx.lifecycle.m mVar = this.f62342a;
        if (mVar == null) {
            h.f.b.l.a("lifecycleOwner");
        }
        return mVar;
    }

    public final View getPresentView() {
        View view = this.f62344c;
        if (view == null) {
            h.f.b.l.a("presentView");
        }
        return view;
    }

    public final void j() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f();
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.camera.b.b> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ASCameraView aSCameraView, Context context) {
            super(0);
            this.this$0 = aSCameraView;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.camera.b.b invoke() {
            Context context = this.$context;
            ASCameraView aSCameraView = this.this$0;
            return new com.ss.android.ugc.asve.recorder.camera.b.b(context, aSCameraView, ASCameraView.a(aSCameraView).f62129d.o());
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.reaction.a.b> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.reaction.a.b invoke() {
            ASCameraView aSCameraView = this.this$0;
            return new com.ss.android.ugc.asve.recorder.reaction.a.b(aSCameraView, aSCameraView.getPresentView(), ASCameraView.a(this.this$0).g());
        }
    }

    public final void g() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().g();
    }

    public final int getBackCameraPos() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().e().b();
    }

    public final int getCameraPosition() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().d();
    }

    public final int getCameraPreviewHeight() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().c();
    }

    public final int getCameraPreviewWidth() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().b();
    }

    public final List<Integer> getCameraZoomList() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().l();
    }

    public final int getCurrentCameraType() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().a();
    }

    public final long getEndFrameTimeUS() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return Math.max(aVar.f().d(), 0L);
    }

    public final boolean getExposureCompensationEnable() {
        if (!this.q || getCameraECInfo() == null || !getCameraController().p()) {
            return false;
        }
        return true;
    }

    public final int getFlashMode() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().g();
    }

    public final int getFrontCameraPos() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().e();
        return 1;
    }

    public final VEMapBufferInfo getIntermediatePathFromEffect() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.f().v();
    }

    public final int getLastFlashMode() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().i();
    }

    public final int getLastRecordFrameNum() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.f().b();
    }

    public final float getMaxCameraZoom() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().k();
    }

    public final int getNextFlashMode() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().h();
    }

    public final int[] getReactionCameraPosInViewPixel() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.g().c();
    }

    public final int[] getReactionPosMarginInViewPixel() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.g().b();
    }

    public final ReactionWindowInfo getReactionWindowInfo() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.g().e();
    }

    public final com.ss.android.ugc.asve.recorder.a getRecorder() {
        if (this.f62345d == null) {
            return null;
        }
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar != null) {
            return aVar;
        }
        h.f.b.l.a("recorder");
        return aVar;
    }

    public final long getSegmentAudioLength() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.f().f();
    }

    public final void h() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().b((VEListener.j) null);
    }

    public final boolean i() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.f().e();
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.recorder.f> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ASCameraView aSCameraView) {
            super(0);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.f invoke() {
            boolean z;
            com.ss.android.ugc.asve.recorder.a a2 = ASCameraView.a(this.this$0);
            if (!ASCameraView.a(this.this$0).f62129d.k().invoke().booleanValue() || !ASCameraView.a(this.this$0).f62129d.o().n()) {
                z = false;
            } else {
                z = true;
            }
            return new com.ss.android.ugc.asve.recorder.f(a2, z);
        }
    }

    public final boolean e() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().a(0.0f);
    }

    public final boolean f() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().f();
    }

    public final float[] getSuggestVolume() {
        if (this.f62345d == null) {
            return new float[]{1.0f, 1.0f};
        }
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.f().s();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
        View view = this.f62343b;
        if (view == null) {
            if (this.f62348g != null) {
                view = this.f62348g;
                if (view == null) {
                    throw new IllegalStateException("no present view!");
                }
            } else {
                throw new IllegalStateException("ASCameraView must contain one SurfaceView or TextureView at least!".toString());
            }
        }
        this.f62344c = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k() {
        /*
            r6 = this;
            android.view.TextureView r0 = r6.f62343b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r6.getChildCount()
            r5 = 0
            r4 = 0
            if (r0 <= 0) goto L_0x0026
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x0012:
            if (r2 >= r3) goto L_0x0026
            android.view.View r1 = r6.getChildAt(r2)
            boolean r0 = r1 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x0023
        L_0x001c:
            android.view.TextureView r1 = (android.view.TextureView) r1
            r6.f62343b = r1
            if (r1 == 0) goto L_0x0028
            return
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0026:
            r1 = r4
            goto L_0x001c
        L_0x0028:
            android.view.SurfaceView r0 = r6.f62348g
            if (r0 == 0) goto L_0x002d
            return
        L_0x002d:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L_0x0042
            int r2 = r6.getChildCount()
        L_0x0037:
            if (r5 >= r2) goto L_0x0042
            android.view.View r1 = r6.getChildAt(r5)
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x0047
            r4 = r1
        L_0x0042:
            android.view.SurfaceView r4 = (android.view.SurfaceView) r4
            r6.f62348g = r4
            return
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.recorder.view.ASCameraView.k():void");
    }

    public final boolean d() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().n();
    }

    public final com.ss.android.ugc.asve.recorder.a a() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar;
    }

    public final void setExposureCompensationEnable(boolean z2) {
        this.q = z2;
    }

    public static final class h implements TextureView.SurfaceTextureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextureView.SurfaceTextureListener f62355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.recorder.a f62356b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.context.h f62357c;

        static {
            Covode.recordClassIndex(38312);
        }

        static final class a extends h.f.b.m implements h.f.a.b<Integer, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f62358a = new a();

            static {
                Covode.recordClassIndex(38313);
            }

            a() {
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

        static final class b extends h.f.b.m implements h.f.a.b<Integer, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f62359a = new b();

            static {
                Covode.recordClassIndex(38314);
            }

            b() {
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

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            h.f.b.l.d(surfaceTexture, "");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f62355a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            h.f.b.l.d(surfaceTexture, "");
            this.f62356b.f().a(this.f62357c.o().f(), b.f62359a);
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f62355a;
            if (surfaceTextureListener != null) {
                return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
            return true;
        }

        public h(TextureView.SurfaceTextureListener surfaceTextureListener, com.ss.android.ugc.asve.recorder.a aVar, com.ss.android.ugc.asve.context.h hVar) {
            this.f62355a = surfaceTextureListener;
            this.f62356b = aVar;
            this.f62357c = hVar;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            h.f.b.l.d(surfaceTexture, "");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f62355a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
            }
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            h.f.b.l.d(surfaceTexture, "");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f62355a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i2, i3);
            }
            Surface surface = new Surface(surfaceTexture);
            com.ss.android.ugc.asve.recorder.c.a f2 = this.f62356b.f();
            String str = Build.DEVICE;
            h.f.b.l.b(str, "");
            f2.a(surface, str, a.f62358a);
        }
    }

    public final void setBeautyFaceRes(String str) {
        h.f.b.l.d(str, "");
        this.y = str;
    }

    public final void setExposureCompensation(int i2) {
        getCameraController().e(i2);
    }

    public final void setFaceMakeUpRes(String str) {
        h.f.b.l.d(str, "");
        this.A = str;
    }

    public final void setLifecycleOwner(androidx.lifecycle.m mVar) {
        h.f.b.l.d(mVar, "");
        this.f62342a = mVar;
    }

    public final void setReshapeRes(String str) {
        h.f.b.l.d(str, "");
        this.z = str;
    }

    public static final /* synthetic */ com.ss.android.ugc.asve.recorder.a a(ASCameraView aSCameraView) {
        com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        getTouchHelper().a(motionEvent);
        return true;
    }

    public final void setDetectionMode(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e();
    }

    public final void setMusicPath(String str) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f();
    }

    public final void setPreviewSizeRatio(float f2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f();
    }

    public final void setVideoQuality(int i2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f();
    }

    public final void b(PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().b(privacyCert);
    }

    public final void c(PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.b().a(privacyCert);
    }

    public final void d(PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.b().b(privacyCert);
    }

    public final void e(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().c(z2);
    }

    public final void f(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().b(z2);
    }

    public final void setARCoreParam(boolean z2) {
        VEARCoreParam vEARCoreParam = new VEARCoreParam();
        vEARCoreParam.setEnableARCore(z2);
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().a(vEARCoreParam);
    }

    public final void setAudioCaptureDevice(com.ss.android.vesdk.audio.i iVar) {
        h.f.b.l.d(iVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.b().a().a(iVar);
    }

    public final void setBodyBeautyLevel(int i2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().a(i2);
    }

    public final void setCameraPreviewSizeInterface(com.ss.android.medialib.presenter.b bVar) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().a(bVar);
    }

    public final void setCloseCameraListener(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.asve.recorder.a aVar2 = this.f62345d;
        if (aVar2 == null) {
            h.f.b.l.a("recorder");
        }
        aVar2.c().a(aVar);
    }

    public final void setDataSourceVideoCompleteListener(Runnable runnable) {
        if (this.f62345d != null) {
            com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            aVar.d().a(runnable);
        }
    }

    public final void setDetectInterval(int i2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().a(i2);
    }

    public final void setDuetSupportChangeLayout(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.d().a(z2);
    }

    public final void setFilter(String str) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().a(str);
    }

    public final void setHandDetectLowpower(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().f(z2);
    }

    public final void setRecordMaxDuration(long j2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(j2);
    }

    public final void setSATZoomListener(ax.r rVar) {
        if (this.f62345d != null) {
            com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            aVar.c().a(rVar);
        }
    }

    public final void b(com.ss.android.medialib.listener.b bVar) {
        h.f.b.l.d(bVar, "");
        if (this.f62345d != null) {
            com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            aVar.b(bVar);
        }
    }

    public final void c(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().d(z2);
    }

    public final void d(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().e(z2);
    }

    public final void g(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().h(z2);
    }

    public final void setAudioDevice(com.ss.android.vesdk.audio.i iVar) {
        ax j2;
        com.ss.android.vesdk.l r2;
        h.f.b.l.d(iVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        com.ss.android.ugc.asve.recorder.d dVar = aVar.f62128c;
        if (!(dVar instanceof VERecorderImpl)) {
            dVar = null;
        }
        VERecorderImpl vERecorderImpl = (VERecorderImpl) dVar;
        if (vERecorderImpl != null && (j2 = vERecorderImpl.j()) != null && (r2 = j2.r()) != null) {
            r2.a(iVar);
        }
    }

    public final void setControllerCallback(com.ss.android.ugc.asve.a.b bVar) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().a(bVar);
        com.ss.android.ugc.asve.recorder.a aVar2 = this.f62345d;
        if (aVar2 == null) {
            h.f.b.l.a("recorder");
        }
        aVar2.f().a(bVar);
        com.ss.android.ugc.asve.recorder.a aVar3 = this.f62345d;
        if (aVar3 == null) {
            h.f.b.l.a("recorder");
        }
        if (aVar3.f62129d.h()) {
            com.ss.android.ugc.asve.recorder.a aVar4 = this.f62345d;
            if (aVar4 == null) {
                h.f.b.l.a("recorder");
            }
            aVar4.b().a(bVar);
        }
    }

    public final void b(com.ss.android.ugc.asve.recorder.camera.f fVar) {
        h.f.b.l.d(fVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().b(fVar);
    }

    public final void b(com.ss.android.ugc.asve.recorder.i iVar) {
        h.f.b.l.d(iVar, "");
        com.ss.android.ugc.asve.recorder.h onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        h.f.b.l.d(iVar, "");
        onRecordInfoListenerDispatcher.f62301a.remove(iVar);
        if (onRecordInfoListenerDispatcher.f62301a.isEmpty()) {
            onRecordInfoListenerDispatcher.f62302b.a((com.ss.android.vesdk.r) null);
        }
    }

    public final void setExposureSeekBarProgress(float f2) {
        com.ss.android.ugc.asve.recorder.camera.b.b cameraViewHelper$lib_asve_release = getCameraViewHelper$lib_asve_release();
        if (cameraViewHelper$lib_asve_release.f62225e) {
            cameraViewHelper$lib_asve_release.a().end();
            cameraViewHelper$lib_asve_release.f62226f.removeView(cameraViewHelper$lib_asve_release.f62224d);
            cameraViewHelper$lib_asve_release.f62226f.removeView(cameraViewHelper$lib_asve_release.f62223c);
            cameraViewHelper$lib_asve_release.f62226f.addView(cameraViewHelper$lib_asve_release.f62223c);
            cameraViewHelper$lib_asve_release.f62226f.addView(cameraViewHelper$lib_asve_release.f62224d);
            cameraViewHelper$lib_asve_release.f62222b = true;
            cameraViewHelper$lib_asve_release.f62221a = true;
        } else {
            cameraViewHelper$lib_asve_release.c().end();
            cameraViewHelper$lib_asve_release.b().end();
            cameraViewHelper$lib_asve_release.f62226f.removeView(cameraViewHelper$lib_asve_release.f62224d);
            cameraViewHelper$lib_asve_release.f62226f.removeView(cameraViewHelper$lib_asve_release.f62223c);
            cameraViewHelper$lib_asve_release.f62226f.addView(cameraViewHelper$lib_asve_release.f62223c);
            cameraViewHelper$lib_asve_release.f62226f.addView(cameraViewHelper$lib_asve_release.f62224d);
            cameraViewHelper$lib_asve_release.f62222b = true;
            cameraViewHelper$lib_asve_release.f62221a = true;
        }
        cameraViewHelper$lib_asve_release.f62223c.setProgress(f2);
        float progress = cameraViewHelper$lib_asve_release.f62223c.getProgress();
        l.d cameraECInfo = cameraViewHelper$lib_asve_release.f62226f.getCameraECInfo();
        if (cameraECInfo != null) {
            int i2 = cameraECInfo.f61825c;
            int i3 = cameraECInfo.f61823a;
            if (Math.abs(i2) < Math.abs(i3)) {
                i3 = -i2;
            } else if (Math.abs(i3) < Math.abs(i2)) {
                i2 = -i3;
            }
            cameraViewHelper$lib_asve_release.f62226f.setExposureCompensation((int) ((progress * ((float) (i3 - i2))) + ((float) i2)));
        }
        cameraViewHelper$lib_asve_release.b().start();
        cameraViewHelper$lib_asve_release.c().start();
    }

    public final void b(r<? super Integer, ? super Integer, ? super String, ? super ax, z> rVar) {
        h.f.b.l.d(rVar, "");
        this.f62346e.remove(rVar);
    }

    public final void a(float f2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.g().a(f2);
    }

    public final void b(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().c(z2);
    }

    public final void a(int i2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().b(i2);
    }

    public final void a(float f2, float f3) {
        getCameraViewHelper$lib_asve_release().a(f2, f3);
    }

    public static /* synthetic */ void a(ASCameraView aSCameraView, boolean z2) {
        if (aSCameraView.r != z2) {
            aSCameraView.r = z2;
            com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            aVar.f().a(z2, (PrivacyCert) null);
        }
    }

    public final int a(Context context, AudioRecorderInterface audioRecorderInterface) {
        h.f.b.l.d(context, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.f().b(context, audioRecorderInterface);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(11317);
        super.addView(view, i2, layoutParams);
        k();
        MethodCollector.o(11317);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ASCameraView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ASCameraView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        a.b bVar;
        h.f.b.l.d(context, "");
        MethodCollector.i(8889);
        this.f62350i = h.i.a((h.f.a.a) new e(this));
        this.f62351j = h.i.a((h.f.a.a) new c(this));
        this.f62352k = h.i.a((h.f.a.a) new i(this));
        this.f62353l = h.i.a((h.f.a.a) new b(this));
        if (this.f62345d != null) {
            com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            bVar = aVar.f62126a;
        } else {
            bVar = a.b.CUSTOM;
        }
        this.f62354m = bVar;
        this.n = h.i.a((h.f.a.a) new a(context));
        this.o = h.i.a((h.f.a.a) new n(this, context));
        com.ss.android.ugc.asve.recorder.b bVar2 = new com.ss.android.ugc.asve.recorder.b();
        this.p = bVar2;
        this.s = h.i.a((h.f.a.a) new d(this, context));
        this.t = h.i.a((h.f.a.a) new m(this));
        CopyOnWriteArrayList<r<Integer, Integer, String, ax, z>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(bVar2);
        this.f62346e = copyOnWriteArrayList;
        this.f62347f = new k(this);
        this.u = h.i.a((h.f.a.a) new j(this));
        this.v = h.i.a((h.f.a.a) new l(this));
        a attrsHelper = getAttrsHelper();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = attrsHelper.f62379d.obtainStyledAttributes(attributeSet, new int[]{R.attr.ug, R.attr.a9l, R.attr.a9m});
            h.f.b.l.b(obtainStyledAttributes, "");
            attrsHelper.f62376a = obtainStyledAttributes.getResourceId(0, 0);
            attrsHelper.f62377b = obtainStyledAttributes.getResourceId(2, 0);
            attrsHelper.f62378c = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
        this.w = h.i.a((h.f.a.a) new g(this));
        this.y = "";
        this.z = "";
        this.A = "";
        MethodCollector.o(8889);
    }

    static final class k extends h.f.b.m implements r<Integer, Integer, String, ax, z> {
        final /* synthetic */ ASCameraView this$0;

        static {
            Covode.recordClassIndex(38317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ASCameraView aSCameraView) {
            super(4);
            this.this$0 = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(Integer num, Integer num2, String str, ax axVar) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            h.f.b.l.d(axVar, "");
            Iterator<T> it = this.this$0.f62346e.iterator();
            while (it.hasNext()) {
                it.next().a(Integer.valueOf(intValue), Integer.valueOf(intValue2), str, axVar);
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, long j2, long j3, String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().a(i2, j2, j3, str);
    }

    public final void a(double d2, boolean z2, float f2, int i2, int i3, h.f.a.b<? super Integer, z> bVar) {
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = this.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(d2, z2, f2, i2, i3, false, bVar);
    }
}
