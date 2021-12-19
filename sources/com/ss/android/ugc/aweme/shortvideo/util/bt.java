package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.bytedance.ies.abmock.SettingsManager;

public final class bt {

    /* renamed from: a  reason: collision with root package name */
    public static final bt f132278a = new bt();

    private bt() {
    }

    static {
        Covode.recordClassIndex(86637);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("enable_4k_import_benchmark", false);
        } catch (a unused) {
            return false;
        }
    }
}
