package com.ss.android.ugc.aweme.music.ui.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.settings.v;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f111913a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(71932);
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(String str, String str2, String str3, Long l2) {
        r.a("download_play_succeed", new d().a("music_id", str).a("url", str3).a("time", l2).a("url_list", str2).a("is_use_tt_player", Boolean.valueOf(v.a())).f66730a);
    }

    public static void a(String str, String str2, String str3, String str4) {
        r.a("download_play_failed", new d().a("music_id", str).a("url", str3).a("fail_reason", str4).a("url_list", str2).a("is_use_tt_player", Boolean.valueOf(v.a())).f66730a);
    }
}
