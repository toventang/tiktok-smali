package com.bytedance.android.live.design.view;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.b.a;
import androidx.core.h.v;
import com.bytedance.android.live.design.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class g extends FrameLayout {
    private int A;
    private final PointF B;

    /* renamed from: a  reason: collision with root package name */
    View f9443a;

    /* renamed from: b  reason: collision with root package name */
    int f9444b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f9445c;

    /* renamed from: d  reason: collision with root package name */
    final Rect f9446d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f9447e;

    /* renamed from: f  reason: collision with root package name */
    Rect f9448f;

    /* renamed from: g  reason: collision with root package name */
    int f9449g;

    /* renamed from: h  reason: collision with root package name */
    Rect f9450h;

    /* renamed from: i  reason: collision with root package name */
    Rect f9451i;

    /* renamed from: j  reason: collision with root package name */
    final PointF f9452j;

    /* renamed from: k  reason: collision with root package name */
    private Path f9453k;

    /* renamed from: l  reason: collision with root package name */
    private int f9454l;

    /* renamed from: m  reason: collision with root package name */
    private int f9455m;
    private int n;
    private int o;
    private Paint p;
    private Paint q;
    private float r;
    private float s;
    private int t;
    private int u;
    private final RectF v = new RectF();
    private final RectF w = new RectF();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private final Rect z;

    static {
        Covode.recordClassIndex(4815);
    }

    public final void addView(View view) {
        MethodCollector.i(4679);
        if (getChildCount() <= 0) {
            super.addView(view);
            MethodCollector.o(4679);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.o(4679);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(1698);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate((float) this.f9447e.left, (float) (this.f9447e.top + this.t));
        Paint paint = this.q;
        if (paint != null) {
            canvas.drawPath(this.f9453k, paint);
        }
        canvas.translate(0.0f, (float) (-this.t));
        canvas.drawPath(this.f9453k, this.p);
        canvas.restore();
        MethodCollector.o(1698);
    }

    public g(Context context) {
        super(context);
        MethodCollector.i(4640);
        Rect rect = new Rect();
        this.z = rect;
        Rect rect2 = new Rect();
        this.f9445c = rect2;
        Rect rect3 = new Rect();
        this.f9446d = rect3;
        this.f9447e = new Rect();
        this.B = new PointF();
        this.f9452j = new PointF();
        Paint paint = new Paint(1);
        this.p = paint;
        paint.setColor(b.a(this, (int) R.attr.amj));
        setWillNotDraw(false);
        this.f9453k = new Path();
        this.f9454l = getContext().getResources().getDimensionPixelSize(R.dimen.z4);
        this.f9455m = getContext().getResources().getDimensionPixelSize(R.dimen.z9);
        this.n = getContext().getResources().getDimensionPixelSize(R.dimen.z3);
        this.o = getContext().getResources().getDimensionPixelSize(R.dimen.z1);
        this.r = getContext().getResources().getDimension(R.dimen.z0);
        this.s = getContext().getResources().getDimension(R.dimen.z2);
        this.t = getContext().getResources().getDimensionPixelSize(R.dimen.zb);
        this.u = getContext().getResources().getDimensionPixelSize(R.dimen.za);
        this.A = getContext().getResources().getDimensionPixelSize(R.dimen.z7);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.z6);
        rect2.set(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        rect.left = this.u;
        rect.top = this.u - this.t;
        rect.right = this.u;
        rect.bottom = this.u + this.t;
        rect3.left = Math.max(rect.left, rect2.left);
        rect3.top = Math.max(rect.top, rect2.top);
        rect3.right = Math.max(rect.right, rect2.right);
        rect3.bottom = Math.max(rect.bottom, rect2.bottom);
        if (this.u > 0) {
            Paint paint2 = new Paint(1);
            this.q = paint2;
            paint2.setColor(-16777216);
            TypedValue typedValue = new TypedValue();
            getContext().getResources().getValue(R.dimen.z_, typedValue, true);
            this.q.setAlpha((int) (typedValue.getFloat() * 255.0f));
            this.q.setMaskFilter(new BlurMaskFilter((float) this.u, BlurMaskFilter.Blur.NORMAL));
        }
        setLayerType(1, null);
        MethodCollector.o(4640);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        MethodCollector.i(5108);
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            MethodCollector.o(5108);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.o(5108);
        throw illegalStateException;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(5128);
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            MethodCollector.o(5128);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.o(5128);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        Rect rect;
        Rect rect2;
        int i5;
        Rect rect3;
        Rect rect4;
        int i6;
        int i7;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        int i8;
        int i9;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int i10 = this.f9444b;
        boolean z3 = true;
        if (i10 == 8388611 || i10 == 8388613) {
            z2 = true;
            i4 = Math.max((this.f9454l * 2) + this.n, this.f9455m * 2);
        } else {
            z2 = false;
            i4 = Math.max(this.f9454l * 2, this.f9455m * 2) + this.o;
        }
        if (this.f9450h.left == -1) {
            rect = this.f9445c;
        } else {
            rect = this.f9450h;
        }
        int i11 = size - rect.left;
        if (this.f9450h.right == -1) {
            rect2 = this.f9445c;
        } else {
            rect2 = this.f9450h;
        }
        int i12 = this.f9455m;
        int i13 = (i11 - rect2.right) - (i12 * 2);
        if (z2) {
            i13 -= this.o;
        }
        int i14 = this.f9449g - (i12 * 2);
        if (z2) {
            i5 = this.o;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, Math.min(i13, i14 - i5));
        if (this.f9450h.top == -1) {
            rect3 = this.f9445c;
        } else {
            rect3 = this.f9450h;
        }
        int i15 = size2 - rect3.top;
        if (this.f9450h.bottom == -1) {
            rect4 = this.f9445c;
        } else {
            rect4 = this.f9450h;
        }
        int i16 = (i15 - rect4.bottom) - (this.f9455m * 2);
        if (!z2) {
            i16 -= this.o;
        }
        int max2 = Math.max(0, i16);
        View childAt = getChildAt(0);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(max2, Integer.MIN_VALUE));
        int measuredWidth = childAt.getMeasuredWidth() + (this.f9455m * 2);
        if (z2) {
            i6 = this.o;
        } else {
            i6 = 0;
        }
        int max3 = Math.max(measuredWidth + i6, this.A);
        int measuredHeight = childAt.getMeasuredHeight() + (this.f9455m * 2);
        if (z2) {
            i7 = 0;
        } else {
            i7 = this.o;
        }
        int max4 = Math.max(i4, measuredHeight + i7);
        this.B.x = 0.0f;
        this.B.y = 0.0f;
        if (this.f9450h.left == -1 && this.f9450h.right == -1) {
            int width = this.f9451i.left - ((max3 - this.f9443a.getWidth()) / 2);
            if (width - this.f9448f.left <= this.f9448f.left + this.f9445c.left) {
                width = this.f9448f.left + this.f9445c.left;
                i9 = width + max3;
            } else {
                i9 = width + max3;
                if (i9 >= this.f9448f.right - this.f9445c.right) {
                    i9 = this.f9448f.right - this.f9445c.right;
                    width = i9 - max3;
                }
            }
            PointF pointF = this.B;
            int i17 = this.f9454l;
            int i18 = this.n;
            pointF.x = a.a(((float) (this.f9451i.right + this.f9451i.left)) / 2.0f, ((float) (width + i17)) + (((float) i18) / 2.0f), ((float) (i9 - i17)) - (((float) i18) / 2.0f)) - (((float) (i9 + width)) / 2.0f);
            this.f9447e.left = Math.min(width - this.f9448f.left, this.f9446d.left);
            this.f9447e.right = Math.min(this.f9448f.right - i9, this.f9446d.right);
            if (this.f9450h.top != -1) {
                this.f9447e.top = this.f9450h.top;
                if (this.f9451i.bottom + max4 + this.f9445c.bottom > this.f9448f.bottom) {
                    this.f9447e.bottom = this.f9445c.bottom;
                } else {
                    this.f9447e.bottom = Math.min(Math.min(this.f9448f.bottom - this.f9451i.bottom, this.f9448f.height() - this.f9447e.top) - max4, this.f9446d.bottom);
                }
            } else {
                this.f9447e.bottom = this.f9450h.bottom;
                if ((this.f9451i.top - max4) - this.f9445c.top < this.f9448f.top) {
                    this.f9447e.top = this.f9445c.top;
                } else {
                    this.f9447e.top = Math.min(Math.min(this.f9451i.top - this.f9448f.top, this.f9448f.height() - this.f9447e.bottom) - max4, this.f9446d.top);
                }
            }
        } else {
            int height = this.f9451i.top - ((max4 - this.f9443a.getHeight()) / 2);
            if (height - this.f9448f.top <= this.f9448f.top + this.f9445c.top) {
                height = this.f9448f.top + this.f9445c.top;
                i8 = height + max4;
            } else {
                i8 = height + max4;
                if (i8 >= this.f9448f.bottom - this.f9445c.bottom) {
                    i8 = this.f9448f.bottom - this.f9445c.bottom;
                    height = i8 - max4;
                }
            }
            PointF pointF2 = this.B;
            int i19 = this.f9454l;
            int i20 = this.n;
            pointF2.y = a.a(((float) (this.f9451i.bottom + this.f9451i.top)) / 2.0f, ((float) (height + i19)) + (((float) i20) / 2.0f), ((float) (i8 - i19)) - (((float) i20) / 2.0f)) - (((float) (i8 + height)) / 2.0f);
            this.f9447e.top = Math.min(height - this.f9448f.top, this.f9446d.top);
            this.f9447e.bottom = Math.min(this.f9448f.bottom - i8, this.f9446d.bottom);
            if (this.f9450h.left != -1) {
                this.f9447e.left = this.f9450h.left;
                if (this.f9451i.right + max3 + this.f9445c.right > this.f9448f.right) {
                    this.f9447e.right = this.f9445c.right;
                } else {
                    this.f9447e.right = Math.min(Math.min(this.f9448f.right - this.f9451i.right, this.f9448f.width() - this.f9447e.left) - max3, this.f9446d.right);
                }
            } else {
                this.f9447e.right = this.f9450h.right;
                if ((this.f9451i.left - max3) - this.f9445c.left < this.f9448f.left) {
                    this.f9447e.left = this.f9445c.left;
                } else {
                    this.f9447e.left = Math.min(Math.min(this.f9451i.left - this.f9448f.left, this.f9448f.width() - this.f9447e.right) - max3, this.f9446d.left);
                }
            }
        }
        setMeasuredDimension(max3 + this.f9447e.left + this.f9447e.right, max4 + this.f9447e.top + this.f9447e.bottom);
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        int i21 = (measuredWidth2 - this.f9447e.left) - this.f9447e.right;
        int i22 = (measuredHeight2 - this.f9447e.top) - this.f9447e.bottom;
        if (v.e(this.f9443a) != 1) {
            z3 = false;
        }
        this.f9453k.reset();
        int i23 = this.f9444b;
        if (i23 == 48) {
            f23 = (float) this.f9454l;
            a(this.v, 0.0f, 0.0f);
            int i24 = this.o;
            int i25 = this.f9454l;
            f4 = (float) ((i22 - i24) - i25);
            a(this.w, 0.0f, (float) ((i22 - i24) - (i25 * 2)));
            f24 = (((float) (i21 - this.n)) / 2.0f) + this.B.x;
            f6 = ((float) (i22 - this.o)) + this.B.y;
            f5 = this.r + f24;
            f18 = (float) i21;
            f19 = (f18 / 2.0f) + this.B.x;
            f10 = ((float) i22) + this.B.y;
            float f25 = this.s;
            f22 = f19 - f25;
            f8 = f25 + f19;
            f21 = (((float) (this.n + i21)) / 2.0f) + this.B.x;
            f13 = ((float) (i22 - this.o)) + this.B.y;
            f12 = f21 - this.r;
            int i26 = this.f9454l;
            f15 = (float) (i21 - i26);
            int i27 = this.o;
            f16 = (float) (i22 - i27);
            a(this.x, (float) (i21 - (i26 * 2)), (float) ((i22 - i27) - (i26 * 2)));
            int i28 = this.f9454l;
            f17 = (float) i28;
            a(this.y, (float) (i21 - (i28 * 2)), 0.0f);
            f9 = f10;
            f20 = 270.0f;
            f2 = 0.0f;
            f11 = f9;
            f7 = f6;
            f14 = f13;
            f3 = 0.0f;
        } else if (i23 == 80) {
            int i29 = this.f9454l;
            f23 = (float) (i21 - i29);
            f2 = (float) i22;
            a(this.v, (float) (i21 - (i29 * 2)), (float) (i22 - (i29 * 2)));
            f3 = (float) i21;
            int i30 = this.o;
            int i31 = this.f9454l;
            f4 = (float) (i30 + i31);
            a(this.w, (float) (i21 - (i31 * 2)), (float) i30);
            f24 = (((float) (this.n + i21)) / 2.0f) + this.B.x;
            f6 = ((float) this.o) + this.B.y;
            f5 = f24 - this.r;
            f19 = (f3 / 2.0f) + this.B.x;
            f10 = this.B.y;
            float f26 = this.s;
            f22 = f19 + f26;
            f8 = f19 - f26;
            f21 = (((float) (i21 - this.n)) / 2.0f) + this.B.x;
            f14 = ((float) this.o) + this.B.y;
            f12 = this.r + f21;
            f15 = (float) this.f9454l;
            int i32 = this.o;
            f16 = (float) i32;
            a(this.x, 0.0f, (float) i32);
            int i33 = this.f9454l;
            f17 = (float) (i22 - i33);
            a(this.y, 0.0f, (float) (i22 - (i33 * 2)));
            f13 = f14;
            f9 = f10;
            f20 = 90.0f;
            f18 = 0.0f;
            f7 = f6;
            f11 = f9;
        } else if (i23 != 8388611 ? i23 != 8388613 || !z3 : z3) {
            f23 = (float) i21;
            int i34 = this.f9454l;
            f2 = (float) i34;
            a(this.v, (float) (i21 - (i34 * 2)), 0.0f);
            int i35 = this.o;
            f3 = (float) (this.f9454l + i35);
            a(this.w, (float) i35, 0.0f);
            f5 = ((float) this.o) + this.B.x;
            f6 = (((float) (i22 - this.n)) / 2.0f) + this.B.y;
            f7 = this.r + f6;
            f8 = this.B.x + 0.0f;
            f17 = (float) i22;
            f9 = (f17 / 2.0f) + this.B.y;
            float f27 = this.s;
            f10 = f9 - f27;
            f11 = f27 + f9;
            f21 = this.B.x + ((float) this.o);
            f13 = this.B.y + (((float) (this.n + i22)) / 2.0f);
            f14 = f13 - this.r;
            int i36 = this.o;
            f15 = (float) i36;
            int i37 = this.f9454l;
            f16 = (float) (i22 - i37);
            a(this.x, (float) i36, (float) (i22 - (i37 * 2)));
            int i38 = this.f9454l;
            f18 = (float) (i21 - i38);
            a(this.y, (float) (i21 - (i38 * 2)), (float) (i22 - (i38 * 2)));
            f20 = 0.0f;
            f12 = f21;
            f19 = f8;
            f4 = 0.0f;
            f22 = f19;
            f24 = f5;
        } else {
            int i39 = this.f9454l;
            f2 = (float) (i22 - i39);
            a(this.v, 0.0f, (float) (i22 - (i39 * 2)));
            int i40 = this.f9454l;
            int i41 = this.o;
            f3 = (float) ((i21 - i40) - i41);
            f4 = (float) i22;
            a(this.w, (float) ((i21 - (i40 * 2)) - i41), (float) (i22 - (i40 * 2)));
            f5 = ((float) (i21 - this.o)) + this.B.x;
            f6 = (((float) (this.n + i22)) / 2.0f) + this.B.y;
            f7 = f6 - this.r;
            f8 = ((float) i21) + this.B.x;
            f9 = (f4 / 2.0f) + this.B.y;
            float f28 = this.s;
            f10 = f9 + f28;
            f11 = f9 - f28;
            f12 = ((float) (i21 - this.o)) + this.B.x;
            f13 = this.B.y + (((float) (i22 - this.n)) / 2.0f);
            f14 = this.r + f13;
            int i42 = this.o;
            f15 = (float) (i21 - i42);
            int i43 = this.f9454l;
            f16 = (float) i43;
            f17 = 0.0f;
            a(this.x, (float) ((i21 - i42) - (i43 * 2)), 0.0f);
            f18 = (float) this.f9454l;
            a(this.y, 0.0f, 0.0f);
            f19 = f8;
            f20 = 180.0f;
            f21 = f12;
            f22 = f19;
            f23 = 0.0f;
            f24 = f5;
        }
        this.f9453k.moveTo(f23, f2);
        this.f9453k.arcTo(this.v, f20, -90.0f);
        this.f9453k.lineTo(f3, f4);
        this.f9453k.arcTo(this.w, f20 - 90.0f, -90.0f);
        this.f9453k.lineTo(f24, f6);
        this.f9453k.cubicTo(f5, f7, f22, f10, f19, f9);
        this.f9453k.cubicTo(f8, f11, f12, f14, f21, f13);
        this.f9453k.lineTo(f15, f16);
        this.f9453k.arcTo(this.x, f20 - 180.0f, -90.0f);
        this.f9453k.lineTo(f18, f17);
        this.f9453k.arcTo(this.y, f20 - 270.0f, -90.0f);
        this.f9453k.close();
        this.f9452j.x = ((float) this.f9447e.left) + f19;
        this.f9452j.y = ((float) this.f9447e.top) + f9;
        setPivotX(this.f9452j.x);
        setPivotY(this.f9452j.y);
    }

    private void a(RectF rectF, float f2, float f3) {
        int i2 = this.f9454l;
        rectF.set(f2, f3, ((float) (i2 * 2)) + f2, ((float) (i2 * 2)) + f3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(1596);
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            MethodCollector.o(1596);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.o(1596);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (r7 != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        r3 = r3 + r8.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r7 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (r7 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        if (r7 != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.g.onLayout(boolean, int, int, int, int):void");
    }
}
