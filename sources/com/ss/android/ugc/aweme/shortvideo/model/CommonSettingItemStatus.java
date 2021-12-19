package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import h.f.b.l;

public class CommonSettingItemStatus extends CommonViewStatus {
    public final t<Boolean> _checked = new t<>();
    public final t<String> _leftText = new t<>();

    static {
        Covode.recordClassIndex(84425);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public void bindView(View view, m mVar) {
        l.d(view, "");
        l.d(mVar, "");
        super.bindView(view, mVar);
        if (view instanceof CommonItemView) {
            this._checked.observe(mVar, new CommonSettingItemStatus$bindView$1(view));
            this._leftText.observe(mVar, new CommonSettingItemStatus$bindView$2(view));
        }
    }
}
