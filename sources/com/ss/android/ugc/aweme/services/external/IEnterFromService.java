package com.ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;

public interface IEnterFromService {
    static {
        Covode.recordClassIndex(79634);
    }

    String getEnterFrom();

    void setEnterFrom(String str);
}
