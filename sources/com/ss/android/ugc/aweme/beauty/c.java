package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f68624a = "";

    /* renamed from: b  reason: collision with root package name */
    public static ComposerBeautyBuriedInfo f68625b;

    /* renamed from: c  reason: collision with root package name */
    public static g f68626c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f68627d = new c();

    /* renamed from: e  reason: collision with root package name */
    private static String f68628e = "";

    private c() {
    }

    static {
        Covode.recordClassIndex(42230);
    }

    public static final void a() {
        f68625b = null;
        f68628e = "";
        f68624a = "";
    }

    public static final int b(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        if (composerBeautyBuriedInfo == null || composerBeautyBuriedInfo.getBeautifyUsed() != 1) {
            return 0;
        }
        return 1;
    }

    public static final int c(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        if (composerBeautyBuriedInfo != null) {
            return composerBeautyBuriedInfo.getModeChosen();
        }
        return 0;
    }

    private static int a(a aVar) {
        if (aVar == null || aVar.getBeautyStatus() != 1) {
            return 0;
        }
        return 1;
    }

    public static final String a(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        List<BeautifyInfo> list;
        String b2;
        if (l.a(composerBeautyBuriedInfo, f68625b)) {
            b2 = f68628e;
        } else {
            f G = g.a().G();
            if (composerBeautyBuriedInfo != null) {
                list = composerBeautyBuriedInfo.getBeautifyInfo();
            } else {
                list = null;
            }
            b2 = G.b(list);
        }
        l.b(b2, "");
        f68628e = b2;
        if (composerBeautyBuriedInfo != null) {
            f68625b = ComposerBeautyBuriedInfo.copy$default(composerBeautyBuriedInfo, 0, 0, 0, null, 15, null);
        }
        l.b(b2, "");
        return b2;
    }

    public static final int a(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, g gVar) {
        if (a((a) composerBeautyBuriedInfo) == 1 || a(gVar) == 1) {
            return 1;
        }
        return 0;
    }

    public static void b(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, g gVar) {
        l.d(composerBeautyBuriedInfo, "");
        l.d(gVar, "");
        String a2 = a(composerBeautyBuriedInfo);
        d.a("perf_record_video", new b().a("beautify_used", b(composerBeautyBuriedInfo)).a("is_composer", composerBeautyBuriedInfo.getModeChosen()).a("beautify_info", a2).f149193a);
        if (f68624a.length() == 0) {
            f68624a = a2;
        }
        f68626c = gVar;
    }
}
