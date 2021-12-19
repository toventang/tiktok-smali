package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class QuickShopSecondFloorInfo implements Serializable {
    @c(a = "enter_text")
    public String enterText;
    @c(a = "process_text")
    public String processText;
    @c(a = "trans_bg_text")
    public String transBgText;

    static {
        Covode.recordClassIndex(75252);
    }

    public String getEnterText() {
        return this.enterText;
    }

    public String getProcessText() {
        return this.processText;
    }

    public String getTransBgText() {
        return this.transBgText;
    }

    public void setEnterText(String str) {
        this.enterText = str;
    }

    public void setProcessText(String str) {
        this.processText = str;
    }

    public void setTransBgText(String str) {
        this.transBgText = str;
    }
}
