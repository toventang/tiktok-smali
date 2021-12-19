package com.ss.android.ugc.aweme.feed.ui.instagram;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f94808a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(60141);
    }

    public static e a() {
        try {
            e eVar = (e) SettingsManager.a().a("third_party_dialog_settings", e.class);
            if (eVar == null) {
                return new e();
            }
            return eVar;
        } catch (Throwable unused) {
            return new e();
        }
    }
}
