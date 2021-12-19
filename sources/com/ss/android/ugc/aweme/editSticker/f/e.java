package com.ss.android.ugc.aweme.editSticker.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.m;
import com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.tools.utils.d;
import h.f.b.l;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(55415);
    }

    public static final void a(InteractStickerStruct interactStickerStruct, List<? extends BaseTrackTimeStamp> list) {
        l.d(interactStickerStruct, "");
        l.d(list, "");
        if (d.a(list)) {
            interactStickerStruct.setTrackList("");
            return;
        }
        try {
            interactStickerStruct.setTrackList(com.ss.android.ugc.aweme.editSticker.d.b().b(list));
        } catch (m unused) {
        }
    }
}
