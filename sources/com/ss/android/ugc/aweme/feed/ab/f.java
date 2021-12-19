package com.ss.android.ugc.aweme.feed.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f91469a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(57555);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("feed_live_no_deduplicate", true)) {
            return true;
        }
        return false;
    }
}
