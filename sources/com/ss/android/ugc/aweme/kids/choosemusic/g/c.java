package com.ss.android.ugc.aweme.kids.choosemusic.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.kids.choosemusic.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f105649a;

    /* renamed from: b  reason: collision with root package name */
    public static int f105650b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static String f105651c;

    /* renamed from: d  reason: collision with root package name */
    public static String f105652d;

    /* renamed from: e  reason: collision with root package name */
    static e f105653e;

    static {
        Covode.recordClassIndex(67673);
    }

    public static void a(String str) {
        e eVar = f105653e;
        if (eVar != null) {
            eVar.a(str);
        }
    }

    public static void a(a aVar, String str, int i2) {
        if (aVar != null) {
            d dVar = new d();
            dVar.a("enter_from", aVar.f105432a).a("music_id", str).a("category_name", aVar.f105433b).a("enter_method", aVar.f105434c).a("order", i2).a("previous_page", f105649a);
            r.a("add_music", dVar.f66730a);
        }
    }

    public static void a(boolean z, String str, a aVar) {
        String str2;
        if (aVar != null) {
            d dVar = new d();
            dVar.a("enter_from", aVar.f105432a).a("music_id", str);
            if (z) {
                str2 = "favorite_song";
            } else {
                str2 = "cancel_favorite_song";
            }
            r.a(str2, dVar.f66730a);
        }
    }

    public static void a(a aVar, String str, int i2, boolean z) {
        if (aVar != null && z) {
            d dVar = new d();
            dVar.a("enter_from", aVar.f105432a).a("music_id", str).a("category_name", aVar.f105433b).a("enter_method", aVar.f105434c).a("order", i2);
            r.a("show_music", dVar.f66730a);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        d dVar = new d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.a("banner_id", str3);
        }
        dVar.a("category_name", str).a("enter_method", str2).a("enter_from", str4).a("creation_id", f105651c);
        if (!TextUtils.isEmpty(str5)) {
            dVar.a("category_id", str5);
        }
        r.a("enter_song_category", dVar.f66730a);
    }
}
