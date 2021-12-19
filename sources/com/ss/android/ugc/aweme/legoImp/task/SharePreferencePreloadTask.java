package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.experiment.dx;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class SharePreferencePreloadTask implements w {
    static {
        Covode.recordClassIndex(69124);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        a(context, "key_language_sp_key");
        a(context, "KEY_NEED_UPLOAD_LAUNCHLOG");
        a(context, "pref_language_key");
        a(context, "preinsatll_appflyer");
        a(context, "appsflyer-data");
        a(context, "ab_test_model");
        a(context, "default_config");
        a(context, "custom_channels");
        a(context, "aweme-app");
        a(context, "aweme_user");
        a(context, "av_ab.xml");
        a(context, "av_settings.xml");
        a(context, "x2c_error");
        a(context, "current_foreground_uid");
        a(context, "USER_PROFILE");
        a(context, "MainTabPreferences");
        a(context, "share_theme_data");
        a(context, "prefs_feed_check");
        PreferenceManager.getDefaultSharedPreferences(context).getAll();
        a(context, "guide");
        a(context, "main_swipere_fresh");
        a(context, "VideoRecord");
        a(context, "long_video_mock");
        a(context, "last_version_code");
        a(context, "appsflyer-data");
        a(context, "app_bundle_session_ids");
        a(context, "sp_show_share_guide_cache");
        a(context, "apps_flyer_cache");
        a(context, "com.google.android.gms.measurement.prefs");
        a(context, "com.google.firebase.common.prefs");
        a(context, "google_ads_flags");
        a(context, "InitialChooseLanguagePreferences");
        a(context, "share_setting_preference");
        a(context, "TabStatus");
        a(context, "ttnet_tnc_config");
        a(context, "ai_music");
        a(context, "com.zhiliaoapp.musically");
        a(context, "DeviceSettingSp");
        a(context, "settings");
        a(context, "new_sp_ad_config");
        a(context, "imbase_0");
        Keva.getRepoSync("money_growth", 0);
        Keva.getRepoSync("money_growth_read_task", 0);
        Keva.getRepoSync("SelectOldCities", 0);
        Keva.getRepoSync("ug_coupon_repo", 0);
        Keva.getRepoSync("TTSettingData", 0);
        Keva.getRepoSync("USER_RETAIN", 0);
        Keva.getRepoSync("first_install_version", 0);
        Keva.getRepoSync("repo_mapping_url", 0);
        Keva.getRepoFromSpSync(context, "music_sp", 0);
        Keva.getRepoFromSpSync(context, "test_sp", 0);
        Keva.getRepoFromSpSync(context, "HateFulPreferences", 0);
        Keva.getRepoFromSpSync(context, "setting_repo_sp", 0);
        if (s.a().booleanValue()) {
            Keva.getRepoSync("new_user_journey", 0);
        }
    }

    private static void a(Context context, String str) {
        if (dx.b()) {
            d.a(context, str, 0);
        } else {
            d.a(context, str, 0).getInt("tiktok", 0);
        }
    }
}
