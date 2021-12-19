package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.j.h;
import java.util.ArrayList;

public final class LiveCDNumberPicker extends View {

    /* renamed from: d  reason: collision with root package name */
    public static final a f127378d = new a((byte) 0);
    private int A;
    private OverScroller B;
    private VelocityTracker C;
    private int D;
    private int E;
    private int F;
    private f G;

    /* renamed from: a  reason: collision with root package name */
    Integer f127379a;

    /* renamed from: b  reason: collision with root package name */
    Integer f127380b;

    /* renamed from: c  reason: collision with root package name */
    d f127381c;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Integer> f127382e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Boolean> f127383f;

    /* renamed from: g  reason: collision with root package name */
    private int f127384g;

    /* renamed from: h  reason: collision with root package name */
    private int f127385h;

    /* renamed from: i  reason: collision with root package name */
    private int f127386i;

    /* renamed from: j  reason: collision with root package name */
    private int f127387j;

    /* renamed from: k  reason: collision with root package name */
    private int f127388k;

    /* renamed from: l  reason: collision with root package name */
    private int f127389l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f127390m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private int r;
    private int s = Integer.MIN_VALUE;
    private int t;
    private int u;
    private int v;
    private int w;
    private Paint x = new Paint();
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(83530);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83531);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getCurrentPosition() {
        return this.f127389l;
    }

    public final boolean getWrapSelectorPick() {
        return this.f127390m;
    }

    private final void d() {
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    public final String getCurrentItem() {
        return d(this.f127389l);
    }

    private final int c() {
        Paint.FontMetricsInt fontMetricsInt = this.x.getFontMetricsInt();
        return Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
    }

    private final int getGapHeight() {
        return getItemHeight() - c();
    }

    private final int getItemHeight() {
        return getHeight() / (this.n - 2);
    }

    public final String getMaxValue() {
        d dVar = this.f127381c;
        if (dVar != null) {
            return dVar.a(this.f127385h);
        }
        return String.valueOf(this.f127385h);
    }

    public final String getMinValue() {
        d dVar = this.f127381c;
        if (dVar != null) {
            return dVar.a(this.f127384g);
        }
        return String.valueOf(this.f127384g);
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        int suggestedMinimumWidth = super.getSuggestedMinimumWidth();
        if (this.o > 0) {
            return Math.max(suggestedMinimumWidth, ((int) n.b(getContext(), 38.0f)) * this.o);
        }
        return suggestedMinimumWidth;
    }

    private final void b() {
        this.u = getItemHeight();
        this.v = c();
        this.t = getGapHeight();
        int i2 = this.u;
        int i3 = ((this.f127387j * i2) + ((this.v + i2) / 2)) - (i2 * this.f127386i);
        this.s = i3;
        this.r = i3;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 <= 0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker.a():void");
    }

    public final void computeScroll() {
        super.computeScroll();
        OverScroller overScroller = this.B;
        if (overScroller == null) {
            l.b();
        }
        if (overScroller.computeScrollOffset()) {
            OverScroller overScroller2 = this.B;
            if (overScroller2 == null) {
                l.b();
            }
            int currX = overScroller2.getCurrX();
            OverScroller overScroller3 = this.B;
            if (overScroller3 == null) {
                l.b();
            }
            int currY = overScroller3.getCurrY();
            if (this.w == 0) {
                OverScroller overScroller4 = this.B;
                if (overScroller4 == null) {
                    l.b();
                }
                this.w = overScroller4.getStartY();
            }
            scrollBy(currX, currY - this.w);
            this.w = currY;
            invalidate();
        } else if (!this.q) {
            this.w = 0;
            int i2 = this.s - this.r;
            int abs = Math.abs(i2);
            int i3 = this.u;
            if (abs > i3 / 2) {
                if (i2 > 0) {
                    i3 = -i3;
                }
                i2 += i3;
            }
            if (i2 != 0) {
                OverScroller overScroller5 = this.B;
                if (overScroller5 == null) {
                    l.b();
                }
                overScroller5.startScroll(getScrollX(), getScrollY(), 0, i2, 800);
                d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        int measureText;
        int suggestedMinimumHeight = super.getSuggestedMinimumHeight();
        if (this.o <= 0) {
            return suggestedMinimumHeight;
        }
        this.x.setTextSize(((float) this.A) * 1.3f);
        if (this.f127381c != null) {
            measureText = this.f127388k;
        } else {
            measureText = (int) this.x.measureText(String.valueOf(this.f127384g));
            int measureText2 = (int) this.x.measureText(String.valueOf(this.f127385h));
            this.x.setTextSize(((float) this.A) * 1.0f);
            if (measureText <= measureText2) {
                measureText = measureText2;
            }
        }
        return Math.max(suggestedMinimumHeight, measureText);
    }

    public final void setMaxValidValue(Integer num) {
        this.f127379a = num;
    }

    public final void setMaxValue(int i2) {
        this.f127385h = i2;
    }

    public final void setMaxWidth(int i2) {
        this.f127388k = i2;
    }

    public final void setMinValidValue(Integer num) {
        this.f127380b = num;
    }

    public final void setMinValue(int i2) {
        this.f127384g = i2;
    }

    public final void setUnselectedTextColor(int i2) {
        this.z = i2;
    }

    public final void setOnValueChangedListener(f fVar) {
        l.d(fVar, "");
        this.G = fVar;
    }

    public final void setWrapSelectorWheel(boolean z2) {
        this.f127390m = z2;
        invalidate();
    }

    public final void setSelectedTextColor(int i2) {
        this.y = b.c(getContext(), i2);
        invalidate();
    }

    public final void setTextAlign(Paint.Align align) {
        l.d(align, "");
        this.x.setTextAlign(align);
    }

    public final void setTypeface(Typeface typeface) {
        l.d(typeface, "");
        this.x.setTypeface(typeface);
    }

    public final void setValue(String str) {
        l.d(str, "");
        l.d(str, "");
        a(a(str));
    }

    private final int a(String str) {
        d dVar = this.f127381c;
        if (dVar != null) {
            return c(dVar.a(str));
        }
        try {
            return c(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final int b(int i2) {
        int i3 = this.f127385h;
        if (i2 > i3) {
            int i4 = this.f127384g;
            return (i4 + ((i2 - i3) % ((i3 - i4) + 1))) - 1;
        }
        int i5 = this.f127384g;
        if (i2 < i5) {
            return (i3 - ((i5 - i2) % ((i3 - i5) + 1))) + 1;
        }
        return i2;
    }

    private final boolean e(int i2) {
        Integer num = this.f127380b;
        if (num != null && i2 < num.intValue()) {
            return false;
        }
        Integer num2 = this.f127379a;
        if (num2 == null || i2 <= num2.intValue()) {
            return true;
        }
        return false;
    }

    private final int c(int i2) {
        if (this.f127390m) {
            return b(i2);
        }
        Integer num = this.f127379a;
        if (num == null) {
            int i3 = this.f127385h;
            if (i2 > i3) {
                return i3;
            }
        } else if (i2 > num.intValue()) {
            Integer num2 = this.f127379a;
            if (num2 == null) {
                l.b();
            }
            return num2.intValue();
        }
        Integer num3 = this.f127380b;
        if (num3 == null) {
            int i4 = this.f127384g;
            if (i2 < i4) {
                return i4;
            }
            return i2;
        } else if (i2 >= num3.intValue()) {
            return i2;
        } else {
            Integer num4 = this.f127380b;
            if (num4 == null) {
                l.b();
            }
            return num4.intValue();
        }
    }

    private String d(int i2) {
        d dVar = this.f127381c;
        if (dVar != null) {
            return dVar.a(i2);
        }
        if (this.f127390m) {
            return g.a(b(i2));
        }
        if (i2 <= this.f127385h && i2 >= this.f127384g) {
            return g.a(i2);
        }
        return "";
    }

    public final void setPickerItemCount(int i2) {
        int i3 = i2 + 2;
        this.n = i3;
        this.f127386i = (i3 - 1) / 2;
        int i4 = i3 - 2;
        this.o = i4;
        this.f127387j = (i4 - 1) / 2;
        this.f127382e = new ArrayList<>(this.n);
        this.f127383f = new ArrayList<>(this.n);
        a();
        b();
        invalidate();
        invalidate();
    }

    public final void a(int i2) {
        if (this.f127389l != i2) {
            this.f127389l = i2;
            ArrayList<Integer> arrayList = this.f127382e;
            if (arrayList == null) {
                l.a("selectorItemIndices");
            }
            arrayList.clear();
            int i3 = this.n;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = this.f127389l + (i4 - this.f127386i);
                if (this.f127390m) {
                    i5 = b(i5);
                }
                ArrayList<Integer> arrayList2 = this.f127382e;
                if (arrayList2 == null) {
                    l.a("selectorItemIndices");
                }
                arrayList2.add(Integer.valueOf(i5));
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0 A[EDGE_INSN: B:39:0x00f0->B:37:0x00f0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r12) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker.onDraw(android.graphics.Canvas):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        l.d(motionEvent, "");
        if (this.C == null) {
            this.C = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.C;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float y2 = motionEvent.getY() - this.p;
                    if (!this.q && Math.abs(y2) > ((float) this.D)) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        if (y2 > 0.0f) {
                            y2 -= (float) this.D;
                        } else {
                            y2 += (float) this.D;
                        }
                        this.q = true;
                    }
                    if (this.q) {
                        scrollBy(0, (int) y2);
                        invalidate();
                        this.p = motionEvent.getY();
                    }
                } else if (actionMasked == 3) {
                    if (this.q) {
                        this.q = false;
                    }
                }
            } else if (this.q) {
                this.q = false;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker2 = this.C;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000, (float) this.E);
                }
                VelocityTracker velocityTracker3 = this.C;
                if (velocityTracker3 != null) {
                    num = Integer.valueOf((int) velocityTracker3.getYVelocity());
                } else {
                    num = null;
                }
                this.w = 0;
                OverScroller overScroller = this.B;
                if (overScroller != null) {
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    if (num == null) {
                        l.b();
                    }
                    int intValue = num.intValue();
                    double itemHeight = (double) getItemHeight();
                    Double.isNaN(itemHeight);
                    overScroller.fling(scrollX, scrollY, 0, intValue, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, (int) (itemHeight * 0.7d));
                }
                d();
            } else {
                int y3 = (((int) motionEvent.getY()) / this.u) - this.f127387j;
                this.w = 0;
                OverScroller overScroller2 = this.B;
                if (overScroller2 == null) {
                    l.b();
                }
                overScroller2.startScroll(0, 0, 0, (-this.u) * y3, 300);
                invalidate();
            }
            VelocityTracker velocityTracker4 = this.C;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.C = null;
        } else {
            OverScroller overScroller3 = this.B;
            if (overScroller3 == null) {
                l.b();
            }
            if (!overScroller3.isFinished()) {
                OverScroller overScroller4 = this.B;
                if (overScroller4 == null) {
                    l.b();
                }
                overScroller4.forceFinished(true);
            }
            this.p = motionEvent.getY();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        setMeasuredDimension(a(getSuggestedMinimumWidth(), layoutParams.width, i2) + getPaddingLeft() + getPaddingRight(), a(getSuggestedMinimumHeight(), layoutParams.height, i3) + getPaddingTop() + getPaddingBottom());
    }

    public LiveCDNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        int i2;
        int i3;
        int i4;
        int i5;
        MethodCollector.i(5791);
        boolean z2 = false;
        if (context != null) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a51, R.attr.a59, R.attr.a5i, R.attr.a5j, R.attr.abd, R.attr.ai_, R.attr.aih, R.attr.ath, R.attr.auf}, 0, 0);
        } else {
            typedArray = null;
        }
        if (typedArray != null) {
            i2 = typedArray.getInt(7, 5);
        } else {
            i2 = 5;
        }
        int i6 = i2 + 2;
        this.n = i6;
        this.f127386i = (i6 - 1) / 2;
        int i7 = i6 - 2;
        this.o = i7;
        this.f127387j = (i7 - 1) / 2;
        this.f127382e = new ArrayList<>(this.n);
        this.f127383f = new ArrayList<>(this.n);
        if (typedArray != null) {
            i3 = typedArray.getInt(2, Integer.MIN_VALUE);
        } else {
            i3 = 0;
        }
        this.f127384g = i3;
        if (typedArray != null) {
            i4 = typedArray.getInt(0, Integer.MAX_VALUE);
        } else {
            i4 = 0;
        }
        this.f127385h = i4;
        if (typedArray != null) {
            if (typedArray.hasValue(1)) {
                this.f127379a = Integer.valueOf(typedArray.getInt(1, 0));
            }
            if (typedArray.hasValue(3)) {
                this.f127380b = Integer.valueOf(typedArray.getInt(3, 0));
            }
            z2 = typedArray.getBoolean(8, false);
        }
        this.f127390m = z2;
        this.B = new OverScroller(context, new DecelerateInterpolator(2.5f));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        l.b(viewConfiguration, "");
        this.D = viewConfiguration.getScaledTouchSlop();
        this.E = viewConfiguration.getScaledMaximumFlingVelocity() / 4;
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        int i8 = R.color.a2;
        if (typedArray != null) {
            i5 = typedArray.getColor(4, b.c(context, R.color.a2));
        } else {
            i5 = R.color.a2;
        }
        this.y = i5;
        this.z = typedArray != null ? typedArray.getColor(5, b.c(context, R.color.a2)) : i8;
        this.A = typedArray != null ? typedArray.getDimensionPixelSize(6, 80) : 80;
        Paint paint = this.x;
        paint.setAntiAlias(true);
        paint.setAntiAlias(true);
        paint.setTextSize(paint.getTextSize());
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setTextAlign(Paint.Align.CENTER);
        if (typedArray != null) {
            typedArray.recycle();
        }
        a();
        MethodCollector.o(5791);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (h.f.b.l.a(r1, r0.intValue()) <= 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (h.f.b.l.a(r1, r0.intValue()) >= 0) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void scrollBy(int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker.scrollBy(int, int):void");
    }

    private static int a(int i2, int i3, int i4) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(View.MeasureSpec.getMode(i4));
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return (i3 == -2 || i3 == -1) ? i2 : i3;
            }
            if (mode != 1073741824) {
                return 0;
            }
        } else if (i3 == -2) {
            size = h.c(i2, size);
        } else if (i3 != -1) {
            size = h.c(i3, size);
        }
        return size;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        MethodCollector.i(5292);
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            b();
        }
        MethodCollector.o(5292);
    }
}
