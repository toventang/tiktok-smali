package com.ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.tools.utils.d;
import h.f.b.l;

public final class k {
    static {
        Covode.recordClassIndex(91602);
    }

    public static final boolean[] a(InfoStickerModel infoStickerModel) {
        l.d(infoStickerModel, "");
        boolean[] zArr = {false, false};
        if (d.a(infoStickerModel.stickers)) {
            return zArr;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            l.b(stickerItemModel, "");
            if (stickerItemModel.isImageSticker()) {
                zArr[0] = true;
                if (stickerItemModel.cutout) {
                    zArr[1] = true;
                }
            }
        }
        return zArr;
    }
}
