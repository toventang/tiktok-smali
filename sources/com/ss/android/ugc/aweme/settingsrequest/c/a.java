package com.ss.android.ugc.aweme.settingsrequest.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f123180a = Keva.getRepo("ab_repo_cold_boot").getInt("key_preload_cache", 0);

    /* renamed from: b  reason: collision with root package name */
    public static int f123181b = Keva.getRepo("ab_repo_cold_boot").getInt("key_prepare_video", 0);

    /* renamed from: c  reason: collision with root package name */
    public static int f123182c = Keva.getRepo("ab_repo_cold_boot").getInt("key_preload_player", 0);

    /* renamed from: d  reason: collision with root package name */
    public static boolean f123183d = Keva.getRepo("ab_repo_cold_boot").getBoolean("feed_cache_delete_delay", false);

    static {
        Covode.recordClassIndex(80907);
    }
}
