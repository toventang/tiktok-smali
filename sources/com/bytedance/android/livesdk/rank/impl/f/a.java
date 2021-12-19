package com.bytedance.android.livesdk.rank.impl.f;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.api.model.b;
import com.bytedance.android.livesdk.rank.api.model.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(12242);
    }

    public static final b a(h hVar) {
        String str = "";
        l.d(hVar, str);
        User user = hVar.f20607a;
        l.b(user, str);
        int i2 = hVar.f20609c;
        long j2 = hVar.f20608b;
        int i3 = hVar.f20615i;
        String str2 = hVar.f20610d;
        if (str2 != null) {
            str = str2;
        }
        return new b(user, i2, j2, i3, str);
    }
}
