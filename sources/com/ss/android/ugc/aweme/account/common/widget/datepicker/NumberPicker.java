package com.ss.android.ugc.aweme.account.common.widget.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Set;

public class NumberPicker extends View {
    private static final int Q = Color.rgb(0, 150, 136);
    private static final int R = Color.rgb(0, 150, 136);
    private static final int S = Color.rgb(255, 255, 255);
    protected int A;
    protected Scroller B;
    protected Scroller C;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected boolean I;
    protected b J;
    protected Set<String> K;
    protected int L;
    protected a M;
    protected boolean N;
    protected String[] O;
    int P;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a  reason: collision with root package name */
    protected int f62907a;
    private VelocityTracker aa;
    private float ab;
    private boolean ac;

    /* renamed from: b  reason: collision with root package name */
    protected int f62908b;

    /* renamed from: c  reason: collision with root package name */
    protected TextPaint f62909c;

    /* renamed from: d  reason: collision with root package name */
    protected TextPaint f62910d;

    /* renamed from: e  reason: collision with root package name */
    protected TextPaint f62911e;

    /* renamed from: f  reason: collision with root package name */
    protected Paint f62912f;

    /* renamed from: g  reason: collision with root package name */
    protected Rect f62913g;

    /* renamed from: h  reason: collision with root package name */
    protected a[] f62914h;

    /* renamed from: i  reason: collision with root package name */
    protected int f62915i;

    /* renamed from: j  reason: collision with root package name */
    protected int f62916j;

    /* renamed from: k  reason: collision with root package name */
    protected int f62917k;

    /* renamed from: l  reason: collision with root package name */
    protected int f62918l;

    /* renamed from: m  reason: collision with root package name */
    protected float f62919m;
    protected int n;
    protected int o;
    protected int p;
    protected float q;
    protected float r;
    protected int s;
    protected String t;
    protected int u;
    protected float v;
    protected int[] w;
    protected int x;
    protected RectF y;
    protected Rect z;

    public interface b {
        static {
            Covode.recordClassIndex(38756);
        }

        void a(NumberPicker numberPicker, int i2);
    }

    public int getCurrentNumber() {
        return this.p;
    }

    static {
        Covode.recordClassIndex(38754);
    }

    private void a() {
        int i2;
        int i3 = this.n;
        if (i3 < 0 || (i2 = this.o) < 0) {
            throw new IllegalArgumentException("number can not be negative");
        }
        if (i3 > i2) {
            this.o = i3;
        }
        if (this.p < i3) {
            this.p = i3;
        }
        int i4 = this.p;
        int i5 = this.o;
        if (i4 > i5) {
            this.p = i5;
        }
        this.w = new int[((i5 - i3) + 1)];
        int i6 = 0;
        while (true) {
            int[] iArr = this.w;
            if (i6 < iArr.length) {
                iArr[i6] = this.n + i6;
                i6++;
            } else {
                this.x = this.p - this.n;
                return;
            }
        }
    }

