package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class UserProfileInitInfo implements Serializable {
    @c(a = "head_model_score")
    public double headModelScore;

    static {
        Covode.recordClassIndex(59464);
    }

    public double getHeadModelScore() {
        return this.headModelScore;
    }

    public void setHeadModelScore(double d2) {
        this.headModelScore = d2;
    }
}
