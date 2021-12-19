package com.ss.android.ugc.aweme.account.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import h.f.b.l;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f65155a = "SendCodeTerminal";

    /* renamed from: b  reason: collision with root package name */
    public static final String f65156b = "monitor_send_sms";

    /* renamed from: c  reason: collision with root package name */
    public static final String f65157c = "monitor_whatsapp_sms";

    /* renamed from: d  reason: collision with root package name */
    public static final a f65158d = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(40055);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(int i2, int i3, int i4, String str) {
            a(i2, i3, i4, str, null);
        }

        public static void b(int i2, int i3, int i4, String str) {
            b.a(f.f65157c, i2, a(i4, str, i3, "choose_dialog"));
        }

        private static JSONObject a(int i2, String str, int i3, String str2) {
            c cVar = new c();
            if (i2 != 0) {
                cVar.a("error_code", Integer.valueOf(i2)).a("error_desc", str);
            }
            cVar.a("send_type", Integer.valueOf(i3));
            if (str2 != null) {
                cVar.a("send_from", str2);
            }
            JSONObject a2 = cVar.a();
            l.b(a2, "");
            return a2;
        }

        public static void a(int i2, int i3, int i4, String str, String str2) {
            b.a(f.f65156b, i2, a(i4, str, i3, str2));
        }
    }

    static {
        Covode.recordClassIndex(40054);
    }
}
