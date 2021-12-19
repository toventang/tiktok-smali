package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f124987a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f124988b = new b();

    private b() {
    }

    public static boolean a() {
        return f124987a.getBoolean("has_tap_feed_caption", false);
    }

    static {
        Covode.recordClassIndex(82105);
        Keva repo = Keva.getRepo("av_feed_keva");
        l.b(repo, "");
        f124987a = repo;
    }
}
