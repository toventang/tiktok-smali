package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100335a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(64103);
    }

    public static Keva a() {
        Keva repo = Keva.getRepo("message_button_text_repo");
        l.b(repo, "");
        return repo;
    }

    public static void a(String str, Keva keva, long j2) {
        if (!keva.contains("key_double_follow_time_stamp".concat(String.valueOf(str)))) {
            keva.storeLong("key_double_follow_time_stamp".concat(String.valueOf(str)), j2);
        }
    }
}
