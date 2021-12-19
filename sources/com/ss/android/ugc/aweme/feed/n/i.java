package com.ss.android.ugc.aweme.feed.n;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.login.a.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.d.a.c;

public final class i implements IAccountService.b {
    static {
        Covode.recordClassIndex(59554);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        if (i2 == 4 || i2 == 1) {
            c.a(new b(false));
        }
    }
}
