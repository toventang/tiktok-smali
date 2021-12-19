package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.abmock.j;
import com.ss.android.ugc.aweme.experiment.ez;
import com.ss.android.ugc.aweme.experiment.fj;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

public final class PreloadKevaKeyTask implements a, w {
    static {
        Covode.recordClassIndex(69096);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
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
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return new String[]{"ABTask"};
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (j.a().c()) {
            SettingsManager.a().a("aab_plugin_fake_install", false);
            SettingsManager.a().a("aab_plugin_aggressive_download_mode", true);
            b.a().a(true, "fetch_feed_in_foreground", false);
            SettingsManager.a().a("use_bridge_engine_v2", true);
            SettingsManager.a().a("enable_vboost_settings", false);
            b.a().a(true, "push_init_optimize_enable", false);
            b.a().a(true, "event_map_builder_optimize", false);
            SettingsManager.a().a("music_media_player_time", 30000);
            b.a().a(true, "enable_fast_event_bus", false);
            SettingsManager.a().a("enable_horae_init", false);
            b.a().a(true, "page_monitor_service_enable_ab", false);
            b.a().a(true, "optimize_preloadfeedtype", 0);
            b.a().a(true, "optimize_asyncinflatefragmentmain", true);
            b.a().a(true, "optimize_asyncinflatefragmentfeed", true);
            b.a().a(true, "optimize_asyncinflatefragmentfeed", true);
            b.a().a(true, "optimize_asyncinflatecoldbootfinish", true);
            b.a().a(true, "optimize_asyncinflateprofiledelaytime", 800L);
            b.a().a(true, "player_background_release_codec_res", 0);
            b.a().a(true, "hpas2sv_dialog_async", false);
            SettingsManager.a().a("feed_detail_transition_local_enable", true);
            b.a().a(true, "feed_detail_transition_enable", false);
            b.a().a(true, "feed_populate_partition_optimize", false);
            b.a().a(true, "player_ab_block_type", 0);
            b.a().a(true, "ad_opt_webview_preload", 0);
            b.a().a(true, "feed_prepare_enable_control_optimize", false);
            b.a().a(true, "feed_prepare_push_control_optimize", false);
            b.a().a(true, "for_you_new_translations", false);
            b.a().a(true, "player_background_release_codec_res_countdown_duration", 30000L);
            b.a().a(true, "feed_scrool_duration_opt_enable", false);
            b.a().a(true, "use_new_app_alert", 0);
            b.a().a(true, "combine_settings_req", true);
            SettingsManager.a().a("story_container_touch_event_enable", true);
            SettingsManager.a().a("background_pause_player_setting", 0);
            b.a().a(true, "tiktok_social_reverse_enable", 0);
            b.a().a(true, "tt_story_experiment", 0);
            SettingsManager.a().a("video_play_progress_count", 0);
            b.a().a(true, "optimize_feed_tab_layout", false);
            b.a().a(true, "following_foru_swipe_disable_unloginuser", 0);
            b.a().a(true, "following_red_dot_reverse", false);
            b.a().a(true, "cancel_other_push", 0);
            SettingsManager.a().a("inapp_update_switch_strategy", 0);
            b.a().a(true, "enable_full_screen_read_adaption", true);
            b.a().a(true, "i18n_following_badge_type_number", false);
            try {
                b.a().a(true, "special_event_entrypoint", SpecialTopicEntry.class);
                b.a().a(true, "image_crop_config_v3", com.ss.android.ugc.aweme.ay.a.a.class);
                b.a().a(true, "permission_pop_up_frequency_control", fj.class, ez.f90014a);
                b.a().a(true, "preload_strategy_hp", PreloadStrategyConfig.class);
            } catch (Exception e2) {
                String.valueOf(e2.getStackTrace());
            }
            b.a().a(true, "feed_view_page_preload_view_optimize", false);
            SettingsManager.a().a("feed_handle_generic_motion", true);
            b.a().a(true, "enable_network_notice", false);
            b.a().a(true, "view_page_populate_delay_enable", false);
            b.a().a(true, "view_page_smooth_scroll_enable", false);
            b.a().a(true, "tt_story_icon_display_strategy", 1);
            b.a().a(true, "gather_mode", 0);
            SettingsManager.a().a("vboost_feed_scroll_opt_time", 1500);
            SettingsManager.a().a("feed_find_bug_setting", 1);
            b.a().a(true, "feed_adapter_get_view_delay", -1);
            b.a().a(true, "engine_preloader_pre_connect", 0);
            b.a().a(true, "player_precreateplayer", 0);
            b.a().a(true, "optimize_feed_prepare_video_option", 100);
            b.a().a(true, "optimize_feed_precreate_player_option", 0);
            b.a().a(true, "helios_anchor_task_plan", "PlanA");
            b.a().a(true, "btm_switch", 0);
            b.a().a(true, "feed_adapter_get_view_delay", -1);
            b.a().a(true, "user_manager_update_optimize", false);
            b.a().a(true, "full_recommend_live_display_type", 1);
            b.a().a(true, "preload_feed_item_optimize", false);
            b.a().a(true, "is_clear_video_background", true);
            b.a().a(true, "lottie_opt_group_ab", 0);
            b.a().a(true, "separate_share_more_strategy", 0);
            b.a().a(true, "feed_user_suggestion_style", 0);
            b.a().a(true, "enable_benchmark_performance", false);
            b.a().a(true, "marquee_title_opt", false);
            b.a().a(true, "feed_Commerce_selected_optimize", false);
            b.a().a(true, "feed_Commerce_logic_optimize", false);
            SettingsManager.a().a("expand_the_character_limit_of_video_caption_enable_for_consumers", false);
            b.a().a(true, "resize_feed_in_small_screen", 0);
            b.a().a(true, "feed_Commerce_unselected_optimize", false);
            b.a().a(true, "surface_lifecycle_notification_enabled", 0);
            b.a().a(true, "player_prerender_cover_need", 1);
            b.a().a(true, "enable_reuse_external_image_include_static_image", true);
            b.a().a(true, "follow_live_interaction_style", 0);
            SettingsManager.a().a("allow_long_video_scrubbing", 0);
            SettingsManager.a().a("anti_addiction_day_time", 0);
            SettingsManager.a().a("anti_addiction_night_time", 0);
            b.a().a(true, "is_preload_process_data", false);
            SettingsManager.a().a("enable_feed_ad_break_duration_optimize", 0);
            SettingsManager.a().a("playermanager_background_check", 0);
            b.a().a(true, "player_schedule_on_render", 0);
            b.a().a(true, "player_prerender_surface_slow_set_fix", false);
            b.a().a(true, "viewpager_load_delay_phase", 0);
            b.a().a(true, "video_caption_line_height", 0);
            b.a().a(true, "interction_share_button_whatsapp_style", 0);
            b.a().a(true, "interction_share_button_style", 0);
            b.a().a(true, "show_play_count", 0);
            b.a().a(true, "feed_player_load_more_preload_experiment", false);
            b.a().a(true, "feed_view_page_preload_delay_time_option", 1000);
            b.a().a(true, "play_time_opt_exp", false);
            b.a().a(true, "player_play_start_time_storge_opt", 0);
            b.a().a(true, "player_prerender_enable", 0);
            b.a().a(true, "feed_palm_rejection_2", 0);
        }
    }
}
