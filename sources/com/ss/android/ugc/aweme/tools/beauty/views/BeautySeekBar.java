package com.ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Objects;

public final class BeautySeekBar extends View {

    /* renamed from: g  reason: collision with root package name */
    public static Drawable f139163g;

    /* renamed from: h  reason: collision with root package name */
    public static Drawable f139164h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f139165i = new a((byte) 0);
    private Paint A;
    private Paint B;
    private Paint C;
    private int D;
    private int E;
    private String F;
    private float G;
    private boolean H;
    private boolean I;
    private Context J;
    private boolean K;
    private Rect L;
    private c M;
    private int N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a  reason: collision with root package name */
    public String f139166a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private ValueAnimator ae;
    private boolean af;
    private final Runnable ag;
    private int ah;
    private boolean ai;

    /* renamed from: b  reason: collision with root package name */
    public int f139167b;

    /* renamed from: c  reason: collision with root package name */
    public int f139168c;

    /* renamed from: d  reason: collision with root package name */
    public String f139169d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f139170e;

    /* renamed from: f  reason: collision with root package name */
    public float f139171f;

    /* renamed from: j  reason: collision with root package name */
    private int f139172j;

    /* renamed from: k  reason: collision with root package name */
    private int f139173k;

    /* renamed from: l  reason: collision with root package name */
    private int f139174l;

    /* renamed from: m  reason: collision with root package name */
    private int f139175m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private float t;
    private int u;
    private int v;
    private Paint w;
    private Paint x;
    private Paint y;
    private Paint z;

    public interface c {
        static {
            Covode.recordClassIndex(91016);
        }

        void a();

        void a(int i2);

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(91012);
    }

