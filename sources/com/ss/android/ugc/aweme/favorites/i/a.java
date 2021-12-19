package com.ss.android.ugc.aweme.favorites.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f90645a = "personal_homepage";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f90646b;

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.a$a  reason: collision with other inner class name */
    public interface AbstractC2193a {
        static {
            Covode.recordClassIndex(56949);
        }

        void c();
    }

    static {
        Covode.recordClassIndex(56948);
    }

    public static String a(int i2) {
        if (i2 == 1) {
            return "show_personal_collection";
        }
        if (i2 == 2) {
            return "click_personal_collection";
        }
        throw new IllegalArgumentException("wrong action value");
    }

    public static void b(String str) {
        r.a(a(1), b(UGCMonitor.EVENT_COMMENT, "collection_comment").a("comment_id", str).f66730a);
    }

    public static void a(String str) {
        r.a(a(1), b("tag", "collection_tag").a("tag_id", str).f66730a);
    }

    public static d b(String str, String str2) {
        return new d().a("content", str).a("enter_from", str2);
    }

    public static void a(int i2, String str) {
        r.a(a(i2), b("prop", "collection_prop").a("prop_id", str).f66730a);
    }

    public static void a(String str, String str2) {
        r.a("change_personal_collection_tab", new d().a("enter_from", f90645a).a("enter_method", str).a("tab_name", str2).f66730a);
    }

    public static void a(String str, boolean z) {
        String str2;
        String a2 = a(1);
        d a3 = b("music", "collection_music").a("music_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        r.a(a2, a3.a("ugc_to_pgc_meta", str2).f66730a);
    }

    public static void a(String str, String str2, String str3) {
        d dVar = new d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.a("tab_name", str3);
        }
        r.a("click_personal_collection", dVar.a("enter_from", str2).a("content", "music").a("music_id", str).f66730a);
    }

    public static void a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        d dVar = new d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.a("tab_name", str3);
        }
        d a2 = dVar.a("music_id", str).a("enter_from", str2).a("process_id", str4).a("enter_method", "click_collection_music");
        if (z) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        r.a("enter_music_detail", a2.a("ugc_to_pgc_meta", str5).f66730a);
    }
}
