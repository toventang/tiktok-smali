package com.ss.android.ugc.aweme.setting.page.privacy.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class a {
    static {
        Covode.recordClassIndex(80371);
    }

    public static final boolean a() {
        return Keva.getRepo("contacts_sync_repo").getBoolean("contacts_sync_is_removing", false);
    }

    public static final boolean b() {
        return Keva.getRepo("facebook_sync_repo").getBoolean("facebook_sync_is_removing", false);
    }

    public static final void a(boolean z) {
        com.ss.android.ugc.aweme.friends.service.a.f97047a.a("privacy_setting", z);
    }

    public static final void b(boolean z) {
        Keva.getRepo("contacts_sync_repo").storeBoolean("contacts_sync_is_removing", z);
    }

    public static final void c(boolean z) {
        Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", z);
    }
}
