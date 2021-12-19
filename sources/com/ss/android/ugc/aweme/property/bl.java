package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class bl {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f118376a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final bl f118377b = new bl();

    private bl() {
    }

    public static final boolean a() {
        return SettingsManager.a().a("enable_synthetic_fps_set", true);
    }

    static {
        Covode.recordClassIndex(76882);
    }
}
