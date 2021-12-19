package com.ss.android.ugc.tiktok.location_api.service;

import com.bytedance.bpea.basics.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.w;

public interface ILocationService {
    static {
        Covode.recordClassIndex(98123);
    }

    w getInitLocationTask();

    int getLocationAB();

    void initLocation(d dVar);

    void setOpt(boolean z);
}
