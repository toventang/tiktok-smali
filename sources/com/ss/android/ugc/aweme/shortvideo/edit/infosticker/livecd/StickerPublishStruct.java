package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class StickerPublishStruct {
    @c(a = "sticker_type")
    private final int stickerType;

    static {
        Covode.recordClassIndex(83750);
    }

    public StickerPublishStruct() {
        this(0, 1, null);
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public StickerPublishStruct(int i2) {
        this.stickerType = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerPublishStruct(int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
