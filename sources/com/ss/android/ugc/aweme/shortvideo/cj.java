package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class cj implements Serializable {
    @c(a = "title")
    private String dialogTitle;
    @c(a = "go_back")
    private String goBack;
    @c(a = "post_anyway")
    private String postAnyway;
    @c(a = "text")
    private String text;

    static {
        Covode.recordClassIndex(82188);
    }

    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final String getGoBack() {
        return this.goBack;
    }

    public final String getPostAnyway() {
        return this.postAnyway;
    }

    public final String getText() {
        return this.text;
    }

    public final void setDialogTitle(String str) {
        this.dialogTitle = str;
    }

    public final void setGoBack(String str) {
        this.goBack = str;
    }

    public final void setPostAnyway(String str) {
        this.postAnyway = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
