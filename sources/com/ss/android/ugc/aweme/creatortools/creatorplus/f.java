package com.ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;

public enum f {
    CreatorPlusStatusUnknown(0),
    CreatorPlusStatusNoRights(1),
    CreatorPlusStatusNeverEnrolled(2),
    CreatorPlusStatusEnrolled(3),
    CreatorPlusStatusMeetsAllRequirements(4),
    CreatorPlusStatusMeetsSomeRequirements(5),
    CreatorPlusStatusEnrollFailed(6),
    CreatorPlusStatusLeft(7),
    CreatorPlusStatusEvicted(8);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(48696);
    }

    private f(int i2) {
        this.value = i2;
    }
}
