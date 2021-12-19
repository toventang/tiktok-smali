package com.ss.android.ugc.aweme.qna.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(77467);
    }

    public static final boolean a(String str) {
        l.d(str, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return TextUtils.equals(str, g2.getCurUserId());
    }
}
