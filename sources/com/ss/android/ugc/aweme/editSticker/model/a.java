package com.ss.android.ugc.aweme.editSticker.model;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(55473);
    }

    public static final Bitmap a(CoverPublishModel coverPublishModel, Bitmap bitmap) {
        l.d(bitmap, "");
        if (coverPublishModel == null) {
            return bitmap;
        }
        return coverPublishModel.getEffectTextModel().mergeCoverText(bitmap);
    }
}
