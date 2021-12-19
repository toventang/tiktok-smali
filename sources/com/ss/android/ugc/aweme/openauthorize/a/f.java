package com.ss.android.ugc.aweme.openauthorize.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class f implements Serializable {
    @c(a = "text_content")
    private final String textContent;
    @c(a = "text_key")
    private final String textKey;

    static {
        Covode.recordClassIndex(73694);
    }

    public final String getTextContent() {
        return this.textContent;
    }

    public final String getTextKey() {
        return this.textKey;
    }
}
