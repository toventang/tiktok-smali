package com.ss.android.ugc.aweme.notification.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f113121a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(72731);
    }

    public static final boolean a() {
        return SettingsManager.a().a("report_inbox_notice", false);
    }
}
