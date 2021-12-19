package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

public final class GifEmojiResponse implements Serializable {
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = "emoticon_data")
    private StickerBean stickers;

    static {
        Covode.recordClassIndex(44313);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final StickerBean getStickers() {
        return this.stickers;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setStickers(StickerBean stickerBean) {
        this.stickers = stickerBean;
    }
}
