package com.ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.publish.e;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;

public final class c implements e {
    static {
        Covode.recordClassIndex(45373);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        l.d(baseShortVideoContext, "");
        l.d(baseShortVideoContext, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        String str = "";
        l.d(baseShortVideoContext, str);
        l.d(linkedHashMap, str);
        if (PublishExtensionModel.fromContext(baseShortVideoContext).fromCommercialSoundPage) {
            linkedHashMap.put("is_commercial_sound_page", "1");
        } else {
            linkedHashMap.put("is_commercial_sound_page", "0");
        }
        if (baseShortVideoContext.isDefaultProp) {
            linkedHashMap.put("is_default_prop", "1");
        } else {
            linkedHashMap.put("is_default_prop", "0");
        }
        Mission mission = PublishExtensionModel.fromString(baseShortVideoContext.commerceData).mission;
        if (mission != null) {
            String missionId = mission.getMissionId();
            if (missionId == null) {
                missionId = str;
            }
            linkedHashMap.put("mission_id", missionId);
            String enterFrom = mission.getEnterFrom();
            if (enterFrom != null) {
                str = enterFrom;
            }
            linkedHashMap.put("mission_from", str);
        }
    }
}
