package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CommentRethinkPopup implements Serializable {
    @c(a = "body")
    private String body;
    @c(a = "highlight")
    private String highlight;
    @c(a = "link")
    private final String link;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(44306);
    }

    public CommentRethinkPopup() {
        this(null, null, null, null, 15, null);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHighlight() {
        return this.highlight;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        l.d(str, "");
        this.body = str;
    }

    public final void setHighlight(String str) {
        l.d(str, "");
        this.highlight = str;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }

    public CommentRethinkPopup(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.title = str;
        this.body = str2;
        this.highlight = str3;
        this.link = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentRethinkPopup(String str, String str2, String str3, String str4, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4);
    }
}
