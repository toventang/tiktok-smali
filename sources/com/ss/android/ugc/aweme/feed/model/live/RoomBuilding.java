package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class RoomBuilding extends BaseResponse implements Serializable {
    @c(a = "activity_h5_url")
    public String activityH5Url;
    @c(a = "activity_icon_url")
    public UrlModel activityIconUrl;
    @c(a = "begin_time")
    public long beginTime;
    @c(a = "end_time")
    public long endTime;
    @c(a = "show_h5")
    public boolean showH5;
    @c(a = "show_h5_url")
    public String showH5Url;

    static {
        Covode.recordClassIndex(59507);
    }
}
