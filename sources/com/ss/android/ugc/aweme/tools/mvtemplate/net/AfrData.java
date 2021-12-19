package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class AfrData {
    private String algorithm = "";
    @c(a = "pic_conf")
    private String jsonResult = "";
    private String pic;

    static {
        Covode.recordClassIndex(91982);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final String getPic() {
        return this.pic;
    }

    public final void setPic(String str) {
        this.pic = str;
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
