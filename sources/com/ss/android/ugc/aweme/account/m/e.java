package com.ss.android.ugc.aweme.account.m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import h.f.b.l;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f65151a = "LogoutTerminal";

    /* renamed from: b  reason: collision with root package name */
    public static final String f65152b = "monitor_logout";

    /* renamed from: c  reason: collision with root package name */
    public static final String f65153c = "monitor_switch_account";

    /* renamed from: d  reason: collision with root package name */
    public static final a f65154d = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(40053);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(int i2, Integer num, String str) {
            b.a(e.f65153c, i2, a(num, str, ""));
        }

        private static JSONObject a(Integer num, String str, String str2) {
            l.d(str2, "");
            c cVar = new c();
            if (num == null || num.intValue() != 0) {
                cVar.a("error_code", num).a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.a("extra", str2);
            }
            JSONObject a2 = cVar.a();
            l.b(a2, "");
            return a2;
        }

        public static void a(int i2, String str, int i3, String str2) {
            l.d(str, "");
            b.a(e.f65152b, i2, a(Integer.valueOf(i3), str2, str));
        }
    }

    static {
        Covode.recordClassIndex(40052);
    }
}
