package com.bytedance.tux.dialog.c;

import android.animation.Animator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a {
    static {
        Covode.recordClassIndex(27376);
    }

    /* access modifiers changed from: protected */
    public abstract Animator b(View view);

    public final void a(View view) {
        l.c(view, "");
        b(view).start();
    }
}
