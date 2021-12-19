package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class EditHint implements Serializable {
    @c(a = "hint")
    String hint;
    @c(a = "language")
    String language;

    static {
        Covode.recordClassIndex(59370);
    }

    public String getHint() {
        return this.hint;
    }

    public String getLanguage() {
        return this.language;
    }

    public String toString() {
        return "EditHint{language='" + this.language + '\'' + ", hint='" + this.hint + '\'' + '}';
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }
}
