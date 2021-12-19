package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class CommonViewStatus$bindView$1<T> implements u {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84429);
    }

    CommonViewStatus$bindView$1(View view) {
        this.$view = view;
    }

    public final void onChanged(Integer num) {
        View view = this.$view;
        l.b(num, "");
        view.setVisibility(num.intValue());
    }
}
