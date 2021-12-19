package com.ss.android.ugc.gamora.recorder.choosemusic.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f147661a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(97329);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("show_music_popup", new b().a("enter_from", "video_shoot_page").a("music_id", str).a("creation_id", str2).f149193a);
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("click_music_popup_option", new b().a("enter_from", "video_shoot_page").a("music_id", str).a("creation_id", str2).a("click_type", str3).f149193a);
    }
}
