package androidx.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import com.bytedance.covode.number.Covode;

final class a {

    /* renamed from: androidx.k.a$a  reason: collision with other inner class name */
    interface AbstractC0048a {
        static {
            Covode.recordClassIndex(1165);
        }

        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    static {
        Covode.recordClassIndex(1164);
    }

    static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        int i2 = Build.VERSION.SDK_INT;
        animator.addPauseListener(animatorListenerAdapter);
    }
}
