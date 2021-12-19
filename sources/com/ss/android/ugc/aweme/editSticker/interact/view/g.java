package com.ss.android.ugc.aweme.editSticker.interact.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.a.j;
import com.ss.android.ugc.aweme.editSticker.a.k;
import com.ss.android.ugc.aweme.editSticker.interact.b;
import com.ss.android.ugc.tools.utils.a.c;

public class g extends FrameLayout {
    private boolean A;
    private boolean B;
    private boolean C;
    private b D;
    private com.ss.android.ugc.aweme.editSticker.c.b E;

    /* renamed from: a  reason: collision with root package name */
    protected Context f88212a;

    /* renamed from: b  reason: collision with root package name */
    protected float f88213b;

    /* renamed from: c  reason: collision with root package name */
    protected float f88214c;

    /* renamed from: d  reason: collision with root package name */
    protected int f88215d;

    /* renamed from: e  reason: collision with root package name */
    protected int f88216e;

    /* renamed from: f  reason: collision with root package name */
    protected StickerHelpBoxView f88217f;

    /* renamed from: g  reason: collision with root package name */
    protected View f88218g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.interact.a.a f88219h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f88220i;

    /* renamed from: j  reason: collision with root package name */
    protected long f88221j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f88222k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f88223l;

    /* renamed from: m  reason: collision with root package name */
    protected float f88224m;
    protected float n;
    public long o;
    public com.ss.android.ugc.aweme.editSticker.a.b p;
    private boolean q;
    private boolean r;
    private PointF s;
    private PointF t;
    private Runnable u;
    private boolean v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    static {
        Covode.recordClassIndex(55452);
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }

