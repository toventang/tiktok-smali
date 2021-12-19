package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.search.j;
import java.util.Arrays;

public class SearchHistory {
    @c(a = "keyword")
    public String keyword;
    @c(a = "int")
    public int type;
    @c(a = "uid")
    public String uid;

    static {
        Covode.recordClassIndex(50929);
    }

    public SearchHistory() {
    }

    public String toString() {
        return this.keyword;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.keyword, this.uid});
    }

    public SearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public static int toHistoryType(int i2) {
        if (i2 == j.f121155c) {
            return 16;
        }
        if (i2 == j.f121157e) {
            return 17;
        }
        if (i2 == j.f121158f) {
            return 22;
        }
        if (i2 == j.f121159g) {
            return 18;
        }
        if (i2 == j.f121156d) {
            return 19;
        }
        if (i2 == j.f121154b) {
            return 20;
        }
        if (i2 == j.f121160h) {
            return 21;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SearchHistory searchHistory = (SearchHistory) obj;
            String str = this.keyword;
            if (str == null ? searchHistory.keyword == null : str.equals(searchHistory.keyword)) {
                String str2 = this.uid;
                if (str2 == null ? searchHistory.uid != null : !str2.equals(searchHistory.uid)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public SearchHistory(String str, int i2) {
        this.keyword = str;
        this.type = i2;
    }

    public SearchHistory(String str, int i2, String str2) {
        this.keyword = str;
        this.type = i2;
        this.uid = str2;
    }
}
