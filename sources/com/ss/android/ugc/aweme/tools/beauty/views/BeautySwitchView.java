package com.ss.android.ugc.aweme.tools.beauty.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class BeautySwitchView extends View {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f139186d = {R.attr.ag9};

    /* renamed from: l  reason: collision with root package name */
    private static final Property<BeautySwitchView, Float> f139187l = new Property<BeautySwitchView, Float>(Float.class, "thumbPos") {
        /* class com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(91023);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(BeautySwitchView beautySwitchView) {
            return Float.valueOf(beautySwitchView.f139188a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(BeautySwitchView beautySwitchView, Float f2) {
            beautySwitchView.setThumbPosition(f2.floatValue());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public float f139188a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f139189b;

    /* renamed from: c  reason: collision with root package name */
    ObjectAnimator f139190c;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f139191e;

    /* renamed from: f  reason: collision with root package name */
    private int f139192f;

    /* renamed from: g  reason: collision with root package name */
    private int f139193g;

    /* renamed from: h  reason: collision with root package name */
    private int f139194h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f139195i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f139196j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f139197k;

    /* renamed from: m  reason: collision with root package name */
    private Paint f139198m;
    private int n;
    private a o;
    private int p;
    private VelocityTracker q;
    private int r;
    private float s;
    private float t;
    private boolean u;

    public interface a {
        static {
            Covode.recordClassIndex(91024);
        }

        void a(boolean z);
    }

    public Drawable getThumbDrawable() {
        return this.f139191e;
    }

    public Rect getThumbRect() {
        return this.f139195i;
    }

    public int getTrackPadding() {
        return this.f139193g;
    }

    public int getTrackRadius() {
        return this.f139194h;
    }

    public ColorStateList getTrackTintList() {
        return this.f139197k;
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.f139192f;
    }

    private boolean getTargetCheckedState() {
        if (this.f139188a > 0.5f) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(91022);
    }

    private int getThumbOffset() {
        float f2;
        if (v.e(this) == 1) {
            f2 = 1.0f - this.f139188a;
        } else {
            f2 = this.f139188a;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    public void setEnableTouch(boolean z) {
        this.u = z;
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.o = aVar;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f139191e = drawable;
    }

    public void setThumbRect(Rect rect) {
        this.f139195i = rect;
    }

    public void setTrackPadding(int i2) {
        this.f139193g = i2;
    }

    public void setTrackRadius(int i2) {
        this.f139194h = i2;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f139197k = colorStateList;
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f2) {
        this.f139188a = f2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.f139189b) {
            mergeDrawableStates(onCreateDrawableState, f139186d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(12933);
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f139197k;
        if (colorStateList != null) {
            this.f139198m.setColor(colorStateList.getColorForState(drawableState, -65536));
        }
        this.f139196j.left = 0.0f;
        this.f139196j.right = (float) getMeasuredWidth();
        this.f139196j.top = (float) this.f139193g;
        this.f139196j.bottom = (float) (getMeasuredHeight() - this.f139193g);
        RectF rectF = this.f139196j;
        int i2 = this.f139194h;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.f139198m);
        this.f139195i.left = getThumbOffset();
        Rect rect = this.f139195i;
        rect.right = rect.left + this.f139192f;
        Drawable drawable = this.f139191e;
        if (drawable != null) {
            drawable.setBounds(this.f139195i);
            this.f139191e.setState(drawableState);
            this.f139191e.draw(canvas);
        }
        MethodCollector.o(12933);
    }

    public void setChecked(boolean z) {
        if (this.f139189b != z) {
            this.f139189b = z;
            a aVar = this.o;
            if (aVar != null) {
                aVar.a(z);
            }
        }
        refreshDrawableState();
        float f2 = 1.0f;
        if (getWindowToken() == null || !v.v(this)) {
            ObjectAnimator objectAnimator = this.f139190c;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z) {
                f2 = 0.0f;
            }
            setThumbPosition(f2);
            return;
        }
        if (!z) {
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f139187l, f2);
        this.f139190c = ofFloat;
        ofFloat.setDuration(250L);
        int i2 = Build.VERSION.SDK_INT;
        this.f139190c.setAutoCancel(true);
        this.f139190c.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != 3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public BeautySwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(12832);
        Drawable drawable = this.f139191e;
        if (drawable == null) {
            super.onMeasure(i2, i3);
            MethodCollector.o(12832);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.f139191e.getIntrinsicHeight();
        this.f139195i.left = 0;
        this.f139195i.top = 0;
        this.f139195i.right = intrinsicWidth;
        this.f139192f = intrinsicWidth;
        this.f139195i.bottom = intrinsicHeight;
        this.f139191e.setBounds(this.f139195i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
            MethodCollector.o(12832);
            return;
        }
        setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        MethodCollector.o(12832);
    }

    private BeautySwitchView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12699);
        this.f139198m = new Paint();
        this.q = VelocityTracker.obtain();
        this.u = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k3, R.attr.k4, R.attr.k5, R.attr.k6});
        this.f139191e = obtainStyledAttributes.getDrawable(0);
        this.f139197k = obtainStyledAttributes.getColorStateList(3);
        this.f139193g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f139194h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        this.f139198m.setAntiAlias(true);
        this.f139195i = new Rect();
        this.f139196j = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        MethodCollector.o(12699);
    }
}
