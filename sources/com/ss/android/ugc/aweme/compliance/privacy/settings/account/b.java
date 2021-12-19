package com.ss.android.ugc.aweme.compliance.privacy.settings.account;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f77495a = new b();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77496a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47955);
        }

        public static void a(int i2) {
            String str;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "download_permission");
            if (i2 == 0) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("change_download_permission", a2.a("to_status", str).a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.b$b  reason: collision with other inner class name */
    public static final class C1792b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1792b f77497a = new C1792b();

        private C1792b() {
        }

        static {
            Covode.recordClassIndex(47956);
        }

        public static void a(int i2) {
            String str;
            if (i2 == 0) {
                str = "Everyone";
            } else if (i2 == 1) {
                str = "Friends";
            } else if (i2 != 3) {
                str = null;
            } else {
                str = "Only_me";
            }
            r.a("change_duet_permission", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "duet_permission").a("to_status", str).a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77498a = new c();

        public static String a(int i2) {
            return i2 != 1 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "" : "no_one" : "friends" : "following" : "everyone";
        }

        private c() {
        }

        static {
            Covode.recordClassIndex(47957);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f77499a = new d();

        private d() {
        }

        static {
            Covode.recordClassIndex(47958);
        }

        public static void a(int i2) {
            String str;
            if (i2 == 0) {
                str = "Everyone";
            } else if (i2 == 1) {
                str = "Friends";
            } else if (i2 != 3) {
                str = null;
            } else {
                str = "Only_me";
            }
            r.a("change_stitch_permission", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "stitch_permission").a("to_status", str).a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f77500a = new e();

        private e() {
        }

        static {
            Covode.recordClassIndex(47959);
        }

        public static void a(String str) {
            l.d(str, "");
            r.a("account_auth_platform_click", new com.ss.android.ugc.aweme.app.f.d().a("account_type", str).f66730a);
        }

        public static void a(String str, boolean z) {
            String str2;
            l.d(str, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("account_type", str);
            if (z) {
                str2 = "ok";
            } else {
                str2 = "cancel";
            }
            r.a("account_auth_pop_up_confirm", a2.a("result", str2).f66730a);
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(47954);
    }
}
