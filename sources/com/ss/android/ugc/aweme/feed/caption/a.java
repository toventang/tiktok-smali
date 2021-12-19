package com.ss.android.ugc.aweme.feed.caption;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f92743a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Keva f92744b;

    private a() {
    }

    public static boolean a() {
        return f92744b.getBoolean("has_tap_translated_caption", false);
    }

    public static void b() {
        f92744b.storeBoolean("has_tap_translated_caption", true);
    }

    static {
        Covode.recordClassIndex(58823);
        Keva repo = Keva.getRepo("cross_language_caption_keva");
        l.b(repo, "");
        f92744b = repo;
    }
}
