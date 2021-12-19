package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class cn {

    /* renamed from: a  reason: collision with root package name */
    public static final cn f118413a = new cn();

    private cn() {
    }

    static {
        Covode.recordClassIndex(76911);
    }

    public static final boolean a() {
        return SettingsManager.a().a("multi_photo_disable_effect_below_five_point", false);
    }
}
