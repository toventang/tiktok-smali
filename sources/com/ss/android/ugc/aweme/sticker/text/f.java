package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    static {
        Covode.recordClassIndex(88726);
    }

    private static List<String> a(StickerItemModel stickerItemModel) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(t.i(((TextStickerData) g.a().G().a(stickerItemModel.extra, TextStickerData.class)).getTextWrapList()));
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void a(BaseShortVideoContext baseShortVideoContext, JSONArray jSONArray) {
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            com.google.c.a.f fVar = g.f135737a;
            com.google.c.a.f fVar2 = h.f135738a;
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList = new ArrayList();
            if (videoPublishEditModel.hasInfoStickers()) {
                for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                    if (((Boolean) fVar.a(stickerItemModel)).booleanValue()) {
                        arrayList.add(stickerItemModel);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, i.f135739a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    jSONArray2.put(fVar2.a(arrayList.get(i2)));
                }
            }
            if (jSONArray2.length() > 0) {
                try {
                    jSONArray.put(new JSONObject().put(StringSet.type, 4).put("data", jSONArray2));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getHasCoverText() && videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getTextSticker() != null) {
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    for (String str : a(videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getTextSticker())) {
                        jSONArray3.put(str);
                    }
                    jSONArray.put(new JSONObject().put(StringSet.type, 9).put("data", jSONArray3));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }
}
