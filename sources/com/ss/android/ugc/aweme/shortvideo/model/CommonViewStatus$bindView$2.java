package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class CommonViewStatus$bindView$2<T> implements u {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84430);
    }

    CommonViewStatus$bindView$2(View view) {
        this.$view = view;
    }

    public final void onChanged(Float f2) {
        View view = this.$view;
        l.b(f2, "");
        view.setAlpha(f2.floatValue());
    }
}
