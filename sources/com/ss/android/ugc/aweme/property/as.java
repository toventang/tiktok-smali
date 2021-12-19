package com.ss.android.ugc.aweme.property;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class as {

    /* renamed from: a  reason: collision with root package name */
    public static final int f118345a = 24;

    /* renamed from: b  reason: collision with root package name */
    public static final as f118346b = new as();

    private as() {
    }

    static {
        Covode.recordClassIndex(76859);
    }

    public static final boolean a() {
        if (Build.VERSION.SDK_INT >= SettingsManager.a().a("enable_media_uri", 24)) {
            return true;
        }
        return false;
    }
}
