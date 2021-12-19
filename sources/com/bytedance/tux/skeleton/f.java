package com.bytedance.tux.skeleton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.skeleton.a.b;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.List;

public abstract class f extends a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f45333d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45334e;

    static {
        Covode.recordClassIndex(27619);
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final List<b> getPlaceholders() {
        return this.f45333d;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        while (this.f45333d.size() > 1) {
            this.f45333d.remove(0).setCallback(null);
        }
        while (this.f45333d.size() <= 0) {
            List<b> list = this.f45333d;
            b bVar = new b();
            bVar.setCallback(this);
            list.add(bVar);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        l.c(drawable, "");
        if (n.a((Iterable) this.f45333d, (Object) drawable)) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        l.c(canvas, "");
        if (!a()) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.f45334e) {
            this.f45334e = true;
            getAnimator().addUpdateListener(this);
            if (!getAnimator().isStarted()) {
                getAnimator().start();
            }
        }
        for (T t : this.f45333d) {
            t.f45326a = getRadius();
            t.f45327b.setColor(getPlaceholderColor());
            t.f45331d = getPulsingColor();
            t.draw(canvas);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        l.c(valueAnimator, "");
        for (T t : this.f45333d) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                int i2 = t.f45331d;
                int alpha = Color.alpha(i2);
                int red = Color.red(i2);
                int green = Color.green(i2);
                t.f45330c.setColor((((int) ((((float) intValue) / 255.0f) * ((float) alpha))) << 24) | (red << 16) | (green << 8) | Color.blue(i2));
                invalidate();
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    private /* synthetic */ f(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        this.f45333d = new ArrayList();
        a(new g(this), new m<ValueAnimator, ValueAnimator, z>(this) {
            /* class com.bytedance.tux.skeleton.f.AnonymousClass1 */
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(27620);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
                ValueAnimator valueAnimator3 = valueAnimator;
                ValueAnimator valueAnimator4 = valueAnimator2;
                l.c(valueAnimator4, "");
                if (valueAnimator3 != null) {
                    valueAnimator3.removeUpdateListener(this.this$0);
                    if (valueAnimator3.isRunning()) {
                        valueAnimator3.cancel();
                    }
                }
                valueAnimator4.addUpdateListener(this.this$0);
                if (!valueAnimator4.isStarted()) {
                    valueAnimator4.start();
                }
                return z.f158842a;
            }
        });
    }
}
