package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.e;

public final class IFetchResourceListenerKt {
    static {
        Covode.recordClassIndex(95194);
    }

    public static final e<Long> toKNListener(IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener == null) {
            return null;
        }
        return new IFetchResourceListenerKt$toKNListener$1(iFetchResourceListener);
    }
}
