package com.ss.android.ugc.aweme.comment.barrage.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.barrage.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final User f71548a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f71549b;

    /* renamed from: c  reason: collision with root package name */
    public final long f71550c;

    /* renamed from: d  reason: collision with root package name */
    public final a f71551d;

    static {
        Covode.recordClassIndex(44025);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f71548a, bVar.f71548a) && l.a(this.f71549b, bVar.f71549b) && this.f71550c == bVar.f71550c && l.a(this.f71551d, bVar.f71551d);
    }

    public final String toString() {
        return "ReactionBubbleDescriptionItem(user=" + this.f71548a + ", aweme=" + this.f71549b + ", publishTimeInMs=" + this.f71550c + ", mobEventParam=" + this.f71551d + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        User user = this.f71548a;
        int i4 = 0;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i2 * 31;
        Aweme aweme = this.f71549b;
        if (aweme != null) {
            i3 = aweme.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f71550c;
        int i6 = (((i5 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        a aVar = this.f71551d;
        if (aVar != null) {
            i4 = aVar.hashCode();
        }
        return i6 + i4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(User user, Aweme aweme, long j2, a aVar) {
        super(3);
        l.d(user, "");
        l.d(aweme, "");
        this.f71548a = user;
        this.f71549b = aweme;
        this.f71550c = j2;
        this.f71551d = aVar;
    }
}
