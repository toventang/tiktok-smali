package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class PreloadPrefsAndKevaTaskV1 implements a, w {

    /* renamed from: a  reason: collision with root package name */
    private Context f107864a;

    static {
        Covode.recordClassIndex(69097);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.IO;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private void a(String str) {
        d.a(this.f107864a, str, 0);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        this.f107864a = context;
        a("applog_stats");
        a("aweme-app");
        a("key_language_sp_key");
        a("KEY_NEED_UPLOAD_LAUNCHLOG");
        a("default_config");
        a("TeenageModeSetting");
        a("app_setting");
        Keva.getRepoSync("keva_switch_repo", 0);
        Keva.getRepoSync("preinsatll_appflyer", 0);
        Keva.getRepoSync("network_keva", 0);
        Keva.getRepoSync("pendant_global_timer_reducer", 0);
        Keva.getRepoSync("new_user_journey", 0);
        Keva.getRepoSync("NewUserUtils", 0);
        Keva.getRepoSync("repo_new_version_journey", 0);
        Keva.getRepoSync("praise_keva", 0);
        Keva.getRepoSync("age_gate_service_repo", 0);
        Keva.getRepoSync("repo_story_cold_start", 0);
        Keva.getRepoSync("account_security_keva_name", 0);
        Keva.getRepoSync("ies_im_core", 0);
        Keva.getRepoSync("interest_select", 0);
        Keva.getRepoSync("setting_repo_sp", 0);
        Keva.getRepoSync("fe-storage", 0);
        Keva.getRepoSync("keva_repo_profile_component", 0);
        Keva.getRepoSync("settings_v3_config", 1);
        Keva.getRepoSync("ab_iorap_repo", 0);
        Keva.getRepoSync("av_ab_vesdk.xml", 0);
        Keva.getRepoSync("appsflyer-data", 0);
        Keva.getRepoSync("token_shared_preference", 0);
        Keva.getRepoSync("com.ss.spipe_setting", 0);
        Keva.getRepoSync("account_sec_share_data", 0);
        Keva.getRepoSync("VideoRecord", 0);
        Keva.getRepoSync("sp_stay_home_guide_cache", 0);
        Keva.getRepoSync("sp_show_share_guide_cache", 0);
        Keva.getRepoSync("MainTabPreferences", 0);
        Keva.getRepoSync("ttlive_sdk_shared_pref_cache", 0);
        Keva.getRepoSync("pendant_lottie_keva", 0);
    }
}
