package com.ss.android.ugc.aweme.music.ui.b;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.utils.f;

public final class a {
    static {
        Covode.recordClassIndex(71931);
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(boolean z, String str, String str2, String str3) {
        if (z) {
            b.a("aweme_music_hit_cache_rate", 0, new c().a("music_id", str).a("fileUrlList", str2).a("cache_type", str3).a());
        } else {
            b.a("aweme_music_hit_cache_rate", 1, new c().a("music_id", str).a("fileUrlList", str2).a("cache_type", str3).a());
        }
    }
}
