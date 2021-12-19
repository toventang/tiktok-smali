package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122009a = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f122010b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f122011c = this.f122012d.getBoolean("settings_keva_enabled", false);

    /* renamed from: d  reason: collision with root package name */
    private Keva f122012d;

    static {
        Covode.recordClassIndex(79982);
    }

    private a() {
        Keva repoSync = Keva.getRepoSync("abmock_keva_repo", 1);
        this.f122012d = repoSync;
        this.f122010b = repoSync.getBoolean("keva_enabled", true);
    }

    public final void a() {
        this.f122012d.storeBoolean("keva_enabled", SettingsManager.a().a("abmock_keva_switch", false));
        this.f122012d.storeBoolean("settings_keva_enabled", SettingsManager.a().a("settings_keva_switch", false));
    }
}
