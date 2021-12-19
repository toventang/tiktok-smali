package com.bytedance.android.livesdk.chatroom.backroom.micbackwidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15040a = 10;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f15041b;

    /* renamed from: c  reason: collision with root package name */
    public static int f15042c;

    /* renamed from: d  reason: collision with root package name */
    public static ValueAnimator f15043d;

    /* renamed from: e  reason: collision with root package name */
    public static AbstractC0324a f15044e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f15045f = new a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a$a  reason: collision with other inner class name */
    public interface AbstractC0324a {
        static {
            Covode.recordClassIndex(8358);
        }

        void a();

        void a(float f2);
    }

    public static final class c extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(8360);
        }

        c() {
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            AbstractC0324a aVar = a.f15044e;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(8357);
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15046a = new b();

        static {
            Covode.recordClassIndex(8359);
        }

        b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            float f2;
            AbstractC0324a aVar = a.f15044e;
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