    public BeautySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91013);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static float a(Context context) {
            l.d(context, "");
            return d.a(context, 9.0f);
        }

        public static float b(Context context) {
            l.d(context, "");
            return d.a(context, 10.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f139178a = new d();

        private d() {
        }

        static {
            Covode.recordClassIndex(91017);
        }

        public static float a(Context context, float f2) {
            l.d(context, "");
            return r.a(context, f2);
        }
    }

    public final float getMActionDownX() {
        return this.G;
    }

    public final int getMBarLocationY() {
        return this.s;
    }

    public final int getMCenterX() {
        return this.r;
    }

    public final int getMColorBlack() {
        return this.n;
    }

    public final int getMColorBlackHint() {
        return this.o;
    }

    public final int getMColorCircle() {
        return this.u;
    }

    public final int getMColorText() {
        return this.v;
    }

    public final int getMColorTextShadow() {
        return this.p;
    }

    public final int getMColorTransparent() {
        return this.q;
    }

    public final int getMColorWhite() {
        return this.f139174l;
    }

    public final int getMColorWhiteHint() {
        return this.f139175m;
    }

    public final Context getMContext() {
        return this.J;
    }

    public final int getMCurPercent() {
        return this.D;
    }

    public final float getMEveryIndexLength() {
        return this.t;
    }

    public final ValueAnimator getMFadeAnimator() {
        return this.ae;
    }

    public final boolean getMHaveInit() {
        return this.K;
    }

    public final boolean getMIsClick() {
        return this.H;
    }

    public final boolean getMIsNormalType() {
        return this.ab;
    }

    public final boolean getMIsTextInCenter() {
        return this.ac;
    }

    public final boolean getMIsTextShowing() {
        return this.af;
    }

    public final Paint getMPaintBar() {
        return this.w;
    }

    public final Paint getMPaintBarHint() {
        return this.x;
    }

    public final Paint getMPaintCircle() {
        return this.y;
    }

    public final Paint getMPaintDefaultCircle() {
        return this.z;
    }

    public final Paint getMPaintTextCenter() {
        return this.B;
    }

    public final Paint getMPaintTextFollow() {
        return this.A;
    }

    public final String getMText() {
        return this.F;
    }

    public final Rect getMTextBounds() {
        return this.L;
    }

    public final boolean getMTouchAble() {
        return this.I;
    }

    public final boolean getMUseBlackUi() {
        return this.ad;
    }

    public final int getMViewHeight() {
        return this.f139173k;
    }

    public final int getMViewWidth() {
        return this.f139172j;
    }

    public final int getMaxPercent() {
        return this.U;
    }

    public final int getMinPercent() {
        return this.V;
    }

    public final Paint getPaintSuggestCirvle() {
        return this.C;
    }

    public final int getPercent() {
        return this.D;
    }

    public final int getSuggestPercent() {
        return this.W;
    }

    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BeautySeekBar f139179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f139180b;

        static {
            Covode.recordClassIndex(91018);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void a() {
            this.f139180b.a();
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void b(int i2) {
            this.f139180b.b(i2);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void a(int i2) {
            ValueAnimator valueAnimator;
            if ((this.f139179a.f139169d == null || i2 != this.f139179a.f139167b) && (valueAnimator = this.f139179a.f139170e) != null) {
                valueAnimator.cancel();
                this.f139179a.f139170e = null;
            }
            this.f139180b.a(i2);
        }

        e(BeautySeekBar beautySeekBar, c cVar) {
            this.f139179a = beautySeekBar;
            this.f139180b = cVar;
        }
    }

    private final boolean b() {
        if (this.V != 0) {
            return true;
        }
        int i2 = this.f139167b;
        if (i2 == 0 || i2 == 100) {
            return false;
        }
        return true;
    }

    public final void buildDrawingCache() {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    final class b implements Runnable {
        static {
            Covode.recordClassIndex(91014);
        }

        public final void run() {
            if (BeautySeekBar.this.getMIsTextShowing()) {
                ValueAnimator mFadeAnimator = BeautySeekBar.this.getMFadeAnimator();
                if (mFadeAnimator != null) {
                    mFadeAnimator.removeAllListeners();
                    mFadeAnimator.cancel();
                }
                BeautySeekBar.this.getMPaintTextCenter().setShadowLayer(0.0f, 0.0f, 0.0f, BeautySeekBar.this.getMColorTextShadow());
                BeautySeekBar.this.setMFadeAnimator(ValueAnimator.ofFloat(1.0f));
                ValueAnimator mFadeAnimator2 = BeautySeekBar.this.getMFadeAnimator();
                if (mFadeAnimator2 != null) {
                    mFadeAnimator2.addUpdateListener(new a(this));
                    mFadeAnimator2.setDuration(300L);
                    mFadeAnimator2.start();
                }
                BeautySeekBar.this.setMIsTextShowing(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f139177a;

            static {
                Covode.recordClassIndex(91015);
            }

            a(b bVar) {
                this.f139177a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                BeautySeekBar.this.setTextAlpha((int) ((1.0f - ((Float) animatedValue).floatValue()) * 255.0f));
                BeautySeekBar.this.invalidate();
            }
        }
    }

    private void a() {
        this.r = this.f139172j / 2;
        Context context = getContext();
        l.b(context, "");
        this.s = (int) d.a(context, 32.0f);
        this.t = (((float) this.f139172j) - (this.R * 2.0f)) / ((float) this.T);
        this.K = true;
        invalidate();
    }

    private void c() {
        float f2;
        removeCallbacks(this.ag);
        if (!this.af && !TextUtils.isEmpty(this.F)) {
            ValueAnimator valueAnimator = this.ae;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            Paint paint = this.B;
            Context context = getContext();
            l.b(context, "");
            if (this.ad) {
                f2 = 0.0f;
            } else {
                f2 = 3.0f;
            }
            paint.setShadowLayer(d.a(context, f2), 0.0f, 0.0f, this.p);
            setTextAlpha(255);
            this.af = true;
            invalidate();
        }
    }

    public final void setIsTwoWayMode(boolean z2) {
        this.ai = z2;
    }

    public final void setLevelAdjustBarTitle(String str) {
        this.f139166a = str;
    }

    public final void setMActionDownX(float f2) {
        this.G = f2;
    }

    public final void setMBarLocationY(int i2) {
        this.s = i2;
    }

    public final void setMCenterX(int i2) {
        this.r = i2;
    }

    public final void setMColorBlack(int i2) {
        this.n = i2;
    }

    public final void setMColorBlackHint(int i2) {
        this.o = i2;
    }

    public final void setMColorCircle(int i2) {
        this.u = i2;
    }

    public final void setMColorText(int i2) {
        this.v = i2;
    }

    public final void setMColorTextShadow(int i2) {
        this.p = i2;
    }

    public final void setMColorTransparent(int i2) {
        this.q = i2;
    }

    public final void setMColorWhite(int i2) {
        this.f139174l = i2;
    }

    public final void setMColorWhiteHint(int i2) {
        this.f139175m = i2;
    }

    public final void setMContext(Context context) {
        this.J = context;
    }

    public final void setMCurPercent(int i2) {
        this.D = i2;
    }

    public final void setMEveryIndexLength(float f2) {
        this.t = f2;
    }

    public final void setMFadeAnimator(ValueAnimator valueAnimator) {
        this.ae = valueAnimator;
    }

    public final void setMHaveInit(boolean z2) {
        this.K = z2;
    }

    public final void setMIsClick(boolean z2) {
        this.H = z2;
    }

    public final void setMIsNormalType(boolean z2) {
        this.ab = z2;
    }

    public final void setMIsTextInCenter(boolean z2) {
        this.ac = z2;
    }

    public final void setMIsTextShowing(boolean z2) {
        this.af = z2;
    }

    public final void setMTouchAble(boolean z2) {
        this.I = z2;
    }

    public final void setMUseBlackUi(boolean z2) {
        this.ad = z2;
    }

    public final void setMViewHeight(int i2) {
        this.f139173k = i2;
    }

    public final void setMViewWidth(int i2) {
        this.f139172j = i2;
    }

    public final void setNeedShowSuggestCircle(boolean z2) {
        this.aa = z2;
    }

    public final void setSuggestPercent(int i2) {
        this.W = i2;
    }

    public final void setTextInCenter(boolean z2) {
        this.ac = z2;
    }

    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BeautySeekBar f139184a;

        static {
            Covode.recordClassIndex(91020);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(BeautySeekBar beautySeekBar) {
            this.f139184a = beautySeekBar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f139184a.setMTouchAble(true);
            super.onAnimationEnd(animator);
        }
    }

    public final void setBarPadding(float f2) {
        this.R = f2;
        a();
    }

    public final void setMPaintBar(Paint paint) {
        l.d(paint, "");
        this.w = paint;
    }

    public final void setMPaintBarHint(Paint paint) {
        l.d(paint, "");
        this.x = paint;
    }

    public final void setMPaintCircle(Paint paint) {
        l.d(paint, "");
        this.y = paint;
    }

    public final void setMPaintDefaultCircle(Paint paint) {
        l.d(paint, "");
        this.z = paint;
    }

    public final void setMPaintTextCenter(Paint paint) {
        l.d(paint, "");
        this.B = paint;
    }

    public final void setMPaintTextFollow(Paint paint) {
        l.d(paint, "");
        this.A = paint;
    }

    public final void setMText(String str) {
        l.d(str, "");
        this.F = str;
    }

    public final void setMTextBounds(Rect rect) {
        l.d(rect, "");
        this.L = rect;
    }

    public final void setPaintSuggestCirvle(Paint paint) {
        l.d(paint, "");
        this.C = paint;
    }

    public final void setPercent(int i2) {
        this.D = i2;
        invalidate();
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        l.d(accessibilityEvent, "");
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final void setBarHeight(float f2) {
        this.w.setStrokeWidth(f2);
        this.x.setStrokeWidth(f2);
    }

    public final void setDefaultCircleConfig(int i2) {
        this.z.setColor(getResources().getColor(i2));
    }

    public final void setOnLevelChangeListener(c cVar) {
        l.d(cVar, "");
        this.M = new e(this, cVar);
    }

    public final void setSuggestCircleColor(int i2) {
        this.C.setColor(getResources().getColor(i2));
    }

    public final void setTextAlpha(int i2) {
        this.ah = i2;
        this.B.setAlpha(i2);
        this.A.setAlpha(i2);
    }

    public final void setTextSize(float f2) {
        this.B.setTextSize(f2);
        this.A.setTextSize(f2);
    }

    private final int b(int i2) {
        int i3;
        int i4 = this.S;
        if (((float) (i2 % i4)) >= ((float) i4) / 2.0f) {
            i3 = (i2 / i4) + 1;
        } else {
            i3 = i2 / i4;
        }
        return i3 * i4;
    }

    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BeautySeekBar f139181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f139182b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f139183c;

        static {
            Covode.recordClassIndex(91019);
        }

        f(BeautySeekBar beautySeekBar, int i2, int i3) {
            this.f139181a = beautySeekBar;
            this.f139182b = i2;
            this.f139183c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            BeautySeekBar beautySeekBar = this.f139181a;
            int i2 = this.f139182b;
            beautySeekBar.setMCurPercent((int) (((float) i2) + (((float) (this.f139183c - i2)) * floatValue)));
            this.f139181a.invalidate();
        }
    }

    private int a(int i2) {
        int i3;
        if (this.S > 1) {
            i2 = b(i2);
        }
        if (i2 > this.T) {
            i3 = this.U;
        } else if (i2 <= 0) {
            i3 = this.V;
        } else {
            i3 = i2 + this.V;
        }
        if (!b()) {
            return i3;
        }
        int i4 = this.f139167b;
        return (i3 < i4 + -2 || i3 > i4 + 2) ? i3 : i4;
    }

    private final void setCurrentProgress(int i2) {
        if (!(this.M == null || this.D == i2)) {
            this.D = Math.min(this.U, Math.max(i2, this.V));
            c cVar = this.M;
            if (cVar == null) {
                l.b();
            }
            cVar.a(this.D);
        }
        invalidate();
        sendAccessibilityEvent(4);
    }

    public final void buildDrawingCache(boolean z2) {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache(z2);
        }
    }

    public final void setContentDescription(CharSequence charSequence) {
        try {
            Field declaredField = View.class.getDeclaredField("mContentDescription");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(this, charSequence);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            super.setContentDescription(charSequence);
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            super.setContentDescription(charSequence);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        l.d(accessibilityNodeInfo, "");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        }
        if (Build.VERSION.SDK_INT >= 21 && isEnabled()) {
            if (this.D > this.V) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (this.D < this.U) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(0, (float) this.V, (float) this.U, (float) this.D);
        l.b(obtain, "");
        accessibilityNodeInfo.setRangeInfo(obtain);
    }

    private void a(boolean z2) {
        this.w.setColor(this.f139174l);
        if (z2) {
            Paint paint = this.w;
            Context context = getContext();
            l.b(context, "");
            paint.setShadowLayer(d.a(context, 1.0f), 0.0f, 0.0f, this.p);
        }
        this.x.setColor(this.f139175m);
        if (z2) {
            Paint paint2 = this.x;
            Context context2 = getContext();
            l.b(context2, "");
            paint2.setShadowLayer(d.a(context2, 1.0f), 0.0f, 0.0f, this.p);
        }
        this.y.setColor(this.u);
        if (z2) {
            Paint paint3 = this.y;
            Context context3 = getContext();
            l.b(context3, "");
            paint3.setShadowLayer(d.a(context3, 3.0f), 0.0f, 0.0f, this.p);
        }
        this.z.setColor(this.f139174l);
        this.C.setColor(getResources().getColor(17170443));
        this.A.setColor(this.v);
        this.B.setColor(this.f139174l);
        setTextAlpha(this.ah);
        this.ad = false;
        if (!this.ad && f139163g == null) {
            f139163g = getResources().getDrawable(R.drawable.d8);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        int i2;
        Drawable drawable;
        int i3;
        MethodCollector.i(12955);
        l.d(canvas, "");
        super.onDraw(canvas);
        if (!this.K) {
            MethodCollector.o(12955);
            return;
        }
        int i4 = this.D;
        int i5 = this.V;
        float f2 = this.R;
        float f3 = this.t;
        float f4 = (((float) (i4 - i5)) * f3) + f2;
        float f5 = f2 + (((float) (this.f139167b - i5)) * f3);
        float f6 = f2 + (((float) (this.W - i5)) * f3);
        int i6 = this.s;
        canvas.drawLine(f2, (float) i6, ((float) this.f139172j) - f2, (float) i6, this.x);
        if (this.ab) {
            float f7 = this.R;
            int i7 = this.s;
            canvas.drawLine(f7, (float) i7, f4, (float) i7, this.w);
        } else {
            int i8 = this.s;
            canvas.drawLine(f4, (float) i8, f5, (float) i8, this.w);
        }
        this.y.setAlpha(255);
        this.z.setAlpha(255);
        this.C.setAlpha(255);
        this.B.setAlpha(255);
        this.A.setAlpha(255);
        int i9 = this.V;
        int i10 = this.U;
        int i11 = this.f139167b;
        if (i9 <= i11 && i10 >= i11 && b()) {
            float f8 = (float) this.s;
            Context context = getContext();
            l.b(context, "");
            canvas.drawCircle(f5, f8, d.a(context, 2.0f), this.z);
        }
        int i12 = this.V;
        int i13 = this.U;
        int i14 = this.W;
        if (i12 <= i14 && i13 >= i14 && this.aa) {
            Context context2 = getContext();
            l.b(context2, "");
            canvas.drawCircle(f6, (float) this.s, d.a(context2, 3.0f), this.C);
        }
        canvas.drawCircle(f4, (float) this.s, this.P, this.y);
        int i15 = this.f139168c;
        if (i15 == Integer.MIN_VALUE) {
            i15 = this.D;
        }
        if (this.f139171f == 0.0f) {
            str = String.valueOf(i15);
        } else {
            str = this.f139169d;
            if (str == null) {
                str = "";
            }
        }
        if (!TextUtils.isEmpty(this.f139166a) && !TextUtils.isEmpty(str)) {
            str = this.f139166a + ' ' + str;
        }
        this.F = str;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(12955);
            return;
        }
        if (this.ac) {
            paint = this.B;
        } else {
            paint = this.A;
        }
        Paint paint2 = this.A;
        String str2 = this.F;
        paint2.getTextBounds(str2, 0, str2.length(), this.L);
        int width = this.L.width();
        Context context3 = getContext();
        l.b(context3, "");
        int a2 = (int) d.a(context3, 14.0f);
        if (this.ac) {
            i2 = this.r;
        } else {
            i2 = (int) f4;
        }
        Context context4 = getContext();
        l.b(context4, "");
        int a3 = (i2 - (width / 2)) - ((int) d.a(context4, 1.0f));
        int i16 = this.s - a2;
        if (this.ad) {
            drawable = f139164h;
        } else {
            drawable = f139163g;
        }
        if (!this.ac && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int max = Math.max(width, intrinsicWidth);
            float f9 = this.f139171f;
            if (f9 == 1.0f) {
                i3 = this.ah;
                max += intrinsicWidth;
            } else if (f9 > 0.0f) {
                max = ((int) (((float) intrinsicWidth) + (((float) (max - intrinsicWidth)) * f9))) + (intrinsicWidth * ((int) f9));
                i3 = 255;
            } else {
                i3 = this.ah;
            }
            float f10 = ((float) i2) - (((float) max) / 2.0f);
            Context context5 = getContext();
            l.b(context5, "");
            float a4 = ((float) this.s) - d.a(context5, 57.0f);
            drawable.setAlpha(i3);
            drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
            canvas.save();
            canvas.translate(f10, a4);
            drawable.draw(canvas);
            canvas.restore();
        }
        float f11 = this.f139171f;
        if (f11 <= 0.0f || f11 >= 1.0f) {
            canvas.drawText(this.F, (float) a3, (float) i16, paint);
            MethodCollector.o(12955);
            return;
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (this.f139171f * 255.0f));
        canvas.drawText(this.F, (float) a3, (float) i16, paint);
        paint.setAlpha(alpha);
        MethodCollector.o(12955);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r3 > (r2 - (r1 - com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.a.b(r0)))) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (!isEnabled()) {
            return false;
        }
        if (i2 == 4096 || i2 == 8192) {
            int max = Math.max(1, Math.round(((float) (this.U - this.V)) / 20.0f));
            if (i2 == 8192) {
                max = -max;
            }
            setCurrentProgress(this.D + max);
            return true;
        } else if (i2 != 16908349) {
            return super.performAccessibilityAction(i2, bundle);
        } else {
            if (Build.VERSION.SDK_INT < 24 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            setCurrentProgress((int) bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            return true;
        }
    }

    private /* synthetic */ BeautySeekBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    public final void a(int i2, int i3, int i4) {
        this.f139174l = i2;
        this.f139175m = i3;
        this.u = i4;
        a(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BeautySeekBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        String str = "";
        l.d(context, str);
        MethodCollector.i(11669);
        this.w = new Paint();
        this.x = new Paint();
        this.y = new Paint();
        this.z = new Paint();
        this.A = new Paint();
        this.B = new Paint();
        this.C = new Paint();
        this.F = str;
        this.I = true;
        this.L = new Rect();
        this.R = d.a(context, 40.0f);
        this.aa = true;
        this.ab = true;
        this.af = true;
        this.f139168c = Integer.MIN_VALUE;
        this.ag = new b();
        this.f139171f = 0.1f;
        this.J = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jv, R.attr.jw, R.attr.jx, R.attr.jy, R.attr.jz, R.attr.k0, R.attr.k1, R.attr.k2});
            l.b(obtainStyledAttributes, str);
            String string = obtainStyledAttributes.getString(5);
            this.f139166a = string != null ? string : str;
            this.N = obtainStyledAttributes.getColor(6, -16777216);
            this.O = obtainStyledAttributes.getDimension(7, d.a(context, 14.0f));
            this.R = obtainStyledAttributes.getDimension(0, d.a(context, 40.0f));
            this.P = obtainStyledAttributes.getDimension(3, a.a(context));
            this.Q = obtainStyledAttributes.getDimension(2, d.a(context, 4.0f));
            this.S = obtainStyledAttributes.getInt(4, 1);
            this.v = obtainStyledAttributes.getColor(1, getResources().getColor(17170443));
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.f139174l = 17170443;
            this.f139175m = 1040187391;
            this.n = R.color.e_;
            this.o = R.color.dy;
            this.p = 1073741824;
            this.q = R.color.us;
            this.u = 17170443;
            this.w.setStyle(Paint.Style.FILL);
            this.w.setStrokeWidth(this.Q);
            this.w.setStrokeCap(Paint.Cap.ROUND);
            this.w.setAntiAlias(true);
            this.x.setStyle(Paint.Style.FILL);
            this.x.setStrokeWidth(this.Q);
            this.x.setStrokeCap(Paint.Cap.ROUND);
            this.x.setAntiAlias(true);
            this.y.setStyle(Paint.Style.FILL);
            this.y.setAntiAlias(true);
            this.z.setStyle(Paint.Style.FILL);
            this.z.setAntiAlias(true);
            this.C.setStyle(Paint.Style.FILL);
            this.C.setAntiAlias(true);
            this.A.setTextSize(this.O);
            this.A.setAntiAlias(true);
            this.B.setTextSize(this.O);
            this.B.setAntiAlias(true);
            a(true);
            setImportantForAccessibility(1);
            setFocusable(true);
            setFocusableInTouchMode(true);
            setClickable(true);
            if (Build.VERSION.SDK_INT >= 26) {
                setFocusedByDefault(true);
            }
        }
        MethodCollector.o(11669);
    }

    public void a(int i2, int i3, boolean z2) {
        int i4;
        this.U = i2;
        this.V = i3;
        if (i3 <= 0 && i2 >= 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        this.f139167b = i4;
        this.T = i2 - i3;
        this.ab = z2;
        if (this.f139172j > 0 && this.f139173k > 0) {
            a();
        }
        invalidate();
        this.f139169d = null;
        ValueAnimator valueAnimator = this.f139170e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f139170e = null;
        }
        this.f139171f = 0.0f;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f139173k != getMeasuredHeight() || this.f139172j != getMeasuredWidth()) {
            this.f139172j = getMeasuredWidth();
            this.f139173k = getMeasuredHeight();
            a();
        }
    }
}
