package com.ss.android.ugc.aweme.account.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f65141a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f65142b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final C1450a f65143c = new C1450a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.m.a$a  reason: collision with other inner class name */
    public static final class C1450a {
        static {
            Covode.recordClassIndex(40046);
        }

        private C1450a() {
        }

        public /* synthetic */ C1450a(byte b2) {
            this();
        }

        public static void a(String str) {
            l.d(str, "");
            a.f65142b = str;
        }

        public static void a(boolean z, String str, boolean z2, int i2) {
            c a2 = new c().a("success", Boolean.valueOf(z));
            if (str == null) {
                str = "";
            }
            JSONObject a3 = a2.a("error_desc", str).a("has_sim_card", Boolean.valueOf(z2)).a("google_availability", Integer.valueOf(i2)).a();
            int i3 = !z ? 1 : 0;
            l.b(a3, "");
            b.a("sms_auto_fill", i3, a3);
        }
    }

    static {
        Covode.recordClassIndex(40045);
    }
}
