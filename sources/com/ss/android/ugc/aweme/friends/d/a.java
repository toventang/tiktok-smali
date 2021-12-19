package com.ss.android.ugc.aweme.friends.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.et;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96832a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(61442);
    }

    private static Keva a() {
        StringBuilder sb = new StringBuilder();
        User c2 = in.c();
        l.b(c2, "");
        return Keva.getRepo(sb.append(c2.getUid()).append("_friends_state_repo").toString());
    }

    public static final void a(String str) {
        l.d(str, "");
        a().storeLong(et.a(str), System.currentTimeMillis());
    }

    public static final boolean b(String str) {
        boolean z;
        l.d(str, "");
        String a2 = et.a(str);
        long j2 = a().getLong(a2, -1);
        if (j2 == -1) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis > 86400000 || currentTimeMillis < 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = true ^ z;
        if (z2) {
            a().erase(a2);
        }
        return z2;
    }
}
