package com.ss.android.ugc.aweme.authorize;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f67100a = "AwemeAuthorizeTerminal";

    /* renamed from: b  reason: collision with root package name */
    public static final String f67101b = "monitor_login_authorize";

    /* renamed from: c  reason: collision with root package name */
    public static final int f67102c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f67103d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f67104e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final C1510a f67105f = new C1510a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.authorize.a$a  reason: collision with other inner class name */
    public static final class C1510a {
        static {
            Covode.recordClassIndex(41343);
        }

        private C1510a() {
        }

        public /* synthetic */ C1510a(byte b2) {
            this();
        }

        public static void a(int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6) {
            String str7 = a.f67101b;
            c cVar = new c();
            if (i3 != 0) {
                c a2 = cVar.a("error_code", Integer.valueOf(i3)).a("error_desc", str);
                if (str2 == null) {
                    str2 = "";
                }
                a2.a("client_key", str2);
            }
            cVar.a("opensdk_name", str3).a("opensdk_version", str4).a("commonsdk_name", str5).a("commsdk_version", str6);
            JSONObject a3 = cVar.a();
            l.b(a3, "");
            b.a(str7, i2, a3);
        }
    }

    static {
        Covode.recordClassIndex(41342);
    }
}
