package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;

public interface ad {
    static {
        Covode.recordClassIndex(11305);
    }

    int getFollowCount();

    int getGiftUVCount();

    long getId();

    long getTicket();

    int getTotalUser();
}
