package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f123047a = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(80807);
    }

    public static final boolean a() {
        return SettingsManager.a().a("pre_release_gpu_resource", false);
    }
}
