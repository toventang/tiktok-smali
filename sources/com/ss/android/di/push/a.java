package com.ss.android.di.push;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.interaction.PushService;

public final class a {
    static {
        Covode.recordClassIndex(36723);
    }

    public static IPushApi a() {
        IPushApi iPushApi;
        try {
            iPushApi = PushService.createIPushApibyMonsterPlugin(false);
        } catch (Exception unused) {
            iPushApi = null;
        }
        if (iPushApi == null) {
            return new PushServiceMock();
        }
        return iPushApi;
    }
}
