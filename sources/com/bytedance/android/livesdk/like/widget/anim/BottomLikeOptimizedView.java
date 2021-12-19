package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.g.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public final class BottomLikeOptimizedView extends View {

    /* renamed from: d  reason: collision with root package name */
    public static final int f18474d = y.a(36.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18475e = y.a(28.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final d f18476f = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<a> f18477a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public final f.b<a> f18478b = new f.b<>(10);

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f18479c;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f18480g = new Paint(1);

    static final class d {
        static {
            Covode.recordClassIndex(10399);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10392);
    }

    public final void a() {
        Iterator<a> it = this.f18477a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            l.b(next, "");
            a aVar = next;
            it.remove();
            this.f18478b.release(aVar);
            aVar.f18481a.cancel();
        }
    }

    public final void setAvatar(Bitmap bitmap) {
        this.f18479c = bitmap;
    }

    final class b extends Property<a, Integer> {
        static {
            Covode.recordClassIndex(10397);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
            super(Integer.TYPE, "avatar_alpha");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(a aVar) {
            int i2;
            a aVar2 = aVar;
            if (aVar2 != null) {
                i2 = aVar2.f18486f;
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(a aVar, Integer num) {
            if (aVar != null && num != null) {
                aVar.f18486f = num.intValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    final class c extends Property<a, Float> {
        static {
            Covode.recordClassIndex(10398);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
            super(Float.TYPE, "avatar_scale");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(a aVar) {
            float f2;
            a aVar2 = aVar;
            if (aVar2 != null) {
                f2 = aVar2.f18484d;
            } else {
                f2 = 0.0f;
            }
            return Float.valueOf(f2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(a aVar, Float f2) {
            if (aVar != null && f2 != null) {
                aVar.f18484d = f2.floatValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    final class e extends Property<a, Integer> {
        static {
            Covode.recordClassIndex(10400);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public e() {
            super(Integer.TYPE, "icon_alpha");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(a aVar) {
            int i2;
            a aVar2 = aVar;
            if (aVar2 != null) {
                i2 = aVar2.f18487g;
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(a aVar, Integer num) {
            if (aVar != null && num != null) {
                aVar.f18487g = num.intValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    final class f extends Property<a, Float> {
        static {
            Covode.recordClassIndex(10401);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public f() {
            super(Float.TYPE, "icon_scale");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(a aVar) {
            float f2;
            a aVar2 = aVar;
            if (aVar2 != null) {
                f2 = aVar2.f18485e;
            } else {
                f2 = 0.0f;
            }
            return Float.valueOf(f2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(a aVar, Float f2) {
            if (aVar != null && f2 != null) {
                aVar.f18485e = f2.floatValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        final Animator f18481a;

        /* renamed from: b  reason: collision with root package name */
        public final RectF f18482b = new RectF();

        /* renamed from: c  reason: collision with root package name */
        public final RectF f18483c = new RectF();

        /* renamed from: d  reason: collision with root package name */
        public float f18484d;

        /* renamed from: e  reason: collision with root package name */
        public float f18485e;

        /* renamed from: f  reason: collision with root package name */
        public int f18486f;

        /* renamed from: g  reason: collision with root package name */
        public int f18487g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap f18488h;

        /* renamed from: j  reason: collision with root package name */
        private final Animator f18490j;

        /* renamed from: k  reason: collision with root package name */
        private final b f18491k;

        /* renamed from: l  reason: collision with root package name */
        private final b f18492l;

        /* renamed from: m  reason: collision with root package name */
        private final ValueAnimator f18493m;
        private final ValueAnimator n;
        private final Animator o;
        private final Animator p;
        private final Animator q;
        private final Animator r;

        static {
            Covode.recordClassIndex(10393);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$a$a  reason: collision with other inner class name */
        static final class C0386a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f18495a;

            static {
                Covode.recordClassIndex(10395);
            }

            C0386a(a aVar) {
                this.f18495a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                RectF rectF = this.f18495a.f18482b;
                rectF.left = floatValue - ((((float) BottomLikeOptimizedView.f18475e) * this.f18495a.f18484d) / 2.0f);
                rectF.right = rectF.left + (((float) BottomLikeOptimizedView.f18475e) * this.f18495a.f18484d);
                RectF rectF2 = this.f18495a.f18483c;
                rectF2.left = floatValue - ((((float) BottomLikeOptimizedView.f18474d) * this.f18495a.f18485e) / 2.0f);
                rectF2.right = rectF2.left + (((float) BottomLikeOptimizedView.f18474d) * this.f18495a.f18485e);
                BottomLikeOptimizedView.this.invalidate();
            }
        }

        static final class b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f18496a;

            static {
                Covode.recordClassIndex(10396);
            }

            b(a aVar) {
                this.f18496a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                RectF rectF = this.f18496a.f18482b;
                rectF.top = floatValue - ((((float) BottomLikeOptimizedView.f18475e) * this.f18496a.f18484d) / 2.0f);
                rectF.bottom = rectF.top + (((float) BottomLikeOptimizedView.f18475e) * this.f18496a.f18484d);
                RectF rectF2 = this.f18496a.f18483c;
                rectF2.top = floatValue - ((((float) BottomLikeOptimizedView.f18474d) * this.f18496a.f18485e) / 2.0f);
                rectF2.bottom = rectF2.top + (((float) BottomLikeOptimizedView.f18474d) * this.f18496a.f18485e);
                BottomLikeOptimizedView.this.invalidate();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
            AnimatorSet animatorSet;
            b bVar = new b();
            this.f18491k = bVar;
            b bVar2 = new b();
            this.f18492l = bVar2;
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setEvaluator(bVar);
            valueAnimator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            valueAnimator.addUpdateListener(new C0386a(this));
            this.f18493m = valueAnimator;
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setEvaluator(bVar2);
            valueAnimator2.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            valueAnimator2.addUpdateListener(new b(this));
            this.n = valueAnimator2;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(valueAnimator, valueAnimator2);
            this.f18490j = animatorSet2;
            c cVar = new c();
            Keyframe ofFloat = Keyframe.ofFloat(0.6666667f, 1.15f);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            Keyframe ofFloat2 = Keyframe.ofFloat(1.0f, 1.0f);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(cVar, Keyframe.ofFloat(0.0f, 0.0f), ofFloat, ofFloat2));
            ofPropertyValuesHolder.setDuration(300L);
            l.b(ofPropertyValuesHolder, "");
            this.o = ofPropertyValuesHolder;
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(new c(), 1.0f, 0.0f), PropertyValuesHolder.ofInt(new b(), 255, 0));
            ofPropertyValuesHolder2.setDuration(150L);
            ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(new f(), 0.0f, 1.0f), PropertyValuesHolder.ofInt(new e(), 0, 255));
            ofPropertyValuesHolder3.setDuration(150L);
            ofPropertyValuesHolder3.setStartDelay(100);
            animatorSet3.playTogether(ofPropertyValuesHolder2, ofPropertyValuesHolder3);
            this.p = animatorSet3;
            ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt(new e(), 0, 255));
            ofPropertyValuesHolder4.setDuration(300L);
            l.b(ofPropertyValuesHolder4, "");
            this.q = ofPropertyValuesHolder4;
            ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt(new e(), 255, 0));
            l.b(ofPropertyValuesHolder5, "");
            this.r = ofPropertyValuesHolder5;
            if (BottomLikeOptimizedView.this.f18479c != null) {
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofPropertyValuesHolder, animatorSet3, ofPropertyValuesHolder5, animatorSet2);
            } else {
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofPropertyValuesHolder4, ofPropertyValuesHolder5, animatorSet2);
            }
            this.f18481a = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter(this) {
                /* class com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f18494a;

                static {
                    Covode.recordClassIndex(10394);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f18494a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    if (BottomLikeOptimizedView.this.f18477a.contains(this.f18494a)) {
                        BottomLikeOptimizedView.this.f18477a.remove(this.f18494a);
                        BottomLikeOptimizedView.this.f18478b.release(this.f18494a);
                    }
                }
            });
        }

        public final void a(Bitmap bitmap, float f2, float f3, float f4, float f5, float f6, float f7) {
            l.d(bitmap, "");
            this.f18488h = bitmap;
            this.f18484d = 0.0f;
            this.f18487g = 0;
            this.f18491k.f18610a = f6;
            this.f18492l.f18610a = f7;
            this.f18493m.setFloatValues(f2, f4);
            this.n.setFloatValues(f3, f5);
            if (BottomLikeOptimizedView.this.f18479c != null) {
                this.f18486f = 255;
                this.f18485e = 0.0f;
                long nextLong = h.i.c.Default.nextLong(500, 1200);
                this.p.setStartDelay(nextLong);
                long nextInt = nextLong + ((long) h.i.c.Default.nextInt(100, 200));
                this.r.setStartDelay(nextInt);
                this.r.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - nextInt);
            } else {
                this.f18486f = 0;
                this.f18485e = 1.0f;
                this.r.setStartDelay(h.i.c.Default.nextLong(666, 1100));
                Animator animator = this.r;
                animator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - animator.getStartDelay());
            }
            this.f18481a.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        for (T t : this.f18477a) {
            Bitmap bitmap = this.f18479c;
            if (bitmap != null && !bitmap.isRecycled() && t.f18482b.width() > 0.0f) {
                this.f18480g.setAlpha(t.f18486f);
                canvas.drawBitmap(bitmap, (Rect) null, t.f18482b, this.f18480g);
            }
            Bitmap bitmap2 = t.f18488h;
            if (bitmap2 != null && !bitmap2.isRecycled() && t.f18483c.width() > 0.0f) {
                this.f18480g.setAlpha(t.f18487g);
                canvas.drawBitmap(bitmap2, (Rect) null, t.f18483c, this.f18480g);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomLikeOptimizedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(4199);
        MethodCollector.o(4199);
    }

    public final void a(Bitmap bitmap, float f2, float f3, float f4, float f5, float f6, float f7) {
        l.d(bitmap, "");
        a acquire = this.f18478b.acquire();
        if (acquire == null) {
            acquire = new a();
        }
        this.f18477a.add(acquire);
        acquire.a(bitmap, f2, f3, f4, f5, f6, f7);
    }
}
