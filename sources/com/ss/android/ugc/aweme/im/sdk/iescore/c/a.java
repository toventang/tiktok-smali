package com.ss.android.ugc.aweme.im.sdk.iescore.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(65923);
    }

    public static final c a(User user) {
        l.d(user, "");
        c cVar = new c();
        cVar.f33946a = user.getUid();
        cVar.f33947b = user.getSecUid();
        return cVar;
    }
}
