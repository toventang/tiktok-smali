package com.bytedance.lobby.instagram;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.d;
import com.bytedance.lobby.internal.BaseProvider;

class InstagramProvider<T> extends BaseProvider<T> {
    static {
        Covode.recordClassIndex(24794);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void d() {
    }

    InstagramProvider(Application application, d dVar) {
        super(application, dVar);
    }
}
