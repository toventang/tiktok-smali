package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f52217a = {16843848};

    static {
        Covode.recordClassIndex(32442);
    }

    private static int a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.a3);
        if (matchConfig == null) {
            return resources.getInteger(R.integer.a3);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(R.integer.a3);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(R.integer.a3);
        }
    }

    static void a(View view, float f2) {
        int a2 = a(view.getResources());
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = (long) a2;
        stateListAnimator.addState(new int[]{16842766, R.attr.afi, -2130970176}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
