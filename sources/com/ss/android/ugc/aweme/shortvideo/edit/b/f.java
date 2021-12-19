package com.ss.android.ugc.aweme.shortvideo.edit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.tools.utils.q;
import com.ss.ugc.effectplatform.j.a;
import h.f.b.l;
import h.m.p;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f126962a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(83287);
    }

    public static boolean a() {
        boolean z;
        if (b().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            q.a("hdr_lens", "hdr model path empty");
            return false;
        } else if (!p.b(b(), "asset://", false)) {
            return g.a();
        } else {
            q.a("hdr_lens", "hdr model not found");
            return false;
        }
    }

    public static String b() {
        String str;
        try {
            if (UseKNPlatform.enableKNPlatform) {
                a a2 = a.C4089a.a();
                l.c("lens_hdr", "");
                str = a2.a(0, "lens_hdr");
                if (str == null) {
                    str = "";
                }
            } else {
                str = DownloadableModelSupportResourceFinder.findResourceUri(null, "lens_hdr");
            }
            q.a("hdr_lens", "hdr model raw path: ".concat(String.valueOf(str)));
            l.b(str, "");
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
