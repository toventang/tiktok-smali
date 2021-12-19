package com.ss.android.ugc.aweme.account.m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f65145a = "BindPhoneTerminal";

    /* renamed from: b  reason: collision with root package name */
    public static final String f65146b = "monitor_bind_phone";

    /* renamed from: c  reason: collision with root package name */
    public static final String f65147c = "monitor_rebind_phone";

    /* renamed from: d  reason: collision with root package name */
    public static final a f65148d = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(40049);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static JSONObject a(int i2, String str, String str2) {
            com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
            if (i2 != 0) {
                cVar.a("error_code", Integer.valueOf(i2)).a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.a("scene", str2);
            }
            JSONObject a2 = cVar.a();
            l.b(a2, "");
            return a2;
        }

        public static void a(int i2, String str, int i3, String str2) {
            l.d(str, "");
            b.a(c.f65146b, i2, a(i3, str2, str));
        }

        public static void b(int i2, String str, int i3, String str2) {
            l.d(str, "");
            b.a(c.f65147c, i2, a(i3, str2, str));
        }
    }

    static {
        Covode.recordClassIndex(40048);
    }
}
