package com.ss.android.ugc.aweme.ftc.components.audiorecord;

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

public final class FTCAudioRecordStartButton extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f97673a;

    /* renamed from: b  reason: collision with root package name */
    a f97674b;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f97675c = ValueAnimator.ofFloat(1.0f, 0.72f);

    /* renamed from: d  reason: collision with root package name */
    ValueAnimator f97676d = ValueAnimator.ofFloat(0.72f, 1.0f);

    static {
        Covode.recordClassIndex(62060);
    }

    public final void a() {
        this.f97675c.end();
        this.f97676d.start();
    }

    public final void b() {
        a aVar = this.f97674b;
        if (aVar == null) {
            l.a("centerView");
        }
        aVar.f97679c.end();
        aVar.f97678b.start();
    }

    public static final class a extends View {

        /* renamed from: a  reason: collision with root package name */
        public float f97677a;

        /* renamed from: b  reason: collision with root package name */
        ValueAnimator f97678b;

        /* renamed from: c  reason: collision with root package name */
        ValueAnimator f97679c;

        /* renamed from: d  reason: collision with root package name */
        private final Paint f97680d;

        /* renamed from: e  reason: collision with root package name */
        private final float f97681e;

        /* renamed from: f  reason: collision with root package name */
        private final float f97682f;

        static {
            Covode.recordClassIndex(62061);
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ValueAnimator valueAnimator = this.f97678b;
            l.b(valueAnimator, "");
            if (valueAnimator.isRunning()) {
                this.f97678b.end();
            }
            ValueAnimator valueAnimator2 = this.f97679c;
            l.b(valueAnimator2, "");
            if (valueAnimator2.isRunning()) {
                this.f97679c.end();
            }
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            MethodCollector.i(4571);
            super.onDraw(canvas);
            if (canvas != null) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                float f2 = this.f97677a;
                canvas.drawRoundRect(rectF, f2, f2, this.f97680d);
                MethodCollector.o(4571);
                return;
            }
            MethodCollector.o(4571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            l.d(context, "");
            MethodCollector.i(4583);
            Paint paint = new Paint();
            this.f97680d = paint;
            float b2 = n.b(context, 3.5f);
            this.f97681e = b2;
            float b3 = n.b(context, 13.0f);
            this.f97682f = b3;
            this.f97677a = b3;
            this.f97678b = ValueAnimator.ofFloat(b2, b3);
            this.f97679c = ValueAnimator.ofFloat(b3, b2);
            paint.setAntiAlias(true);
            paint.setColor(Color.parseColor("#fe2c55"));
            this.f97678b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f97683a;

                static {
                    Covode.recordClassIndex(62062);
                }

                {
                    this.f97683a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a aVar = this.f97683a;
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f97677a = ((Float) animatedValue).floatValue();
                    this.f97683a.invalidate();
                }
            });
            ValueAnimator valueAnimator = this.f97678b;
            l.b(valueAnimator, "");
            valueAnimator.setDuration(250L);
            this.f97679c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f97684a;

                static {
                    Covode.recordClassIndex(62063);
                }

                {
                    this.f97684a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a aVar = this.f97684a;
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f97677a = ((Float) animatedValue).floatValue();
                    this.f97684a.invalidate();
                }
            });
            ValueAnimator valueAnimator2 = this.f97679c;
            l.b(valueAnimator2, "");
            valueAnimator2.setDuration(250L);
            MethodCollector.o(4583);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f97675c;
        l.b(valueAnimator, "");
        if (valueAnimator.isRunning()) {
            this.f97675c.end();
        }
        ValueAnimator valueAnimator2 = this.f97676d;
        l.b(valueAnimator2, "");
        if (valueAnimator2.isRunning()) {
            this.f97676d.end();
        }
    }

    public static final /* synthetic */ ImageView a(FTCAudioRecordStartButton fTCAudioRecordStartButton) {
        ImageView imageView = fTCAudioRecordStartButton.f97673a;
        if (imageView == null) {
            l.a("bgView");
        }
        return imageView;
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCAudioRecordStartButton f97685a;

        static {
            Covode.recordClassIndex(62064);
        }

        b(FTCAudioRecordStartButton fTCAudioRecordStartButton) {
            this.f97685a = fTCAudioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            FTCAudioRecordStartButton.a(this.f97685a).setScaleX(floatValue);
            FTCAudioRecordStartButton.a(this.f97685a).setScaleY(floatValue);
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCAudioRecordStartButton f97686a;

        static {
            Covode.recordClassIndex(62065);
        }

        c(FTCAudioRecordStartButton fTCAudioRecordStartButton) {
            this.f97686a = fTCAudioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            FTCAudioRecordStartButton.a(this.f97686a).setScaleX(floatValue);
            FTCAudioRecordStartButton.a(this.f97686a).setScaleY(floatValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCAudioRecordStartButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(3951);
        ImageView imageView = new ImageView(getContext());
        this.f97673a = imageView;
        imageView.setBackground(com.ss.android.ugc.tools.view.a.a(-16776961, -1, 0));
        View view = this.f97673a;
        if (view == null) {
            l.a("bgView");
        }
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        Context context2 = getContext();
        l.b(context2, "");
        this.f97674b = new a(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) n.b(getContext(), 20.0f), (int) n.b(getContext(), 20.0f));
        layoutParams.topMargin = (int) n.b(getContext(), 26.0f);
        layoutParams.leftMargin = (int) n.b(getContext(), 26.0f);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart((int) n.b(getContext(), 26.0f));
        View view2 = this.f97674b;
        if (view2 == null) {
            l.a("centerView");
        }
        addView(view2, layoutParams);
        this.f97675c.addUpdateListener(new b(this));
        this.f97676d.addUpdateListener(new c(this));
        MethodCollector.o(3951);
    }
}
