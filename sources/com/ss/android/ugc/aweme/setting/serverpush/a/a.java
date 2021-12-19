package com.ss.android.ugc.aweme.setting.serverpush.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "en_name")
    String englishName;
    @c(a = "code")
    String languageCode;
    @c(a = "local_name")
    String localName;

    static {
        Covode.recordClassIndex(80411);
    }

    public final String getEnglishName() {
        return this.englishName;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getLocalName() {
        return this.localName;
    }

    public final void setEnglishName(String str) {
        this.englishName = str;
    }

    public final void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public final void setLocalName(String str) {
        this.localName = str;
    }
}