    private void b() {
        int length = String.valueOf(this.o).length();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("0");
        }
        String sb2 = sb.toString();
        this.f62909c.getTextBounds(sb2, 0, sb2.length(), this.f62913g);
        String str = this.t;
        if (str != null) {
            this.f62910d.getTextBounds(str, 0, str.length(), this.z);
        }
    }

    private void c() {
        if (this.C.isFinished()) {
            this.E = 0;
            int round = (this.f62915i + (Math.round(((float) (this.f62914h[0].f62921b - this.f62915i)) / ((float) this.H)) * this.H)) - this.f62914h[0].f62921b;
            if (round != 0) {
                this.C.startScroll(0, 0, 0, round, 300);
            }
        }
    }

    public void computeScroll() {
        Scroller scroller = this.B;
        if (scroller.isFinished()) {
            e(0);
            scroller = this.C;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.F = currY;
        int i2 = currY - this.E;
        this.G = i2;
        d(i2);
        invalidate();
        this.E = this.F;
    }

    private void d() {
        int i2 = 0;
        if (this.ac) {
            this.P = this.f62914h.length / 2;
            while (i2 < this.f62914h.length) {
                this.f62914h[i2] = new a((this.x - 3) + i2, this.f62915i + (this.H * i2));
                i2++;
            }
            return;
        }
        while (i2 < this.f62914h.length) {
            a aVar = new a((this.x - 3) + i2, this.f62915i + (this.H * i2));
            if (aVar.f62920a > this.w.length - 1) {
                aVar.f62920a -= this.w.length;
            } else if (aVar.f62920a < 0) {
                aVar.f62920a += this.w.length;
            }
            this.f62914h[i2] = aVar;
            i2++;
        }
    }

    public final NumberPicker a(b bVar) {
        this.J = bVar;
        return this;
    }

    private void e(int i2) {
        if (this.U != i2) {
            this.U = i2;
        }
    }

    public void setNonRecurrent(boolean z2) {
        this.ac = z2;
        d();
    }

    public void setSoundEffectsEnabled(boolean z2) {
        super.setSoundEffectsEnabled(z2);
        this.N = z2;
    }

    public final NumberPicker a(int i2) {
        this.n = i2;
        a();
        d();
        invalidate();
        return this;
    }

    public final NumberPicker b(int i2) {
        this.o = i2;
        a();
        d();
        invalidate();
        return this;
    }

    public final NumberPicker c(int i2) {
        this.p = i2;
        a();
        d();
        invalidate();
        return this;
    }

    public final NumberPicker a(String[] strArr) {
        this.O = strArr;
        a();
        invalidate();
        return this;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.aa == null) {
            this.aa = VelocityTracker.obtain();
        }
        this.aa.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        this.A = actionMasked;
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.E = (int) motionEvent.getY();
            if (!this.B.isFinished() || !this.C.isFinished()) {
                this.B.forceFinished(true);
                this.C.forceFinished(true);
                e(0);
            }
        } else if (2 == actionMasked) {
            int y2 = (int) motionEvent.getY();
            this.F = y2;
            int i2 = y2 - this.E;
            this.G = i2;
            if (!this.I && Math.abs(i2) < this.T) {
                return false;
            }
            this.I = true;
            int i3 = this.G;
            int i4 = this.T;
            if (i3 > i4) {
                this.G = i3 - i4;
            } else if (i3 < (-i4)) {
                this.G = i3 + i4;
            }
            this.E = this.F;
            d(this.G);
            e(1);
            invalidate();
        } else if (1 == actionMasked) {
            this.I = false;
            VelocityTracker velocityTracker = this.aa;
            velocityTracker.computeCurrentVelocity(1000, (float) this.W);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.V) {
                if (yVelocity > 0) {
                    int i5 = (int) (this.f62919m * 10.0f);
                    this.E = 0;
                    this.B.fling(0, 0, 0, yVelocity, 0, 0, 0, i5);
                } else if (yVelocity < 0) {
                    int i6 = (int) (this.f62919m * 10.0f);
                    this.E = i6;
                    this.B.fling(0, i6, 0, yVelocity, 0, 0, 0, i6);
                }
                invalidate();
                e(2);
            } else {
                c();
                invalidate();
            }
            this.aa.recycle();
            this.aa = null;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(int r6) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.d(int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r13) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.onDraw(android.graphics.Canvas):void");
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            this.f62907a = size;
        } else {
            this.f62907a = this.f62913g.width() + getPaddingLeft() + getPaddingRight() + this.z.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f62908b = size2;
        } else {
            this.f62908b = (this.L * this.f62913g.height()) + ((this.L - 1) * this.s) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f62907a, this.f62908b);
        if (this.y == null) {
            RectF rectF = new RectF();
            this.y = rectF;
            rectF.left = 0.0f;
            this.y.right = (float) this.f62907a;
            this.y.top = (float) (((this.f62908b - this.f62913g.height()) - this.s) / 2);
            this.y.bottom = (float) (((this.f62908b + this.f62913g.height()) + this.s) / 2);
            int height = this.s + this.f62913g.height();
            this.H = height;
            int i4 = this.f62908b;
            this.f62915i = (i4 / 2) - (height * 3);
            this.f62916j = (i4 / 2) + (height * 3);
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f62920a;

        /* renamed from: b  reason: collision with root package name */
        public int f62921b;

        static {
            Covode.recordClassIndex(38755);
        }

        public a(int i2, int i3) {
            this.f62920a = i2;
            this.f62921b = i3;
        }
    }

    private NumberPicker(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8622);
        this.A = 3;
        this.K = new HashSet();
        this.N = true;
        this.ab = getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jd, R.attr.qo, R.attr.qw, R.attr.qx, R.attr.rj, R.attr.ro, R.attr.rt, R.attr.sw, R.attr.u4, R.attr.u5, R.attr.u6, R.attr.xc, R.attr.aad, R.attr.af_, R.attr.asz}, 0, 0);
        int i2 = Q;
        this.f62917k = obtainStyledAttributes.getColor(2, i2);
        this.f62919m = obtainStyledAttributes.getDimension(3, this.ab * 32.0f);
        this.f62918l = obtainStyledAttributes.getColor(4, i2);
        this.n = obtainStyledAttributes.getInteger(13, 0);
        this.o = obtainStyledAttributes.getInteger(7, 0);
        this.p = obtainStyledAttributes.getInteger(1, 0);
        this.s = (int) obtainStyledAttributes.getDimension(14, this.ab * 16.0f);
        this.t = obtainStyledAttributes.getString(8);
        this.u = obtainStyledAttributes.getColor(9, R);
        this.v = obtainStyledAttributes.getDimension(10, this.ab * 12.0f);
        this.D = obtainStyledAttributes.getColor(0, S);
        this.L = obtainStyledAttributes.getInteger(12, 5);
        this.q = obtainStyledAttributes.getDimension(6, this.ab * 2.0f);
        this.r = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
        a();
        TextPaint textPaint = new TextPaint();
        this.f62909c = textPaint;
        textPaint.setTextSize(this.f62919m);
        this.f62909c.setColor(this.f62917k);
        this.f62909c.setFlags(1);
        this.f62909c.setTextAlign(Paint.Align.CENTER);
        TextPaint textPaint2 = new TextPaint(this.f62909c);
        this.f62911e = textPaint2;
        textPaint2.setAlpha(77);
        TextPaint textPaint3 = new TextPaint();
        this.f62910d = textPaint3;
        textPaint3.setTextSize(this.v);
        this.f62910d.setColor(this.u);
        this.f62910d.setFlags(1);
        this.f62910d.setTextAlign(Paint.Align.LEFT);
        Paint paint = new Paint();
        this.f62912f = paint;
        paint.setColor(this.f62918l);
        this.f62912f.setStyle(Paint.Style.STROKE);
        this.f62912f.setStrokeWidth(this.q);
        this.f62913g = new Rect();
        this.z = new Rect();
        b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.T = viewConfiguration.getScaledPagingTouchSlop();
        this.V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.W = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.B = new Scroller(getContext(), null);
        this.C = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        this.f62914h = new a[(this.L + 4)];
        MethodCollector.o(8622);
    }
}
