package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class StickerAttrStruct {
    @c(a = "comment_sticker_id")
    private String commentStickerId;
    @c(a = "poll_sticker_id")
    private String pollStickerId;

    static {
        Covode.recordClassIndex(88106);
    }

    public String getCommentStickerId() {
        return this.commentStickerId;
    }

    public String getPollStickerId() {
        return this.pollStickerId;
    }

    public void setCommentStickerId(String str) {
        this.commentStickerId = str;
    }

    public void setPollStickerId(String str) {
        this.pollStickerId = str;
    }
}
