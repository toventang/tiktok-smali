package com.bytedance.android.live;

import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.f.b.l;

public class c implements f {
    static {
        Covode.recordClassIndex(4508);
    }

    @Override // com.bytedance.android.live.f
    public Class<? extends LiveRecyclableWidget> getCommentWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.f
    public void showEmoteDetailDialog(EmoteModel emoteModel, i iVar) {
        l.d(emoteModel, "");
        l.d(iVar, "");
    }
}
