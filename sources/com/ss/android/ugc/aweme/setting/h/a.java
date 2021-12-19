package com.ss.android.ugc.aweme.setting.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122200a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80114);
    }

    public static void a(boolean z) {
        String str;
        d dVar = new d();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        r.a(" remove_result", dVar.a("status", str).f66730a);
    }

    public static void a(int i2) {
        String str;
        d a2 = new d().a("enter_from", "privacy_setting").a("method", "manual").a("to_status", "on");
        if (i2 == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        r.a("switch_sync_auth", a2.a("platform", str).f66730a);
    }

    public static void b(int i2) {
        String str;
        d a2 = new d().a("enter_from", "privacy_setting").a("method", "manual").a("to_status", "off");
        if (i2 == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        r.a("switch_sync_auth", a2.a("platform", str).f66730a);
    }

    public static void c(int i2) {
        String str;
        d a2 = new d().a("enter_from", "privacy_setting");
        if (i2 == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        r.a("remove_sync_auth", a2.a("platform", str).f66730a);
    }

    public static void d(int i2) {
        String str;
        d a2 = new d().a("enter_from", "privacy_setting");
        if (i2 == 1) {
            str = "contact";
        } else {
            str = "fb";
        }
        r.a("remove_sync_pop", a2.a("platform", str).f66730a);
    }

    public static void a(boolean z, int i2) {
        String str;
        String str2;
        d a2 = new d().a("enter_from", "privacy_setting");
        if (z) {
            str = "remove";
        } else {
            str = "cancel";
        }
        d a3 = a2.a("result", str);
        if (i2 == 1) {
            str2 = "contact";
        } else {
            str2 = "fb";
        }
        r.a("confirm_remove_sync_pop", a3.a("platform", str2).f66730a);
    }
}
