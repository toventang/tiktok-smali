package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.e;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.utils.ha;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;

public final class ai implements e {

    /* renamed from: a  reason: collision with root package name */
    private final String f123354a = "SharePublishServiceExtension";

    static {
        Covode.recordClassIndex(81009);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        l.d(baseShortVideoContext, "");
        l.d(baseShortVideoContext, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        String str;
        String str2;
        l.d(baseShortVideoContext, "");
        l.d(linkedHashMap, "");
        ad a2 = ha.a(baseShortVideoContext);
        if (a2 != null) {
            if (a2.mClientKey != null && !linkedHashMap.containsKey("open_platform_key")) {
                String str3 = a2.mClientKey;
                l.b(str3, "");
                linkedHashMap.put("open_platform_key", str3);
            }
            if (a2.mOpenPlatformExtra != null && !linkedHashMap.containsKey("open_platform_extra")) {
                String str4 = a2.mOpenPlatformExtra;
                l.b(str4, "");
                linkedHashMap.put("open_platform_extra", str4);
            }
            if (a2.mState == null) {
                str = "";
            } else {
                str = a2.mState;
            }
            l.b(str, "");
            linkedHashMap.put("open_platform_share_id", str);
            if (a2.mOpenPlatformContent == null) {
                str2 = "";
            } else {
                str2 = a2.mOpenPlatformContent;
            }
            l.b(str2, "");
            linkedHashMap.put("open_platform_content", str2);
        }
    }
}
