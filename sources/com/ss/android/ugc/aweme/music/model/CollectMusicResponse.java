package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class CollectMusicResponse extends BaseResponse {
    public int action;
    @c(a = "resso_info")
    public RessoCollectInfo ressoCollectInfo;

    static {
        Covode.recordClassIndex(71656);
    }
}
