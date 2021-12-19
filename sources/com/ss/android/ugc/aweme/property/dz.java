package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class dz {

    /* renamed from: a  reason: collision with root package name */
    public static final SmartCompileModelV1 f118477a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final dz f118478b = new dz();

    private dz() {
    }

    static {
        Covode.recordClassIndex(76953);
    }

    public static SmartCompileModelV1 a() {
        if (!bf.a()) {
            return null;
        }
        return (SmartCompileModelV1) SettingsManager.a().a("smart_compile_model", SmartCompileModelV1.class, f118477a);
    }
}
