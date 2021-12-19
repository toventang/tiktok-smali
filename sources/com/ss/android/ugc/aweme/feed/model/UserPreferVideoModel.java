package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class UserPreferVideoModel extends BaseResponse {
    @c(a = "video_list")
    public List<UserPreferVideo> videoList;

    static {
        Covode.recordClassIndex(59463);
    }
}
