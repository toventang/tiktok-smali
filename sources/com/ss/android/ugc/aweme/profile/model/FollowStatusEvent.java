package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class FollowStatusEvent implements b {
    public final FollowStatus status;

    static {
        Covode.recordClassIndex(75222);
    }

    public static /* synthetic */ FollowStatusEvent copy$default(FollowStatusEvent followStatusEvent, FollowStatus followStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            followStatus = followStatusEvent.status;
        }
        return followStatusEvent.copy(followStatus);
    }

    public final FollowStatusEvent copy(FollowStatus followStatus) {
        l.d(followStatus, "");
        return new FollowStatusEvent(followStatus);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FollowStatusEvent) && l.a(this.status, ((FollowStatusEvent) obj).status);
        }
        return true;
    }

    public final int hashCode() {
        FollowStatus followStatus = this.status;
        if (followStatus != null) {
            return followStatus.hashCode();
        }
        return 0;
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public final String toString() {
        return "FollowStatusEvent(status=" + this.status + ")";
    }

    public FollowStatusEvent(FollowStatus followStatus) {
        l.d(followStatus, "");
        this.status = followStatus;
    }
}
