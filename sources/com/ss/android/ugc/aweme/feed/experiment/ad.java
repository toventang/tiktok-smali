package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final int f93031a = SettingsManager.a().a("feed_find_bug_setting", 1);

    public static boolean a() {
        if (f93031a >= 3) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (f93031a >= 2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(59001);
    }
}
