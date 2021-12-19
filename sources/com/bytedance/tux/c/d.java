package com.bytedance.tux.c;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;

public final class d extends b {

    /* renamed from: g  reason: collision with root package name */
    public float f44771g;

    /* renamed from: h  reason: collision with root package name */
    public final ValueAnimator f44772h = new ValueAnimator();

    static {
        Covode.recordClassIndex(27346);
    }

    @Override // com.bytedance.tux.c.b
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f44772h;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
    }

    public static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f44773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PropertyValuesHolder f44774b;

        static {
            Covode.recordClassIndex(27347);
        }

        public a(d dVar, PropertyValuesHolder propertyValuesHolder) {
            this.f44773a = dVar;
            this.f44774b = propertyValuesHolder;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            d dVar = this.f44773a;
            l.a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dVar.f44771g = (float) ((Integer) animatedValue).intValue();
                this.f44773a.invalidateSelf();
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @Override // com.bytedance.tux.c.b
    public final void draw(Canvas canvas) {
        l.c(canvas, "");
        int width = getBounds().width();
        int height = getBounds().height();
        canvas.save();
        canvas.rotate(this.f44771g, ((float) getBounds().left) + (((float) width) / 2.0f), ((float) getBounds().top) + (((float) height) / 2.0f));
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, int i2) {
        super(context, i2);
        l.c(context, "");
    }
}
