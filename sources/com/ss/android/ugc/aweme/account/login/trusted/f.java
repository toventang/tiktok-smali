package com.ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f63713a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final f f63714b = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(39287);
    }

    public static e a() {
        try {
            e eVar = (e) SettingsManager.a().a("save_info_dialog_interval", e.class);
            if (eVar == null) {
                return new e();
            }
            return eVar;
        } catch (Throwable unused) {
            return new e();
        }
    }
}
