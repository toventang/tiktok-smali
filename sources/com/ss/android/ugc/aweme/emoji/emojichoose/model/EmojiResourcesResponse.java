package com.ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class EmojiResourcesResponse extends BaseResponse {
    @c(a = "resources")
    private List<a> resources;

    static {
        Covode.recordClassIndex(56104);
    }

    public List<a> getResources() {
        return this.resources;
    }

    public void setResources(List<a> list) {
        this.resources = list;
    }
}
