package com.ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.publish.e;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public final class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private final String f74443a = "StarAtlasPublishServiceExtension";

    static {
        Covode.recordClassIndex(45917);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        l.d(baseShortVideoContext, "");
        l.d(baseShortVideoContext, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        l.d(baseShortVideoContext, "");
        l.d(linkedHashMap, "");
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        l.b(fromContext, "");
        if (fromContext.isStarAtlas) {
            linkedHashMap.put("is_star_atlas", "1");
        } else {
            linkedHashMap.put("is_star_atlas", "0");
        }
        if (!TextUtils.isEmpty(fromContext.starAtlasContent)) {
            String str = fromContext.starAtlasContent;
            l.b(str, "");
            linkedHashMap.put("star_atlas_content", str);
        }
        if (!TextUtils.isEmpty(fromContext.brandedContentType)) {
            String str2 = fromContext.brandedContentType;
            l.b(str2, "");
            linkedHashMap.put("branded_content_type", str2);
        }
        if (!b.a((Collection) fromContext.tcmTagBaInfo)) {
            String b2 = new f().b(fromContext.tcmTagBaInfo);
            l.b(b2, "");
            linkedHashMap.put("tcm_tag_ba_info", b2);
        }
    }
}
