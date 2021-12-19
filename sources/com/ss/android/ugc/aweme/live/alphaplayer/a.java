package com.ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.b;
import com.ss.android.ugc.aweme.live.alphaplayer.e.a;
import java.util.List;

public final class a extends GLSurfaceView implements e {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f108107a;

    /* renamed from: b  reason: collision with root package name */
    public float f108108b;

    /* renamed from: c  reason: collision with root package name */
    public float f108109c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.e.a f108110d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.controller.a f108111e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f108112f;

    /* renamed from: g  reason: collision with root package name */
    private a.d f108113g;

    /* renamed from: h  reason: collision with root package name */
    private a.AbstractC2778a f108114h = new a.AbstractC2778a() {
        /* class com.ss.android.ugc.aweme.live.alphaplayer.a.AnonymousClass5 */

        static {
            Covode.recordClassIndex(69324);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a.AbstractC2778a
        public final int b() {
            return a.this.f108111e.j();
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a.AbstractC2778a
        public final void a() {
            if (a.this.f108112f != null) {
                a.this.f108112f.release();
            }
            a.this.f108107a = false;
            a.this.f108112f = null;
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a.AbstractC2778a
        public final void a(Surface surface) {
            if (surface.isValid()) {
                if (a.this.f108112f != null) {
                    a.this.f108112f.release();
                }
                a.this.f108112f = surface;
                a.this.f108107a = true;
                try {
                    a.this.f108111e.a(a.this.f108112f);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                a.this.f108111e.e();
            }
        }
    };

    static {
        Covode.recordClassIndex(69319);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final View getView() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final boolean c() {
        return this.f108107a;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final a.d getScaleType() {
        return this.f108113g;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void a() {
        this.f108110d.a();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void b() {
        this.f108110d.b();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void d() {
        a.AbstractC2778a aVar = this.f108114h;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void e() {
        com.ss.android.ugc.aweme.live.alphaplayer.e.a aVar = this.f108110d;
        if (aVar != null) {
            aVar.a(this.f108114h);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        queueEvent(new Runnable() {
            /* class com.ss.android.ugc.aweme.live.alphaplayer.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(69323);
            }

            public final void run() {
                Thread currentThread = Thread.currentThread();
                currentThread.setName("alpha-play-" + currentThread.getName());
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void setPlayerController(com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar) {
        this.f108111e = aVar;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void a(final List<b> list) {
        queueEvent(new Runnable() {
            /* class com.ss.android.ugc.aweme.live.alphaplayer.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(69322);
            }

            public final void run() {
                if (a.this.f108110d != null) {
                    a.this.f108110d.a(list);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void setVideoRenderer(com.ss.android.ugc.aweme.live.alphaplayer.e.a aVar) {
        this.f108110d = aVar;
        setRenderer(aVar);
        e();
        setRenderMode(0);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final boolean b(ViewGroup viewGroup) {
        MethodCollector.i(2602);
        if (viewGroup == null) {
            MethodCollector.o(2602);
            return false;
        }
        viewGroup.removeView(this);
        MethodCollector.o(2602);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void setConfigParams(final a.b bVar) {
        this.f108113g = bVar.f108167b;
        if (this.f108110d != null) {
            queueEvent(new Runnable() {
                /* class com.ss.android.ugc.aweme.live.alphaplayer.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69320);
                }

                public final void run() {
                    a.this.f108110d.a(bVar);
                }
            });
        }
    }

    public a(Context context) {
        super(context, null);
        MethodCollector.i(2578);
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(-3);
            e();
            setZOrderOnTop(true);
            setPreserveEGLContextOnPause(true);
        }
        MethodCollector.o(2578);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final boolean a(ViewGroup viewGroup) {
        MethodCollector.i(2600);
        if (viewGroup == null) {
            MethodCollector.o(2600);
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == viewGroup) {
            MethodCollector.o(2600);
            return true;
        }
        b(viewGroup2);
        if (viewGroup.indexOfChild(this) == -1) {
            viewGroup.addView(this);
            MethodCollector.o(2600);
            return true;
        }
        MethodCollector.o(2600);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(2592);
        super.onMeasure(i2, i3);
        a(this.f108108b, this.f108109c);
        MethodCollector.o(2592);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void a(float f2, float f3) {
        if (f2 > 0.0f && f3 > 0.0f) {
            this.f108108b = f2;
            this.f108109c = f3;
        }
        if (this.f108110d != null) {
            final float measuredWidth = (float) getMeasuredWidth();
            final float measuredHeight = (float) getMeasuredHeight();
            queueEvent(new Runnable() {
                /* class com.ss.android.ugc.aweme.live.alphaplayer.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69321);
                }

                public final void run() {
                    a.this.f108110d.a(measuredWidth, measuredHeight, a.this.f108108b, a.this.f108109c);
                }
            });
        }
    }
}
