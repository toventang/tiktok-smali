package com.ss.android.ugc.aweme.feed.ui.instagram;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class InsDialogSettings {
    @c(a = "body")
    private String body = "body";
    @c(a = "cancel_btn_text")
    private String cancelBtnText = "not now";
    @c(a = "jump_url")
    private String jumpUrl = "";
    @c(a = "ok_btn_text")
    private String okBtnText = "ok";
    @c(a = "title")
    private String title = "title";

    static {
        Covode.recordClassIndex(60131);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCancelBtnText() {
        return this.cancelBtnText;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getOkBtnText() {
        return this.okBtnText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        l.d(str, "");
        this.body = str;
    }

    public final void setCancelBtnText(String str) {
        l.d(str, "");
        this.cancelBtnText = str;
    }

    public final void setJumpUrl(String str) {
        l.d(str, "");
        this.jumpUrl = str;
    }

    public final void setOkBtnText(String str) {
        l.d(str, "");
        this.okBtnText = str;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }
}
