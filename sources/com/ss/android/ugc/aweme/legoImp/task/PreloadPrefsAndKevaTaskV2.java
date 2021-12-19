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

public class PreloadPrefsAndKevaTaskV2 implements a, w {

    /* renamed from: a  reason: collision with root package name */
    private Context f107865a;

    static {
        Covode.recordClassIndex(69098);
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
        d.a(this.f107865a, str, 0);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        this.f107865a = context;
        a("SP_EXPERIMENT_CACHE");
        a("CLIENT_EXPERIMENT_CACHE_TAG");
        a("SP_EXPERIMENT_CACHE");
        a("aweme_user");
        a("applog_stats");
        a("com.ss.spipe_setting");
        a("push_multi_process_config");
        a("push_setting");
        a("default_config");
        a("key_language_sp_key");
        a("KEY_NEED_UPLOAD_LAUNCHLOG");
        a("appsflyer-data");
        a("monitor_switch_config");
        a("app_setting");
        a("test_setting");
        a("aweme-app");
        a("ttlive_sdk_shared_pref_cache");
        a("preinsatll_appflyer");
        a("long_video_mock");
        a("live-app-core-sdk");
        a("ttlive_live_user");
        a("live_fans_comment_guide");
        a("live_fans_club_tips");
        a("extra_group");
        a("pay_controll");
        a("ttlive_sdk_shared_pref_cache");
        a("share_setting_preference");
        a("com.ss.android.deviceregister.utils.Cdid");
        a("performance_sp");
        Keva.getRepoSync("ab_repo_cold_boot", 0);
        Keva.getRepoSync("new_illegal_username_keva", 0);
        Keva.getRepoSync("settings_v3_config", 1);
        Keva.getRepoSync("precise_exposure_repo", 1);
        Keva.getRepoSync("network_keva", 0);
        Keva.getRepoSync("repo_new_version_journey", 0);
        Keva.getRepoSync("compliance_setting", 0);
        Keva.getRepoSync("av-storage-white-list", 0);
        Keva.getRepoSync("pendant_global_timer_reducer", 0);
        Keva.getRepoSync("pendant_global_timer", 0);
        Keva.getRepoSync("repo_parental_platform", 0);
        Keva.getRepoSync("new_user_journey", 0);
        Keva.getRepoSync("NewUserUtils", 0);
        Keva.getRepoSync("age_gate_service_repo", 0);
        Keva.getRepoSync("account_security_keva_name", 0);
        Keva.getRepoSync("special_plus_keva", 0);
        Keva.getRepoSync("MTMainTabPreferences", 0);
        Keva.getRepoSync("InitialChooseLanguagePreferences", 0);
        Keva.getRepoSync("money_growth", 0);
        Keva.getRepoSync("main_process_runstate", 1);
        Keva.getRepoSync("appsflyer_repo", 0);
        Keva.getRepoSync("tcm_pro_account", 0);
        Keva.getRepoSync("imsdk_0", 0);
        Keva.getRepoSync("compliance_privacy_group_chat_cache", 0);
        Keva.getRepoSync("ies_im_core", 0);
        Keva.getRepoSync("lark_cache_file", 0);
        Keva.getRepoSync("interest_select", 0);
        Keva.getRepoSync("player_setting", 0);
        Keva.getRepoSync("VideoRecord", 0);
        Keva.getRepoSync("setting_repo_safe_view", 0);
        Keva.getRepoSync("ab_iorap_repo", 0);
        Keva.getRepoSync("com.facebook.internal.FEATURE_MANAGER", 0);
        Keva.getRepoSync("pendant_lottie_keva", 0);
        Keva.getRepoSync("hybrid_debug_settings", 0);
        Keva.getRepoSync("gecko-debug-tool", 0);
        Keva.getRepoSync("av-storage-white-list", 0);
        Keva.getRepoSync("crash_marker_repo", 0);
        Keva.getRepoSync("jsbridge2-permission", 0);
    }
}
