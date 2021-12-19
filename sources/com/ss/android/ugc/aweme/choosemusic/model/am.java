package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class am implements Serializable {
    @c(a = "info")
    private String info;
    @c(a = "query_id")
    private String queryId;
    @c(a = "words_source")
    private String wordsSource;

    static {
        Covode.recordClassIndex(43555);
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final String getWordsSource() {
        return this.wordsSource;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setWordsSource(String str) {
        this.wordsSource = str;
    }
}
