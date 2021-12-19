package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MusicSearchHistory {
    @c(a = "keyword")
    public String keyword;
    @c(a = "int")
    public int type;

    static {
        Covode.recordClassIndex(71680);
    }

    public MusicSearchHistory() {
    }

    public int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public MusicSearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.keyword;
            String str2 = ((MusicSearchHistory) obj).keyword;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public MusicSearchHistory(String str, int i2) {
        this.keyword = str;
        this.type = i2;
    }
}
