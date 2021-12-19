package com.ss.android.ugc.aweme.kids.a.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f105347a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(67526);
    }

    public static final void a(int i2, long j2, String str, String str2, String str3, String str4) {
        com.bytedance.apm.b.a("aweme_music_play_error_rate", i2, new c().a("duration", Long.valueOf(j2)).a("fileUri", str2).a("fileUrlList", str).a("errorDesc", str3).a("isUseTTPlayer", (Boolean) false).a("trace", str4).a());
    }
}
