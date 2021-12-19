package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class e implements Serializable {
    private String creativeId;
    private String logExtra;

    static {
        Covode.recordClassIndex(66565);
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public e(String str, String str2) {
        this.logExtra = str;
        this.creativeId = str2;
    }
}
