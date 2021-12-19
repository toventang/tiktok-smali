package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

public final class b {
    static {
        Covode.recordClassIndex(69207);
    }

    public static void a() {
        Keva repo = Keva.getRepo("anr_dispatch_boost", 1);
        repo.storeBoolean("boost_enable", com.bytedance.ies.abmock.b.a().a(true, "anr_dispatch_boost", false));
        repo.storeBoolean("kitkat_enable", SettingsManager.a().a("anr_dispatch_kitkat_enable", true));
        repo.storeBoolean("remove_bomb_twice_enable", SettingsManager.a().a("anr_dispatch_remove_bomb_twice_enable", false));
    }
}
