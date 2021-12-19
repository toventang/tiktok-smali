package androidx.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

public final class d extends aj {
    static {
        Covode.recordClassIndex(1199);
    }

    public d() {
    }

    /* access modifiers changed from: package-private */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f3292a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3293b;

        static {
            Covode.recordClassIndex(1201);
        }

        a(View view) {
            this.f3292a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            ae.a(this.f3292a, 1.0f);
            if (this.f3293b) {
                this.f3292a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (v.p(this.f3292a) && this.f3292a.getLayerType() == 0) {
                this.f3293b = true;
                this.f3292a.setLayerType(2, null);
            }
        }
    }

    public d(int i2) {
        c(i2);
    }

    @Override // androidx.k.m, androidx.k.aj
    public final void a(s sVar) {
        super.a(sVar);
        sVar.f3355a.put("android:fade:transitionAlpha", Float.valueOf(ae.f3229a.a(sVar.f3356b)));
    }

    private static float a(s sVar, float f2) {
        Float f3;
        if (sVar == null || (f3 = (Float) sVar.f3355a.get("android:fade:transitionAlpha")) == null) {
            return f2;
        }
        return f3.floatValue();
    }

    private Animator a(final View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        ae.a(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ae.f3230b, f3);
        ofFloat.addListener(new a(view));
        a(new n() {
            /* class androidx.k.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1200);
            }

            @Override // androidx.k.n, androidx.k.m.c
            public final void a(m mVar) {
                ae.a(view, 1.0f);
                ae.f3229a.c(view);
                mVar.b(this);
            }
        });
        return ofFloat;
    }

    @Override // androidx.k.aj
    public final Animator a(ViewGroup viewGroup, View view, s sVar) {
        ae.f3229a.b(view);
        return a(view, a(sVar, 1.0f), 0.0f);
    }

    @Override // androidx.k.aj
    public final Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f2 = 0.0f;
        float a2 = a(sVar, 0.0f);
        if (a2 != 1.0f) {
            f2 = a2;
        }
        return a(view, f2, 1.0f);
    }
}
