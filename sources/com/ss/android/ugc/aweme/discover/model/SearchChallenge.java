package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.commercialize.model.an;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

public class SearchChallenge implements Serializable {
    @b(a = StringJsonAdapterFactory.class)
    @c(a = "ad_data")
    an adData;
    @c(a = "items")
    List<Aweme> awemes;
    @c(a = "challenge_info")
    Challenge challenge;
    public LogPbBean logPbBean;
    @c(a = "position")
    List<Position> position;
    private String requestId;

    static {
        Covode.recordClassIndex(50922);
    }

    public an getAdData() {
        return this.adData;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean hasAwemeList() {
        List<Aweme> list = this.awemes;
        if (list == null || list.size() < 3) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.challenge.getCid().hashCode();
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            challenge2.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallenge)) {
            return false;
        }
        return TextUtils.equals(this.challenge.getCid(), ((SearchChallenge) obj).challenge.getCid());
    }
}
