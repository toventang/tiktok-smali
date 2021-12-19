package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;

public final class c {
    @com.google.gson.a.c(a = "following_list")

    /* renamed from: a  reason: collision with root package name */
    public int f76646a;

    static {
        Covode.recordClassIndex(47347);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && this.f76646a == ((c) obj).f76646a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f76646a;
    }

    public final String toString() {
        return "FollowList(followingList=" + this.f76646a + ")";
    }

    public c(int i2) {
        this.f76646a = i2;
    }
}
