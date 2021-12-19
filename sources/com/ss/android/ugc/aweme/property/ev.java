package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ev {

    /* renamed from: a  reason: collision with root package name */
    public static final ev f118520a = new ev();

    private ev() {
    }

    static {
        Covode.recordClassIndex(76977);
    }

    public static final boolean a() {
        return SettingsManager.a().a("enable_large_matting_detect_model", false);
    }
}
