package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f72840a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(44870);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("mt_comment_load_timer_setting", 1) == 1) {
            return true;
        }
        return false;
    }
}
