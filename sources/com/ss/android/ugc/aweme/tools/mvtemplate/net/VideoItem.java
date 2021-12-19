package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class VideoItem {
    private String algorithm = "";
    private String content;
    @c(a = "video_conf")
    private String jsonResult = "";

    static {
        Covode.recordClassIndex(91987);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setAlgorithm(String str) {
        l.d(str, "");
        this.algorithm = str;
    }

    public final void setJsonResult(String str) {
        l.d(str, "");
        this.jsonResult = str;
    }
}
