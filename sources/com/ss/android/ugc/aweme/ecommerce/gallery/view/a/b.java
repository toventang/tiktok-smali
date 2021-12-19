package com.ss.android.ugc.aweme.ecommerce.gallery.view.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class b extends AppCompatImageView {
    public g A = new g();
    public RectF B;
    public Runnable C;
    public View.OnLongClickListener D;
    public e E;
    int F = 0;
    public Runnable G = new Runnable() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(53859);
        }

        public final void run() {
            if (b.this.f86061f != null) {
                b.this.f86061f.onClick(b.this);
            }
        }
    };
    private int H;
    private int I;
    private int J;
    private int K = 500;
    private Matrix L = new Matrix();
    private Matrix M = new Matrix();
    private GestureDetector N;
    private ScaleGestureDetector O;
    private ImageView.ScaleType P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private PointF U = new PointF();
    private a V;
    private long W;

    /* renamed from: a  reason: collision with root package name */
    public int f86056a;
    private ScaleGestureDetector.OnScaleGestureListener aa = new ScaleGestureDetector.OnScaleGestureListener() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(53858);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            boolean z = false;
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            b.this.o *= scaleFactor;
            b bVar = b.this;
            if (bVar.o > 1.0f) {
                z = true;
            }
            bVar.f86065j = z;
            b.this.f86059d.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            b.this.a();
            if (b.this.E != null) {
                b.this.E.a(b.this.o);
            }
            return true;
        }
    };
    private GestureDetector.OnGestureListener ab = new GestureDetector.SimpleOnGestureListener() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(53860);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (b.this.D != null) {
                b.this.D.onLongClick(b.this);
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            b bVar = b.this;
            bVar.postDelayed(bVar.G, 250);
            return false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            b.this.f86063h = false;
            b.this.f86062g = false;
            b.this.f86066k = false;
            b bVar = b.this;
            bVar.removeCallbacks(bVar.G);
            return false;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            float f2;
            b.this.A.b();
            float width = b.this.v.left + (b.this.v.width() / 2.0f);
            float height = b.this.v.top + (b.this.v.height() / 2.0f);
            b.this.y.set(width, height);
            b.this.z.set(width, height);
            b.this.p = 0;
            b.this.q = 0;
            float f3 = 1.0f;
            if (b.this.f86065j) {
                f2 = b.this.o;
                if (b.this.E != null) {
                    b.this.E.a(1.0f);
                }
            } else {
                f2 = b.this.o;
                f3 = b.this.f86057b;
                if (b.this.E != null) {
                    b.this.E.a(b.this.f86057b);
                }
                b.this.y.set(motionEvent.getX(), motionEvent.getY());
            }
            b.this.f86060e.reset();
            b.this.f86060e.postTranslate(-b.this.u.left, -b.this.u.top);
            b.this.f86060e.postTranslate(b.this.z.x, b.this.z.y);
            b.this.f86060e.postTranslate(-b.this.r, -b.this.s);
            b.this.f86060e.postRotate(b.this.n, b.this.z.x, b.this.z.y);
            b.this.f86060e.postScale(f3, f3, b.this.y.x, b.this.y.y);
            b.this.f86060e.postTranslate((float) b.this.p, (float) b.this.q);
            b.this.f86060e.mapRect(b.this.w, b.this.u);
            b bVar = b.this;
            bVar.a(bVar.w);
            b bVar2 = b.this;
            bVar2.f86065j = !bVar2.f86065j;
            b.this.A.a(f2, f3);
            b.this.A.a();
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            float f4;
            float f5;
            int i2;
            float f6;
            int i3;
            int i4;
            int i5;
            float f7;
            int i6;
            int i7;
            int i8;
            int i9;
            if (b.this.f86062g) {
                return false;
            }
            if ((!b.this.f86067l && !b.this.f86068m) || b.this.A.f86078a) {
                return false;
            }
            if (((float) Math.round(b.this.v.left)) >= b.this.t.left || ((float) Math.round(b.this.v.right)) <= b.this.t.right) {
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            if (((float) Math.round(b.this.v.top)) >= b.this.t.top || ((float) Math.round(b.this.v.bottom)) <= b.this.t.bottom) {
                f5 = 0.0f;
            } else {
                f5 = f3;
            }
            if (b.this.f86066k || b.this.n % 90.0f != 0.0f) {
                float f8 = (float) (((int) (b.this.n / 90.0f)) * 90);
                float f9 = b.this.n % 90.0f;
                if (f9 > 45.0f) {
                    f8 += 90.0f;
                } else if (f9 < -45.0f) {
                    f8 -= 90.0f;
                }
                b.this.A.b((int) b.this.n, (int) f8);
                b.this.n = f8;
            }
            b bVar = b.this;
            bVar.a(bVar.v);
            g gVar = b.this.A;
            if (f4 < 0.0f) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = 0;
            }
            gVar.f86085h = i2;
            if (f4 > 0.0f) {
                f6 = Math.abs(b.this.v.left);
            } else {
                f6 = b.this.v.right - b.this.t.right;
            }
            int i10 = (int) f6;
            if (f4 < 0.0f) {
                i10 = Integer.MAX_VALUE - i10;
            }
            if (f4 < 0.0f) {
                i3 = i10;
            } else {
                i3 = 0;
            }
            if (f4 < 0.0f) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = i10;
            }
            if (f4 < 0.0f) {
                i10 = Integer.MAX_VALUE - i3;
            }
            if (f5 < 0.0f) {
                i5 = Integer.MAX_VALUE;
            } else {
                i5 = 0;
            }
            gVar.f86086i = i5;
            if (f5 > 0.0f) {
                f7 = Math.abs(b.this.v.top);
            } else {
                f7 = b.this.v.bottom - b.this.t.bottom;
            }
            int i11 = (int) f7;
            if (f5 < 0.0f) {
                i11 = Integer.MAX_VALUE - i11;
            }
            if (f5 < 0.0f) {
                i6 = i11;
            } else {
                i6 = 0;
            }
            if (f5 < 0.0f) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = i11;
            }
            if (f5 < 0.0f) {
                i11 = Integer.MAX_VALUE - i6;
            }
            if (f4 == 0.0f) {
                i3 = 0;
                i4 = 0;
            }
            if (f5 == 0.0f) {
                i6 = 0;
                i7 = 0;
            }
            OverScroller overScroller = gVar.f86080c;
            int i12 = gVar.f86085h;
            int i13 = gVar.f86086i;
            int i14 = (int) f4;
            int i15 = (int) f5;
            if (Math.abs(i10) < b.this.f86058c * 2) {
                i8 = 0;
            } else {
                i8 = b.this.f86058c;
            }
            if (Math.abs(i11) < b.this.f86058c * 2) {
                i9 = 0;
            } else {
                i9 = b.this.f86058c;
            }
            overScroller.fling(i12, i13, i14, i15, i3, i4, i6, i7, i8, i9);
            b.this.A.a();
            return super.onFling(motionEvent, motionEvent2, f2, f3);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (b.this.A.f86078a) {
                b.this.A.b();
            }
            if (b.this.a(f2)) {
                if (f2 < 0.0f && b.this.v.left - f2 > b.this.t.left) {
                    f2 = b.this.v.left;
                }
                if (f2 > 0.0f && b.this.v.right - f2 < b.this.t.right) {
                    f2 = b.this.v.right - b.this.t.right;
                }
                b.this.f86059d.postTranslate(-f2, 0.0f);
                b bVar = b.this;
                bVar.p = (int) (((float) bVar.p) - f2);
            } else if (b.this.f86067l || b.this.f86062g || b.this.f86063h) {
                b.this.b();
                if (!b.this.f86062g) {
                    if (f2 < 0.0f && b.this.v.left - f2 > b.this.x.left) {
                        b bVar2 = b.this;
                        f2 = bVar2.a(bVar2.v.left - b.this.x.left, f2);
                    }
                    if (f2 > 0.0f && b.this.v.right - f2 < b.this.x.right) {
                        b bVar3 = b.this;
                        f2 = bVar3.a(bVar3.v.right - b.this.x.right, f2);
                    }
                }
                b bVar4 = b.this;
                bVar4.p = (int) (((float) bVar4.p) - f2);
                b.this.f86059d.postTranslate(-f2, 0.0f);
                b.this.f86063h = true;
            }
            if (b.this.b(f3)) {
                if (f3 < 0.0f && b.this.v.top - f3 > b.this.t.top) {
                    f3 = b.this.v.top;
                }
                if (f3 > 0.0f && b.this.v.bottom - f3 < b.this.t.bottom) {
                    f3 = b.this.v.bottom - b.this.t.bottom;
                }
                b.this.f86059d.postTranslate(0.0f, -f3);
                b bVar5 = b.this;
                bVar5.q = (int) (((float) bVar5.q) - f3);
            } else if (b.this.f86068m || b.this.f86063h || b.this.f86062g) {
                b.this.b();
                if (!b.this.f86062g) {
                    if (f3 < 0.0f && b.this.v.top - f3 > b.this.x.top) {
                        b bVar6 = b.this;
                        f3 = bVar6.b(bVar6.v.top - b.this.x.top, f3);
                    }
                    if (f3 > 0.0f && b.this.v.bottom - f3 < b.this.x.bottom) {
                        b bVar7 = b.this;
                        f3 = bVar7.b(bVar7.v.bottom - b.this.x.bottom, f3);
                    }
                }
                b.this.f86059d.postTranslate(0.0f, -f3);
                b bVar8 = b.this;
                bVar8.q = (int) (((float) bVar8.q) - f3);
                b.this.f86063h = true;
            }
            b.this.a();
            return true;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public float f86057b;

    /* renamed from: c  reason: collision with root package name */
    public int f86058c;

    /* renamed from: d  reason: collision with root package name */
    public Matrix f86059d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    public Matrix f86060e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    public View.OnClickListener f86061f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f86062g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f86063h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f86064i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f86065j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f86066k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f86067l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f86068m;
    public float n;
    public float o = 1.0f;
    public int p;
    public int q;
    public float r;
    public float s;
    public RectF t = new RectF();
    public RectF u = new RectF();
    public RectF v = new RectF();
    public RectF w = new RectF();
    public RectF x = new RectF();
    public PointF y = new PointF();
    public PointF z = new PointF();

    public interface a {
        static {
            Covode.recordClassIndex(53862);
        }

        float a();
    }

    public interface e {
        static {
            Covode.recordClassIndex(53866);
        }

        void a(float f2);
    }

    static {
        Covode.recordClassIndex(53857);
    }

    public int getDefaultAnimaDuring() {
        return 340;
    }

    public int getAnimaDuring() {
        return this.f86056a;
    }

    public float getMaxScale() {
        return this.f86057b;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$b  reason: collision with other inner class name */
    public class C2067b implements a {
        static {
            Covode.recordClassIndex(53863);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.a
        public final float a() {
            return b.this.v.bottom;
        }

        public C2067b() {
        }
    }

    public class f implements a {
        static {
            Covode.recordClassIndex(53867);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.a
        public final float a() {
            return b.this.v.top;
        }

        public f() {
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f86078a;

        /* renamed from: b  reason: collision with root package name */
        OverScroller f86079b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f86080c;

        /* renamed from: d  reason: collision with root package name */
        Scroller f86081d;

        /* renamed from: e  reason: collision with root package name */
        Scroller f86082e;

        /* renamed from: f  reason: collision with root package name */
        Scroller f86083f;

        /* renamed from: g  reason: collision with root package name */
        a f86084g;

        /* renamed from: h  reason: collision with root package name */
        int f86085h;

        /* renamed from: i  reason: collision with root package name */
        int f86086i;

        /* renamed from: j  reason: collision with root package name */
        int f86087j;

        /* renamed from: k  reason: collision with root package name */
        int f86088k;

        /* renamed from: l  reason: collision with root package name */
        RectF f86089l = new RectF();

        /* renamed from: m  reason: collision with root package name */
        c f86090m;

        static {
            Covode.recordClassIndex(53868);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f86078a = true;
            d();
        }

        private void d() {
            if (this.f86078a) {
                b.this.post(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            b.this.removeCallbacks(this);
            this.f86079b.abortAnimation();
            this.f86081d.abortAnimation();
            this.f86080c.abortAnimation();
            this.f86083f.abortAnimation();
            this.f86078a = false;
        }

        private void c() {
            b.this.f86059d.reset();
            b.this.f86059d.postTranslate(-b.this.u.left, -b.this.u.top);
            b.this.f86059d.postTranslate(b.this.z.x, b.this.z.y);
            b.this.f86059d.postTranslate(-b.this.r, -b.this.s);
            b.this.f86059d.postRotate(b.this.n, b.this.z.x, b.this.z.y);
            b.this.f86059d.postScale(b.this.o, b.this.o, b.this.y.x, b.this.y.y);
            b.this.f86059d.postTranslate((float) b.this.p, (float) b.this.q);
            b.this.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01b3, code lost:
            if (r2 != false) goto L_0x016e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 481
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.g.run():void");
        }

        g() {
            this.f86090m = new c(b.this, (byte) 0);
            Context context = b.this.getContext();
            this.f86079b = new OverScroller(context, this.f86090m);
            this.f86081d = new Scroller(context, this.f86090m);
            this.f86080c = new OverScroller(context, this.f86090m);
            this.f86082e = new Scroller(context, this.f86090m);
            this.f86083f = new Scroller(context, this.f86090m);
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2, int i3) {
            this.f86083f.startScroll(i2, 0, i3 - i2, 0, b.this.f86056a);
        }

        /* access modifiers changed from: package-private */
        public final void a(float f2, float f3) {
            this.f86081d.startScroll((int) (f2 * 10000.0f), 0, (int) ((f3 - f2) * 10000.0f), 0, b.this.f86056a);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            this.f86087j = 0;
            this.f86088k = 0;
            this.f86079b.startScroll(0, 0, i2, i3, b.this.f86056a);
        }

        /* access modifiers changed from: package-private */
        public final void a(float f2, float f3, float f4, float f5, int i2, a aVar) {
            this.f86082e.startScroll((int) (f2 * 10000.0f), (int) (f3 * 10000.0f), (int) (f4 * 10000.0f), (int) (f5 * 10000.0f), i2);
            this.f86084g = aVar;
        }
    }

    public class d implements a {
        static {
            Covode.recordClassIndex(53865);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.a
        public final float a() {
            return (b.this.v.top + b.this.v.bottom) / 2.0f;
        }

        public d() {
        }
    }

    private void i() {
        h();
        float f2 = -this.v.top;
        this.q = (int) (((float) this.q) + f2);
        this.f86059d.postTranslate(0.0f, f2);
        a();
        l();
    }

    private void j() {
        h();
        float f2 = this.t.bottom - this.v.bottom;
        this.q = (int) (((float) this.q) + f2);
        this.f86059d.postTranslate(0.0f, f2);
        a();
        l();
    }

    public final void c() {
        this.f86059d.reset();
        a();
        this.o = 1.0f;
        this.p = 0;
        this.q = 0;
    }

    private void h() {
        if (this.v.width() < this.t.width()) {
            float width = this.t.width() / this.v.width();
            this.o = width;
            this.f86059d.postScale(width, width, this.U.x, this.U.y);
            a();
            l();
        }
    }

    private void k() {
        this.f86059d.postScale(this.t.width() / this.v.width(), this.t.height() / this.v.height(), this.U.x, this.U.y);
        a();
        l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f86072a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 53861(0xd265, float:7.5475E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.f86072a = r2
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.f86072a     // Catch:{ NoSuchFieldError -> 0x0023 }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.f86072a     // Catch:{ NoSuchFieldError -> 0x002e }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.f86072a     // Catch:{ NoSuchFieldError -> 0x0039 }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.f86072a     // Catch:{ NoSuchFieldError -> 0x0044 }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.f86072a     // Catch:{ NoSuchFieldError -> 0x004f }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.f86072a     // Catch:{ NoSuchFieldError -> 0x005a }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.AnonymousClass4.<clinit>():void");
        }
    }

    private void e() {
        if (this.Q && this.R) {
            Drawable drawable = getDrawable();
            int a2 = a(drawable);
            int b2 = b(drawable);
            float f2 = (float) a2;
            if (f2 > this.t.width() || ((float) b2) > this.t.height()) {
                float width = f2 / this.v.width();
                float height = ((float) b2) / this.v.height();
                if (width <= height) {
                    width = height;
                }
                this.o = width;
                this.f86059d.postScale(width, width, this.U.x, this.U.y);
                a();
                l();
            }
        }
    }

    private void f() {
        if (this.v.width() < this.t.width() || this.v.height() < this.t.height()) {
            float width = this.t.width() / this.v.width();
            float height = this.t.height() / this.v.height();
            if (width <= height) {
                width = height;
            }
            this.o = width;
            this.f86059d.postScale(width, width, this.U.x, this.U.y);
            a();
            l();
        }
    }

    private void g() {
        if (this.v.width() > this.t.width() || this.v.height() > this.t.height()) {
            float width = this.t.width() / this.v.width();
            float height = this.t.height() / this.v.height();
            if (width >= height) {
                width = height;
            }
            this.o = width;
            this.f86059d.postScale(width, width, this.U.x, this.U.y);
            a();
            l();
        }
    }

    private void l() {
        Drawable drawable = getDrawable();
        this.u.set(0.0f, 0.0f, (float) a(drawable), (float) b(drawable));
        this.L.set(this.M);
        this.L.mapRect(this.u);
        this.r = this.u.width() / 2.0f;
        this.s = this.u.height() / 2.0f;
        this.o = 1.0f;
        this.p = 0;
        this.q = 0;
        this.f86059d.reset();
    }

    public a getInfo() {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        a(this, iArr);
        rectF.set(((float) iArr[0]) + this.v.left, ((float) iArr[1]) + this.v.top, ((float) iArr[0]) + this.v.right, ((float) iArr[1]) + this.v.bottom);
        return new a(rectF, this.v, this.t, this.u, this.U, this.o, this.n, this.P);
    }

    public final void a() {
        boolean z2;
        this.M.set(this.L);
        this.M.postConcat(this.f86059d);
        setImageMatrix(this.M);
        this.f86059d.mapRect(this.v, this.u);
        boolean z3 = true;
        if (this.v.width() > this.t.width()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f86067l = z2;
        if (this.v.height() <= this.t.height()) {
            z3 = false;
        }
        this.f86068m = z3;
    }

    public final void b() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (!this.f86063h) {
            RectF rectF = this.t;
            RectF rectF2 = this.v;
            RectF rectF3 = this.x;
            if (rectF.left > rectF2.left) {
                f2 = rectF.left;
            } else {
                f2 = rectF2.left;
            }
            if (rectF.right < rectF2.right) {
                f3 = rectF.right;
            } else {
                f3 = rectF2.right;
            }
            if (f2 > f3) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            if (rectF.top > rectF2.top) {
                f4 = rectF.top;
            } else {
                f4 = rectF2.top;
            }
            if (rectF.bottom < rectF2.bottom) {
                f5 = rectF.bottom;
            } else {
                f5 = rectF2.bottom;
            }
            if (f4 > f5) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                rectF3.set(f2, f4, f3, f5);
            }
        }
    }

    private void d() {
        float f2;
        if (this.Q && this.R) {
            this.L.reset();
            this.f86059d.reset();
            this.f86065j = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int a2 = a(drawable);
            int b2 = b(drawable);
            float f3 = (float) a2;
            float f4 = (float) b2;
            this.u.set(0.0f, 0.0f, f3, f4);
            int i2 = (width - a2) / 2;
            int i3 = (height - b2) / 2;
            float f5 = 1.0f;
            if (a2 > width) {
                f2 = ((float) width) / f3;
            } else {
                f2 = 1.0f;
            }
            if (b2 > height) {
                f5 = ((float) height) / f4;
            }
            if (f2 >= f5) {
                f2 = f5;
            }
            this.L.reset();
            this.L.postTranslate((float) i2, (float) i3);
            this.L.postScale(f2, f2, this.U.x, this.U.y);
            this.L.mapRect(this.u);
            this.r = this.u.width() / 2.0f;
            this.s = this.u.height() / 2.0f;
            this.y.set(this.U);
            this.z.set(this.y);
            a();
            switch (AnonymousClass4.f86072a[this.P.ordinal()]) {
                case 1:
                    e();
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    g();
                    break;
                case 4:
                    h();
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    i();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    j();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    k();
                    break;
            }
            this.S = true;
            if (this.V != null && System.currentTimeMillis() - this.W < ((long) this.K)) {
                a(this.V);
            }
            this.V = null;
            if (b2 > a2 * 3) {
                this.f86059d.postTranslate(0.0f, -this.v.top);
                this.q = (int) (((float) this.q) - this.v.top);
                a();
            }
        }
    }

    public void setAnimaDuring(int i2) {
        this.f86056a = i2;
    }

    public void setMaxAnimFromWaiteTime(int i2) {
        this.K = i2;
    }

    public void setMaxScale(float f2) {
        this.f86057b = f2;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.D = onLongClickListener;
    }

    public void setOnScaleListener(e eVar) {
        this.E = eVar;
    }

    public void setAdjustViewBounds(boolean z2) {
        super.setAdjustViewBounds(z2);
        this.T = z2;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.A.f86090m.f86074a = interpolator;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f86061f = onClickListener;
    }

    class c implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public Interpolator f86074a;

        static {
            Covode.recordClassIndex(53864);
        }

        private c() {
            this.f86074a = new DecelerateInterpolator();
        }

        public final float getInterpolation(float f2) {
            Interpolator interpolator = this.f86074a;
            if (interpolator != null) {
                return interpolator.getInterpolation(f2);
            }
            return f2;
        }

        /* synthetic */ c(b bVar, byte b2) {
            this();
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f86062g) {
            return true;
        }
        return a((float) i2);
    }

    public boolean canScrollVertically(int i2) {
        if (this.f86062g) {
            return true;
        }
        return b((float) i2);
    }

    public void draw(Canvas canvas) {
        RectF rectF = this.B;
        if (rectF != null) {
            canvas.clipRect(rectF);
            this.B = null;
        }
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i2) {
        Drawable drawable;
        try {
            drawable = getResources().getDrawable(i2);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = this.P;
        this.P = scaleType;
        if (scaleType2 != scaleType) {
            d();
        }
    }

    private static int a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth > 0) {
            return intrinsicWidth;
        }
        int minimumWidth = drawable.getMinimumWidth();
        if (minimumWidth <= 0) {
            return drawable.getBounds().width();
        }
        return minimumWidth;
    }

    private static int b(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            return intrinsicHeight;
        }
        int minimumHeight = drawable.getMinimumHeight();
        if (minimumHeight <= 0) {
            return drawable.getBounds().height();
        }
        return minimumHeight;
    }

    private boolean b(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.top)) - ((this.t.height() - rectF.height()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    private boolean c(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.left)) - ((this.t.width() - rectF.width()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.Q = false;
        } else if ((drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) || ((drawable.getMinimumWidth() > 0 && drawable.getMinimumHeight() > 0) || (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0))) {
            if (!this.Q) {
                this.Q = true;
            }
            d();
        }
    }

    private void a(a aVar) {
        a dVar;
        if (this.S) {
            c();
            a info = getInfo();
            float width = aVar.f86049b.width() / info.f86049b.width();
            float height = aVar.f86049b.height() / info.f86049b.height();
            if (width >= height) {
                width = height;
            }
            float width2 = aVar.f86048a.left + (aVar.f86048a.width() / 2.0f);
            float height2 = aVar.f86048a.top + (aVar.f86048a.height() / 2.0f);
            this.f86059d.reset();
            this.f86059d.postTranslate(-this.u.left, -this.u.top);
            this.f86059d.postTranslate(width2 - (this.u.width() / 2.0f), height2 - (this.u.height() / 2.0f));
            this.f86059d.postScale(width, width, width2, height2);
            this.f86059d.postRotate(aVar.f86054g, width2, height2);
            a();
            this.y.set(width2, height2);
            this.z.set(width2, height2);
            this.A.a((int) (this.U.x - width2), (int) (this.U.y - height2));
            this.A.a(width, 1.0f);
            this.A.b((int) aVar.f86054g, 0);
            if (aVar.f86050c.width() < aVar.f86049b.width() || aVar.f86050c.height() < aVar.f86049b.height()) {
                float width3 = aVar.f86050c.width() / aVar.f86049b.width();
                float height3 = aVar.f86050c.height() / aVar.f86049b.height();
                if (width3 > 1.0f) {
                    width3 = 1.0f;
                }
                if (height3 > 1.0f) {
                    height3 = 1.0f;
                }
                if (aVar.f86055h == ImageView.ScaleType.FIT_START) {
                    dVar = new f();
                } else if (aVar.f86055h == ImageView.ScaleType.FIT_END) {
                    dVar = new C2067b();
                } else {
                    dVar = new d();
                }
                this.A.a(width3, height3, 1.0f - width3, 1.0f - height3, this.f86056a / 3, dVar);
                this.f86060e.setScale(width3, height3, (this.v.left + this.v.right) / 2.0f, dVar.a());
                this.f86060e.mapRect(this.A.f86089l, this.v);
                this.B = this.A.f86089l;
            }
            this.A.a();
            return;
        }
        this.V = aVar;
        this.W = System.currentTimeMillis();
    }

    public final boolean b(float f2) {
        if (this.v.height() <= this.t.height()) {
            return false;
        }
        if (f2 < 0.0f && ((float) Math.round(this.v.top)) - f2 >= this.t.top) {
            return false;
        }
        if (f2 <= 0.0f || ((float) Math.round(this.v.bottom)) - f2 > this.t.bottom) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r1 != 6) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void a(RectF rectF) {
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        int i3 = 0;
        if (rectF.width() <= this.t.width()) {
            if (!c(rectF)) {
                i2 = -((int) (((this.t.width() - rectF.width()) / 2.0f) - rectF.left));
            }
            i2 = 0;
        } else {
            if (rectF.left > this.t.left) {
                f2 = rectF.left;
                f3 = this.t.left;
            } else {
                if (rectF.right < this.t.right) {
                    f2 = rectF.right;
                    f3 = this.t.right;
                }
                i2 = 0;
            }
            i2 = (int) (f2 - f3);
        }
        if (rectF.height() > this.t.height()) {
            if (rectF.top > this.t.top) {
                f4 = rectF.top;
                f5 = this.t.top;
            } else if (rectF.bottom < this.t.bottom) {
                f4 = rectF.bottom;
                f5 = this.t.bottom;
            }
            i3 = (int) (f4 - f5);
        } else if (!b(rectF)) {
            i3 = -((int) (((this.t.height() - rectF.height()) / 2.0f) - rectF.top));
        }
        if (i2 != 0 || i3 != 0) {
            if (!this.A.f86080c.isFinished()) {
                this.A.f86080c.abortAnimation();
            }
            this.A.a(-i2, -i3);
        }
    }

    public final boolean a(float f2) {
        if (this.v.width() <= this.t.width()) {
            return false;
        }
        if (f2 < 0.0f && ((float) Math.round(this.v.left)) - f2 >= this.t.left) {
            return false;
        }
        if (f2 <= 0.0f || ((float) Math.round(this.v.right)) - f2 > this.t.right) {
            return true;
        }
        return false;
    }

    public final float a(float f2, float f3) {
        return f3 * (Math.abs(Math.abs(f2) - ((float) this.J)) / ((float) this.J));
    }

    private static void a(View view, int[] iArr) {
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() != 16908290) {
                iArr[0] = iArr[0] - view2.getScrollX();
                iArr[1] = iArr[1] - view2.getScrollY();
                iArr[0] = iArr[0] + view2.getLeft();
                iArr[1] = iArr[1] + view2.getTop();
                parent = view2.getParent();
            } else {
                return;
            }
        }
        iArr[0] = (int) (((float) iArr[0]) + 0.5f);
        iArr[1] = (int) (((float) iArr[1]) + 0.5f);
    }

    public final float b(float f2, float f3) {
        return f3 * (Math.abs(Math.abs(f2) - ((float) this.J)) / ((float) this.J));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!this.Q) {
            super.onMeasure(i2, i3);
            return;
        }
        Drawable drawable = getDrawable();
        int a2 = a(drawable);
        int b2 = b(drawable);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        if (layoutParams.width != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || a2 <= size) : mode == 0) {
            size = a2;
        }
        if (layoutParams.height != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || b2 <= size2) : mode2 == 0) {
            size2 = b2;
        }
        if (this.T) {
            float f2 = (float) a2;
            float f3 = (float) b2;
            float f4 = (float) size;
            float f5 = (float) size2;
            if (f2 / f3 != f4 / f5) {
                float f6 = f5 / f3;
                float f7 = f4 / f2;
                if (f6 >= f7) {
                    f6 = f7;
                }
                if (layoutParams.width != -1) {
                    size = (int) (f2 * f6);
                }
                if (layoutParams.height != -1) {
                    size2 = (int) (f3 * f6);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.P == null) {
            this.P = ImageView.ScaleType.CENTER_INSIDE;
        }
        this.N = new GestureDetector(getContext(), this.ab);
        this.O = new ScaleGestureDetector(getContext(), this.aa);
        float f2 = getResources().getDisplayMetrics().density;
        int i2 = (int) (30.0f * f2);
        this.I = i2;
        this.f86058c = i2;
        this.J = (int) (f2 * 140.0f);
        this.H = 35;
        this.f86056a = 340;
        this.f86057b = 2.0f;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.t.set(0.0f, 0.0f, (float) i2, (float) i3);
        this.U.set((float) (i2 / 2), (float) (i3 / 2));
        if (!this.R) {
            this.R = true;
            d();
        }
    }
}
