package com.ss.android.ugc.aweme.question.sticker;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class QuestionStickerView extends CommentStickerView {
    static {
        Covode.recordClassIndex(77982);
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView
    public final int getMLayoutId() {
        return R.layout.arx;
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView
    public final int getMReplyTextId() {
        return R.string.dg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuestionStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }
}
