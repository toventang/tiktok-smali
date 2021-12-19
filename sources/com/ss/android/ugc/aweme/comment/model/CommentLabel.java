package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class CommentLabel implements Serializable {
    private static final long serialVersionUID = 5974802910310825054L;
    @c(a = b.f37372a)
    public String color;
    @c(a = "text")
    public String text;
    @c(a = StringSet.type)
    public int type;
    @c(a = "url")
    public String url;

    static {
        Covode.recordClassIndex(44299);
    }

    public String getLabelColor() {
        return this.color;
    }

    public String getLabelText() {
        return this.text;
    }

    public int getLabelType() {
        return this.type;
    }

    public String getLabelUrl() {
        return this.url;
    }

    public void setLabelColor(String str) {
        this.color = str;
    }

    public void setLabelText(String str) {
        this.text = str;
    }

    public void setLabelType(int i2) {
        this.type = i2;
    }

    public void setLabelUrl(String str) {
        this.url = str;
    }
}
