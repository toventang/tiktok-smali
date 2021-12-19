package com.ss.android.ugc.aweme.ug.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f141949a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92751);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("need_call_user_agreement_and_ugc_popup", false);
        } catch (Exception unused) {
            return false;
        }
    }
}
