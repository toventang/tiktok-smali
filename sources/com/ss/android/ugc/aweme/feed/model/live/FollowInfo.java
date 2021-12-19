package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class FollowInfo implements Serializable {
    @c(a = "follow_status")
    long followStatus;
    @c(a = "follower_count")
    long followerCount;
    @c(a = "following_count")
    long followingCount;
    @c(a = "push_status")
    long pushStatus;

    static {
        Covode.recordClassIndex(59491);
    }
}
