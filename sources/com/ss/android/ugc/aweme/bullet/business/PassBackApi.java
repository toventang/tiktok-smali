package com.ss.android.ugc.aweme.bullet.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.t;
import com.google.gson.o;

public interface PassBackApi {
    static {
        Covode.recordClassIndex(42679);
    }

    @t
    b<String> executePost(@ag String str, @com.bytedance.retrofit2.b.b o oVar);
}
