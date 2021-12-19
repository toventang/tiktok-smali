package com.ss.android.ugc.aweme.music.ui.b;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.settings.v;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f111914a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(71933);
    }

    public static final void a(long j2, String str, String str2, String str3) {
        b.a("aweme_music_play_error_rate", 0, new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(j2)).a("fileUri", str2).a("fileUrlList", str).a("isUseTTPlayer", Boolean.valueOf(v.a())).a("trace", str3).a());
    }

    public static final void a(int i2, long j2, String str, String str2, String str3, String str4) {
        b.a("aweme_music_play_error_rate", i2, new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(j2)).a("fileUri", str2).a("fileUrlList", str).a("errorDesc", str3).a("isUseTTPlayer", Boolean.valueOf(v.a())).a("trace", str4).a());
    }
}
