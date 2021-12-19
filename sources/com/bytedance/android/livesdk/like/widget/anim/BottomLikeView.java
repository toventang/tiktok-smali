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
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class BottomLikeView extends View {

    /* renamed from: b  reason: collision with root package name */
    public static final int f18501b = y.a(36.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18502c = y.a(28.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final a f18503d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f18504a = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Paint f18505e;

    static final class a {
        static {
            Covode.recordClassIndex(10403);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10402);
    }

    public final void a() {
        Iterator<b> it = this.f18504a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            l.b(next, "");
            it.remove();
            next.f18512g.cancel();
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f18506a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public final RectF f18507b = new RectF();

        /* renamed from: c  reason: collision with root package name */
        public float f18508c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f18509d;

        /* renamed from: e  reason: collision with root package name */
        public int f18510e = 255;

        /* renamed from: f  reason: collision with root package name */
        public int f18511f;

        /* renamed from: g  reason: collision with root package name */
        final AnimatorSet f18512g;

        /* renamed from: h  reason: collision with root package name */
        public final Bitmap f18513h;

        /* renamed from: i  reason: collision with root package name */
        public final Bitmap f18514i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ BottomLikeView f18515j;

        static {
            Covode.recordClassIndex(10404);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$b  reason: collision with other inner class name */
        public static final class C0387b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18522a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18523b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18524c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ PointF f18525d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f18526e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f18527f;

            static {
                Covode.recordClassIndex(10406);
            }

            public final void onAnimationEnd(Animator animator) {
                if (this.f18522a.f18515j.f18504a.contains(this.f18522a)) {
                    this.f18522a.f18515j.f18504a.remove(this.f18522a);
                }
            }

            C0387b(b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j2) {
                this.f18522a = bVar;
                this.f18523b = pointF;
                this.f18524c = pointF2;
                this.f18525d = pointF3;
                this.f18526e = z;
                this.f18527f = j2;
            }
        }

        static final class c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18528a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18529b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18530c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ PointF f18531d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f18532e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f18533f;

            static {
                Covode.recordClassIndex(10407);
            }

            c(b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j2) {
                this.f18528a = bVar;
                this.f18529b = pointF;
                this.f18530c = pointF2;
                this.f18531d = pointF3;
                this.f18532e = z;
                this.f18533f = j2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18528a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f18508c = ((Float) animatedValue).floatValue();
            }
        }

        static final class d implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18534a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18535b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18536c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ PointF f18537d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f18538e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f18539f;

            static {
                Covode.recordClassIndex(10408);
            }

            d(b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j2) {
                this.f18534a = bVar;
                this.f18535b = pointF;
                this.f18536c = pointF2;
                this.f18537d = pointF3;
                this.f18538e = z;
                this.f18539f = j2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18534a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f18508c = ((Float) animatedValue).floatValue();
            }
        }

        static final class e implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f18540a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f18541b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18542c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ PointF f18543d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ PointF f18544e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f18545f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ long f18546g;

            static {
                Covode.recordClassIndex(10409);
            }

            e(long j2, b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j3) {
                this.f18540a = j2;
                this.f18541b = bVar;
                this.f18542c = pointF;
                this.f18543d = pointF2;
                this.f18544e = pointF3;
                this.f18545f = z;
                this.f18546g = j3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18541b;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f18511f = ((Integer) animatedValue).intValue();
            }
        }

        static final class f implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18547a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18548b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18549c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ PointF f18550d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f18551e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f18552f;

            static {
                Covode.recordClassIndex(10410);
            }

            f(b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j2) {
                this.f18547a = bVar;
                this.f18548b = pointF;
                this.f18549c = pointF2;
                this.f18550d = pointF3;
                this.f18551e = z;
                this.f18552f = j2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18547a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f18511f = ((Integer) animatedValue).intValue();
            }
        }

        static final class g implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f18553a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f18554b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18555c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ PointF f18556d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ PointF f18557e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f18558f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ long f18559g;

            static {
                Covode.recordClassIndex(10411);
            }

            g(long j2, b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j3) {
                this.f18553a = j2;
                this.f18554b = bVar;
                this.f18555c = pointF;
                this.f18556d = pointF2;
                this.f18557e = pointF3;
                this.f18558f = z;
                this.f18559g = j3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18554b;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f18511f = ((Integer) animatedValue).intValue();
            }
        }

        static final class h implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18560a;

            static {
                Covode.recordClassIndex(10412);
            }

            h(b bVar) {
                this.f18560a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18560a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f18508c = ((Float) animatedValue).floatValue();
            }
        }

        static final class i implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18561a;

            static {
                Covode.recordClassIndex(10413);
            }

            i(b bVar) {
                this.f18561a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18561a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f18510e = ((Integer) animatedValue).intValue();
            }
        }

        static final class j implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18562a;

            static {
                Covode.recordClassIndex(10414);
            }

            j(b bVar) {
                this.f18562a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18562a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f18509d = ((Float) animatedValue).floatValue();
            }
        }

        static final class k implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18563a;

            static {
                Covode.recordClassIndex(10415);
            }

            k(b bVar) {
                this.f18563a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.f18563a;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f18511f = ((Integer) animatedValue).intValue();
            }
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18516a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PointF f18517b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PointF f18518c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ PointF f18519d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f18520e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f18521f;

            static {
                Covode.recordClassIndex(10405);
            }

            a(b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j2) {
                this.f18516a = bVar;
                this.f18517b = pointF;
                this.f18518c = pointF2;
                this.f18519d = pointF3;
                this.f18520e = z;
                this.f18521f = j2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type android.graphics.PointF");
                PointF pointF = (PointF) animatedValue;
                RectF rectF = this.f18516a.f18506a;
                rectF.left = pointF.x - ((((float) BottomLikeView.f18502c) * this.f18516a.f18508c) / 2.0f);
                rectF.top = pointF.y - ((((float) BottomLikeView.f18502c) * this.f18516a.f18508c) / 2.0f);
                rectF.right = rectF.left + (((float) BottomLikeView.f18502c) * this.f18516a.f18508c);
                rectF.bottom = rectF.top + (((float) BottomLikeView.f18502c) * this.f18516a.f18508c);
                RectF rectF2 = this.f18516a.f18507b;
                rectF2.left = pointF.x - ((((float) BottomLikeView.f18501b) * this.f18516a.f18509d) / 2.0f);
                rectF2.top = pointF.y - ((((float) BottomLikeView.f18501b) * this.f18516a.f18509d) / 2.0f);
                rectF2.right = rectF2.left + (((float) BottomLikeView.f18501b) * this.f18516a.f18509d);
                rectF2.bottom = rectF2.top + (((float) BottomLikeView.f18501b) * this.f18516a.f18509d);
                this.f18516a.f18515j.invalidate();
            }
        }

        public b(BottomLikeView bottomLikeView, boolean z, Bitmap bitmap, Bitmap bitmap2, PointF pointF, PointF pointF2, PointF pointF3) {
            b bVar;
            l.d(bitmap2, "");
            l.d(pointF, "");
            l.d(pointF2, "");
            l.d(pointF3, "");
            this.f18515j = bottomLikeView;
            this.f18513h = bitmap;
            this.f18514i = bitmap2;
            long nextLong = h.i.c.Default.nextLong(500, 1200);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ValueAnimator ofObject = ValueAnimator.ofObject(new a(pointF2), pointF, pointF3);
            ofObject.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            ofObject.addUpdateListener(new a(this, pointF2, pointF, pointF3, z, nextLong));
            ofObject.addListener(new C0387b(this, pointF2, pointF, pointF3, z, nextLong));
            arrayList.add(ofObject);
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.15f);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new c(this, pointF2, pointF, pointF3, z, nextLong));
                arrayList.add(ofFloat);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.15f, 1.0f);
                ofFloat2.setDuration(100L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.addUpdateListener(new d(this, pointF2, pointF, pointF3, z, nextLong));
                ofFloat2.setStartDelay(200);
                arrayList.add(ofFloat2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.setDuration(150L);
                ofFloat3.addUpdateListener(new h(this));
                ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
                ofInt.setDuration(150L);
                ofInt.addUpdateListener(new i(this));
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat4.setDuration(150L);
                ofFloat4.setStartDelay(100);
                ofFloat4.addUpdateListener(new j(this));
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 255);
                ofInt2.setDuration(150L);
                ofInt2.setStartDelay(100);
                ofInt2.addUpdateListener(new k(this));
                animatorSet2.playTogether(ofFloat3, ofInt, ofFloat4, ofInt2);
                animatorSet2.setStartDelay(nextLong);
                arrayList.add(animatorSet2);
                long nextInt = nextLong + ((long) h.i.c.Default.nextInt(100, 200));
                ValueAnimator ofInt3 = ValueAnimator.ofInt(255, 0);
                ofInt3.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - nextInt);
                ofInt3.setInterpolator(new DecelerateInterpolator());
                ofInt3.addUpdateListener(new e(nextInt, this, pointF2, pointF, pointF3, z, nextLong));
                ofInt3.setStartDelay(nextInt);
                arrayList.add(ofInt3);
                bVar = this;
            } else {
                bVar = this;
                bVar.f18508c = 0.0f;
                bVar.f18510e = 0;
                bVar.f18509d = 1.0f;
                bVar.f18511f = 0;
                ValueAnimator ofInt4 = ValueAnimator.ofInt(0, 255);
                ofInt4.setDuration(300L);
                ofInt4.addUpdateListener(new f(this, pointF2, pointF, pointF3, false, nextLong));
                arrayList.add(ofInt4);
                long nextInt2 = (long) h.i.c.Default.nextInt(666, 1100);
                ValueAnimator ofInt5 = ValueAnimator.ofInt(255, 0);
                ofInt5.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - nextInt2);
                ofInt5.setStartDelay(nextInt2);
                ofInt5.addUpdateListener(new g(nextInt2, this, pointF2, pointF, pointF3, false, nextLong));
                arrayList.add(ofInt5);
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            bVar.f18512g = animatorSet;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        for (T t : this.f18504a) {
            if (t.f18506a.width() > 0.0f) {
                this.f18505e.setAlpha(t.f18510e);
                if (t.f18513h != null && !t.f18513h.isRecycled()) {
                    canvas.drawBitmap(t.f18513h, (Rect) null, t.f18506a, this.f18505e);
                }
            }
            if (t.f18507b.width() > 0.0f) {
                this.f18505e.setAlpha(t.f18511f);
                if (!t.f18514i.isRecycled()) {
                    canvas.drawBitmap(t.f18514i, (Rect) null, t.f18507b, this.f18505e);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(4059);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f18505e = paint;
        MethodCollector.o(4059);
    }

    public final void a(Bitmap bitmap, Bitmap bitmap2, PointF pointF, PointF pointF2, PointF pointF3) {
        l.d(bitmap2, "");
        l.d(pointF, "");
        l.d(pointF2, "");
        l.d(pointF3, "");
        this.f18504a.add(new b(this, false, bitmap, bitmap2, pointF, pointF2, pointF3));
    }
}
