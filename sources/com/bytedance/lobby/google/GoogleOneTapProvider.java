package com.bytedance.lobby.google;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.d;
import com.bytedance.lobby.internal.BaseProvider;

class GoogleOneTapProvider<T> extends BaseProvider<T> {
    static {
        Covode.recordClassIndex(24782);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void d() {
    }

    GoogleOneTapProvider(Application application, d dVar) {
        super(application, dVar);
    }
}
