package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.d.d;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f13385a = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(7458);
    }

    public static final Object a() {
        if (LiveMessageTimeoutSetting.INSTANCE.getHttpFetchRequestTimeout() <= 0) {
            return null;
        }
        d dVar = new d();
        dVar.f28948i = LiveMessageTimeoutSetting.INSTANCE.getHttpFetchRequestTimeout();
        return dVar;
    }
}
