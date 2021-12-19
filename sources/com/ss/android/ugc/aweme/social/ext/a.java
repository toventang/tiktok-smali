package com.ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.service.b;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(87454);
    }

    public static final <T extends TuxTextView> void a(T t, User user, Aweme aweme, Integer num) {
        l.d(t, "");
        b.f133710a.a(t, user, aweme, num);
    }

    public static /* synthetic */ void a(TuxTextView tuxTextView, User user, Aweme aweme, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            user = null;
        }
        if ((i2 & 2) != 0) {
            aweme = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        a(tuxTextView, user, aweme, num);
    }
}
