package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class PrivacySetting implements Serializable {
    @c(a = "following_visibility")
    private final int followingVisibility;

    static {
        Covode.recordClassIndex(75247);
    }

    public PrivacySetting() {
        this(0, 1, null);
    }

    public final int getFollowingVisibility() {
        return this.followingVisibility;
    }

    public PrivacySetting(int i2) {
        this.followingVisibility = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacySetting(int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
