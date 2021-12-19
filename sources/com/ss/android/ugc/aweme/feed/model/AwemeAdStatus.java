package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class AwemeAdStatus extends BaseResponse {
    @c(a = "ad_exist")
    public boolean adExist;
    @c(a = "ad_id")
    public String adId;
    @c(a = "pass")
    public boolean pass;
    @c(a = "url")
    public String url;

    static {
        Covode.recordClassIndex(59315);
    }
}
