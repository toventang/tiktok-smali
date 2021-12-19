package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.utils.dx;
import java.io.Serializable;

public class UserAwemeCover implements Serializable {
    @b(a = dx.class)
    @c(a = "aweme_info")
    String awemeInfo;
    @c(a = "preview_end")
    int previewEnd;
    @c(a = "preview_start")
    int previewStart;
    @c(a = "pull_text")
    String pullText;

    static {
        Covode.recordClassIndex(75280);
    }

    public String getAwemeInfo() {
        return this.awemeInfo;
    }

    public int getPreviewEnd() {
        return this.previewEnd;
    }

    public int getPreviewStart() {
        return this.previewStart;
    }

    public String getPullText() {
        return this.pullText;
    }

    public void setAwemeInfo(String str) {
        this.awemeInfo = str;
    }

    public void setPreviewEnd(int i2) {
        this.previewEnd = i2;
    }

    public void setPreviewStart(int i2) {
        this.previewStart = i2;
    }

    public void setPullText(String str) {
        this.pullText = str;
    }
}
