package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import java.util.ArrayList;

public final class StickerPermissionResponse extends BaseResponse {
    @c(a = "sticker_list")
    private final ArrayList<StickerPublishStruct> stickerList;

    static {
        Covode.recordClassIndex(83749);
    }

    public StickerPermissionResponse() {
        this(null, 1, null);
    }

    public final ArrayList<StickerPublishStruct> getStickerList() {
        return this.stickerList;
    }

    public StickerPermissionResponse(ArrayList<StickerPublishStruct> arrayList) {
        this.stickerList = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerPermissionResponse(ArrayList arrayList, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : arrayList);
    }
}
