package com.ss.android.ugc.gamora.recorder.quickupload;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class o {
    static {
        Covode.recordClassIndex(97723);
    }

    public static final void a(List<? extends ValueAnimator> list) {
        l.d(list, "");
        for (ValueAnimator valueAnimator : list) {
            valueAnimator.cancel();
        }
    }
}
