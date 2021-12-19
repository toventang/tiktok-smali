package com.bytedance.android.live;

import androidx.fragment.app.i;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface f extends a {
    static {
        Covode.recordClassIndex(5067);
    }

    Class<? extends LiveRecyclableWidget> getCommentWidget();

    void showEmoteDetailDialog(EmoteModel emoteModel, i iVar);
}
