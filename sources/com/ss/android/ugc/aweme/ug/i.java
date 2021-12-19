package com.ss.android.ugc.aweme.ug;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f141953a = Keva.getRepo("new_user_journey");

    /* renamed from: b  reason: collision with root package name */
    public static final a f141954b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(92755);
        }

        private a() {
        }

        public static long a() {
            long j2;
            long currentTimeMillis = System.currentTimeMillis();
            if (i.f141953a.contains("mandatory_login_shown_millis")) {
                j2 = currentTimeMillis - i.f141953a.getLong("mandatory_login_shown_millis", currentTimeMillis);
            } else {
                j2 = -1;
            }
            i.f141953a.erase("mandatory_login_shown_millis");
            return j2;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(boolean z, String str, String str2, String str3, String str4, boolean z2, long j2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            if (i.f141953a.contains("mandatory_login_shown_millis")) {
                long a2 = a();
                d a3 = new d().a("enter_method", str3).a("enter_from", str2).a("enter_type", str4).a("is_register", z ? 1 : 0).a("error_code", 0).a("user_id", j2).a("platform", str).a("gms_auto_fill", z2 ? 1 : 0);
                if (a2 != -1) {
                    a3.a("duration", a2);
                }
                r.a("onboarding_forced_login_success", a3.f66730a);
            }
        }
    }

    static {
        Covode.recordClassIndex(92754);
    }
}
