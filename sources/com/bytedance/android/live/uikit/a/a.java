package com.bytedance.android.live.uikit.a;

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

final class a extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    Animation.AnimationListener f12839a;

    /* renamed from: b  reason: collision with root package name */
    private int f12840b;

    static {
        Covode.recordClassIndex(7138);
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
        Animation.AnimationListener animationListener = this.f12839a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f12839a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(getResources().getColor(i2));
        }
    }

    public a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (20.0f * f2 * 2.0f);
        int i3 = (int) (1.75f * f2);
        int i4 = (int) (0.0f * f2);
        this.f12840b = (int) (3.5f * f2);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            v.a(this, f2 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C0266a(this.f12840b, i2));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f12840b, (float) i4, (float) i3, 503316480);
            int i5 = this.f12840b;
            setPadding(i5, i5, i5, i5);
        }
        shapeDrawable.getPaint().setColor(-328966);
        setBackgroundDrawable(shapeDrawable);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f12840b * 2), getMeasuredHeight() + (this.f12840b * 2));
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.a.a$a  reason: collision with other inner class name */
    class C0266a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f12842b;

        /* renamed from: c  reason: collision with root package name */
        private int f12843c;

        /* renamed from: d  reason: collision with root package name */
        private Paint f12844d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        private int f12845e;

        static {
            Covode.recordClassIndex(7139);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth();
            float f2 = (float) (width / 2);
            float height = (float) (a.this.getHeight() / 2);
            canvas.drawCircle(f2, height, (float) ((this.f12845e / 2) + this.f12843c), this.f12844d);
            canvas.drawCircle(f2, height, (float) (this.f12845e / 2), paint);
        }

        public C0266a(int i2, int i3) {
            this.f12843c = i2;
            this.f12845e = i3;
            int i4 = this.f12845e;
            RadialGradient radialGradient = new RadialGradient((float) (i4 / 2), (float) (i4 / 2), (float) this.f12843c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f12842b = radialGradient;
            this.f12844d.setShader(radialGradient);
        }
    }
}
