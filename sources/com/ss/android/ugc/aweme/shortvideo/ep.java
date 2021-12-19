package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class ep {

    /* renamed from: a  reason: collision with root package name */
    public static final ep f128448a = new ep();

    private ep() {
    }

    static {
        Covode.recordClassIndex(84221);
    }

    public static final String a(User user) {
        String uniqueId;
        l.d(user, "");
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
        } else {
            uniqueId = user.getUniqueId();
        }
        l.b(uniqueId, "");
        return uniqueId;
    }
}
