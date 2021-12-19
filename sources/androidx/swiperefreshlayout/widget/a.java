package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

/* access modifiers changed from: package-private */
public class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    Animation.AnimationListener f4386a;

    /* renamed from: b  reason: collision with root package name */
    int f4387b;

    static {
        Covode.recordClassIndex(1702);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4386a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4386a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    class C0065a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f4389b;

        /* renamed from: c  reason: collision with root package name */
        private Paint f4390c = new Paint();

        static {
            Covode.recordClassIndex(1703);
        }

        private void a(int i2) {
            float f2 = (float) (i2 / 2);
            RadialGradient radialGradient = new RadialGradient(f2, f2, (float) a.this.f4387b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f4389b = radialGradient;
            this.f4390c.setShader(radialGradient);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            a((int) f2);
        }

        C0065a(int i2) {
            a.this.f4387b = i2;
            a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth() / 2;
            float f2 = (float) width;
            float height = (float) (a.this.getHeight() / 2);
            canvas.drawCircle(f2, height, f2, this.f4390c);
            canvas.drawCircle(f2, height, (float) (width - a.this.f4387b), paint);
        }
    }

    a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f2);
        int i3 = (int) (0.0f * f2);
        this.f4387b = (int) (3.5f * f2);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            v.a(this, f2 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C0065a(this.f4387b));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f4387b, (float) i3, (float) i2, 503316480);
            int i4 = this.f4387b;
            setPadding(i4, i4, i4, i4);
        }
        shapeDrawable.getPaint().setColor(-328966);
        v.a(this, shapeDrawable);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f4387b * 2), getMeasuredHeight() + (this.f4387b * 2));
        }
    }
}
