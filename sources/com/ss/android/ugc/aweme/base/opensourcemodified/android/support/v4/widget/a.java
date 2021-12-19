package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

/* access modifiers changed from: package-private */
public final class a extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    Animation.AnimationListener f68211a;

    /* renamed from: b  reason: collision with root package name */
    int f68212b;

    /* renamed from: c  reason: collision with root package name */
    public ShapeDrawable f68213c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f68214d;

    static {
        Covode.recordClassIndex(42023);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f68211a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f68211a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.f68214d) {
            super.draw(canvas);
        }
    }

    public final void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a$a  reason: collision with other inner class name */
    class C1544a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f68216b;

        /* renamed from: c  reason: collision with root package name */
        private Paint f68217c = new Paint();

        static {
            Covode.recordClassIndex(42024);
        }

        private void a(int i2) {
            float f2 = (float) (i2 / 2);
            RadialGradient radialGradient = new RadialGradient(f2, f2, (float) a.this.f68212b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f68216b = radialGradient;
            this.f68217c.setShader(radialGradient);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            a((int) f2);
        }

        C1544a(int i2) {
            a.this.f68212b = i2;
            a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth();
            int height = a.this.getHeight();
            int i2 = width / 2;
            if (i2 >= 0 && i2 - a.this.f68212b >= 0) {
                float f2 = (float) i2;
                float f3 = (float) (height / 2);
                canvas.drawCircle(f2, f3, f2, this.f68217c);
                canvas.drawCircle(f2, f3, (float) (i2 - a.this.f68212b), paint);
            }
        }
    }

    a(Context context) {
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f2);
        int i3 = (int) (0.0f * f2);
        this.f68212b = (int) (3.5f * f2);
        if (a()) {
            this.f68213c = new ShapeDrawable(new OvalShape());
            v.a(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new C1544a(this.f68212b));
            this.f68213c = shapeDrawable;
            setLayerType(1, shapeDrawable.getPaint());
            this.f68213c.getPaint().setShadowLayer((float) this.f68212b, (float) i3, (float) i2, 503316480);
            int i4 = this.f68212b;
            setPadding(i4, i4, i4, i4);
        }
        this.f68213c.getPaint().setColor(-328966);
        v.a(this, this.f68213c);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f68212b * 2), getMeasuredHeight() + (this.f68212b * 2));
        }
    }
}
