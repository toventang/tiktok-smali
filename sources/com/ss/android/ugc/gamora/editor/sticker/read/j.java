package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f146926a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(96763);
    }

    public static void a(ShortVideoCommonParams shortVideoCommonParams) {
        l.d(shortVideoCommonParams, "");
        r.a("text_reading_bubble_show", new b().a("enter_from", "video_edit_page").a("shoot_way", shortVideoCommonParams.shootWay).a("content_source", shortVideoCommonParams.contentSource).a("content_type", shortVideoCommonParams.contentType).a("creation_id", shortVideoCommonParams.creationId).f149193a);
    }

    public static void b(ShortVideoCommonParams shortVideoCommonParams) {
        l.d(shortVideoCommonParams, "");
        r.a("cancel_text_reading", new b().a("shoot_way", shortVideoCommonParams.shootWay).a("content_source", shortVideoCommonParams.contentSource).a("content_type", shortVideoCommonParams.contentType).a("creation_id", shortVideoCommonParams.creationId).f149193a);
    }

    public static void a(ShortVideoCommonParams shortVideoCommonParams, String str, String str2) {
        l.d(shortVideoCommonParams, "");
        l.d(str, "");
        l.d(str2, "");
        r.a("click_text_reading", new b().a("enter_from", "video_edit_page").a("shoot_way", shortVideoCommonParams.shootWay).a("content_source", shortVideoCommonParams.contentSource).a("content_type", shortVideoCommonParams.contentType).a("tone_choice_method", str).a("enter_method", str2).a("creation_id", shortVideoCommonParams.creationId).f149193a);
    }

    public static void b(ShortVideoCommonParams shortVideoCommonParams, String str, String str2) {
        String str3;
        l.d(shortVideoCommonParams, "");
        b a2 = new b().a("shoot_way", shortVideoCommonParams.shootWay).a("content_source", shortVideoCommonParams.contentSource).a("content_type", shortVideoCommonParams.contentType).a("creation_id", shortVideoCommonParams.creationId);
        if (str == null) {
            str = "";
        }
        b a3 = a2.a("tone_id", str);
        if (str2 == null) {
            str2 = "";
        }
        b a4 = a3.a("tone_name", str2);
        if (k.b()) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        r.a("text_reading_complete", a4.a("is_open_apply", str3).f149193a);
    }
}
