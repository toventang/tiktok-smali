package com.ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.d;
import com.ss.android.ugc.aweme.live.alphaplayer.e.a;
import java.util.List;

public final class b extends d implements e {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f108124a;

    /* renamed from: b  reason: collision with root package name */
    public float f108125b;

    /* renamed from: c  reason: collision with root package name */
    public float f108126c;

    /* renamed from: d  reason: collision with root package name */
    public a f108127d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.controller.a f108128e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f108129f;
    private a.d q;
    private a.AbstractC2778a r = new a.AbstractC2778a() {
        /* class com.ss.android.ugc.aweme.live.alphaplayer.b.AnonymousClass5 */

        static {
            Covode.recordClassIndex(69334);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a.AbstractC2778a
        public final int b() {
            return b.this.f108128e.j();
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a.AbstractC2778a
        public final void a() {
            if (b.this.f108129f != null) {
                b.this.f108129f.release();
            }
            b.this.f108124a = false;
            b.this.f108129f = null;
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a.AbstractC2778a
        public final void a(Surface surface) {
            if (surface.isValid()) {
                if (b.this.f108129f != null) {
                    b.this.f108129f.release();
                }
                b.this.f108129f = surface;
                b.this.f108124a = true;
                try {
                    b.this.f108128e.a(b.this.f108129f);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                b.this.f108128e.e();
            }
        }
    };

    static {
        Covode.recordClassIndex(69329);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final View getView() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final boolean c() {
        return this.f108124a;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final a.d getScaleType() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void a() {
        this.f108127d.a();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void b() {
        this.f108127d.b();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void d() {
        a.AbstractC2778a aVar = this.r;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void e() {
        com.ss.android.ugc.aweme.live.alphaplayer.e.a aVar = this.f108127d;
        if (aVar != null) {
            aVar.a(this.r);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(new Runnable() {
            /* class com.ss.android.ugc.aweme.live.alphaplayer.b.AnonymousClass4 */

            static {
                Covode.recordClassIndex(69333);
            }

            public final void run() {
                Thread currentThread = Thread.currentThread();
                currentThread.setName("alpha-play-" + currentThread.getName());
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void setPlayerController(com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar) {
        this.f108128e = aVar;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void a(final List<com.ss.android.ugc.aweme.live.alphaplayer.c.b> list) {
        a(new Runnable() {
            /* class com.ss.android.ugc.aweme.live.alphaplayer.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(69332);
            }

            public final void run() {
                if (b.this.f108127d != null) {
                    b.this.f108127d.a(list);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void setVideoRenderer(com.ss.android.ugc.aweme.live.alphaplayer.e.a aVar) {
        this.f108127d = aVar;
        setRenderer(aVar);
        e();
        setRenderMode(0);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final boolean b(ViewGroup viewGroup) {
        MethodCollector.i(2560);
        if (viewGroup == null) {
            MethodCollector.o(2560);
            return false;
        }
        viewGroup.removeView(this);
        MethodCollector.o(2560);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void setConfigParams(final a.b bVar) {
        this.q = bVar.f108167b;
        if (this.f108127d != null) {
            a(new Runnable() {
                /* class com.ss.android.ugc.aweme.live.alphaplayer.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69330);
                }

                public final void run() {
                    b.this.f108127d.a(bVar);
                }
            });
        }
    }

    public b(Context context) {
        super(context);
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(new d.b(8, 16));
            e();
            setPreserveEGLContextOnPause(true);
            setOpaque(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final boolean a(ViewGroup viewGroup) {
        MethodCollector.i(2558);
        if (viewGroup == null) {
            MethodCollector.o(2558);
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == viewGroup) {
            MethodCollector.o(2558);
            return true;
        }
        b(viewGroup2);
        if (viewGroup.indexOfChild(this) == -1) {
            viewGroup.addView(this);
            MethodCollector.o(2558);
            return true;
        }
        MethodCollector.o(2558);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        a(this.f108125b, this.f108126c);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e
    public final void a(float f2, float f3) {
        if (f2 > 0.0f && f3 > 0.0f) {
            this.f108125b = f2;
            this.f108126c = f3;
        }
        if (this.f108127d != null) {
            final float measuredWidth = (float) getMeasuredWidth();
            final float measuredHeight = (float) getMeasuredHeight();
            a(new Runnable() {
                /* class com.ss.android.ugc.aweme.live.alphaplayer.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69331);
                }

                public final void run() {
                    b.this.f108127d.a(measuredWidth, measuredHeight, b.this.f108125b, b.this.f108126c);
                }
            });
        }
    }
}
