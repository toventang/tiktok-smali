package com.ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import l.b.f;
import l.b.t;

public interface IGetVideoInfoApi {
    static {
        Covode.recordClassIndex(77029);
    }

    @f(a = "/tiktok/v1/video/query_url/")
    ab<b> getVideoInfoByURL(@t(a = "video_url") String str);
}
