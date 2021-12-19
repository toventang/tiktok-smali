package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class StickerBean implements Serializable {
    @c(a = "has_more")
    private boolean hasMore;
    @c(a = "next_cursor")
    private int nextCursor;
    @c(a = "sticker_source")
    private int source;
    @c(a = "sticker_list")
    private List<GifEmoji> stickerList;

    static {
        Covode.recordClassIndex(44315);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final int getSource() {
        return this.source;
    }

    public final List<GifEmoji> getStickerList() {
        return this.stickerList;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setNextCursor(int i2) {
        this.nextCursor = i2;
    }

    public final void setSource(int i2) {
        this.source = i2;
    }

    public final void setStickerList(List<GifEmoji> list) {
        this.stickerList = list;
    }
}
