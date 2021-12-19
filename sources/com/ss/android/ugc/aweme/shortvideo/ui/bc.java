package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.sticker.g;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import h.f.b.l;

public final class bc {
    static {
        Covode.recordClassIndex(86120);
    }

    public static final c a(FaceStickerBean faceStickerBean) {
        l.d(faceStickerBean, "");
        g b2 = h.b(String.valueOf(faceStickerBean.getStickerId()));
        if (!(b2 instanceof c)) {
            b2 = null;
        }
        return (c) b2;
    }
}
