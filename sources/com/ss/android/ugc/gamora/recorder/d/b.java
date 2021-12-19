package com.ss.android.ugc.gamora.recorder.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(97338);
    }

    public static final boolean a(FaceStickerBean faceStickerBean) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        l.d(faceStickerBean, "");
        if (!faceStickerBean.isBusi() || faceStickerBean.getFaceStickerCommerceBean() == null || (faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean()) == null || faceStickerCommerceBean.f134973d != 1) {
            return false;
        }
        FaceStickerCommerceBean faceStickerCommerceBean2 = faceStickerBean.getFaceStickerCommerceBean();
        if (faceStickerCommerceBean2 != null) {
            str = faceStickerCommerceBean2.f134972c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }
}
