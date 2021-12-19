package com.bytedance.lobby.google;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.sdk.a.k.b.a.b;
import com.bytedance.sdk.a.k.c.d;

public class GoogleWebAuthProvider extends BaseProvider {
    static {
        Covode.recordClassIndex(24786);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void d() {
        Application application = LobbyCore.getApplication();
        b[] bVarArr = {new b("https://accounts.google.com/o/oauth2/v2/auth", "https://www.googleapis.com/oauth2/v4/token", this.f40228c.f40177c)};
        d.f43392a = application;
        int i2 = 0;
        do {
            bVarArr[0].a(application);
            i2++;
        } while (i2 <= 0);
    }

    protected GoogleWebAuthProvider(Application application, com.bytedance.lobby.d dVar) {
        super(application, dVar);
    }
}
