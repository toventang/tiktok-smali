package com.ss.android.ugc.aweme.story.interaction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class f extends e {

    /* renamed from: a  reason: collision with root package name */
    public final User f137850a;

    /* renamed from: b  reason: collision with root package name */
    public final long f137851b;

    /* renamed from: c  reason: collision with root package name */
    public final g f137852c;

    static {
        Covode.recordClassIndex(90179);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f137850a, fVar.f137850a) && this.f137851b == fVar.f137851b && l.a(this.f137852c, fVar.f137852c);
    }

    public final String toString() {
        return "ReactionBubblePublishItem(user=" + this.f137850a + ", publishTimeInMs=" + this.f137851b + ", mobEventParam=" + this.f137852c + ")";
    }

    public final int hashCode() {
        int i2;
        User user = this.f137850a;
        int i3 = 0;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f137851b;
        int i4 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        g gVar = this.f137852c;
        if (gVar != null) {
            i3 = gVar.hashCode();
        }
        return i4 + i3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(User user, long j2, g gVar) {
        super(2);
        l.d(user, "");
        this.f137850a = user;
        this.f137851b = j2;
        this.f137852c = gVar;
    }
}
