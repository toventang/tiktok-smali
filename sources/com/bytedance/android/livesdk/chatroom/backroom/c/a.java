package com.bytedance.android.livesdk.chatroom.backroom.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f15007a;

    /* renamed from: b  reason: collision with root package name */
    public static ValueAnimator f15008b;

    /* renamed from: c  reason: collision with root package name */
    public static AbstractC0321a f15009c;

    /* renamed from: d  reason: collision with root package name */
    public static long f15010d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f15011e = new a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0321a {
        static {
            Covode.recordClassIndex(8338);
        }

        void a();

        void a(float f2);
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(8337);
    }

    public static void a() {
        ValueAnimator valueAnimator = f15008b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        f15008b = null;
        f15009c = null;
        f15007a = 0;
        f15010d = 0;
    }

    public static boolean b() {
        if (f15007a <= 0 && f15010d > 0) {
            return true;
        }
        ValueAnimator valueAnimator = f15008b;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    public static final class c extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(8340);
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            AbstractC0321a aVar = a.f15009c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15012a = new b();

        static {
            Covode.recordClassIndex(8339);
        }

        b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            float f2;
            AbstractC0321a aVar = a.f15009c;
            if (aVar != null) {
                Float f3 = null;
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                if (obj instanceof Float) {
                    f3 = obj;
                }
                Float f4 = f3;
                if (f4 != null) {
                    f2 = f4.floatValue();
                } else {
                    f2 = 0.0f;
                }
                aVar.a(f2);
            }
        }
    }
}
