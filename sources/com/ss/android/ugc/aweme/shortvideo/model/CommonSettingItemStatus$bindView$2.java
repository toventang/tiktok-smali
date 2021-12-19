package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;

final class CommonSettingItemStatus$bindView$2<T> implements m {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84427);
    }

    CommonSettingItemStatus$bindView$2(View view) {
        this.$view = view;
    }

    public final void onChanged(String str) {
        ((CommonItemView) this.$view).setLeftText(str);
    }
}
