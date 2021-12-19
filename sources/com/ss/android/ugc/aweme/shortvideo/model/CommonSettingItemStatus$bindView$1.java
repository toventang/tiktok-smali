package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import h.f.b.l;

final class CommonSettingItemStatus$bindView$1<T> implements m {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84426);
    }

    CommonSettingItemStatus$bindView$1(View view) {
        this.$view = view;
    }

    public final void onChanged(Boolean bool) {
        l.b(bool, "");
        ((CommonItemView) this.$view).setChecked(bool.booleanValue());
    }
}
