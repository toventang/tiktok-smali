package com.bytedance.creativex.recorder.filter.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class c implements d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f28270d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ValueAnimator f28271a;

    /* renamed from: b  reason: collision with root package name */
    public e f28272b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28273c;

    static {
        Covode.recordClassIndex(16582);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(16583);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.d.d
    public final void a() {
        ValueAnimator valueAnimator = this.f28271a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28271a = null;
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, float f2) {
            super(0);
            this.this$0 = cVar;
            this.$fraction = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e eVar = this.this$0.f28272b;
            if (eVar != null) {
                float f2 = this.$fraction;
                eVar.a(f2, c.b(f2));
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ float $velocity;
        final /* synthetic */ int $windowWidth;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, float f2, float f3, int i2) {
            super(0);
            this.this$0 = cVar;
            this.$velocity = f2;
            this.$fraction = f3;
            this.$windowWidth = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            boolean z;
            float[] fArr;
            float f2;
            g gVar;
            float abs;
            c cVar = this.this$0;
            float f3 = this.$velocity;
            float f4 = this.$fraction;
            int i2 = this.$windowWidth;
            if (Math.signum(f4) == Math.signum(f3)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fArr = new float[2];
                fArr[0] = f4;
                f2 = 0.0f;
            } else {
                fArr = new float[2];
                fArr[0] = f4;
                if (f3 >= 1.0E-5f) {
                    f2 = -1.0f;
                } else {
                    f2 = 1.0f;
                }
            }
            fArr[1] = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            l.b(ofFloat, "");
            if (z) {
                gVar = g.NONE;
                abs = ((float) i2) * Math.abs(f4);
            } else {
                if (f3 >= 1.0E-5f) {
                    gVar = g.LEFT;
                } else {
                    gVar = g.RIGHT;
                }
                abs = ((float) i2) * (1.0f - Math.abs(f4));
            }
            long min = Math.min((long) (((float) ((long) abs)) / ((Math.abs(f3) / 1000.0f) / 2.0f)), 400L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(min);
            ofFloat.addUpdateListener(new b(cVar));
            ofFloat.addListener(new C0602c(cVar, gVar));
            ofFloat.start();
            cVar.f28271a = ofFloat;
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.c$c  reason: collision with other inner class name */
    public static final class C0602c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f28276b;

        static {
            Covode.recordClassIndex(16585);
        }

        public final void onAnimationStart(Animator animator) {
            this.f28275a.f28273c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            e eVar = this.f28275a.f28272b;
            if (eVar != null) {
                eVar.a(this.f28276b);
            }
            this.f28275a.f28273c = false;
        }

        C0602c(c cVar, g gVar) {
            this.f28275a = cVar;
            this.f28276b = gVar;
        }
    }

    private final void a(h.f.a.a<z> aVar) {
        if (!this.f28273c) {
            aVar.invoke();
        }
    }

    public static f b(float f2) {
        if (f2 < 1.0E-5f) {
            return f.LEFT;
        }
        return f.RIGHT;
    }

    @Override // com.bytedance.creativex.recorder.filter.d.d
    public final void a(float f2) {
        a(new d(this, f2));
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28274a;

        static {
            Covode.recordClassIndex(16584);
        }

        b(c cVar) {
            this.f28274a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            e eVar = this.f28274a.f28272b;
            if (eVar != null) {
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                eVar.a(floatValue, c.b(((Float) animatedValue2).floatValue()));
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.d.d
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f28272b = eVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.d.d
    public final void a(float f2, float f3, int i2) {
        a(new e(this, f2, f3, i2));
    }
}
