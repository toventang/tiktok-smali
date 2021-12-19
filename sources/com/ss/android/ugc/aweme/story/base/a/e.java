package com.ss.android.ugc.aweme.story.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f136877a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final e f136878b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(89452);
    }

    public static int a() {
        if (b.a().a(true, "creative_story_publish_retry_enable", false)) {
            return SettingsManager.a().a("creative_story_publish_retry_time", 1);
        }
        return 0;
    }
}
