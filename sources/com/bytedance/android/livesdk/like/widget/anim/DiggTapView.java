package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.d.g;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class DiggTapView extends View {

    /* renamed from: b  reason: collision with root package name */
    public static final int f18564b = y.a(42.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final a f18565c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f18566a = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f18567d = new Paint(1);

    static final class a {
        static {
            Covode.recordClassIndex(10417);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10416);
    }

    public final void a() {
        Iterator<b> it = this.f18566a.iterator();
        while (it.hasNext()) {
            it.next().f18571d.cancel();
            it.remove();
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f18568a;

        /* renamed from: b  reason: collision with root package name */
        public int f18569b;

        /* renamed from: c  reason: collision with root package name */
        public float f18570c;

        /* renamed from: d  reason: collision with root package name */
        final AnimatorSet f18571d;

        /* renamed from: e  reason: collision with root package name */
        public final Bitmap f18572e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f18573f = false;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DiggTapView f18574g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f18575h;

        /* renamed from: i  reason: collision with root package name */
        private final PointF f18576i;

        /* renamed from: j  reason: collision with root package name */
        private final PointF f18577j;

        static {
            Covode.recordClassIndex(10418);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$b  reason: collision with other inner class name */
        public static final class C0388b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18581a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18582b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18583c;

            static {
                Covode.recordClassIndex(10420);
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                this.f18581a.f18574g.f18566a.remove(this.f18581a);
            }

            C0388b(b bVar, PointF pointF, PointF pointF2) {
                this.f18581a = bVar;
                this.f18582b = pointF;
                this.f18583c = pointF2;
            }
        }

        static final class c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18584a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18585b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18586c;

            static {
                Covode.recordClassIndex(10421);
            }

            c(b bVar, PointF pointF, PointF pointF2) {
                this.f18584a = bVar;
                this.f18585b = pointF;
                this.f18586c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18584a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f18569b = ((Integer) animatedValue).intValue();
            }
        }

        static final class d implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18587a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18588b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18589c;

            static {
                Covode.recordClassIndex(10422);
            }

            d(b bVar, PointF pointF, PointF pointF2) {
                this.f18587a = bVar;
                this.f18588b = pointF;
                this.f18589c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18587a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f18569b = ((Integer) animatedValue).intValue();
            }
        }

        static final class e implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18590a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18591b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18592c;

            static {
                Covode.recordClassIndex(10423);
            }

            e(b bVar, PointF pointF, PointF pointF2) {
                this.f18590a = bVar;
                this.f18591b = pointF;
                this.f18592c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18590a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.a(((Float) animatedValue).floatValue());
            }
        }

        static final class h implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18595a;

            static {
                Covode.recordClassIndex(10426);
            }

            h(b bVar) {
                this.f18595a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18595a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f18570c = ((Float) animatedValue).floatValue();
                this.f18595a.f18574g.invalidate();
            }
        }

        static final class i implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18596a;

            static {
                Covode.recordClassIndex(10427);
            }

            i(b bVar) {
                this.f18596a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18596a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f18570c = ((Float) animatedValue).floatValue();
                this.f18596a.f18574g.invalidate();
            }
        }

        public final void a(float f2) {
            RectF rectF = this.f18568a;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float f3 = (((float) DiggTapView.f18564b) * f2) / 2.0f;
            rectF.left = centerX - f3;
            rectF.top = centerY - f3;
            rectF.right = centerX + f3;
            rectF.bottom = centerY + f3;
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18578a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18579b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18580c;

            static {
                Covode.recordClassIndex(10419);
            }

            a(b bVar, PointF pointF, PointF pointF2) {
                this.f18578a = bVar;
                this.f18579b = pointF;
                this.f18580c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type android.graphics.PointF");
                PointF pointF = (PointF) animatedValue;
                RectF rectF = this.f18578a.f18568a;
                float width = rectF.width() / 2.0f;
                rectF.left = pointF.x - width;
                rectF.top = pointF.y - width;
                rectF.right = pointF.x + width;
                rectF.bottom = pointF.y + width;
                this.f18578a.f18574g.invalidate();
            }
        }

        static final class f implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18593a;

            static {
                Covode.recordClassIndex(10424);
            }

            f(b bVar) {
                this.f18593a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18593a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.a(((Float) animatedValue).floatValue());
                this.f18593a.f18574g.invalidate();
            }
        }

        static final class g implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18594a;

            static {
                Covode.recordClassIndex(10425);
            }

            g(b bVar) {
                this.f18594a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18594a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.a(((Float) animatedValue).floatValue());
                this.f18594a.f18574g.invalidate();
            }
        }

        public b(DiggTapView diggTapView, Bitmap bitmap, PointF pointF, PointF pointF2) {
            l.d(bitmap, "");
            l.d(pointF, "");
            l.d(pointF2, "");
            this.f18574g = diggTapView;
            this.f18572e = bitmap;
            this.f18576i = pointF;
            this.f18577j = pointF2;
            RectF rectF = new RectF();
            this.f18568a = rectF;
            this.f18569b = 255;
            this.f18575h = true;
            rectF.left = pointF.x - ((float) (DiggTapView.f18564b / 2));
            rectF.top = pointF.y - ((float) (DiggTapView.f18564b / 2));
            rectF.right = pointF.x + ((float) (DiggTapView.f18564b / 2));
            rectF.bottom = pointF.y + ((float) (DiggTapView.f18564b / 2));
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            AnimatorSet animatorSet3 = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.5f);
            ofFloat.setDuration(100L);
            ofFloat.addUpdateListener(new f(this));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.5f, 1.36f, 1.4f);
            ofFloat2.setDuration(150L);
            ofFloat2.addUpdateListener(new g(this));
            animatorSet3.playSequentially(ofFloat, ofFloat2);
            AnimatorSet animatorSet4 = new AnimatorSet();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, -8.0f);
            ofFloat3.setDuration(100L);
            ofFloat3.addUpdateListener(new h(this));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-8.0f, 3.0f, 0.0f);
            ofFloat4.setDuration(150L);
            ofFloat4.addUpdateListener(new i(this));
            animatorSet4.playSequentially(ofFloat3, ofFloat4);
            animatorSet2.playTogether(animatorSet3, animatorSet4);
            AnimatorSet animatorSet5 = new AnimatorSet();
            ValueAnimator ofObject = ValueAnimator.ofObject(new a(new PointF(pointF2.x, pointF.y)), pointF, pointF2);
            ofObject.setDuration(1500L);
            ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
            ofObject.addUpdateListener(new a(this, pointF, pointF2));
            ofObject.addListener(new C0388b(this, pointF, pointF2));
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 153);
            ofInt.setDuration(500L);
            ofInt.addUpdateListener(new c(this, pointF, pointF2));
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator ofInt2 = ValueAnimator.ofInt(153, 0);
            ofInt2.setDuration(1000L);
            ofInt2.addUpdateListener(new d(this, pointF, pointF2));
            ofInt2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt2.setStartDelay(500);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.4f, 0.5f);
            ofFloat5.setDuration(500L);
            ofFloat5.addUpdateListener(new e(this, pointF, pointF2));
            animatorSet5.playTogether(ofObject, ofInt, ofInt2, ofFloat5);
            animatorSet5.setStartDelay(200);
            animatorSet.playSequentially(animatorSet2, animatorSet5);
            animatorSet.start();
            this.f18571d = animatorSet;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        for (T t : this.f18566a) {
            if (!t.f18572e.isRecycled()) {
                g.a("LikeIconDraw");
                canvas.save();
                this.f18567d.setAlpha(t.f18569b);
                if (t.f18570c != 0.0f) {
                    canvas.rotate(t.f18570c, t.f18568a.centerX(), t.f18568a.centerY());
                }
                canvas.drawBitmap(t.f18572e, (Rect) null, t.f18568a, this.f18567d);
                canvas.restore();
                g.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiggTapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(5043);
        MethodCollector.o(5043);
    }
}
