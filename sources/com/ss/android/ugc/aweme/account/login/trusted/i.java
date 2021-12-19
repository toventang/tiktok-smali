package com.ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.t;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f63723a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(39290);
    }

    static Keva a() {
        Keva repo = Keva.getRepo("aweme_trusted_users_repo");
        l.b(repo, "");
        return repo;
    }

    public static List<h> b() {
        boolean z;
        String string = a().getString("users_list_json", "");
        l.b(string, "");
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ArrayList();
        }
        try {
            List<h> b2 = dg.b(string, h[].class);
            l.b(b2, "");
            return b2;
        } catch (t unused) {
            return new ArrayList();
        }
    }

    public static void a(List<h> list) {
        if (list != null) {
            a().storeString("users_list_json", dg.a().b(list));
        }
    }
}
