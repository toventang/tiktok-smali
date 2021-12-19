package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.k.m;
import androidx.k.s;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class j extends m {
    static {
        Covode.recordClassIndex(32563);
    }

    @Override // androidx.k.m
    public final void a(s sVar) {
        d(sVar);
    }

    @Override // androidx.k.m
    public final void b(s sVar) {
        d(sVar);
    }

    private static void d(s sVar) {
        if (sVar.f3356b instanceof TextView) {
            sVar.f3355a.put("android:textscale:scale", Float.valueOf(((TextView) sVar.f3356b).getScaleX()));
        }
    }

    @Override // androidx.k.m
    public final Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        float f2;
        if (sVar == null || sVar2 == null || !(sVar.f3356b instanceof TextView) || !(sVar2.f3356b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) sVar2.f3356b;
        Map<String, Object> map = sVar.f3355a;
        Map<String, Object> map2 = sVar2.f3355a;
        float f3 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f2 = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f2 = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f3 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f2 == f3) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.internal.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32564);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
