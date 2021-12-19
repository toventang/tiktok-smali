package com.bytedance.ies.powerpermissions.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34452a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20588);
    }

    private static boolean a() {
        return Keva.getRepo("FriendsSharePreferences").getBoolean("read_contact_denied", false);
    }

    private static void b() {
        Keva.getRepo("FriendsSharePreferences").storeBoolean("read_contact_denied", true);
    }

    public static boolean a(String str) {
        l.c(str, "");
        if (l.a((Object) str, (Object) "android.permission.READ_CONTACTS")) {
            return a();
        }
        return Keva.getRepo("permission_store").getBoolean(str, false);
    }

    public static void b(String str) {
        l.c(str, "");
        if (l.a((Object) str, (Object) "android.permission.READ_CONTACTS")) {
            b();
        } else {
            Keva.getRepo("permission_store").storeBoolean(str, true);
        }
    }
}
