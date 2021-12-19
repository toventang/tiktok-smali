package com.ss.android.ugc.aweme.following.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public enum a implements Serializable {
    FOLLOWING,
    FOLLOWER;

    static {
        Covode.recordClassIndex(60990);
    }
}
