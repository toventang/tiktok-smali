package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class bd {

    /* renamed from: a  reason: collision with root package name */
    public static final bd f118361a = new bd();

    private bd() {
    }

    static {
        Covode.recordClassIndex(76871);
    }

    public static final boolean a() {
        return SettingsManager.a().a("enable_sdk_log", false);
    }
}
