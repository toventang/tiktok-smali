package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class cb {

    /* renamed from: a  reason: collision with root package name */
    public static final cb f89688a = new cb();

    private cb() {
    }

    static {
        Covode.recordClassIndex(56362);
    }

    public static final boolean a() {
        return SettingsManager.a().a("studio_disable_shared_ar_friend_list_filter", false);
    }
}