    public View getDrawView() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return true;
    }

    public boolean i() {
        return false;
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean p() {
        return false;
    }

    public View getContentView() {
        return this.f88218g;
    }

    public boolean getLockMode() {
        return this.f88223l;
    }

    public float getRotateAngle() {
        return this.f88214c;
    }

    public float getScale() {
        return this.f88213b;
    }

    public final boolean a(c cVar) {
        if (!g()) {
            return false;
        }
        boolean a2 = a(cVar.f149987i, cVar.f149988j);
        this.q = a2;
        return a2;
    }

    public PointF[] getFourAnglePoint() {
        return this.f88217f.getFourAnglePoint();
    }

    public RectF getViewPositionRect() {
        return this.f88217f.getViewBoxRect();
    }

    public final void l() {
        a(false);
    }

    public final boolean n() {
        return this.f88217f.f88185a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        a(true);
    }

    public class a implements k {
        static {
            Covode.recordClassIndex(55453);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void d() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public void f() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void g() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void a() {
            if (g.this.f88219h != null) {
                g.this.f88219h.c();
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void b() {
            if (g.this.f88219h != null) {
                g.this.f88219h.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void e() {
            if (g.this.f88219h != null) {
                g.this.f88219h.d();
            }
        }

        public a() {
        }
    }

    /* access modifiers changed from: protected */
    public com.ss.android.ugc.aweme.editSticker.a.b a() {
        return new j(this, new a());
    }

    public final boolean f() {
        if (this.f88220i || this.q || this.r) {
            return true;
        }
        return false;
    }

    public int getContentViewHeight() {
        return (int) (((float) this.f88218g.getMeasuredHeight()) * this.f88213b);
    }

    public int getContentViewWidth() {
        return (int) (((float) this.f88218g.getMeasuredWidth()) * this.f88213b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p.f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.g();
    }

    public void c() {
        this.p.a(this.f88217f.getRectOnWindow(), (int) this.t.x, (int) this.t.y, this.f88217f.getRotateAngle(), false);
    }

    public PointF getCenterViewPoint() {
        Rect rect = new Rect();
        this.f88218g.getHitRect(rect);
        rect.centerX();
        return new PointF(rect.exactCenterX(), rect.exactCenterY());
    }

    public PointF getContentViewPoint() {
        return new PointF(this.f88218g.getX(), this.f88218g.getY());
    }

    public final boolean k() {
        boolean z2 = this.f88217f.f88185a;
        if (z2 && this.B) {
            a(false);
        }
        this.B = false;
        this.f88222k = false;
        if (z2 || this.C) {
            return true;
        }
        return false;
    }

    public final void m() {
        if (d()) {
            this.f88217f.b();
            Runnable runnable = this.u;
            if (runnable != null) {
                this.f88217f.removeCallbacks(runnable);
            }
            this.f88217f.postDelayed(this.u, 3000);
        }
    }

    public void j() {
        if (this.f88217f.f88185a || (this.A && this.z < 2)) {
            if (this.f88219h != null && this.x) {
                new com.ss.android.ugc.aweme.editSticker.interact.g().f88167a.storeBoolean("interact_sticker_hint_set", true);
                this.f88219h.b();
            }
            a(false);
            return;
        }
        m();
    }

    public void b() {
        Rect rect = new Rect();
        int measuredWidth = this.f88218g.getMeasuredWidth();
        int measuredHeight = this.f88218g.getMeasuredHeight();
        int x2 = (int) this.f88218g.getX();
        int y2 = (int) this.f88218g.getY();
        rect.set(x2, y2, measuredWidth + x2, measuredHeight + y2);
        this.f88217f.a(rect);
        int[] iArr = new int[2];
        this.f88218g.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - x2;
        iArr[1] = iArr[1] - y2;
        this.f88217f.setmWindowPadding(iArr);
        this.f88217f.a(this.f88213b, this.f88214c);
        this.f88217f.setStickerShowHelpboxCallback(new j(this));
    }

    public final void e() {
        float f2;
        b();
        this.f88217f.a();
        com.ss.android.ugc.aweme.editSticker.interact.a.a aVar = this.f88219h;
        float f3 = 0.0f;
        if (aVar != null) {
            PointF e2 = aVar.e();
            f3 = e2.x;
            f2 = e2.y;
        } else {
            f2 = 0.0f;
        }
        float x2 = this.f88218g.getX() + f3;
        float y2 = this.f88218g.getY() + f2;
        com.ss.android.ugc.aweme.editSticker.interact.a.a aVar2 = this.f88219h;
        if (aVar2 == null || !this.f88223l || aVar2.b(f3, f2)) {
            this.f88218g.setX(x2);
            this.f88218g.setY(y2);
            this.f88217f.b(f3, f2);
        }
    }

    public void setLockMode(boolean z2) {
        this.f88223l = z2;
    }

    public void setMotionInterceptor(com.ss.android.ugc.aweme.editSticker.c.b bVar) {
        this.E = bVar;
    }

    public void setStickerEditListener(com.ss.android.ugc.aweme.editSticker.interact.a.a aVar) {
        this.f88219h = aVar;
    }

    public g(Context context) {
        this(context, null);
    }

    private void a(boolean z2) {
        this.f88217f.a(z2);
    }

    public final void a(float f2) {
        com.ss.android.ugc.aweme.editSticker.interact.a.a aVar = this.f88219h;
        if (aVar == null || !this.f88223l || aVar.c(f2)) {
            float f3 = this.f88213b * f2;
            this.f88213b = f3;
            float f4 = this.f88224m;
            if (f3 > f4) {
                this.f88213b = f4;
                return;
            }
            float f5 = this.n;
            if (f3 < f5) {
                this.f88213b = f5;
                return;
            }
            this.f88218g.setScaleX(f3);
            this.f88218g.setScaleY(this.f88213b);
            this.f88217f.a(this.f88213b, this.f88214c);
        }
    }

    public final boolean b(float f2) {
        if (!g() || !this.q) {
            return false;
        }
        a((float) Math.toDegrees((double) f2), (Boolean) true);
        return true;
    }

    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        if (!h() || !this.r) {
            return false;
        }
        a(scaleGestureDetector.getScaleFactor());
        return true;
    }

    public boolean b(MotionEvent motionEvent) {
        boolean z2;
        if (!d()) {
            return false;
        }
        b(motionEvent.getX(), motionEvent.getY());
        this.t.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.x = this.f88217f.c(this.s.x, this.s.y);
        b(this.f88218g.getX() + ((float) (this.f88218g.getWidth() / 2)), this.f88218g.getY() + ((float) (this.f88218g.getHeight() / 2)));
        this.s.x += (float) this.f88215d;
        if (this.w != -1) {
            if (this.f88219h != null && !i()) {
                new RectF(this.f88217f.getHelpBoxRect());
                PointF centerViewPoint = getCenterViewPoint();
                b bVar = this.D;
                if (bVar != null) {
                    bVar.f88162c = centerViewPoint.x - this.D.f88162c;
                    this.D.f88163d = centerViewPoint.y - this.D.f88163d;
                }
                com.ss.android.ugc.aweme.editSticker.interact.a.a aVar = this.f88219h;
                float f2 = this.s.x;
                float f3 = this.s.y;
                aVar.a(this, true);
            }
            if (System.currentTimeMillis() - this.f88221j > 300 && !i() && this.v) {
                m();
                this.v = false;
            }
            if (System.currentTimeMillis() - this.f88221j <= 300 && !i()) {
                if (!this.E.a()) {
                    j();
                } else {
                    this.C = true;
                }
            }
            com.ss.android.ugc.aweme.editSticker.interact.a.a aVar2 = this.f88219h;
            if (aVar2 != null) {
                aVar2.a(true, false, o(), false);
            }
            z2 = true;
        } else {
            if (this.q && this.f88219h != null && !i()) {
                new RectF(this.f88217f.getHelpBoxRect());
                PointF centerViewPoint2 = getCenterViewPoint();
                b bVar2 = this.D;
                if (bVar2 != null) {
                    bVar2.f88162c = centerViewPoint2.x - this.D.f88162c;
                    this.D.f88163d = centerViewPoint2.y - this.D.f88163d;
                }
                com.ss.android.ugc.aweme.editSticker.interact.a.a aVar3 = this.f88219h;
                float f4 = this.s.x;
                float f5 = this.s.y;
                aVar3.a(this, true);
                this.f88219h.a(true, true, o(), false);
            }
            z2 = false;
        }
        if (this.f88220i) {
            this.o = System.currentTimeMillis();
        }
        this.B = true ^ this.f88222k;
        this.f88220i = false;
        this.r = false;
        this.q = false;
        this.f88222k = false;
        this.w = -1;
        return z2;
    }

    public boolean a(MotionEvent motionEvent) {
        if (!d()) {
            return false;
        }
        PointF centerViewPoint = getCenterViewPoint();
        this.D = new b(this.f88214c, this.f88213b, Float.valueOf(centerViewPoint.x).floatValue(), Float.valueOf(centerViewPoint.y).floatValue());
        this.C = false;
        this.A = false;
        this.f88222k = false;
        boolean a2 = a(motionEvent.getX(), motionEvent.getY());
        this.f88220i = a2;
        if (a2) {
            this.w = 3;
        } else {
            this.w = -1;
        }
        if (this.w != -1) {
            this.f88222k = true;
        }
        if (!this.f88222k) {
            a(false);
        }
        b(motionEvent.getX(), motionEvent.getY());
        this.f88221j = System.currentTimeMillis();
        return this.f88222k;
    }

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        boolean z2 = false;
        if (!h()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis < 300) {
            this.o = System.currentTimeMillis();
        }
        if (a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()) && currentTimeMillis > 300) {
            z2 = true;
        }
        this.r = z2;
        return z2;
    }

    public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
        if (!d() || !f()) {
            return false;
        }
        if (Math.abs(bVar.f149983i.x) + Math.abs(bVar.f149983i.y) < 1.0f) {
            return true;
        }
        if (this.f88217f.f88185a) {
            this.A = true;
        }
        this.z = (int) (Math.abs(bVar.f149983i.x) + Math.abs(bVar.f149983i.y));
        a(bVar.f149983i.x, bVar.f149983i.y, true);
        b(this.f88218g.getX() + ((float) (this.f88218g.getWidth() / 2)), this.f88218g.getY() + ((float) (this.f88218g.getHeight() / 2)));
        this.s.x += (float) this.f88215d;
        if (f() && this.f88219h != null) {
            new RectF(this.f88217f.getHelpBoxRect());
            com.ss.android.ugc.aweme.editSticker.interact.a.a aVar = this.f88219h;
            float f2 = this.s.x;
            float f3 = this.s.y;
            aVar.a(this, false);
        }
        if (!this.v) {
            this.v = this.f88217f.f88185a;
        }
        a(false);
        return true;
    }

    private boolean a(float f2, float f3) {
        b(f2, f3);
        return this.f88217f.c(this.s.x, this.s.y);
    }

    private void b(float f2, float f3) {
        this.s.set(f2, f3);
        this.s.offset((float) (-this.f88215d), (float) (-this.f88216e));
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, null);
        MethodCollector.i(2357);
        this.f88213b = 1.0f;
        this.s = new PointF();
        this.t = new PointF();
        this.u = new h(this);
        this.w = -1;
        this.x = false;
        this.f88223l = false;
        this.f88224m = 100.0f;
        this.n = 0.01f;
        this.y = false;
        this.o = 0;
        this.z = 0;
        this.A = false;
        this.B = false;
        this.C = false;
        this.E = com.ss.android.ugc.aweme.editSticker.c.a.f88100a;
        this.p = a();
        MethodCollector.o(2357);
    }

    public final void a(float f2, Boolean bool) {
        if (this.f88219h != null) {
            int i2 = -1;
            if (bool.booleanValue()) {
                i2 = this.f88219h.a(false, true, o(), false);
            }
            if (this.f88223l && !this.f88219h.b(f2)) {
                return;
            }
            if (4 == i2) {
                f2 = this.f88219h.a(f2).floatValue();
            }
        }
        float f3 = this.f88214c - f2;
        this.f88214c = f3;
        this.f88218g.setRotation(f3);
        this.f88217f.a(this.f88213b, this.f88214c);
    }

    public void a(int i2, int i3) {
        this.f88215d = i2;
        this.f88216e = i3;
    }

    public void a(float f2, float f3, Boolean bool) {
        int a2;
        if (!(this.f88219h == null || !bool.booleanValue() || -1 == (a2 = this.f88219h.a(false, false, o(), p())))) {
            PointF a3 = this.f88219h.a(f2, f3);
            if (3 == a2) {
                f2 = a3.x;
                f3 = a3.y;
            }
        }
        float x2 = this.f88218g.getX() + f2;
        float y2 = this.f88218g.getY() + f3;
        com.ss.android.ugc.aweme.editSticker.interact.a.a aVar = this.f88219h;
        if (aVar == null || !this.f88223l || aVar.b(f2, f3)) {
            this.f88218g.setX(x2);
            this.f88218g.setY(y2);
            this.f88217f.b(f2, f3);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
        MethodCollector.i(2360);
        this.f88213b = 1.0f;
        this.s = new PointF();
        this.t = new PointF();
        this.u = new i(this);
        this.w = -1;
        this.x = false;
        this.f88223l = false;
        this.f88224m = 100.0f;
        this.n = 0.01f;
        this.y = false;
        this.o = 0;
        this.z = 0;
        this.A = false;
        this.B = false;
        this.C = false;
        this.E = com.ss.android.ugc.aweme.editSticker.c.a.f88100a;
        this.p = a();
        MethodCollector.o(2360);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        MethodCollector.i(2365);
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.y != z2) {
            this.y = z2;
            b();
        }
        MethodCollector.o(2365);
    }
}
