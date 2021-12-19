package com.ss.android.ugc.aweme.ug.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141948a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(92750);
    }

    public static boolean a() {
        boolean z = false;
        try {
            z = SettingsManager.a().a("show_unlogin_push_setting_page", false);
            return z;
        } catch (Exception e2) {
            e2.printStackTrace();
            return z;
        }
    }
}
