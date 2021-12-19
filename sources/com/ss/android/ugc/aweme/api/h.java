package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f66452a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(40843);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("enable_zero_rating_workflow", 0) != 0) {
            return true;
        }
        return false;
    }
}
