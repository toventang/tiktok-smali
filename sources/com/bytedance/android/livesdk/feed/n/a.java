package com.bytedance.android.livesdk.feed.n;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;

public final class a implements com.bytedance.android.livesdk.feed.g.a {
    static {
        Covode.recordClassIndex(9742);
    }

    @Override // com.bytedance.android.livesdk.feed.g.a
    public final boolean a() {
        return ((IHostUser) com.bytedance.android.live.t.a.a(IHostUser.class)).isLogin();
    }
}
