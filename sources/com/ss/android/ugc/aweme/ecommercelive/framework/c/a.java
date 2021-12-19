package com.ss.android.ugc.aweme.ecommercelive.framework.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.ECommerceLiveSettingsServiceImpl;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(55333);
    }

    public static final IECommerceLiveSettingsService a() {
        IECommerceLiveSettingsService c2 = ECommerceLiveSettingsServiceImpl.c();
        l.b(c2, "");
        return c2;
    }
}
