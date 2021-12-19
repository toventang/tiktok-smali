package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class HotSearchGuideWord {
    @c(a = "breathe_times")
    public int breatheTimes;
    @c(a = "word")
    public String displayWord;
    @c(a = "search_word")
    public String searchWord;
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(59397);
    }

    public boolean isNormalWord() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public String getSearchWord() {
        if (TextUtils.isEmpty(this.searchWord)) {
            return this.displayWord;
        }
        return this.searchWord;
    }

    public boolean isAd() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "displayWord: " + this.displayWord + ", searchWord: " + this.searchWord + ", type: " + this.type;
    }
}
