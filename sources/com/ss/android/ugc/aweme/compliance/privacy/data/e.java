package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.compliance.api.model.n;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.ag;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.Map;
import org.json.JSONException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f77389a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final Keva f77390b;

    /* renamed from: c  reason: collision with root package name */
    private static n f77391c;

    /* renamed from: d  reason: collision with root package name */
    private static String f77392d;

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, m> f77393e;

    /* renamed from: f  reason: collision with root package name */
    private static String f77394f;

    /* renamed from: g  reason: collision with root package name */
    private static Map<String, m> f77395g;

    public static final class a extends com.google.gson.b.a<Map<String, ? extends m>> {
        static {
            Covode.recordClassIndex(47871);
        }

        a() {
        }
    }

    public static final class b extends com.google.gson.b.a<Map<String, ? extends m>> {
        static {
            Covode.recordClassIndex(47872);
        }

        b() {
        }
    }

    private e() {
    }

    public static void b() {
        f77391c = null;
        f77390b.erase("private_settings");
    }

    public static void d() {
        f77393e = null;
        f77390b.erase(a("popup_agreement"));
    }

    public static void f() {
        f77395g = null;
        f77390b.erase(a("post_record"));
    }

    static {
        Covode.recordClassIndex(47870);
        Keva repo = Keva.getRepo("compliance_setting");
        l.b(repo, "");
        f77390b = repo;
    }

    public static n a() {
        boolean z;
        if (f77391c == null) {
            try {
                f77391c = (n) dg.a(f77390b.getString("private_settings", ""), n.class);
            } catch (JSONException unused) {
            }
        }
        if (f77391c == null) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.compliance.common.c.a.a("privacy_deprecated_keva", z, ag.a(v.a("key", "restriction")));
        return f77391c;
    }

    public static Map<String, m> c() {
        String a2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.a();
        String str = f77392d;
        boolean z = false;
        if (str == null || !p.a(str, a2, false)) {
            f77393e = null;
        }
        if (f77393e == null) {
            String string = f77390b.getString(a("popup_agreement"), "");
            try {
                f77393e = (Map) dg.a().a(string, new a().type);
            } catch (JSONException unused) {
            }
            f77392d = a2;
        }
        if (f77393e == null) {
            z = true;
        }
        com.ss.android.ugc.aweme.compliance.common.c.a.a("privacy_deprecated_keva", z, ag.a(v.a("key", "popupAgreement")));
        return f77393e;
    }

    public static Map<String, m> e() {
        String a2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.a();
        String str = f77394f;
        boolean z = false;
        if (str == null || !p.a(str, a2, false)) {
            f77395g = null;
        }
        if (f77395g == null) {
            String string = f77390b.getString(a("post_record"), "");
            try {
                f77395g = (Map) dg.a().a(string, new b().type);
            } catch (JSONException unused) {
            }
            f77394f = a2;
        }
        if (f77395g == null) {
            z = true;
        }
        com.ss.android.ugc.aweme.compliance.common.c.a.a("privacy_deprecated_keva", z, ag.a(v.a("key", "postRecord")));
        return f77395g;
    }

    private static String a(String str) {
        String a2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.a();
        if (a2 == null || a2.length() == 0) {
            return str;
        }
        return str + a2;
    }
}
