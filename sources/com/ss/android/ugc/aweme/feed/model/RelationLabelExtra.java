package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class RelationLabelExtra implements Serializable {
    @c(a = "after_text")
    private String afterText = "";
    @c(a = "comment_id")
    private String cid = "";
    @c(a = "tab_text")
    private String tabText = "";

    static {
        Covode.recordClassIndex(59447);
    }

    public final String getAfterText() {
        return this.afterText;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getTabText() {
        return this.tabText;
    }

    public final void setAfterText(String str) {
        this.afterText = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setTabText(String str) {
        this.tabText = str;
    }
}
