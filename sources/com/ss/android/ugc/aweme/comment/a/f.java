package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f71281a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(43881);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("video_reply_comments_all", 0) == 1) {
            return true;
        }
        return false;
    }
}
