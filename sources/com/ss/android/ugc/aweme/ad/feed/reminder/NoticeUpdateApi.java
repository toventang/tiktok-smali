package com.ss.android.ugc.aweme.ad.feed.reminder;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;

public interface NoticeUpdateApi {
    static {
        Covode.recordClassIndex(40594);
    }

    @t(a = "/tiktok/v1/ad/notice/update/")
    f.a.t<AdNoticeModel> postAdNotice(@z(a = "creative_id") String str, @z(a = "enable_notice") Boolean bool, @z(a = "log_id") String str2);
}
