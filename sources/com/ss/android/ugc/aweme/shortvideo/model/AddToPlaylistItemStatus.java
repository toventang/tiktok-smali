package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class AddToPlaylistItemStatus extends CommonViewStatus {
    public final t<String> _nameText = new t<>();

    static {
        Covode.recordClassIndex(84406);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public final void bindView(View view, m mVar) {
        l.d(view, "");
        l.d(mVar, "");
        super.bindView(view, mVar);
        this._nameText.removeObservers(mVar);
        this._nameText.observe(mVar, new AddToPlaylistItemStatus$bindView$1(view));
    }
}
