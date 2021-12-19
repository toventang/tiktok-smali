package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class HonorStruct implements Serializable {
    @c(a = "honor_level")
    public int level;
    @c(a = "honor_score")
    public long score;

    static {
        Covode.recordClassIndex(75228);
    }
}
