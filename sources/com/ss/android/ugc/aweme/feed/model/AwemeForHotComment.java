package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public class AwemeForHotComment {
    public Aweme mAweme;
    public int mEventType;
    public String mHotCommentTargetId;

    static {
        Covode.recordClassIndex(59321);
    }

    public AwemeForHotComment(int i2, Aweme aweme) {
        this.mEventType = i2;
        this.mAweme = aweme;
    }
}
