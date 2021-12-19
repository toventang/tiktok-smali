package com.bytedance.tux.status.loading;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;

public final class TuxSpinner extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public b f45392a;

    /* renamed from: b  reason: collision with root package name */
    private Animator f45393b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45394c;

    static {
        Covode.recordClassIndex(27638);
    }

    public TuxSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    private final void a() {
        Animator animator;
        if (!this.f45394c && (animator = this.f45393b) != null) {
            animator.start();
            this.f45394c = true;
        }
    }

    private final void b() {
        this.f45394c = false;
        Animator animator = this.f45393b;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        k.a(this);
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (getVisibility() == 0) {
            a();
        } else {
            b();
        }
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxSpinner f45395a;

        static {
            Covode.recordClassIndex(27639);
        }

        a(TuxSpinner tuxSpinner) {
            this.f45395a = tuxSpinner;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                b bVar = this.f45395a.f45392a;
                bVar.f45396g = floatValue;
                bVar.invalidateSelf();
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class b extends com.bytedance.tux.c.b {

        /* renamed from: g  reason: collision with root package name */
        public float f45396g;

        static {
            Covode.recordClassIndex(27640);
        }

        @Override // com.bytedance.tux.c.b
        public final void draw(Canvas canvas) {
            l.c(canvas, "");
            int width = getBounds().width();
            int height = getBounds().height();
            canvas.save();
            canvas.rotate(this.f45396g, ((float) getBounds().left) + (((float) width) / 2.0f), ((float) getBounds().top) + (((float) height) / 2.0f));
            super.draw(canvas);
            canvas.restore();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context, int i2) {
            super(context, i2);
            l.c(context, "");
        }
    }

    public final void a(int i2, int i3) {
        Context context = getContext();
        l.a((Object) context, "");
        b bVar = new b(context, i2);
        this.f45392a = bVar;
        bVar.c(i3);
        setImageDrawable(this.f45392a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSpinner(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap8, R.attr.arl}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = new b(context, resourceId);
        this.f45392a = bVar;
        bVar.c(color);
        setImageDrawable(this.f45392a);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new a(this));
        this.f45393b = ofFloat;
        if (getVisibility() == 0) {
            a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.c6 : i2);
    }
}
