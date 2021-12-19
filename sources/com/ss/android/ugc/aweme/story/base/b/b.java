package com.ss.android.ugc.aweme.story.base.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.hk;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f136882a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(89456);
    }

    public static String a(String str, String str2) {
        if (str == null || str.length() == 0) {
            bj.c("StoryStorageManager:access story work dir before setting session id");
        }
        StringBuilder sb = new StringBuilder("");
        if (hk.a(str)) {
            sb.append(str);
            if (hk.a(str2)) {
                sb.append("/").append(str2);
            }
        }
        g.a().l().addStoryTempFile(g.a().g().c().f(str));
        return g.a().g().c().f(sb.toString());
    }
}
