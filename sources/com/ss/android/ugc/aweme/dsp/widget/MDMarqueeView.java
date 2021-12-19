package com.ss.android.ugc.aweme.dsp.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.core.f.y;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class MDMarqueeView extends View {

    /* renamed from: g  reason: collision with root package name */
    public static final a f84029g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f84030a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f84031b;

    /* renamed from: c  reason: collision with root package name */
    public float f84032c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f84033d;

    /* renamed from: e  reason: collision with root package name */
    public int f84034e;

    /* renamed from: f  reason: collision with root package name */
    public int f84035f;

    /* renamed from: h  reason: collision with root package name */
    private Float f84036h;

    /* renamed from: i  reason: collision with root package name */
    private TextPaint f84037i;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f84038j;

    /* renamed from: k  reason: collision with root package name */
    private ValueAnimator f84039k;

    /* renamed from: l  reason: collision with root package name */
    private float f84040l;

    /* renamed from: m  reason: collision with root package name */
    private int f84041m;
    private Animator.AnimatorListener n;
    private boolean o;

    static {
        Covode.recordClassIndex(52399);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52400);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f84039k.cancel();
        super.onDetachedFromWindow();
        String.valueOf("onDetachedFromWindow, " + hashCode());
    }

    public final void setMarqueeEnable(boolean z) {
        this.o = z;
    }

    public final void setMarqueeRepeatCount(int i2) {
        this.f84034e = i2;
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MDMarqueeView f84042a;

        static {
            Covode.recordClassIndex(52401);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(MDMarqueeView mDMarqueeView) {
            this.f84042a = mDMarqueeView;
        }

        public final void onAnimationCancel(Animator animator) {
            String.valueOf("onAnimationCancel, " + this.f84042a.hashCode());
        }

        public final void onAnimationStart(Animator animator) {
            String.valueOf("onAnimationStart, " + this.f84042a.hashCode());
        }

        public final void onAnimationEnd(Animator animator) {
            String.valueOf("onAnimationEnd, mAnimatorRepeatCount:" + this.f84042a.f84034e + ", mAnimatorIsRunning:" + this.f84042a.f84033d + ", " + this.f84042a.hashCode());
            if (this.f84042a.f84034e == 0 && this.f84042a.f84033d) {
                double length = (double) this.f84042a.f84030a.length();
                double width = (double) this.f84042a.getWidth();
                Double.isNaN(length);
                Double.isNaN(width);
                double d2 = length * width;
                double d3 = (double) this.f84042a.f84035f;
                Double.isNaN(d3);
                int ceil = ((int) Math.ceil(d2 / d3)) - 3;
                if (ceil < 0) {
                    ceil = 0;
                }
                if (this.f84042a.f84030a.length() >= ceil) {
                    MDMarqueeView mDMarqueeView = this.f84042a;
                    String str = mDMarqueeView.f84030a;
                    int length2 = this.f84042a.f84030a.length();
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    mDMarqueeView.f84030a = p.a(str, ceil, length2, "...").toString();
                }
                this.f84042a.f84031b = false;
                this.f84042a.invalidate();
            }
        }
    }

    public final void setTextSize(float f2) {
        this.f84036h = Float.valueOf(f2);
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MDMarqueeView f84043a;

        static {
            Covode.recordClassIndex(52402);
        }

        c(MDMarqueeView mDMarqueeView) {
            this.f84043a = mDMarqueeView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            this.f84043a.f84032c = valueAnimator.getAnimatedFraction();
            this.f84043a.invalidate();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getX() <= ((float) this.f84035f)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setText(String str) {
        l.d(str, "");
        setContentDescription(str);
        this.f84030a = str;
        this.f84033d = false;
        this.f84031b = false;
        this.f84039k.cancel();
        String.valueOf("restoreMarqueeAnimation, " + hashCode());
        String obj = getContentDescription().toString();
        this.f84037i.getTextBounds(obj, 0, obj.length(), this.f84038j);
        this.f84035f = this.f84038j.left + this.f84038j.width() + getPaddingLeft() + getPaddingRight();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(1736);
        l.d(canvas, "");
        super.onDraw(canvas);
        if (!this.f84033d) {
            if (getWidth() < this.f84035f) {
                this.f84031b = true;
                if (this.o) {
                    ValueAnimator valueAnimator = this.f84039k;
                    valueAnimator.addUpdateListener(new c(this));
                    valueAnimator.removeListener(this.n);
                    valueAnimator.addListener(this.n);
                    valueAnimator.setDuration(((long) this.f84030a.length()) * 400);
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    valueAnimator.setRepeatCount(this.f84034e);
                    valueAnimator.start();
                    String.valueOf("startAnimator, " + hashCode());
                    this.f84033d = true;
                }
            } else {
                this.f84039k.cancel();
            }
        }
        String.valueOf("triggerMarquee, content:" + this.f84030a + ", mAnimatorIsRunning:" + this.f84033d + ", mNeededWidth:" + this.f84035f + ", width:" + getWidth() + ", mEnableMarqueeAnimator:" + this.o + ", " + hashCode());
        if (this.f84031b) {
            canvas.clipRect(getPaddingLeft(), 0, getWidth() - getPaddingRight(), getHeight());
            float paddingLeft = (float) getPaddingLeft();
            float height = (((float) getHeight()) + this.f84040l) / 2.0f;
            canvas.save();
            canvas.translate((-this.f84032c) * ((float) (this.f84038j.width() + 100)), 0.0f);
            canvas.drawText(this.f84030a, paddingLeft, height, this.f84037i);
            canvas.drawText(this.f84030a, paddingLeft + ((float) this.f84038j.width()) + 100.0f, height, this.f84037i);
            canvas.restore();
            MethodCollector.o(1736);
            return;
        }
        this.f84039k.cancel();
        canvas.drawText(this.f84030a, (float) getPaddingLeft(), (((float) getHeight()) + this.f84040l) / 2.0f, this.f84037i);
        String.valueOf("onDraw, cancel animator, " + hashCode());
        MethodCollector.o(1736);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MDMarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            size = Math.min(this.f84035f, size);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MDMarqueeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        float f2;
        l.d(context, "");
        MethodCollector.i(1967);
        float f3 = 0.0f;
        this.f84036h = Float.valueOf(0.0f);
        this.f84030a = "";
        this.f84037i = new TextPaint();
        this.f84038j = new Rect();
        this.f84039k = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f84034e = -1;
        this.n = new b(this);
        this.o = true;
        try {
            this.f84036h = Float.valueOf(n.b(context, 18.0f));
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aih});
                l.b(obtainStyledAttributes, "");
                Float f4 = this.f84036h;
                if (f4 == null) {
                    l.b();
                }
                this.f84036h = Float.valueOf(obtainStyledAttributes.getDimension(0, f4.floatValue()));
                obtainStyledAttributes.recycle();
            }
            this.f84037i = new TextPaint(5);
            int color = context.getResources().getColor(R.color.a9);
            this.f84041m = color;
            this.f84037i.setColor(color);
            this.f84037i.setAntiAlias(true);
            this.f84037i.setFakeBoldText(true);
            TextPaint textPaint = this.f84037i;
            Float f5 = this.f84036h;
            if (f5 != null) {
                textPaint.setTextSize(f5.floatValue());
                TextPaint textPaint2 = this.f84037i;
                Context e2 = y.e();
                l.b(e2, "");
                Context a2 = i.a.a.a.a.b.a(e2);
                l.b(a2, "");
                Resources resources = a2.getResources();
                l.b(resources, "");
                textPaint2.setShadowLayer((0.5f / resources.getDisplayMetrics().density) + 0.5f, 0.0f, 0.0f, context.getResources().getColor(R.color.bk));
                Paint.FontMetrics fontMetrics = this.f84037i.getFontMetrics();
                if (fontMetrics != null) {
                    f2 = fontMetrics.descent;
                    f3 = fontMetrics.ascent;
                } else {
                    f2 = 0.0f;
                }
                this.f84040l = -(f2 + f3);
                MethodCollector.o(1967);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            MethodCollector.o(1967);
            throw nullPointerException;
        } catch (Exception e3) {
            e3.printStackTrace();
            MethodCollector.o(1967);
        }
    }
}
