package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f71285a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(43882);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("enable_video_reply", 0) == 1) {
            return true;
        }
        return false;
    }
}
