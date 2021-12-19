package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import com.airbnb.lottie.d.b;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.h.q;
import com.airbnb.lottie.i.d;
import com.airbnb.lottie.j.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class g extends Drawable implements Animatable, Drawable.Callback {
    private static final String y = g.class.getSimpleName();
    private final Set<Object> A;
    private final ArrayList<a> B;
    private boolean C;
    private int D;
    private boolean E;
    private final ValueAnimator.AnimatorUpdateListener F;
    private int G;
    private WeakReference<LottieAnimationView> H;

    /* renamed from: a  reason: collision with root package name */
    public e f5554a;

    /* renamed from: b  reason: collision with root package name */
    public final d f5555b;

    /* renamed from: c  reason: collision with root package name */
    public float f5556c;

    /* renamed from: d  reason: collision with root package name */
    boolean f5557d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5558e;

    /* renamed from: f  reason: collision with root package name */
    b f5559f;

    /* renamed from: g  reason: collision with root package name */
    public String f5560g;

    /* renamed from: h  reason: collision with root package name */
    c f5561h;

    /* renamed from: i  reason: collision with root package name */
    public com.airbnb.lottie.d.a f5562i;

    /* renamed from: j  reason: collision with root package name */
    public b f5563j;

    /* renamed from: k  reason: collision with root package name */
    public r f5564k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5565l;

    /* renamed from: m  reason: collision with root package name */
    public com.airbnb.lottie.e.c.b f5566m;
    boolean n;
    public a o;
    public com.airbnb.lottie.b.a p;
    public boolean q;
    public float r;
    public Object s;
    public boolean t;
    Animator.AnimatorListener u;
    Bitmap v;
    public int w;
    public int x;
    private final Matrix z = new Matrix();

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(2333);
        }

        void a();
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getAlpha() {
        return this.D;
    }

    public final void a(boolean z2) {
        if (this.f5565l != z2) {
            int i2 = Build.VERSION.SDK_INT;
            this.f5565l = z2;
            if (this.f5554a != null) {
                c();
            }
        }
    }

    public final <T> void a(final e eVar, final T t2, final c<T> cVar) {
        if (this.f5566m == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(2326);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.a(eVar, t2, cVar);
                }
            });
            return;
        }
        if (eVar.f5525a != null) {
            eVar.f5525a.a(t2, cVar);
        } else {
            List<e> a2 = a(eVar);
            for (int i2 = 0; i2 < a2.size(); i2++) {
                a2.get(i2).f5525a.a(t2, cVar);
            }
            if (a2.isEmpty()) {
                return;
            }
        }
        invalidateSelf();
        if (t2 == k.A) {
            c(this.f5555b.d());
        }
    }

    public final boolean a(e eVar) {
        e eVar2 = this.f5554a;
        return eVar2 == null || eVar2 != eVar;
    }

    /* access modifiers changed from: protected */
    public final void a(LottieAnimationView lottieAnimationView) {
        if (d.a.f5625a && d.a.f5628d) {
            this.t = true;
            this.H = new WeakReference<>(lottieAnimationView);
            Context context = lottieAnimationView.getContext();
            DisplayMetrics displayMetrics = null;
            if (context != null) {
                displayMetrics = context.getResources().getDisplayMetrics();
            }
            this.p = new com.airbnb.lottie.b.a(this, displayMetrics);
            AnonymousClass7 r1 = new Animator.AnimatorListener() {
                /* class com.airbnb.lottie.g.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(2330);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    float k2;
                    g.this.q = true;
                    g gVar = g.this;
                    if (gVar.f5555b.f5682a > 0.0f) {
                        k2 = g.this.f5555b.j();
                    } else {
                        k2 = g.this.f5555b.k();
                    }
                    gVar.r = k2;
                }
            };
            this.u = r1;
            this.f5555b.addListener(r1);
        }
    }

    public final void d() {
        l();
        invalidateSelf();
    }

    public boolean isRunning() {
        return g();
    }

    static {
        Covode.recordClassIndex(2317);
    }

    private boolean t() {
        LottieAnimationView n2 = n();
        if (n2 == null || n2.getDrawable() != this) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        com.airbnb.lottie.i.d dVar = this.f5555b;
        if (dVar == null) {
            return false;
        }
        return dVar.isRunning();
    }

    public final void j() {
        com.airbnb.lottie.g.d.b(this);
        this.B.clear();
        this.f5555b.g();
    }

    public final LottieAnimationView n() {
        WeakReference<LottieAnimationView> weakReference = this.H;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private Context s() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final void c() {
        this.f5566m = new com.airbnb.lottie.e.c.b(this, q.a(this.f5554a), this.f5554a.f5336g, this.f5554a);
        if (d.a.f5625a) {
            o();
        }
    }

    public final void e() {
        com.airbnb.lottie.g.d.a(this);
        if (this.f5566m == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(2331);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.e();
                }
            });
        } else {
            this.f5555b.f();
        }
    }

    public final void f() {
        com.airbnb.lottie.g.d.d(this);
        if (this.f5566m == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(2332);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.f();
                }
            });
        } else {
            this.f5555b.h();
        }
    }

    public int getIntrinsicHeight() {
        e eVar = this.f5554a;
        if (eVar == null) {
            return -1;
        }
        return (int) (((float) eVar.f5337h.height()) * this.f5556c);
    }

    public int getIntrinsicWidth() {
        e eVar = this.f5554a;
        if (eVar == null) {
            return -1;
        }
        return (int) (((float) eVar.f5337h.width()) * this.f5556c);
    }

    public final boolean h() {
        if (this.f5564k != null || this.f5554a.f5334e.b() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        e eVar = this.f5554a;
        if (eVar != null) {
            String str = this.f5560g;
            if (str != null) {
                eVar.f5341l = str;
            }
            c cVar = this.f5561h;
            if (cVar != null) {
                this.f5554a.f5341l = cVar.getClass().getName();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        a();
        if (this.f5555b.isRunning()) {
            this.f5555b.cancel();
        }
        this.f5554a = null;
        this.f5566m = null;
        this.f5559f = null;
        this.f5555b.e();
    }

    public void start() {
        if (d.a.f5625a) {
            Drawable.Callback callback = getCallback();
            if ((callback instanceof View) && !((View) callback).isInEditMode()) {
                e();
                return;
            }
            return;
        }
        e();
    }

    public void stop() {
        if (com.airbnb.lottie.g.d.f5620a) {
            hashCode();
            isVisible();
            com.airbnb.lottie.g.d.a();
        }
        this.B.clear();
        com.airbnb.lottie.i.d dVar = this.f5555b;
        dVar.c(true);
        dVar.b(dVar.i());
    }

    private boolean p() {
        e eVar = this.f5554a;
        if (eVar == null || getBounds().isEmpty() || eVar.f5337h.isEmpty() || a(getBounds()) == a(eVar.f5337h)) {
            return true;
        }
        return false;
    }

    private void q() {
        e eVar;
        if (!d.a.f5625a && (eVar = this.f5554a) != null) {
            float f2 = this.f5556c;
            setBounds(0, 0, (int) (((float) eVar.f5337h.width()) * f2), (int) (((float) this.f5554a.f5337h.height()) * f2));
        }
    }

    private void u() {
        LottieAnimationView lottieAnimationView;
        if (this.t) {
            this.t = false;
            WeakReference<LottieAnimationView> weakReference = this.H;
            if (!(weakReference == null || (lottieAnimationView = weakReference.get()) == null)) {
                lottieAnimationView.f();
            }
            com.airbnb.lottie.b.a aVar = this.p;
            if (aVar != null) {
                aVar.b();
                this.p.a();
            }
            if (this.v != null) {
                this.v = null;
            }
        }
    }

    public final void a() {
        if (this.t) {
            com.airbnb.lottie.b.a aVar = this.p;
            if (aVar != null) {
                aVar.b();
                this.p.a();
            }
            this.v = null;
            b bVar = this.f5559f;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        b bVar2 = this.f5559f;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    public final void i() {
        com.airbnb.lottie.g.d.c(this);
        if (this.t) {
            com.airbnb.lottie.b.a aVar = this.p;
            if (aVar != null) {
                aVar.b();
                this.p.a();
            }
            this.v = null;
        }
        this.B.clear();
        this.f5555b.cancel();
    }

    public final boolean m() {
        boolean z2;
        if (!this.t || !t() || !isRunning()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.q) {
            if (!z2) {
                this.q = false;
            } else if (this.f5555b.f5683b == this.r) {
                return false;
            } else {
                this.q = false;
            }
        }
        return z2;
    }

    public final void o() {
        com.airbnb.lottie.e.c.b bVar;
        if (d.a.f5625a && d.a.f5628d && this.t && (bVar = this.f5566m) != null) {
            int c2 = bVar.c();
            int d2 = this.f5566m.d();
            int i2 = 1500750;
            if (d.e.f5649a) {
                i2 = 1000500;
            }
            if (c2 > 0 && d2 > 0 && c2 * d2 >= i2) {
                u();
            }
        }
    }

    public g() {
        com.airbnb.lottie.i.d dVar = new com.airbnb.lottie.i.d();
        this.f5555b = dVar;
        this.f5556c = 1.0f;
        this.A = new HashSet();
        this.B = new ArrayList<>();
        this.f5557d = false;
        this.f5558e = false;
        this.C = true;
        this.D = 255;
        this.E = false;
        AnonymousClass1 r1 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.airbnb.lottie.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2318);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MethodCollector.i(4915);
                com.airbnb.lottie.g.b.b(g.this);
                if (g.this.f5566m != null) {
                    g gVar = g.this;
                    if (com.airbnb.lottie.g.d.f5620a) {
                        if (com.airbnb.lottie.g.d.f5624e == null) {
                            com.airbnb.lottie.g.d.f5624e = new Random();
                        }
                        if (((double) com.airbnb.lottie.g.d.f5624e.nextFloat()) < 0.01d) {
                            gVar.hashCode();
                            gVar.isVisible();
                        }
                    }
                    if (d.a.f5625a && g.this.m()) {
                        com.airbnb.lottie.b.a aVar = g.this.p;
                        aVar.f5302d = Float.valueOf(g.this.f5555b.d());
                        aVar.f5299a.invalidateSelf();
                        if (aVar.f5301c == null) {
                            aVar.f5301c = com.airbnb.lottie.i.c.a(aVar.f5299a);
                        }
                        aVar.f5301c.post(aVar.f5303e);
                        MethodCollector.o(4915);
                        return;
                    } else if (g.this.t) {
                        synchronized (g.this.s) {
                            try {
                                g.this.f5566m.a(g.this.f5555b.d());
                            } finally {
                                MethodCollector.o(4915);
                            }
                        }
                        return;
                    } else {
                        g.this.f5566m.a(g.this.f5555b.d());
                    }
                }
                MethodCollector.o(4915);
            }
        };
        this.F = r1;
        this.G = 0;
        this.q = false;
        this.s = new Object();
        this.t = false;
        this.v = null;
        this.w = 0;
        this.x = 0;
        dVar.addUpdateListener(r1);
        if (com.airbnb.lottie.g.d.f5620a) {
            hashCode();
            com.airbnb.lottie.g.d.a();
        }
    }

    public final void b() {
        this.f5555b.a(this.f5554a);
        c(this.f5555b.getAnimatedFraction());
        d(this.f5556c);
        q();
        Iterator it = new ArrayList(this.B).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a();
            }
            it.remove();
        }
        this.B.clear();
        this.f5554a.a(this.n);
    }

    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (d.a.f5625a || this.t) {
            if (!this.f5557d) {
                this.f5557d = true;
                if (callback != null) {
                    try {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            callback.invalidateDrawable(this);
                            if (com.airbnb.lottie.g.d.f5620a) {
                                com.airbnb.lottie.g.b.c(this);
                            }
                        } else if (callback instanceof View) {
                            ((View) callback).postInvalidate();
                            if (com.airbnb.lottie.g.d.f5620a) {
                                com.airbnb.lottie.g.b.c(this);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } else if (callback != null) {
            callback.invalidateDrawable(this);
            if (com.airbnb.lottie.g.d.f5620a) {
                com.airbnb.lottie.g.b.c(this);
            }
        }
    }

    private b r() {
        Context s2;
        MethodCollector.i(6386);
        if (getCallback() == null) {
            MethodCollector.o(6386);
            return null;
        }
        b bVar = this.f5559f;
        if (bVar != null && (!((s2 = s()) == null && bVar.f5326a == null) && !bVar.f5326a.equals(s2) && !this.E)) {
            if (this.t) {
                this.f5559f.b();
            } else {
                this.f5559f.a();
            }
            this.f5559f = null;
        }
        if (this.f5559f == null) {
            if (this.t) {
                synchronized (this.s) {
                    try {
                        if (this.f5559f == null) {
                            d.e.a(s());
                            this.f5559f = new b(getCallback(), this.f5560g, this.f5561h, this.f5554a.f5332c);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(6386);
                        throw th;
                    }
                }
            } else {
                d.e.a(s());
                this.f5559f = new b(getCallback(), this.f5560g, this.f5561h, this.f5554a.f5332c);
            }
        }
        b bVar2 = this.f5559f;
        MethodCollector.o(6386);
        return bVar2;
    }

    private static float a(Rect rect) {
        return ((float) rect.width()) / ((float) rect.height());
    }

    public final void d(float f2) {
        this.f5556c = f2;
        q();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void setAlpha(int i2) {
        this.D = i2;
        if (d.a.f5625a) {
            invalidateSelf();
        }
    }

    private List<e> a(e eVar) {
        if (this.f5566m == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f5566m.a(eVar, 0, arrayList, new e(new String[0]));
        return arrayList;
    }

    public final void b(final float f2) {
        e eVar = this.f5554a;
        if (eVar == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(2322);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.b(f2);
                }
            });
            return;
        }
        float f3 = eVar.f5338i;
        b((int) (f3 + (f2 * (this.f5554a.f5339j - f3))));
    }

    public final void d(int i2) {
        this.f5555b.setRepeatCount(i2);
    }

    private void b(Canvas canvas) {
        MethodCollector.i(5965);
        if (this.t) {
            synchronized (this.s) {
                try {
                    if (!p()) {
                        d(canvas);
                    } else {
                        e(canvas);
                    }
                } finally {
                    MethodCollector.o(5965);
                }
            }
        } else if (!p()) {
            d(canvas);
            MethodCollector.o(5965);
        } else {
            e(canvas);
            MethodCollector.o(5965);
        }
    }

    private float c(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f5554a.f5337h.width()), ((float) canvas.getHeight()) / ((float) this.f5554a.f5337h.height()));
    }

    private void d(Canvas canvas) {
        if (this.f5566m != null) {
            int i2 = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f5554a.f5337h.width());
            float height = ((float) bounds.height()) / ((float) this.f5554a.f5337h.height());
            if (this.C) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    float f2 = 1.0f / min;
                    width /= f2;
                    height /= f2;
                    if (f2 > 1.0f) {
                        i2 = canvas.save();
                        float width2 = ((float) bounds.width()) / 2.0f;
                        float height2 = ((float) bounds.height()) / 2.0f;
                        float f3 = width2 * min;
                        float f4 = min * height2;
                        canvas.translate(width2 - f3, height2 - f4);
                        canvas.scale(f2, f2, f3, f4);
                    }
                }
            }
            this.z.reset();
            this.z.preScale(width, height);
            this.f5566m.a(canvas, this.z, this.D);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    private void e(Canvas canvas) {
        float f2;
        if (this.f5566m != null) {
            float f3 = this.f5556c;
            float c2 = c(canvas);
            if (f3 > c2) {
                f2 = this.f5556c / c2;
            } else {
                c2 = f3;
                f2 = 1.0f;
            }
            int i2 = -1;
            if (f2 > 1.0f) {
                i2 = canvas.save();
                float width = ((float) this.f5554a.f5337h.width()) / 2.0f;
                float height = ((float) this.f5554a.f5337h.height()) / 2.0f;
                float f4 = width * c2;
                float f5 = height * c2;
                float f6 = this.f5556c;
                canvas.translate((width * f6) - f4, (f6 * height) - f5);
                canvas.scale(f2, f2, f4, f5);
            }
            this.z.reset();
            this.z.preScale(c2, c2);
            this.f5566m.a(canvas, this.z, this.D);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public final Bitmap a(String str) {
        String str2;
        b r2 = r();
        if (r2 == null) {
            return null;
        }
        if (!d.a.f5625a) {
            return r2.a(str);
        }
        try {
            return r2.a(str);
        } catch (IllegalStateException e2) {
            Drawable.Callback callback = getCallback();
            if (callback == null || !(callback instanceof LottieAnimationView)) {
                str2 = null;
            } else {
                str2 = ((LottieAnimationView) callback).getAnimationName();
            }
            if (this.f5558e || d.a.f5634j || (d.a.f5625a && !com.airbnb.lottie.g.d.f5620a)) {
                return null;
            }
            throw new IllegalStateException("animName:" + str2 + " message:" + e2.getMessage());
        }
    }

    public final void c(final float f2) {
        e eVar = this.f5554a;
        if (eVar == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(2325);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.c(f2);
                }
            });
            return;
        }
        float f3 = eVar.f5338i;
        c((int) (f3 + (f2 * (this.f5554a.f5339j - f3))));
    }

    public final void a(final float f2) {
        e eVar = this.f5554a;
        if (eVar == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(2320);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.a(f2);
                }
            });
            return;
        }
        float f3 = eVar.f5338i;
        a((int) (f3 + (f2 * (this.f5554a.f5339j - f3))));
    }

    public final void b(final int i2) {
        if (this.f5554a == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass12 */

                static {
                    Covode.recordClassIndex(2321);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.b(i2);
                }
            });
        } else {
            this.f5555b.c(i2);
        }
    }

    public final void c(final int i2) {
        if (this.f5554a == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(2324);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.c(i2);
                }
            });
        } else {
            this.f5555b.a(i2);
        }
    }

    public void draw(Canvas canvas) {
        float f2;
        this.f5557d = false;
        if (d.a.f5625a) {
            a(canvas);
        } else {
            d.b("Drawable#draw");
            if (this.f5566m != null) {
                float f3 = this.f5556c;
                float c2 = c(canvas);
                if (f3 > c2) {
                    f2 = this.f5556c / c2;
                    if (f2 > 1.0f) {
                        canvas.save();
                        float width = ((float) this.f5554a.f5337h.width()) / 2.0f;
                        float height = ((float) this.f5554a.f5337h.height()) / 2.0f;
                        float f4 = width * c2;
                        float f5 = height * c2;
                        float f6 = this.f5556c;
                        canvas.translate((width * f6) - f4, (f6 * height) - f5);
                        canvas.scale(f2, f2, f4, f5);
                    }
                } else {
                    c2 = f3;
                    f2 = 1.0f;
                }
                this.z.reset();
                this.z.preScale(c2, c2);
                this.f5566m.a(canvas, this.z, this.D);
                d.c("Drawable#draw");
                if (f2 > 1.0f) {
                    canvas.restore();
                }
            }
        }
        if (com.airbnb.lottie.g.b.f5616c) {
            a aVar = this.o;
            if (aVar != null) {
                aVar.a();
            }
            if (com.airbnb.lottie.g.b.f5614a != null) {
                com.airbnb.lottie.g.b.f5614a.a();
            }
        }
    }

    public final void a(final int i2) {
        if (this.f5554a == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(2319);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.a(i2);
                }
            });
        } else {
            this.f5555b.b(i2);
        }
    }

    public final void a(Canvas canvas) {
        d.b("Drawable#draw");
        if (this.f5566m != null) {
            d.b("Drawable#draw");
            if (this.f5558e || d.a.f5634j) {
                try {
                    b(canvas);
                } catch (Throwable unused) {
                }
            } else {
                b(canvas);
            }
            d.c("Drawable#draw");
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void a(final int i2, final int i3) {
        if (this.f5554a == null) {
            this.B.add(new a() {
                /* class com.airbnb.lottie.g.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(2323);
                }

                @Override // com.airbnb.lottie.g.a
                public final void a() {
                    g.this.a(i2, i3);
                }
            });
        } else {
            this.f5555b.a(i2, i3);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }
}
