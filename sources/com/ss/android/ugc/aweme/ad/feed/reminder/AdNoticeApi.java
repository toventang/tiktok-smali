package com.ss.android.ugc.aweme.ad.feed.reminder;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;
import f.a.t;

public interface AdNoticeApi {
    static {
        Covode.recordClassIndex(40593);
    }

    @h(a = "/tiktok/v1/ad/notice/subscription/status/")
    t<AdNoticeModel> getAdNotice(@z(a = "creative_id") String str);
}
