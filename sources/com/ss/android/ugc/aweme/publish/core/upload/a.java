package com.ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SmartSliceModel f118628a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final a f118629b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77040);
    }

    public static SmartSliceModel a() {
        try {
            return (SmartSliceModel) SettingsManager.a().a("network_smart_slice_model", SmartSliceModel.class, f118628a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
