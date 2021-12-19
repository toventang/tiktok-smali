package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    public static final bc f118360a = new bc();

    private bc() {
    }

    static {
        Covode.recordClassIndex(76870);
    }

    public static final boolean a() {
        return SettingsManager.a().a("enable_release_capture_result", true);
    }
}
