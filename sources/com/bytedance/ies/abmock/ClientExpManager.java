package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.g.c.a;
import com.bytedance.g.c.b;

public class ClientExpManager {
    private static final a aot_delay_client_experiment = new a("com.ss.android.ugc.aweme.experiment.AotDelayClientExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70333700", 0.2d, 0), new b("70333702", 0.2d, 180000), new b("70333703", 0.2d, 240000), new b("70333704", 0.2d, 300000), new b("70333701", 0.2d, -1));
    private static final a backup_video_opt = new a("com.ss.android.ugc.aweme.experiment.NewUserBackupVideoExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70339302", 0.2d, 0), new b("70339303", 0.2d, 1), new b("70339304", 0.2d, 2), new b("70339305", 0.2d, 3), new b("70339306", 0.2d, 4));
    private static final a cpu_big_core_bound_client = new a("com.ss.android.ugc.aweme.experiment.CpuBigCoreBoundClientExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70331956", 0.05d, 0), new b("70331957", 0.05d, 1), new b("70331958", 0.9d, 2));
    private static final a decompress_so_strategy_client = new a("com.ss.android.ugc.aweme.buildconfigdiff.LibraryCompressABGray", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("1668063", 0.05d, 0), new b("1668064", 0.05d, 1), new b("1668065", 0.05d, 2), new b("1668066", 0.05d, 3));
    private static final a enable_zero_rating_toast = new a("com.ss.android.ugc.aweme.api.ZeroRatingExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70243657", 0.5d, 0), new b("70243658", 0.5d, 1));
    private static final a first_feed_fallback_enable = new a("com.ss.android.ugc.aweme.feed.experiment.FirstFeedFallbackEnable", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70217649", 0.5d, false), new b("70217650", 0.5d, false));
    private static final a fix_active_user_experiment = new a("com.ss.android.ugc.aweme.experiment.FixActiveUserExperiment$FixActiveUserAB", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70242164", 0.5d, true), new b("70242163", 0.5d, false));
    private static final a flow_opt_key = new a("com.ss.android.ugc.aweme.experiment.FlowOptAB", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("50014827", 0.5d, 0), new b("50014828", 0.5d, 1));
    private static final a gecko_bytediff_exp_tt_android = new a("com.ss.android.ugc.aweme.utils.gecko.GeckoXBytediffExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70327863", 0.25d, 0), new b("70327864", 0.25d, 1), new b("70327865", 0.25d, 2), new b("70327866", 0.25d, 3));
    private static final a gender_selection_onboarding_countries = new a("com.ss.android.ugc.aweme.experiment.GenderSelectionExperiments$GenderSelectionExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70315650", 0.2d, 0), new b("70315651", 0.2d, 1), new b("70315652", 0.2d, 2), new b("70315653", 0.2d, 3), new b("70315654", 0.2d, 4));
    private static final a gender_selection_onboarding_gender_sensitive_countries = new a("com.ss.android.ugc.aweme.experiment.GenderSelectionExperiments$GenderSelectionSensitiveExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70315655", 0.2d, 0), new b("70315656", 0.2d, 1), new b("70315657", 0.2d, 2), new b("70315658", 0.2d, 3), new b("70315659", 0.2d, 4));
    private static final a gm_age_gate_education = new a("com.ss.android.ugc.aweme.account.experiment.GuestModeAgeGateOptimizationsExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70258518", 0.3d, 0), new b("70258519", 0.3d, 1), new b("70258520", 0.3d, 2), new b("70258521", 0.1d, 3));
    private static final a gm_btn_appearance_optimize = new a("com.ss.android.ugc.aweme.account.experiment.GuestModeSignUpPageOptimizationsExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70258458", 0.15d, 1), new b("70258459", 0.15d, 2), new b("70258460", 0.15d, 3), new b("70258461", 0.15d, 4), new b("70258462", 0.15d, 5), new b("70258463", 0.15d, 6), new b("70258464", 0.1d, 0));
    private static final a is_opt_new_user_boot = new a("com.ss.android.ugc.aweme.experiment.NewUserColdBootOptimizeV1Experiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70259969", 0.25d, 0), new b("70259970", 0.25d, 1), new b("70259971", 0.25d, 2), new b("70259972", 0.25d, 3));
    private static final a kr_consent_box_fix = new a("com.ss.android.ugc.aweme.compliance.business.consent.TpcConsentBoxFixExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70335628", 0.5d, 0), new b("70335629", 0.5d, 1));
    private static final a kr_consent_box_optimization = new a("com.ss.android.ugc.aweme.compliance.business.termspp.KRConsentBoxOptimizations", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70326714", 0.2d, 0), new b("70326715", 0.2d, 1), new b("70326716", 0.2d, 2), new b("70326717", 0.2d, 3), new b("70326718", 0.2d, 4));
    private static final a launch_opt_swipeup = new a("com.ss.android.ugc.aweme.buildconfigdiff.NewUserSwipeUpOptimizeExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("185214911", 0.5d, 0), new b("185215011", 0.5d, 1));
    private static final a login_default_open_screen = new a("com.ss.android.ugc.aweme.account.experiment.MakeLoginPageDefaultExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70294443", 0.33d, 0), new b("70294444", 0.33d, 1), new b("70294445", 0.33d, 2), new b("70294446", 0.01d, 3));
    private static final a miniapp_plugin_install_strategy = new a("com.ss.android.ugc.aweme.miniapp.abtest.MiniAppPluginInstallAB", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("50019349", 0.5d, 0), new b("50019350", 0.5d, 1));
    private static final a new_user_did_replace_video = new a("com.ss.android.ugc.aweme.experiment.NewUserDidFeedOptimizeExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70277420", 0.34d, 0), new b("70277422", 0.33d, 2), new b("70277421", 0.33d, 1));
    private static final a new_user_email_verification = new a("com.ss.android.ugc.aweme.account.experiment.NewUserEmailVerificationSetting", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70332898", 0.1d, false), new b("70332899", 0.1d, true));
    private static final a new_user_feed_total_opt = new a("com.ss.android.ugc.aweme.experiment.NewUserFeedTotalExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70339357", 0.05d, 0), new b("70339358", 0.05d, 1), new b("70339359", 0.05d, 2), new b("70339360", 0.85d, 3));
    private static final a new_user_guide_animation = new a("com.ss.android.ugc.aweme.experiment.NewUserGuideOptimizeExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70326040", 0.25d, 0), new b("70326041", 0.25d, 1), new b("70326042", 0.25d, 2), new b("70326043", 0.25d, 3));
    private static final a new_user_video_prerender = new a("com.ss.android.ugc.aweme.experiment.NewUserVideoPrerenderExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70283221", 0.02d, -1), new b("70283219", 0.49d, 0), new b("70283220", 0.49d, 1));
    private static final a onboarding_email_consent = new a("com.ss.android.ugc.aweme.account.experiment.ShowEmailConsentExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70315148", 0.33d, 0), new b("70315149", 0.33d, 1), new b("70315150", 0.33d, 2));
    private static final a qr_code_login = new a("com.ss.android.ugc.aweme.buildconfigdiff.QRCodeLoginExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("50017292", 0.5d, false), new b("50017293", 0.5d, true));
    private static final a remove_onboarding_steps = new a("com.ss.android.ugc.aweme.experiment.RemoveOnboardingStepsExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70258442", 0.25d, 0), new b("70258443", 0.25d, 1), new b("70258444", 0.25d, 2), new b("70258445", 0.25d, 3));
    private static final a remove_vk = new a("com.ss.android.ugc.aweme.account.experiment.DeprioritizeVKSignUpExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70352503", 0.33d, 0), new b("70352504", 0.33d, 1), new b("70352505", 0.33d, 2), new b("70352506", 0.01d, 3));
    private static final a resso_anchor_installed_vid = new a("com.ss.android.ugc.aweme.buildconfigdiff.RessoAnchorInstalledVidExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70126867,50065929", 1.0d, 0));
    private static final a resso_anchor_uninstalled_vid = new a("com.ss.android.ugc.aweme.buildconfigdiff.RessoAnchorUninstalledVidExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70126866,50065928", 1.0d, 0));
    private static final a return_fyp_tooltip = new a("com.ss.android.ugc.aweme.discover.experiment.FypTooltipExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70191645", 0.333d, 0), new b("70191646", 0.333d, 1), new b("70191647", 0.333d, 2));
    private static final a return_user_journey = new a("com.ss.android.ugc.aweme.buildconfigdiff.ReturnUserJourneyAB", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("50018159", 0.333d, 0), new b("50018160", 0.333d, 1), new b("50018161", 0.333d, 2));
    private static final a sea_nonpersonalized_popup = new a("com.ss.android.ugc.aweme.account.experiment.SEANonPersonalizedPopupExperienceExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70324710", 0.25d, 0), new b("70324711", 0.25d, 1), new b("70324712", 0.25d, 2), new b("70324713", 0.25d, 3));
    private static final a slogan_login_opt_experiment = new a("com.ss.android.ugc.aweme.buildconfigdiff.SloganExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("50022572", 0.34d, 0), new b("50022573", 0.33d, 1), new b("50022574", 0.33d, 2));
    private static final a topic_interest_selection_style = new a("com.ss.android.ugc.aweme.experiment.TopicInterestSelectionStyle", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70308626", 0.2d, 0), new b("70308627", 0.2d, 4), new b("70308628", 0.6d, 5));
    private static final a use_localized_recommend_group_global_regions = new a("com.ss.android.ugc.aweme.experiment.GlobalInterestsLocalizationExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70269128", 0.5d, false), new b("70269129", 0.5d, true));
    private static final a vmshrink_high_exp = new a("com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$VMShrinkerHighExperiment", "app", new String[]{"aot_delay_client_experiment", "backup_video_opt", "cpu_big_core_bound_client", "decompress_so_strategy_client", "enable_zero_rating_toast", "first_feed_fallback_enable", "fix_active_user_experiment", "flow_opt_key", "gecko_bytediff_exp_tt_android", "gender_selection_onboarding_countries", "gender_selection_onboarding_gender_sensitive_countries", "gm_age_gate_education", "gm_btn_appearance_optimize", "is_opt_new_user_boot", "kr_consent_box_fix", "kr_consent_box_optimization", "launch_opt_swipeup", "login_default_open_screen", "miniapp_plugin_install_strategy", "new_user_did_replace_video", "new_user_email_verification", "new_user_feed_total_opt", "new_user_guide_animation", "new_user_video_prerender", "onboarding_email_consent", "qr_code_login", "remove_onboarding_steps", "remove_vk", "resso_anchor_installed_vid", "resso_anchor_uninstalled_vid", "return_fyp_tooltip", "return_user_journey", "sea_nonpersonalized_popup", "slogan_login_opt_experiment", "topic_interest_selection_style", "use_localized_recommend_group_global_regions", "vmshrink_high_exp"}, new b("70275156", 0.33d, 0), new b("70275157", 0.33d, 1), new b("70275158", 0.33d, 2));

    static {
        Covode.recordClassIndex(18581);
    }

    public static int aot_delay_client_experiment() {
        return ((Integer) c.a("aot_delay_client_experiment", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, aot_delay_client_experiment)).intValue();
    }

    public static int aot_delay_client_experiment(boolean z) {
        return ((Integer) c.a("aot_delay_client_experiment", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, aot_delay_client_experiment)).intValue();
    }

    public static int backup_video_opt() {
        return ((Integer) c.a("backup_video_opt", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, backup_video_opt)).intValue();
    }

    public static int backup_video_opt(boolean z) {
        return ((Integer) c.a("backup_video_opt", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, backup_video_opt)).intValue();
    }

    public static int cpu_big_core_bound_client() {
        return ((Integer) c.a("cpu_big_core_bound_client", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, cpu_big_core_bound_client)).intValue();
    }

    public static int cpu_big_core_bound_client(boolean z) {
        return ((Integer) c.a("cpu_big_core_bound_client", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, cpu_big_core_bound_client)).intValue();
    }

    public static int decompress_so_strategy_client() {
        return ((Integer) c.a("decompress_so_strategy_client", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, decompress_so_strategy_client)).intValue();
    }

    public static int decompress_so_strategy_client(boolean z) {
        return ((Integer) c.a("decompress_so_strategy_client", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, decompress_so_strategy_client)).intValue();
    }

    public static int enable_zero_rating_toast() {
        return ((Integer) c.a("enable_zero_rating_toast", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, enable_zero_rating_toast)).intValue();
    }

    public static int enable_zero_rating_toast(boolean z) {
        return ((Integer) c.a("enable_zero_rating_toast", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, enable_zero_rating_toast)).intValue();
    }

    public static boolean first_feed_fallback_enable() {
        return ((Boolean) c.a("first_feed_fallback_enable", Boolean.TYPE, Boolean.valueOf("false"), true, true, first_feed_fallback_enable)).booleanValue();
    }

    public static boolean first_feed_fallback_enable(boolean z) {
        return ((Boolean) c.a("first_feed_fallback_enable", Boolean.TYPE, Boolean.valueOf("false"), true, z, first_feed_fallback_enable)).booleanValue();
    }

    public static boolean fix_active_user_experiment() {
        return ((Boolean) c.a("fix_active_user_experiment", Boolean.TYPE, Boolean.valueOf("false"), true, true, fix_active_user_experiment)).booleanValue();
    }

    public static boolean fix_active_user_experiment(boolean z) {
        return ((Boolean) c.a("fix_active_user_experiment", Boolean.TYPE, Boolean.valueOf("false"), true, z, fix_active_user_experiment)).booleanValue();
    }

    public static int flow_opt_key() {
        return ((Integer) c.a("flow_opt_key", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, flow_opt_key)).intValue();
    }

    public static int flow_opt_key(boolean z) {
        return ((Integer) c.a("flow_opt_key", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, flow_opt_key)).intValue();
    }

    public static int gecko_bytediff_exp_tt_android() {
        return ((Integer) c.a("gecko_bytediff_exp_tt_android", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, gecko_bytediff_exp_tt_android)).intValue();
    }

    public static int gecko_bytediff_exp_tt_android(boolean z) {
        return ((Integer) c.a("gecko_bytediff_exp_tt_android", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, gecko_bytediff_exp_tt_android)).intValue();
    }

    public static int gender_selection_onboarding_countries() {
        return ((Integer) c.a("gender_selection_onboarding_countries", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, gender_selection_onboarding_countries)).intValue();
    }

    public static int gender_selection_onboarding_countries(boolean z) {
        return ((Integer) c.a("gender_selection_onboarding_countries", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, gender_selection_onboarding_countries)).intValue();
    }

    public static int gender_selection_onboarding_gender_sensitive_countries() {
        return ((Integer) c.a("gender_selection_onboarding_gender_sensitive_countries", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, gender_selection_onboarding_gender_sensitive_countries)).intValue();
    }

    public static int gender_selection_onboarding_gender_sensitive_countries(boolean z) {
        return ((Integer) c.a("gender_selection_onboarding_gender_sensitive_countries", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, gender_selection_onboarding_gender_sensitive_countries)).intValue();
    }

    public static int gm_age_gate_education() {
        return ((Integer) c.a("gm_age_gate_education", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, gm_age_gate_education)).intValue();
    }

    public static int gm_age_gate_education(boolean z) {
        return ((Integer) c.a("gm_age_gate_education", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, gm_age_gate_education)).intValue();
    }

    public static int gm_btn_appearance_optimize() {
        return ((Integer) c.a("gm_btn_appearance_optimize", Integer.TYPE, Integer.valueOf(Double.valueOf("1").intValue()), true, true, gm_btn_appearance_optimize)).intValue();
    }

    public static int gm_btn_appearance_optimize(boolean z) {
        return ((Integer) c.a("gm_btn_appearance_optimize", Integer.TYPE, Integer.valueOf(Double.valueOf("1").intValue()), true, z, gm_btn_appearance_optimize)).intValue();
    }

    public static int is_opt_new_user_boot() {
        return ((Integer) c.a("is_opt_new_user_boot", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, is_opt_new_user_boot)).intValue();
    }

    public static int is_opt_new_user_boot(boolean z) {
        return ((Integer) c.a("is_opt_new_user_boot", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, is_opt_new_user_boot)).intValue();
    }

    public static int kr_consent_box_fix() {
        return ((Integer) c.a("kr_consent_box_fix", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, kr_consent_box_fix)).intValue();
    }

    public static int kr_consent_box_fix(boolean z) {
        return ((Integer) c.a("kr_consent_box_fix", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, kr_consent_box_fix)).intValue();
    }

    public static int kr_consent_box_optimization() {
        return ((Integer) c.a("kr_consent_box_optimization", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, kr_consent_box_optimization)).intValue();
    }

    public static int kr_consent_box_optimization(boolean z) {
        return ((Integer) c.a("kr_consent_box_optimization", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, kr_consent_box_optimization)).intValue();
    }

    public static int launch_opt_swipeup() {
        return ((Integer) c.a("launch_opt_swipeup", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, launch_opt_swipeup)).intValue();
    }

    public static int launch_opt_swipeup(boolean z) {
        return ((Integer) c.a("launch_opt_swipeup", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, launch_opt_swipeup)).intValue();
    }

    public static int login_default_open_screen() {
        return ((Integer) c.a("login_default_open_screen", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, login_default_open_screen)).intValue();
    }

    public static int login_default_open_screen(boolean z) {
        return ((Integer) c.a("login_default_open_screen", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, login_default_open_screen)).intValue();
    }

    public static int miniapp_plugin_install_strategy() {
        return ((Integer) c.a("miniapp_plugin_install_strategy", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, miniapp_plugin_install_strategy)).intValue();
    }

    public static int miniapp_plugin_install_strategy(boolean z) {
        return ((Integer) c.a("miniapp_plugin_install_strategy", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, miniapp_plugin_install_strategy)).intValue();
    }

    public static int new_user_did_replace_video() {
        return ((Integer) c.a("new_user_did_replace_video", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, new_user_did_replace_video)).intValue();
    }

    public static int new_user_did_replace_video(boolean z) {
        return ((Integer) c.a("new_user_did_replace_video", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, new_user_did_replace_video)).intValue();
    }

    public static boolean new_user_email_verification() {
        return ((Boolean) c.a("new_user_email_verification", Boolean.TYPE, Boolean.valueOf("false"), true, true, new_user_email_verification)).booleanValue();
    }

    public static boolean new_user_email_verification(boolean z) {
        return ((Boolean) c.a("new_user_email_verification", Boolean.TYPE, Boolean.valueOf("false"), true, z, new_user_email_verification)).booleanValue();
    }

    public static int new_user_feed_total_opt() {
        return ((Integer) c.a("new_user_feed_total_opt", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, new_user_feed_total_opt)).intValue();
    }

    public static int new_user_feed_total_opt(boolean z) {
        return ((Integer) c.a("new_user_feed_total_opt", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, new_user_feed_total_opt)).intValue();
    }

    public static int new_user_guide_animation() {
        return ((Integer) c.a("new_user_guide_animation", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, new_user_guide_animation)).intValue();
    }

    public static int new_user_guide_animation(boolean z) {
        return ((Integer) c.a("new_user_guide_animation", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, new_user_guide_animation)).intValue();
    }

    public static int new_user_video_prerender() {
        return ((Integer) c.a("new_user_video_prerender", Integer.TYPE, Integer.valueOf(Double.valueOf("-1").intValue()), true, true, new_user_video_prerender)).intValue();
    }

    public static int new_user_video_prerender(boolean z) {
        return ((Integer) c.a("new_user_video_prerender", Integer.TYPE, Integer.valueOf(Double.valueOf("-1").intValue()), true, z, new_user_video_prerender)).intValue();
    }

    public static int onboarding_email_consent() {
        return ((Integer) c.a("onboarding_email_consent", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, onboarding_email_consent)).intValue();
    }

    public static int onboarding_email_consent(boolean z) {
        return ((Integer) c.a("onboarding_email_consent", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, onboarding_email_consent)).intValue();
    }

    public static boolean qr_code_login() {
        return ((Boolean) c.a("qr_code_login", Boolean.TYPE, Boolean.valueOf("false"), true, true, qr_code_login)).booleanValue();
    }

    public static boolean qr_code_login(boolean z) {
        return ((Boolean) c.a("qr_code_login", Boolean.TYPE, Boolean.valueOf("false"), true, z, qr_code_login)).booleanValue();
    }

    public static int remove_onboarding_steps() {
        return ((Integer) c.a("remove_onboarding_steps", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, remove_onboarding_steps)).intValue();
    }

    public static int remove_onboarding_steps(boolean z) {
        return ((Integer) c.a("remove_onboarding_steps", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, remove_onboarding_steps)).intValue();
    }

    public static int remove_vk() {
        return ((Integer) c.a("remove_vk", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, remove_vk)).intValue();
    }

    public static int remove_vk(boolean z) {
        return ((Integer) c.a("remove_vk", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, remove_vk)).intValue();
    }

    public static int resso_anchor_installed_vid() {
        return ((Integer) c.a("resso_anchor_installed_vid", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, resso_anchor_installed_vid)).intValue();
    }

    public static int resso_anchor_installed_vid(boolean z) {
        return ((Integer) c.a("resso_anchor_installed_vid", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, resso_anchor_installed_vid)).intValue();
    }

    public static int resso_anchor_uninstalled_vid() {
        return ((Integer) c.a("resso_anchor_uninstalled_vid", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, resso_anchor_uninstalled_vid)).intValue();
    }

    public static int resso_anchor_uninstalled_vid(boolean z) {
        return ((Integer) c.a("resso_anchor_uninstalled_vid", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, resso_anchor_uninstalled_vid)).intValue();
    }

    public static int return_fyp_tooltip() {
        return ((Integer) c.a("return_fyp_tooltip", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, return_fyp_tooltip)).intValue();
    }

    public static int return_fyp_tooltip(boolean z) {
        return ((Integer) c.a("return_fyp_tooltip", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, return_fyp_tooltip)).intValue();
    }

    public static int return_user_journey() {
        return ((Integer) c.a("return_user_journey", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, return_user_journey)).intValue();
    }

    public static int return_user_journey(boolean z) {
        return ((Integer) c.a("return_user_journey", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, return_user_journey)).intValue();
    }

    public static int sea_nonpersonalized_popup() {
        return ((Integer) c.a("sea_nonpersonalized_popup", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, sea_nonpersonalized_popup)).intValue();
    }

    public static int sea_nonpersonalized_popup(boolean z) {
        return ((Integer) c.a("sea_nonpersonalized_popup", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, sea_nonpersonalized_popup)).intValue();
    }

    public static int slogan_login_opt_experiment() {
        return ((Integer) c.a("slogan_login_opt_experiment", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, slogan_login_opt_experiment)).intValue();
    }

    public static int slogan_login_opt_experiment(boolean z) {
        return ((Integer) c.a("slogan_login_opt_experiment", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, slogan_login_opt_experiment)).intValue();
    }

    public static int topic_interest_selection_style() {
        return ((Integer) c.a("topic_interest_selection_style", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, topic_interest_selection_style)).intValue();
    }

    public static int topic_interest_selection_style(boolean z) {
        return ((Integer) c.a("topic_interest_selection_style", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, topic_interest_selection_style)).intValue();
    }

    public static boolean use_localized_recommend_group_global_regions() {
        return ((Boolean) c.a("use_localized_recommend_group_global_regions", Boolean.TYPE, Boolean.valueOf("false"), true, true, use_localized_recommend_group_global_regions)).booleanValue();
    }

    public static boolean use_localized_recommend_group_global_regions(boolean z) {
        return ((Boolean) c.a("use_localized_recommend_group_global_regions", Boolean.TYPE, Boolean.valueOf("false"), true, z, use_localized_recommend_group_global_regions)).booleanValue();
    }

    public static int vmshrink_high_exp() {
        return ((Integer) c.a("vmshrink_high_exp", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, true, vmshrink_high_exp)).intValue();
    }

    public static int vmshrink_high_exp(boolean z) {
        return ((Integer) c.a("vmshrink_high_exp", Integer.TYPE, Integer.valueOf(Double.valueOf("0").intValue()), true, z, vmshrink_high_exp)).intValue();
    }
}
