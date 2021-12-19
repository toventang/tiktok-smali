package com.ss.android.ugc.aweme.mix.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.e.b;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109707a = new a();

    private a() {
    }

    public static void a(String str, String str2, boolean z) {
        r.a("cancel_editing_playlist", new d().a("enter_from", str2).a("is_discard", z ? 1 : 0).a("playlist_id", str).f66730a);
    }

    static {
        Covode.recordClassIndex(70240);
    }

    public static void a(String str) {
        l.d(str, "");
        r.a("enter_playlist_name", new d().a("enter_from", str).f66730a);
    }

    public static void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("create_playlist", new d().a("enter_from", str).a("enter_method", str2).f66730a);
    }

    public static void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("enter_playlist_intro_page", new d().a("enter_from", str).a("enter_method", str2).f66730a);
    }

    public static void d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("enter_playlist_name_page", new d().a("enter_from", str).a("enter_method", str2).f66730a);
    }

    public static void e(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("enter_playlist_selection_page", new d().a("enter_from", str).a("enter_method", str2).f66730a);
    }

    public static void f(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("enter_playlist_reorder_page", new d().a("enter_from", str).a("enter_method", str2).f66730a);
    }

    public static void a(String str, String str2) {
        r.a("delete_playlist", new d().a("enter_from", str2).a("playlist_id", str).f66730a);
    }

    public static void a(Aweme aweme, String str, String str2) {
        String str3;
        User author;
        d a2 = new d().a("enter_from", str2).a("playlist_id", str);
        String str4 = null;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str3 = null;
        } else {
            str3 = author.getUid();
        }
        d a3 = a2.a("author_id", str3);
        if (aweme != null) {
            str4 = aweme.getGroupId();
        }
        r.a("leave_playlist", a3.a("group_id", str4).f66730a);
    }

    public static void a(String str, String str2, String str3) {
        r.a("add_multiple_playlist_video_fail", new d().a("enter_from", str2).a("enter_method", str3).a("playlist_id", str).f66730a);
    }

    public static void a(Aweme aweme, String str, String str2, b bVar) {
        String str3;
        String str4;
        Integer num;
        String str5;
        User author;
        d a2 = new d().a("enter_from", str2).a("playlist_id", str);
        String str6 = null;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str3 = null;
        } else {
            str3 = author.getUid();
        }
        d a3 = a2.a("author_id", str3);
        if (bVar == null || (str4 = bVar.getSearchId()) == null) {
            str4 = "";
        }
        d a4 = a3.a("search_id", str4);
        if (bVar != null) {
            num = bVar.isFromVideo();
        } else {
            num = null;
        }
        d a5 = a4.a("is_from_video", num);
        if (bVar != null) {
            str5 = bVar.getSearchType();
        } else {
            str5 = null;
        }
        d a6 = a5.a("search_type", str5);
        if (aweme != null) {
            str6 = aweme.getGroupId();
        }
        r.a("enter_playlist", a6.a("group_id", str6).f66730a);
    }

    public static void a(String str, int i2, String str2, String str3) {
        r.a("post_creating_playlist", new d().a("video_cnt", i2).a("playlist_id", str).a("enter_from", str2).a("enter_method", str3).f66730a);
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, b bVar, int i2) {
        Integer num;
        String searchId;
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 8) != 0) {
            str4 = "";
        }
        if ((i2 & 16) != 0) {
            str5 = "";
        }
        if ((i2 & 32) != 0) {
            str6 = "";
        }
        if ((i2 & 64) != 0) {
            str7 = "";
        }
        String str8 = null;
        if ((i2 & 128) != 0) {
            bVar = null;
        }
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        d a2 = new d().a("enter_from", str).a("playlist_id", str2).a("group_id", str3).a("author_id", str4);
        if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
            str5 = searchId;
        }
        d a3 = a2.a("search_id", str5).a("search_result_id", str6).a("search_keyword", str7);
        if (bVar != null) {
            num = bVar.isFromVideo();
        } else {
            num = null;
        }
        d a4 = a3.a("is_from_video", num);
        if (bVar != null) {
            str8 = bVar.getSearchType();
        }
        r.a("show_playlist_entrance", a4.a("search_type", str8).f66730a);
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, b bVar, int i3) {
        Integer num;
        String searchId;
        if ((i3 & 4) != 0) {
            str3 = "";
        }
        if ((i3 & 8) != 0) {
            str4 = "";
        }
        if ((i3 & 32) != 0) {
            str5 = "";
        }
        if ((i3 & 64) != 0) {
            str6 = "";
        }
        if ((i3 & 128) != 0) {
            str7 = "";
        }
        if ((i3 & 256) != 0) {
            str8 = "";
        }
        String str9 = null;
        if ((i3 & 512) != 0) {
            bVar = null;
        }
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        d a2 = new d().a("enter_method", str5).a("previous_page", str).a("enter_from", str).a("author_id", str3).a("group_id", str4).a("playlist_id", str2).a("order", i2);
        if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
            str6 = searchId;
        }
        d a3 = a2.a("search_id", str6).a("search_result_id", str7).a("search_keyword", str8);
        if (bVar != null) {
            num = bVar.isFromVideo();
        } else {
            num = null;
        }
        d a4 = a3.a("is_from_video", num);
        if (bVar != null) {
            str9 = bVar.getSearchType();
        }
        r.a("enter_playlist_detail", a4.a("search_type", str9).f66730a);
    }
}
