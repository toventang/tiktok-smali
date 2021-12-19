package com.bytedance.creativex.recorder.sticker.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import org.json.JSONObject;

public final class g {
    static {
        Covode.recordClassIndex(16712);
    }

    public static boolean a(FaceStickerBean faceStickerBean) {
        if (com.ss.android.ugc.aweme.sticker.p.g.a("GreenScreen", faceStickerBean) || com.ss.android.ugc.aweme.sticker.p.g.a("BackgroundVideo", faceStickerBean) || ((faceStickerBean != null && faceStickerBean != FaceStickerBean.NONE && c.a(faceStickerBean.getSdkExtra(), "BackgroundVideo")) || b(faceStickerBean))) {
            return true;
        }
        return false;
    }

    private static boolean b(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || TextUtils.isEmpty(faceStickerBean.getSdkExtra()) || !faceStickerBean.getSdkExtra().contains("pl") || !faceStickerBean.getSdkExtra().contains("alg")) {
            return false;
        }
        try {
            return new JSONObject(faceStickerBean.getSdkExtra()).has("pl");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
