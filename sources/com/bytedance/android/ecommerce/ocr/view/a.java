package com.bytedance.android.ecommerce.ocr.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.android.ecommerce.k.k;
import com.bytedance.android.ecommerce.ocr.a.b;
import com.bytedance.android.ecommerce.ocr.a.c;
import com.bytedance.android.ecommerce.ocr.a.d;
import com.bytedance.android.ecommerce.ocr.a.e;
import com.bytedance.android.ecommerce.ocr.a.g;
import com.bytedance.android.ecommerce.ocr.a.h;
import com.bytedance.android.ecommerce.ocr.a.i;
import com.bytedance.android.ecommerce.ocr.a.j;
import com.bytedance.android.ecommerce.ocr.a.l;
import com.bytedance.android.ecommerce.ocr.a.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class a extends ViewGroup {
    private final Handler.Callback A;
    private c B;

    /* renamed from: a  reason: collision with root package name */
    public Handler f7271a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7272b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7273c;

    /* renamed from: d  reason: collision with root package name */
    public List<AbstractC0096a> f7274d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    h f7275e;

    /* renamed from: f  reason: collision with root package name */
    m f7276f;

    /* renamed from: g  reason: collision with root package name */
    m f7277g;

    /* renamed from: h  reason: collision with root package name */
    Rect f7278h;

    /* renamed from: i  reason: collision with root package name */
    public m f7279i;

    /* renamed from: j  reason: collision with root package name */
    Rect f7280j = null;

    /* renamed from: k  reason: collision with root package name */
    Rect f7281k = null;

    /* renamed from: l  reason: collision with root package name */
    m f7282l = null;

    /* renamed from: m  reason: collision with root package name */
    double f7283m = 0.1d;
    public final AbstractC0096a n;
    private b o;
    private WindowManager p;
    private SurfaceView q;
    private TextureView r;
    private d s;
    private int t = -1;
    private d u = new d();
    private l v = null;
    private boolean w = false;
    private c.b x;
    private Camera.Area y;
    private final SurfaceHolder.Callback z = new SurfaceHolder.Callback() {
        /* class com.bytedance.android.ecommerce.ocr.view.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(3491);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (!Build.BRAND.equalsIgnoreCase("Meizu")) {
                a.this.f7279i = null;
            }
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            if (surfaceHolder != null) {
                a.this.f7279i = new m(i3, i4);
                a.this.b();
            }
        }
    };

    /* renamed from: com.bytedance.android.ecommerce.ocr.view.a$a  reason: collision with other inner class name */
    public interface AbstractC0096a {
        static {
            Covode.recordClassIndex(3496);
        }

        void a();

        void a(Exception exc);

        void b();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(3489);
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    public b getCameraInstance() {
        return this.o;
    }

    public d getCameraSettings() {
        return this.u;
    }

    public Rect getFramingRect() {
        return this.f7280j;
    }

    public m getFramingRectSize() {
        return this.f7282l;
    }

    public double getMarginFraction() {
        return this.f7283m;
    }

    public Rect getPreviewFramingRect() {
        return this.f7281k;
    }

    private TextureView.SurfaceTextureListener h() {
        return new TextureView.SurfaceTextureListener() {
            /* class com.bytedance.android.ecommerce.ocr.view.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3490);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                a.this.f7279i = new m(i2, i3);
                a.this.b();
            }
        };
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    private int getDisplayRotation() {
        return this.p.getDefaultDisplay().getRotation();
    }

    private boolean i() {
        b bVar = this.o;
        if (bVar == null || bVar.f7167g) {
            return true;
        }
        return false;
    }

    public final void g() {
        if (!i()) {
            this.o.d();
        }
    }

    public l getPreviewScalingStrategy() {
        l lVar = this.v;
        if (lVar != null) {
            return lVar;
        }
        if (this.r != null) {
            return new g();
        }
        return new i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.w);
        return bundle;
    }

    public final void a() {
        if (e() && getDisplayRotation() != this.t) {
            d();
            c();
        }
    }

    public final void d() {
        TextureView textureView;
        SurfaceView surfaceView;
        k.a();
        this.t = -1;
        b bVar = this.o;
        if (bVar != null) {
            bVar.e();
            this.o = null;
            this.f7273c = false;
        } else {
            this.f7271a.sendEmptyMessage(R.id.fny);
        }
        if (this.f7279i == null && (surfaceView = this.q) != null) {
            surfaceView.getHolder().removeCallback(this.z);
        }
        if (this.f7279i == null && (textureView = this.r) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f7276f = null;
        this.f7277g = null;
        this.f7281k = null;
        this.s.a();
        this.n.c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        MethodCollector.i(7259);
        super.onAttachedToWindow();
        if (this.f7272b) {
            TextureView textureView = new TextureView(getContext());
            this.r = textureView;
            textureView.setSurfaceTextureListener(h());
            addView(this.r);
            MethodCollector.o(7259);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.q = surfaceView;
        surfaceView.getHolder().addCallback(this.z);
        addView(this.q);
        MethodCollector.o(7259);
    }

    public final void b() {
        float f2;
        m mVar = this.f7279i;
        if (mVar != null && this.f7277g != null && this.f7278h != null) {
            if (this.q == null || !mVar.equals(new m(this.f7278h.width(), this.f7278h.height()))) {
                TextureView textureView = this.r;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f7277g != null) {
                        m mVar2 = new m(this.r.getWidth(), this.r.getHeight());
                        m mVar3 = this.f7277g;
                        float f3 = ((float) mVar2.f7229a) / ((float) mVar2.f7230b);
                        float f4 = ((float) mVar3.f7229a) / ((float) mVar3.f7230b);
                        float f5 = 1.0f;
                        if (f3 < f4) {
                            f5 = f4 / f3;
                            f2 = 1.0f;
                        } else {
                            f2 = f3 / f4;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(f5, f2);
                        matrix.postTranslate((((float) mVar2.f7229a) - (((float) mVar2.f7229a) * f5)) / 2.0f, (((float) mVar2.f7230b) - (((float) mVar2.f7230b) * f2)) / 2.0f);
                        this.r.setTransform(matrix);
                    }
                    a(new e(this.r.getSurfaceTexture()));
                    return;
                }
                return;
            }
            a(new e(this.q.getHolder()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        if (r2 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.view.a.c():void");
    }

    public void setCameraSettings(d dVar) {
        this.u = dVar;
    }

    public void setFramingRectSize(m mVar) {
        this.f7282l = mVar;
    }

    public void setPreviewScalingStrategy(l lVar) {
        this.v = lVar;
    }

    public void setUseTextureView(boolean z2) {
        this.f7272b = z2;
    }

    public final void a(int i2) {
        if (!i()) {
            this.o.a(i2);
        }
    }

    public void setLightListener(c.b bVar) {
        b bVar2 = this.o;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
        this.x = bVar;
    }

    public void setTorch(boolean z2) {
        this.w = z2;
        b bVar = this.o;
        if (bVar != null) {
            bVar.a(z2);
        }
    }

    public void setZoom(float f2) {
        if (!i()) {
            this.o.a(f2);
        }
    }

    private void a(e eVar) {
        b bVar;
        if (!this.f7273c && (bVar = this.o) != null) {
            bVar.f7162b = eVar;
            this.o.c();
            this.f7273c = true;
            f();
            this.n.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public void setMarginFraction(double d2) {
        if (d2 < 0.5d) {
            this.f7283m = d2;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7252);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(7252);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(7244);
        AnonymousClass3 r3 = new Handler.Callback() {
            /* class com.bytedance.android.ecommerce.ocr.view.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(3492);
            }

            public final boolean handleMessage(Message message) {
                if (message.what == R.id.fo5) {
                    a aVar = a.this;
                    aVar.f7277g = (m) message.obj;
                    if (aVar.f7276f == null) {
                        return true;
                    }
                    if (aVar.f7276f == null || aVar.f7277g == null || aVar.f7275e == null) {
                        aVar.f7281k = null;
                        aVar.f7280j = null;
                        aVar.f7278h = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    int i2 = aVar.f7277g.f7229a;
                    int i3 = aVar.f7277g.f7230b;
                    int i4 = aVar.f7276f.f7229a;
                    int i5 = aVar.f7276f.f7230b;
                    h hVar = aVar.f7275e;
                    aVar.f7278h = hVar.f7223c.b(aVar.f7277g, hVar.f7221a);
                    Rect rect = new Rect(0, 0, i4, i5);
                    Rect rect2 = aVar.f7278h;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (aVar.f7282l != null) {
                        rect3.inset(Math.max(0, (rect3.width() - aVar.f7282l.f7229a) / 2), Math.max(0, (rect3.height() - aVar.f7282l.f7230b) / 2));
                    } else {
                        double width = (double) rect3.width();
                        double d2 = aVar.f7283m;
                        Double.isNaN(width);
                        double d3 = width * d2;
                        double height = (double) rect3.height();
                        double d4 = aVar.f7283m;
                        Double.isNaN(height);
                        int min = (int) Math.min(d3, height * d4);
                        rect3.inset(min, min);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    aVar.f7280j = rect3;
                    Rect rect4 = new Rect(aVar.f7280j);
                    rect4.offset(-aVar.f7278h.left, -aVar.f7278h.top);
                    aVar.f7281k = new Rect((rect4.left * i2) / aVar.f7278h.width(), (rect4.top * i3) / aVar.f7278h.height(), (rect4.right * i2) / aVar.f7278h.width(), (rect4.bottom * i3) / aVar.f7278h.height());
                    if (aVar.f7281k.width() <= 0 || aVar.f7281k.height() <= 0) {
                        aVar.f7281k = null;
                        aVar.f7280j = null;
                    } else {
                        aVar.n.a();
                    }
                    aVar.requestLayout();
                    aVar.b();
                    return true;
                }
                if (message.what == R.id.fnz) {
                    Exception exc = (Exception) message.obj;
                    if (a.this.e()) {
                        a.this.d();
                        a.this.n.a(exc);
                    }
                } else if (message.what == R.id.fny) {
                    a.this.n.d();
                }
                return false;
            }
        };
        this.A = r3;
        this.B = new c() {
            /* class com.bytedance.android.ecommerce.ocr.view.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(3493);
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.c
            public final void a() {
                a.this.f7271a.postDelayed(new Runnable() {
                    /* class com.bytedance.android.ecommerce.ocr.view.a.AnonymousClass4.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(3494);
                    }

                    public final void run() {
                        a.this.a();
                    }
                }, 250);
            }
        };
        this.n = new AbstractC0096a() {
            /* class com.bytedance.android.ecommerce.ocr.view.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(3495);
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.a.AbstractC0096a
            public final void a() {
                for (AbstractC0096a aVar : a.this.f7274d) {
                    aVar.a();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.a.AbstractC0096a
            public final void b() {
                for (AbstractC0096a aVar : a.this.f7274d) {
                    aVar.b();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.a.AbstractC0096a
            public final void c() {
                for (AbstractC0096a aVar : a.this.f7274d) {
                    aVar.c();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.a.AbstractC0096a
            public final void d() {
                for (AbstractC0096a aVar : a.this.f7274d) {
                    aVar.d();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.a.AbstractC0096a
            public final void a(Exception exc) {
                for (AbstractC0096a aVar : a.this.f7274d) {
                    aVar.a(exc);
                }
            }
        };
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.auh, R.attr.aui, R.attr.auk, R.attr.aun});
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f7282l = new m(dimension, dimension2);
        }
        this.f7272b = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.v = new g();
        } else if (integer == 2) {
            this.v = new com.bytedance.android.ecommerce.ocr.a.i();
        } else if (integer == 3) {
            this.v = new j();
        }
        obtainStyledAttributes.recycle();
        this.p = (WindowManager) a(context, "window");
        this.f7271a = new Handler(r3);
        this.s = new d();
        MethodCollector.o(7244);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        m mVar = new m(i4 - i2, i5 - i3);
        this.f7276f = mVar;
        b bVar = this.o;
        if (bVar != null && bVar.f7165e == null) {
            h hVar = new h(getDisplayRotation(), mVar);
            this.f7275e = hVar;
            hVar.f7223c = getPreviewScalingStrategy();
            b bVar2 = this.o;
            h hVar2 = this.f7275e;
            bVar2.f7165e = hVar2;
            bVar2.f7163c.f7193f = hVar2;
            this.o.b();
            boolean z3 = this.w;
            if (z3) {
                this.o.a(z3);
            }
        }
        SurfaceView surfaceView = this.q;
        if (surfaceView != null) {
            Rect rect = this.f7278h;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, this.f7278h.top, this.f7278h.right, this.f7278h.bottom);
            }
        } else {
            TextureView textureView = this.r;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }
}
