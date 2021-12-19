package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class CommonViewStatus$bindView$3<T> implements u {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84431);
    }

    CommonViewStatus$bindView$3(View view) {
        this.$view = view;
    }

    public final void onChanged(Boolean bool) {
        View view = this.$view;
        l.b(bool, "");
        view.setEnabled(bool.booleanValue());
    }
}
