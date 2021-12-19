package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class RedEnvelopeURLConfig {
    @Group(isDefault = true, value = "default group")
    private static b DEFAULT = new b();
    public static final RedEnvelopeURLConfig INSTANCE = new RedEnvelopeURLConfig();

    private RedEnvelopeURLConfig() {
    }

    public final b getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(10966);
    }

    public final String getSendUrl() {
        b bVar = (b) SettingsManager.INSTANCE.getValueSafely(RedEnvelopeURLConfig.class);
        if (bVar != null) {
            return bVar.f18732b;
        }
        return null;
    }

    public final String getShortTouchUrl() {
        b bVar = (b) SettingsManager.INSTANCE.getValueSafely(RedEnvelopeURLConfig.class);
        if (bVar != null) {
            return bVar.f18731a;
        }
        return null;
    }

    public final void setDEFAULT(b bVar) {
        l.d(bVar, "");
        DEFAULT = bVar;
    }
}
