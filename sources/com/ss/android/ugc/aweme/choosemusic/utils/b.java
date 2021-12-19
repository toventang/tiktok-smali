package com.ss.android.ugc.aweme.choosemusic.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.ui.be;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f70718a;

    /* renamed from: b  reason: collision with root package name */
    public static String f70719b;

    /* renamed from: c  reason: collision with root package name */
    public static int f70720c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static String f70721d;

    /* renamed from: e  reason: collision with root package name */
    public static String f70722e;

    /* renamed from: f  reason: collision with root package name */
    static e f70723f;

    private static String b(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "" : "local_song" : "favourite_song" : "popular_song";
    }

    public static boolean a() {
        return CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e();
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        d dVar = new d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.a("banner_id", str3);
        }
        dVar.a("category_name", str).a("enter_method", str2).a("enter_from", str4).a("creation_id", f70721d);
        if (!TextUtils.isEmpty(str5)) {
            dVar.a("category_id", str5);
        }
        if (a()) {
            dVar.a("is_commercial", "1");
        }
        r.a("enter_song_category", dVar.f66730a);
    }

    public static void a(boolean z, String str, com.ss.android.ugc.aweme.choosemusic.b bVar, int i2, LogPbBean logPbBean) {
        if (bVar != null) {
            d dVar = new d();
            dVar.a("enter_from", bVar.f70379a).a("music_id", str).a("category_name", bVar.f70380b).a("enter_method", bVar.f70381c).a("previous_page", bVar.f70382d).a("order", i2).a("creation_id", f70721d);
            if (!TextUtils.isEmpty(bVar.f70383e)) {
                dVar.a("category_id", bVar.f70383e);
            }
            if (!TextUtils.isEmpty(bVar.f70385g)) {
                dVar.a("tag_id", bVar.f70385g);
            }
            if (!TextUtils.isEmpty(bVar.f70384f)) {
                dVar.a("prop_id", bVar.f70384f);
            }
            if (bVar.f70387i != null) {
                dVar.a("log_pb", bVar.f70387i);
                dVar.a("impr_id", !TextUtils.isEmpty(bVar.f70387i.getImprId()) ? bVar.f70387i.getImprId() : "");
            }
            String str2 = "favourite_song";
            if (TextUtils.equals(bVar.f70379a, "search_music")) {
                dVar.a("search_keyword", f70719b);
                dVar.a("search_id", bVar.f70388j);
                dVar.a("search_result_id", str);
                dVar.a("log_pb", new f().b(logPbBean));
                if (!z) {
                    str2 = "cancel_favourite_song";
                }
                if (a()) {
                    dVar.a("is_commercial", "1");
                }
                r.a(str2, be.a(dVar.f66730a));
            } else if (z) {
                if (a()) {
                    dVar.a("is_commercial", "1");
                }
                r.a(str2, dVar.f66730a);
            }
        }
    }

    static {
        Covode.recordClassIndex(43600);
    }

    public static void b() {
        d dVar = new d();
        dVar.a("enter_from", "change_music_page").a("creation_id", f70721d);
        if (a()) {
            dVar.a("is_commercial", "1");
        }
        r.a("enter_search", dVar.f66730a);
    }

    public static void a(String str) {
        e eVar = f70723f;
        if (eVar != null) {
            eVar.a(str);
        }
    }

    public static void a(long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("tab_name", "local_song");
        hashMap.put("read_duration", String.valueOf(j2));
        r.a("local_music_read_duration", be.a(hashMap));
    }

    public static void a(int i2) {
        d dVar = new d();
        dVar.a("tab_name", b(i2)).a("previous_page", f70718a);
        if (a()) {
            dVar.a("is_commercial", "1");
        }
        r.a("enter_music_tab", dVar.f66730a);
    }

    public static void a(com.ss.android.ugc.aweme.choosemusic.b bVar, String str, int i2) {
        a(bVar, str, i2, true, false);
    }

    public static void a(String str, com.ss.android.ugc.aweme.choosemusic.b bVar, MusicModel musicModel) {
        int c2;
        long b2;
        String str2;
        if (bVar != null && f70723f != null) {
            d dVar = new d();
            d a2 = dVar.a("music_id", str).a("category_name", bVar.f70380b);
            e eVar = f70723f;
            if (eVar == null) {
                c2 = 0;
            } else {
                c2 = eVar.c(str);
            }
            d a3 = a2.a("time", c2);
            e eVar2 = f70723f;
            if (eVar2 == null) {
                b2 = 0;
            } else {
                b2 = eVar2.b(str);
            }
            a3.a("stay_time", b2).a("enter_from", bVar.f70379a).a("enter_method", bVar.f70381c).a("previous_page", bVar.f70382d).a("creation_id", f70721d);
            if (!TextUtils.isEmpty(bVar.f70385g)) {
                dVar.a("tag_id", bVar.f70385g);
            }
            if (!TextUtils.isEmpty(bVar.f70384f)) {
                dVar.a("prop_id", bVar.f70384f);
            }
            if (bVar.f70387i != null) {
                dVar.a("log_pb", bVar.f70387i);
                if (!TextUtils.isEmpty(bVar.f70387i.getImprId())) {
                    str2 = bVar.f70387i.getImprId();
                } else {
                    str2 = "";
                }
                dVar.a("impr_id", str2);
            }
            if (TextUtils.equals(bVar.f70379a, "search_music")) {
                dVar.a("search_keyword", f70719b);
                dVar.a("search_id", musicModel.getSearchId());
                dVar.a("search_result_id", musicModel.getId());
            }
            r.a("music_play_time", dVar.f66730a);
            f70723f = null;
        }
    }

    public static void a(com.ss.android.ugc.aweme.choosemusic.b bVar, String str, boolean z, String str2) {
        String str3;
        String str4;
        if (bVar != null) {
            d dVar = new d();
            d a2 = dVar.a("enter_from", bVar.f70379a).a("music_id", str).a("category_name", bVar.f70380b).a("creation_id", f70721d);
            if (z) {
                str3 = "click_banner";
            } else {
                str3 = "click_button";
            }
            a2.a("enter_method", str3);
            if (!TextUtils.isEmpty(bVar.f70383e)) {
                dVar.a("category_id", bVar.f70383e);
            }
            if (!TextUtils.isEmpty(str2)) {
                dVar.a("process_id", str2);
            }
            if (bVar.f70387i != null) {
                dVar.a("log_pb", bVar.f70387i);
                if (!TextUtils.isEmpty(bVar.f70387i.getImprId())) {
                    str4 = bVar.f70387i.getImprId();
                } else {
                    str4 = "";
                }
                dVar.a("impr_id", str4);
            }
            r.a("enter_music_detail", dVar.f66730a);
        }
    }

    public static void a(com.ss.android.ugc.aweme.choosemusic.b bVar, String str, int i2, LogPbBean logPbBean) {
        String str2;
        String str3;
        if (bVar != null) {
            d dVar = new d();
            dVar.a("enter_from", bVar.f70379a).a("music_id", str).a("category_name", bVar.f70380b).a("enter_method", bVar.f70381c).a("order", i2).a("previous_page", f70718a).a("creation_id", f70721d);
            if (!TextUtils.isEmpty(bVar.f70385g)) {
                dVar.a("tag_id", bVar.f70385g);
            }
            if (!TextUtils.isEmpty(bVar.f70384f)) {
                dVar.a("prop_id", bVar.f70384f);
            }
            if (!TextUtils.isEmpty(bVar.f70383e)) {
                dVar.a("category_id", bVar.f70383e);
            }
            if (bVar.f70387i != null) {
                dVar.a("log_pb", bVar.f70387i);
                if (!TextUtils.isEmpty(bVar.f70387i.getImprId())) {
                    str3 = bVar.f70387i.getImprId();
                } else {
                    str3 = "";
                }
                dVar.a("impr_id", str3);
            }
            Long videoLength = EditVideoInfoServiceImpl.a().getVideoLength(f70721d);
            if (videoLength != null) {
                str2 = videoLength.toString();
            } else {
                str2 = "0";
            }
            dVar.a("creation_duration", str2);
            if (TextUtils.equals(bVar.f70379a, "search_music")) {
                dVar.a("search_keyword", f70719b);
                dVar.a("search_id", bVar.f70388j);
                dVar.a("search_result_id", str);
                dVar.a("log_pb", new f().b(logPbBean));
                if (a()) {
                    dVar.a("is_commercial", "1");
                }
                r.a("add_music", be.a(dVar.f66730a));
            } else {
                if (a()) {
                    dVar.a("is_commercial", "1");
                }
                r.a("add_music", dVar.f66730a);
            }
            if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
                AVExternalServiceImpl.a().publishService().setFromCommercialSoundPage(true);
                AVExternalServiceImpl.a().publishService().setHasOpenCommercialSoundPage(true);
                return;
            }
            AVExternalServiceImpl.a().publishService().setFromCommercialSoundPage(false);
            AVExternalServiceImpl.a().publishService().setHasOpenCommercialSoundPage(false);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        d dVar = new d();
        dVar.a("enter_from", str).a("playlist_id", str2).a("playlist_name", str3).a("platform", str4);
        r.a("share_playlist", dVar.f66730a);
    }

    public static void a(com.ss.android.ugc.aweme.choosemusic.b bVar, String str, int i2, boolean z, boolean z2) {
        String str2;
        if (bVar != null && z) {
            d dVar = new d();
            dVar.a("enter_from", bVar.f70379a).a("music_id", str).a("category_name", bVar.f70380b).a("enter_method", bVar.f70381c).a("previous_page", bVar.f70382d).a("order", i2).a("creation_id", f70721d).a("ugc_to_pgc_meta", z2 ? 1 : 0);
            if (!TextUtils.isEmpty(bVar.f70383e)) {
                dVar.a("category_id", bVar.f70383e);
            }
            if (!TextUtils.isEmpty(bVar.f70385g)) {
                dVar.a("tag_id", bVar.f70385g);
            }
            if (!TextUtils.isEmpty(bVar.f70384f)) {
                dVar.a("prop_id", bVar.f70384f);
            }
            if (bVar.f70387i != null) {
                dVar.a("log_pb", bVar.f70387i);
                if (!TextUtils.isEmpty(bVar.f70387i.getImprId())) {
                    str2 = bVar.f70387i.getImprId();
                } else {
                    str2 = "";
                }
                dVar.a("impr_id", str2);
            }
            if (a()) {
                dVar.a("is_commercial", "1");
            }
            r.a("show_music", dVar.f66730a);
        }
    }
}
