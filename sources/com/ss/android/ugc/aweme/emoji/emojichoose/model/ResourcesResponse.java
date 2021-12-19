package com.ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class ResourcesResponse extends BaseResponse {
    @c(a = "resources")
    List<b> resources;

    static {
        Covode.recordClassIndex(56105);
    }

    public List<b> getResources() {
        return this.resources;
    }

    public void setResources(List<b> list) {
        this.resources = list;
    }
}
