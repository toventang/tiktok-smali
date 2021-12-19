package com.ss.android.ugc.aweme.discover.helper;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.discover.lynx.container.a;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import h.a.n;
import java.util.ArrayList;
import java.util.List;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static ad f81069a;

    /* renamed from: b  reason: collision with root package name */
    public static final ai f81070b = new ai();

    /* renamed from: c  reason: collision with root package name */
    private static List<a> f81071c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static String f81072d = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-sounds/template.js&prefix=online/lynx/search-card&use_bdx=1";

    /* renamed from: e  reason: collision with root package name */
    private static String f81073e = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=sounds-from-artist/template.js&prefix=online/lynx/search-card&use_bdx=1";

    /* renamed from: f  reason: collision with root package name */
    private static String f81074f = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-live/template.js&prefix=online/lynx/search-card&use_bdx=1";

    /* renamed from: g  reason: collision with root package name */
    private static String f81075g = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-shopping/template.js&use_bdx=1";

    private ai() {
    }

    static {
        Covode.recordClassIndex(50392);
    }

    public static d a() {
        String str;
        o oVar;
        l c2;
        try {
            ad adVar = (ad) SettingsManager.a().a("search_result_config", ad.class, f81069a);
            f81069a = adVar;
            if (adVar == null || (oVar = adVar.f81065d) == null || (c2 = oVar.c("schema")) == null || (str = c2.c()) == null) {
                str = f81074f;
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            h.f.b.l.b(buildUpon, "");
            d dVar = new d();
            dVar.setSchema(buildUpon.toString());
            return dVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<a> a(String str) {
        String str2;
        o oVar;
        l c2;
        try {
            ad adVar = (ad) SettingsManager.a().a("search_result_config", ad.class, f81069a);
            f81069a = adVar;
            if (adVar == null || (oVar = adVar.f81063b) == null || (c2 = oVar.c("schema")) == null || (str2 = c2.c()) == null) {
                str2 = f81073e;
            }
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            h.f.b.l.b(buildUpon, "");
            buildUpon.appendQueryParameter("keyword", str);
            d dVar = new d();
            dVar.setSchema(buildUpon.toString());
            f81071c = n.c(new a(dVar));
        } catch (Throwable unused) {
        }
        return f81071c;
    }

    public static List<a> b(String str, String str2, String str3) {
        String str4;
        o oVar;
        l c2;
        try {
            ad adVar = (ad) SettingsManager.a().a("search_result_config", ad.class, f81069a);
            f81069a = adVar;
            if (adVar == null || (oVar = adVar.f81064c) == null || (c2 = oVar.c("schema")) == null || (str4 = c2.c()) == null) {
                str4 = f81075g;
            }
            Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
            h.f.b.l.b(buildUpon, "");
            buildUpon.appendQueryParameter("keyword", str).appendQueryParameter("search_context", str3).appendQueryParameter("search_source", str2);
            d dVar = new d();
            dVar.setSchema(buildUpon.toString());
            f81071c = n.c(new a(dVar));
        } catch (Throwable unused) {
        }
        return f81071c;
    }

    public static List<a> a(String str, String str2, String str3) {
        String str4;
        o oVar;
        l c2;
        try {
            ad adVar = (ad) SettingsManager.a().a("search_result_config", ad.class, f81069a);
            f81069a = adVar;
            if (adVar == null || (oVar = adVar.f81062a) == null || (c2 = oVar.c("schema")) == null || (str4 = c2.c()) == null) {
                str4 = f81072d;
            }
            Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
            h.f.b.l.b(buildUpon, "");
            buildUpon.appendQueryParameter("keyword", str).appendQueryParameter("search_context", str3).appendQueryParameter("search_source", str2);
            d dVar = new d();
            dVar.setSchema(buildUpon.toString());
            f81071c = n.c(new a(dVar));
        } catch (Throwable unused) {
        }
        return f81071c;
    }
}
