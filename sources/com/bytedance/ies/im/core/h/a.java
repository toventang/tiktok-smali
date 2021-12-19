package com.bytedance.ies.im.core.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.k;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34188a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20360);
    }

    public static String a() {
        String string = Keva.getRepo("ies_im_core").getString("token", "");
        l.b(string, "");
        return string;
    }

    public static k b() {
        try {
            String string = Keva.getRepo("ies_im_core").getString("mix_link_config_2", "");
            if (string == null) {
                return null;
            }
            if (string.length() == 0) {
                return null;
            }
            return (k) dg.a(string, k.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(String str) {
        Keva repo = Keva.getRepo("ies_im_core");
        if (str == null) {
            str = "";
        }
        repo.storeString("token", str);
    }
}
