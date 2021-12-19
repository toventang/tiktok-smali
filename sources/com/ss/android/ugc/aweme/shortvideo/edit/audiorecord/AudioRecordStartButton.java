package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.Objects;

public final class AudioRecordStartButton extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f126845a;

    /* renamed from: b  reason: collision with root package name */
    a f126846b;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f126847c = ValueAnimator.ofFloat(1.0f, 0.72f);

    /* renamed from: d  reason: collision with root package name */
    ValueAnimator f126848d = ValueAnimator.ofFloat(0.72f, 1.0f);

    static {
        Covode.recordClassIndex(83221);
    }

    public final void a() {
        this.f126847c.end();
        this.f126848d.start();
    }

    public final void b() {
        a aVar = this.f126846b;
        if (aVar == null) {
            l.a("centerView");
        }
        aVar.f126851c.end();
        aVar.f126850b.start();
    }

    public static final class a extends View {

        /* renamed from: a  reason: collision with root package name */
        public float f126849a;

        /* renamed from: b  reason: collision with root package name */
        ValueAnimator f126850b;

        /* renamed from: c  reason: collision with root package name */
        ValueAnimator f126851c;

        /* renamed from: d  reason: collision with root package name */
        private final Paint f126852d;

        /* renamed from: e  reason: collision with root package name */
        private final float f126853e;

        /* renamed from: f  reason: collision with root package name */
        private final float f126854f;

        static {
            Covode.recordClassIndex(83222);
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ValueAnimator valueAnimator = this.f126850b;
            l.b(valueAnimator, "");
            if (valueAnimator.isRunning()) {
                this.f126850b.end();
            }
            ValueAnimator valueAnimator2 = this.f126851c;
            l.b(valueAnimator2, "");
            if (valueAnimator2.isRunning()) {
                this.f126851c.end();
            }
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            MethodCollector.i(3457);
            super.onDraw(canvas);
            if (canvas != null) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                float f2 = this.f126849a;
                canvas.drawRoundRect(rectF, f2, f2, this.f126852d);
                MethodCollector.o(3457);
                return;
            }
            MethodCollector.o(3457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            l.d(context, "");
            MethodCollector.i(3462);
            Paint paint = new Paint();
            this.f126852d = paint;
            float b2 = n.b(getContext(), 3.5f);
            this.f126853e = b2;
            float b3 = n.b(getContext(), 13.0f);
            this.f126854f = b3;
            this.f126849a = b3;
            this.f126850b = ValueAnimator.ofFloat(b2, b3);
            this.f126851c = ValueAnimator.ofFloat(b3, b2);
            paint.setAntiAlias(true);
            paint.setColor(Color.parseColor("#fe2c55"));
            this.f126850b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f126855a;

                static {
                    Covode.recordClassIndex(83223);
                }

                {
                    this.f126855a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a aVar = this.f126855a;
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f126849a = ((Float) animatedValue).floatValue();
                    this.f126855a.invalidate();
                }
            });
            ValueAnimator valueAnimator = this.f126850b;
            l.b(valueAnimator, "");
            valueAnimator.setDuration(250L);
            this.f126851c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f126856a;

                static {
                    Covode.recordClassIndex(83224);
                }

                {
                    this.f126856a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a aVar = this.f126856a;
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f126849a = ((Float) animatedValue).floatValue();
                    this.f126856a.invalidate();
                }
            });
            ValueAnimator valueAnimator2 = this.f126851c;
            l.b(valueAnimator2, "");
            valueAnimator2.setDuration(250L);
            MethodCollector.o(3462);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f126847c;
        l.b(valueAnimator, "");
        if (valueAnimator.isRunning()) {
            this.f126847c.end();
        }
        ValueAnimator valueAnimator2 = this.f126848d;
        l.b(valueAnimator2, "");
        if (valueAnimator2.isRunning()) {
            this.f126848d.end();
        }
    }

    public static final /* synthetic */ ImageView a(AudioRecordStartButton audioRecordStartButton) {
        ImageView imageView = audioRecordStartButton.f126845a;
        if (imageView == null) {
            l.a("bgView");
        }
        return imageView;
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioRecordStartButton f126857a;

        static {
            Covode.recordClassIndex(83225);
        }

        b(AudioRecordStartButton audioRecordStartButton) {
            this.f126857a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            AudioRecordStartButton.a(this.f126857a).setScaleX(floatValue);
            AudioRecordStartButton.a(this.f126857a).setScaleY(floatValue);
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioRecordStartButton f126858a;

        static {
            Covode.recordClassIndex(83226);
        }

        c(AudioRecordStartButton audioRecordStartButton) {
            this.f126858a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            AudioRecordStartButton.a(this.f126858a).setScaleX(floatValue);
            AudioRecordStartButton.a(this.f126858a).setScaleY(floatValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioRecordStartButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(6179);
        ImageView imageView = new ImageView(getContext());
        this.f126845a = imageView;
        imageView.setBackground(com.ss.android.ugc.tools.view.a.a(-16776961, -1, 0));
        View view = this.f126845a;
        if (view == null) {
            l.a("bgView");
        }
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        Context context2 = getContext();
        l.b(context2, "");
        this.f126846b = new a(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) n.b(getContext(), 20.0f), (int) n.b(getContext(), 20.0f));
        layoutParams.topMargin = (int) n.b(getContext(), 26.0f);
        layoutParams.leftMargin = (int) n.b(getContext(), 26.0f);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart((int) n.b(getContext(), 26.0f));
        View view2 = this.f126846b;
        if (view2 == null) {
            l.a("centerView");
        }
        addView(view2, layoutParams);
        this.f126847c.addUpdateListener(new b(this));
        this.f126848d.addUpdateListener(new c(this));
        MethodCollector.o(6179);
    }
}
