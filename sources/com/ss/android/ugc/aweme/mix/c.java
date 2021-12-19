package com.ss.android.ugc.aweme.mix;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.e;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;

public final class c implements e {
    static {
        Covode.recordClassIndex(70330);
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
        if (baseShortVideoContext.playlist_id != null && baseShortVideoContext.playlist_name != null) {
            String str = baseShortVideoContext.playlist_id;
            l.b(str, "");
            linkedHashMap.put("playlist_id", str);
            String str2 = baseShortVideoContext.playlist_name;
            l.b(str2, "");
            linkedHashMap.put("playlist_name", str2);
        }
    }
}
