package com.ss.android.ugc.gamora.editor;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class u {
    static {
        Covode.recordClassIndex(96961);
    }

    public static final void a(View view, float f2, long j2) {
        l.d(view, "");
        view.animate().translationY(f2).setDuration(j2).start();
    }

    public static final void a(View view, float f2, float f3, float f4) {
        l.d(view, "");
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setTranslationX(f3);
        view.setTranslationY(f4);
    }
}
