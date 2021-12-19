package com.ss.android.ugc.aweme.im.sdk.chat.feature.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f101057a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(64648);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        Keva.getRepo("story_direct_message").storeString(str, str2);
    }

    public static boolean b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return l.a((Object) str2, (Object) Keva.getRepo("story_direct_message").getString(str, ""));
    }
}
