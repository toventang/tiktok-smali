package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public abstract class af extends ad {

    /* renamed from: a  reason: collision with root package name */
    public final User f104041a;

    /* renamed from: b  reason: collision with root package name */
    public final String f104042b;

    static {
        Covode.recordClassIndex(66630);
    }

    public int hashCode() {
        return this.f104041a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        return l.a((Object) this.f104041a.getUid(), (Object) ((af) obj).f104041a.getUid());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(User user, String str, int i2) {
        super(i2);
        l.d(user, "");
        l.d(str, "");
        this.f104041a = user;
        this.f104042b = str;
    }
}
