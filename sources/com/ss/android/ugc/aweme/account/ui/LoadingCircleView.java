package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class LoadingCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65397a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f65398b;

    /* renamed from: c  reason: collision with root package name */
    private float f65399c;

    /* renamed from: d  reason: collision with root package name */
    private float f65400d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f65401e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f65402f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f65403g;

    /* renamed from: h  reason: collision with root package name */
    private RectF f65404h;

    /* renamed from: i  reason: collision with root package name */
    private final h f65405i;

    static {
        Covode.recordClassIndex(40208);
    }

    public LoadingCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final RotateAnimation getRotateAnim() {
        return (RotateAnimation) this.f65405i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40209);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b() {
        this.f65402f = false;
        clearAnimation();
    }

    private final void d() {
        if (!c()) {
            startAnimation(getRotateAnim());
        }
    }

    public final void a() {
        this.f65402f = true;
        if (this.f65401e) {
            d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f65401e = true;
        if (this.f65402f) {
            d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f65401e = false;
        clearAnimation();
    }

    static final class b extends m implements h.f.a.a<RotateAnimation> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65406a = new b();

        static {
            Covode.recordClassIndex(40210);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RotateAnimation invoke() {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1000);
            return rotateAnimation;
        }
    }

    private boolean c() {
        if (!getRotateAnim().hasStarted() || getRotateAnim().hasEnded()) {
            return false;
        }
        return true;
    }

    public final void setLineWidth(float f2) {
        this.f65403g.setStrokeWidth(f2);
    }

    public final void setLoadingColor(int i2) {
        this.f65403g.setColor(i2);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f65404h == null) {
            float f2 = this.f65399c / 2.0f;
            this.f65404h = new RectF(((float) v.f(this)) + f2, ((float) getPaddingTop()) + f2, ((float) (getWidth() - v.g(this))) - f2, ((float) (getHeight() - getPaddingBottom())) - f2);
        }
        if (canvas != null) {
            RectF rectF = this.f65404h;
            if (rectF == null) {
                l.b();
            }
            canvas.drawArc(rectF, 0.0f, this.f65400d, false, this.f65403g);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingCircleView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LoadingCircleView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9451);
        this.f65403g = new Paint();
        this.f65405i = i.a((h.f.a.a) b.f65406a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nc, R.attr.a2k, R.attr.ag3});
        l.b(obtainStyledAttributes, "");
        this.f65398b = obtainStyledAttributes.getColor(0, -16777216);
        this.f65399c = (float) obtainStyledAttributes.getDimensionPixelSize(1, n.a(5.0d));
        this.f65400d = obtainStyledAttributes.getFloat(2, 300.0f);
        obtainStyledAttributes.recycle();
        this.f65403g.setAntiAlias(true);
        this.f65403g.setStyle(Paint.Style.STROKE);
        this.f65403g.setStrokeCap(Paint.Cap.ROUND);
        setLoadingColor(this.f65398b);
        setLineWidth(this.f65399c);
        MethodCollector.o(9451);
    }
}
