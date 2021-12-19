package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class EffectExtKt {
    static {
        Covode.recordClassIndex(95334);
    }

    public static final String expectedMd5(Effect effect) {
        l.c(effect, "");
        UrlModel fileUrl = effect.getFileUrl();
        if (fileUrl != null) {
            return fileUrl.getUri();
        }
        return null;
    }
}
