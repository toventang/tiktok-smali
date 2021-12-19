package com.bytedance.scene.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(26242);
    }

    public static Animator a(Animator... animatorArr) {
        List asList = Arrays.asList(animatorArr);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }
}
