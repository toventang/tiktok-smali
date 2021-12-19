package com.ss.android.ugc.aweme.discover;

import com.bytedance.covode.number.Covode;

public interface IHotSpotRepo {
    static {
        Covode.recordClassIndex(49868);
    }

    void getAllSpots();
}
