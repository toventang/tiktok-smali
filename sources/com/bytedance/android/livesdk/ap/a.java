package com.bytedance.android.livesdk.ap;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface a {
    public static final b<Integer> A = new b<>("broadcast_pause_times_per_each", (Integer) 3);
    public static final b<Integer> B = new b<>("live_ctrl_window_x", (Integer) -1);
    public static final b<Integer> C = new b<>("live_ctrl_window_y", (Integer) -1);
    public static final b<Boolean> D = new b<>("live_game_msg_enabled", (Boolean) true);
    public static final b<Integer> E = new b<>("show_screen_record_notification_tips_permission_count", (Integer) 0);
    public static final b<Boolean> F = new b<>("live_inroom_pk_tips", (Boolean) true);
    public static final b<Boolean> G = new b<>("live_inroom_pk_animation", (Boolean) false);
    public static final b<Set<Long>> H = new b<>("gift_panel_showed_manual", new HashSet());
    public static final b<Set<String>> I = new b<>("gift_panel_opened_guide_url", new HashSet());
    public static final b<Boolean> J = new b<>("showed_doodle_template_popup_tip", (Boolean) false);
    public static final b<Boolean> K = new b<>("gift_animation_enable_landscape", (Boolean) true);
    public static final b<Long> L = new b<>("live_start_live_anchor", (Long) 0L);
    public static final b<Map<String, String>> M = new b<>("live_start_live_tag", new HashMap());
    public static final b<Boolean> N = new b<>("live_beauty_feedback_clicked", (Boolean) false);
    public static final b<Integer> O = new b<>("live_filter_id", (Integer) -1);
    public static final b<Float> P;
    public static final b<Float> Q;
    public static final b<Float> R;
    public static final b<Float> S;
    public static final b<Integer> T = new b<>("beauty_level", (Integer) 3);
    public static final b<Set<Long>> U = new b<>("prop_panel_showed_red_point", new HashSet());
    public static final b<Set<String>> V = new b<>("fast_gift_hide_confirm_gift", new HashSet());
    public static final b<Set<String>> W = new b<>("mt_fast_gift_hide_confirm_gift", new HashSet());
    public static final b<Float> X;
    public static final b<Float> Y;
    public static final b<Integer> Z = new b<>("barrage_local_type", (Integer) 2);

    /* renamed from: a  reason: collision with root package name */
    public static final b<Boolean> f14007a = new b<>("jump_to_room_dialog", (Boolean) false);
    public static final b<Boolean> aA = new b<>("recharge_dialog_big_deal_hint_shown", (Boolean) false);
    public static final b<Long> aB = new b<>("drawer_anim_show", (Long) 0L);
    public static final b<Integer> aC = new b<>("drawer_anim_show_count", (Integer) 0);
    public static final b<Boolean> aD = new b<>("live_comment_danmu_state", (Boolean) false);
    public static final b<String> aE = new b<>("room_decoration_customize_text", "");
    public static final b<Integer> aF = new b<>("room_decoration_text_pass_level", (Integer) 31);
    public static final b<Long> aG = new b<>("room_decoration_anchor_id", (Long) 0L);
    public static final b<String> aH = new b<>("room_decoration_list", "");
    public static final b<Boolean> aI = new b<>("show_room_decoration_toast", (Boolean) true);
    public static final b<Boolean> aJ = new b<>("showed_pay_channel_scroll_tip", (Boolean) false);
    public static final b<Boolean> aK = new b<>("show_enter_other_live_room_dialog", (Boolean) true);
    public static final b<Boolean> aL = new b<>("show_enter_other_live_room_dialog_of_hour_rank", (Boolean) true);
    public static final b<Long> aM = new b<>("mobile_flow_show_time", (Long) 0L);
    public static final b<String> aN = new b<>("last_first_charge_bubble_show_time", "");
    public static final b<String> aO = new b<>("last_first_charge_bubble_text", "");
    public static final b<List<String>> aP = new b<>("last_first_charge_bubble_show_info", new ArrayList());
    public static final b<Integer> aQ = new b<>("recharge_dialog_content_height", (Integer) 0);
    public static final b<Boolean> aR = new b<>("show_question_guide_bubble", (Boolean) true);
    public static final b<Boolean> aS = new b<>("show_close_question_tip", (Boolean) true);
    public static final b<Boolean> aT = new b<>("show_pause_live_tip", (Boolean) true);
    public static final b<String> aU = new b<>("tool_bar_first_charge_shake_times", "");
    public static final b<Long> aV = new b<>("recharge_reward_popup_in_gift_dialog_timestamp", (Long) 0L);
    public static final b<String> aW = new b<>("live_last_turntable_bubble", "");
    public static final b<Long> aX = new b<>("live_last_new_drive_count", (Long) 0L);
    public static final b<Boolean> aY = new b<>("live_showd_drive_panel", (Boolean) false);
    public static final b<Double> aZ = new b<>("live_last_healthy_score", Double.valueOf(0.0d));
    public static final b<Boolean> aa = new b<>("barrage_enable", (Boolean) true);
    public static final b<Boolean> ab = new b<>("room_auto_gift_thanks", (Boolean) false);
    public static final b<Boolean> ac = new b<>("game_quiz_anchor_tip_show", (Boolean) false);
    public static final b<Long> ad = new b<>("live_guide_to_feed_show_time", (Long) 0L);
    public static final b<Boolean> ae = new b<>("live_game_quit_click", (Boolean) false);
    public static final b<Boolean> af = new b<>("live_share_get_diamonds_tip", (Boolean) true);
    public static final b<Integer> ag = new b<>("live_game_msg_state", (Integer) 0);
    public static final b<Boolean> ah = new b<>("live_game_comment_msg_push", (Boolean) true);
    public static final b<Boolean> ai = new b<>("live_game_gift_msg_push", (Boolean) true);
    public static final b<Boolean> aj = new b<>("live_anchor_show_fans_club_push", (Boolean) false);
    public static final b<Boolean> ak = new b<>("live_anchor_show_fans_club_auto_light_4_anchor_push", (Boolean) false);
    public static final b<Boolean> al = new b<>("live_anchor_show_fans_club_auto_light_4_audience_push", (Boolean) false);
    public static final b<Boolean> am = new b<>("gesture_magic_guide_flag", (Boolean) true);
    public static final b<Map<String, Boolean>> an = new b<>("gesture_magic_guide_v2", new HashMap());
    public static final b<Boolean> ao = new b<>("gesture_magic_switch", (Boolean) true);
    public static final b<Boolean> ap = new b<>("gesture_magic_switch_v2", (Boolean) false);
    public static final b<Map<String, String>> aq = new b<>("gesture_magic_old_select_composer_path_map", new HashMap());
    public static final b<Map<String, List<String>>> ar = new b<>("gesture_magic_select_composer_path_map", new HashMap());
    public static final b<Map<String, Map<String, Float>>> as = new b<>("live_composer_save_node_tag_value", new HashMap());
    public static final b<Integer> at = new b<>("current_sticker_page_position", (Integer) 0);
    public static final b<Boolean> au = new b<>("show_backpack_tips", (Boolean) true);
    public static final b<Boolean> av = new b<>("vigo_show_start_live_flame_tip", (Boolean) true);
    public static final b<Integer> aw = new b<>("vigo_show_end_live_flame_tip_count", (Integer) 0);
    public static final b<Boolean> ax = new b<>("package_purchase_showed", (Boolean) false);
    public static final b<String> ay = new b<>("last_pay_channel", "");
    public static final b<Boolean> az = new b<>("recharge_dialog_balance_change_tip_shown", (Boolean) false);

    /* renamed from: b  reason: collision with root package name */
    public static final b<Set<String>> f14008b = new b<>("gift_list_type", new HashSet());
    public static final b<Boolean> bA = new b<>("live_show_moderator_setting_red_dot", (Boolean) true);
    public static final b<Boolean> bB = new b<>("live_subscribe_chat_only_switch", (Boolean) false);
    public static final b<Boolean> bC = new b<>("live_subscribe_show_preview_reddot", (Boolean) true);
    public static final b<Boolean> bD = new b<>("live_sucscribe_finished_guide", (Boolean) false);
    public static final b<Boolean> bE = new b<>("live_subscribe_first_get_qualification", (Boolean) true);
    public static final b<Boolean> bF = new b<>("live_show_admin_setting_red_dot", (Boolean) true);
    public static final b<Boolean> bG = new b<>("live_show_comment_setting_red_dot", (Boolean) true);
    public static final b<Boolean> bH = new b<>("live_show_preview_setting_red_dot", (Boolean) true);
    public static final b<Boolean> bI = new b<>("live_show_preview_temporary_mute_setting_update_dialog", (Boolean) true);
    public static final b<Boolean> bJ = new b<>("live_show_preview_temporary_mute_setting_red_dot", (Boolean) true);
    public static final b<Boolean> bK = new b<>("live_show_manage_temporary_mute_setting_red_dot", (Boolean) true);
    public static final b<Long> bL = new b<>("live_show_room_default_temporary_mute_duration", (Long) Long.MIN_VALUE);
    public static final b<LongSparseArray<String>> bM = new b<>("send_gift_group_count", new LongSparseArray());
    public static final b<LongSparseArray<String>> bN = new b<>("send_prop_group_count", new LongSparseArray());
    public static final b<Boolean> bO = new b<>("official_danmu_enable", (Boolean) true);
    public static final b<Boolean> bP = new b<>("official_gift_enable", (Boolean) true);
    public static final b<Boolean> bQ = new b<>("show_live_replay_prompt", (Boolean) true);
    public static final b<Boolean> bR = new b<>("anchor_comments_enable", (Boolean) true);
    public static final b<Boolean> bS = new b<>("anchor_is_receive_link", (Boolean) true);
    public static final b<Boolean> bT = new b<>("anchor_is_suggested_to_another_anchor", (Boolean) false);
    public static final b<Boolean> bU = new b<>("link_mic_battle_has_show_guide", (Boolean) false);
    public static final b<Boolean> bV = new b<>("link_mic_battle_has_show_invite_pop_tip", (Boolean) false);
    public static final b<Boolean> bW = new b<>("link_mic_battle_has_anchor_show_rule_pop_tip", (Boolean) false);
    public static final b<Boolean> bX = new b<>("link_mic_battle_has_audience_show_rule_pop_tip", (Boolean) false);
    public static final b<List<Double>> bY = new b<>("rankdom_linkmic_ quickly_disconnected_record", new ArrayList());
    public static final b<Integer> bZ = new b<>("random_linkmic_time", "random_linkmic_time", 0);
    public static final b<Long> ba = new b<>("live_last_punishment_time", (Long) 0L);
    public static final b<Integer> bb = new b<>("duty_gift_last_rules", (Integer) 0);
    public static final b<String> bc = new b<>("last_first_quit_anchor_dialog", "");
    public static final b<String> bd = new b<>("last_first_more_anchor_guide", "");
    public static final b<Integer> be = new b<>("join_fans_comment_guide_times", (Integer) 0);
    public static final b<Long> bf = new b<>("latest_show_join_fans_comment_time", (Long) 0L);
    public static final b<Boolean> bg = new b<>("has_show_live_long_press_clear_screen_tips", (Boolean) false);
    public static final b<Boolean> bh = new b<>("has_slide_to_exit_room", (Boolean) false);
    public static final b<Integer> bi = new b<>("starlight_anim_guide_count", (Integer) 0);
    public static final b<Integer> bj = new b<>("starlight_text_guide_count", (Integer) 0);
    public static final b<Integer> bk = new b<>("hotsoon_wallet_page_guide_shown", (Integer) 0);
    public static final b<String> bl = new b<>("live_group_toolbar_red_dot_local", "");
    public static final b<Boolean> bm = new b<>("show_gift_toolbar_red_dot", (Boolean) false);
    public static final b<Boolean> bn = new b<>("click_gift_toolbar_red_dot", (Boolean) false);
    public static final b<Boolean> bo = new b<>("show_gift_dialog_prop_red_dot", (Boolean) false);
    public static final b<Boolean> bp = new b<>("has_shown_send_red_packet", (Boolean) false);
    public static final b<Boolean> bq = new b<>("official_task_packet_animation", (Boolean) false);
    public static final b<Boolean> br = new b<>("has_show_koi_play_description", (Boolean) false);
    public static final b<Set<String>> bs = new b<>("star_room_open_red_packet_rooms", new HashSet());
    public static final b<Set<String>> bt = new b<>("star_room_open_red_packet_uids", new HashSet());
    public static final b<Boolean> bu = new b<>("has_play_gift_failure_on_mediaplayer", (Boolean) false);
    public static final b<Boolean> bv = new b<>("has_shown_portal_gift_guide", (Boolean) false);
    public static final b<Boolean> bw = new b<>("manage_button_tips_show", (Boolean) true);
    public static final b<Boolean> bx = new b<>("block_word_pannel_tips_show", (Boolean) true);
    public static final b<Boolean> by = new b<>("live_show_preview_setting_update_dialog", (Boolean) true);
    public static final b<Boolean> bz = new b<>("live_show_preview_moderator_setting_red_dot", (Boolean) true);

    /* renamed from: c  reason: collision with root package name */
    public static final b<Set<String>> f14009c = new b<>("gift_urls", new HashSet());
    public static final b<Boolean> cA = new b<>("live_first_open_props_dialog_in_broadcast", (Boolean) true);
    public static final b<Long> cB = new b<>("live_finish_page_push_tip_time", (Long) 0L);
    public static final b<Integer> cC = new b<>("live_finish_page_push_tip_count", (Integer) 0);
    public static final b<Boolean> cD = new b<>("live_jsb_show_exchange_dialog", (Boolean) true);
    public static final b<Boolean> cE = new b<>("live_show_exchange_red_dot", (Boolean) true);
    public static final b<Integer> cF = new b<>("live_ug_exchange_click_cancel_count", (Integer) 0);
    public static final b<Integer> cG = new b<>("live_gifts_exchange_click_cancel_count", (Integer) 0);
    public static final b<Integer> cH = new b<>("live_has_exchange_gift_success", (Integer) 0);
    public static final b<Boolean> cI = new b<>("live_show_turn_on_auto_exchange_dialog", (Boolean) true);
    public static final b<Boolean> cJ = new b<>("live_center_lottie_guide_animation", (Boolean) true);
    public static final b<Boolean> cK = new b<>("live_center_lottie_guide_right_animation", (Boolean) true);
    public static final b<Boolean> cL = new b<>("live_intro_preview_setting_entrance", (Boolean) true);
    public static final b<Boolean> cM = new b<>("live_intro_broadcast  _setting_entrance", (Boolean) true);
    public static final b<Map<String, String>> cN = new b<>(u.a().b().c() + "_broadcast_live_game_category_last_select_game", new HashMap());
    public static final b<Map<String, String>> cO = new b<>("broadcast_fetched_game_tag", new HashMap());
    public static final b<Boolean> cP = new b<>("obs_screen_live_audience_click_definition_selection", (Boolean) false);
    public static final b<Map<String, String>> cQ = new b<>("obs_screen_live_audience_manually_select_sdk_key", new HashMap());
    public static final b<Map<String, String>> cR = new b<>("screen_live_broadcast_manually_select_sdk_key", new HashMap());
    public static final b<Long> cS = new b<>("live_filter_change_time", (Long) -1L);
    public static final b<Map<String, Double>> cT = new b<>("live_filter_level_map", new HashMap());
    public static final b<Boolean> cU = new b<>("live_multi_live_guest_click_beauty_tips", (Boolean) false);
    public static final b<Boolean> cV = new b<>("live_multi_live_anchor_settings_prompt_shown", (Boolean) false);
    public static final b<Boolean> cW = new b<>("live_multi_live_anchor_settings_bubble_shown", (Boolean) false);
    public static final b<Boolean> ca = new b<>("has_click_random_linkmic_entrance_when_ban", (Boolean) false);
    public static final b<Boolean> cb = new b<>("link_mic_battle_open_gift_guide_not_show_again", (Boolean) false);
    public static final b<Boolean> cc = new b<>("link_mic_battle_task_open_gift_toast", (Boolean) false);
    public static final b<Boolean> cd = new b<>("anchor_show_qa_tutorial", (Boolean) true);
    public static final b<Boolean> ce = new b<>("admin_show_qa_tutorial", (Boolean) true);
    public static final b<Boolean> cf = new b<>("anchor_first_turn_qa", (Boolean) true);
    public static final b<Boolean> cg = new b<>("anchor_first_answer", (Boolean) true);
    public static final b<Boolean> ch = new b<>("anchor_first_switch_question", (Boolean) true);
    public static final b<Boolean> ci = new b<>("anchor_has_show_open_suggested_switch_message", (Boolean) false);
    public static final b<Boolean> cj = new b<>("anchor_is_receive_linkmic_invitation_this_live", (Boolean) true);
    public static final b<Boolean> ck = new b<>("anchor_should_open_guest_linkmic_when_start", (Boolean) true);
    public static final b<Boolean> cl = new b<>("should_show_battle_rule_guide_message", (Boolean) true);
    public static final b<String> cm = new b<>("live_broadcast_game_category", "");
    public static final b<Boolean> cn = new b<>("live_category_bubble_guide_show", (Boolean) false);
    public static final b<Boolean> co = new b<>("live_game_float_first_show", (Boolean) true);
    public static final b<Boolean> cp = new b<>("live_game_msg_first_snapped", (Boolean) true);
    public static final b<Integer> cq = new b<>("live_game_msg_state", (Integer) 0);
    public static final b<Boolean> cr = new b<>("live_pip_switcher_open", (Boolean) false);
    public static final b<Boolean> cs = new b<>("live_pip_guide_dialog_has_shown", (Boolean) false);
    public static final b<Boolean> ct = new b<>("live_game_latest_set_landscape", (Boolean) true);
    public static final b<Integer> cu = new b<>("live_last_set_game", (Integer) 0);
    public static final b<Boolean> cv = new b<>("live_first_add_hashtag_in_preview", (Boolean) true);
    public static final b<Boolean> cw = new b<>("live_first_open_hashtag_dialog_in_broadcast", (Boolean) true);
    public static final b<Long> cx = new b<>("live_hashtag_id", (Long) 0L);
    public static final b<String> cy = new b<>("live_hashtag_name", "none");
    public static final b<Boolean> cz = new b<>("live_has_ever_use_hashtag", (Boolean) false);

    /* renamed from: d  reason: collision with root package name */
    public static final b<String> f14010d = new b<>("assets_cache_data", "");

    /* renamed from: e  reason: collision with root package name */
    public static final b<String> f14011e = new b<>("disk_present_assets_cache_data", "");

    /* renamed from: f  reason: collision with root package name */
    public static final b<String> f14012f = new b<>("assets_cache_data_last_download_time", "");

    /* renamed from: g  reason: collision with root package name */
    public static final b<Long> f14013g = new b<>("assets_cache_last_check_time", (Long) 0L);

    /* renamed from: h  reason: collision with root package name */
    public static final b<Integer> f14014h = new b<>("live_broadcast_room_type", (Integer) 0);

    /* renamed from: i  reason: collision with root package name */
    public static final b<Integer> f14015i = new b<>("live_camera_type", (Integer) 1);

    /* renamed from: j  reason: collision with root package name */
    public static final b<Boolean> f14016j = new b<>("live_media_camera_mirror", (Boolean) false);

    /* renamed from: k  reason: collision with root package name */
    public static final b<String> f14017k = new b<>("live_resource_current_version", "");

    /* renamed from: l  reason: collision with root package name */
    public static final b<Integer> f14018l = new b<>("live_interact_pk_clean_total_count", (Integer) 5);

    /* renamed from: m  reason: collision with root package name */
    public static final b<Integer> f14019m = new b<>("live_interact_pk_total_num", (Integer) 5);
    public static final b<String> n = new b<>("live_interact_pk_clean_date", "");
    public static final b<Boolean> o = new b<>("live_interact_pk_clean_tip", (Boolean) true);
    public static final b<Boolean> p = new b<>("live_interact_pk_steal_tower_tip", (Boolean) true);
    public static final b<Integer> q = new b<>("live_interact_pk_tip_show_num", (Integer) 0);
    public static final b<String> r = new b<>("live_interact_pk_tip_show_date", "");
    public static final b<Long> s = new b<>("live_prop_expire_tip_time", (Long) 0L);
    public static final b<String> t = new b<>("last_share_channel", "");
    public static final b<Boolean> u = new b<>("first_enter_live_start", (Boolean) true);
    public static final b<Long> v = new b<>("current_room_id", (Long) 0L);
    public static final b<Long> w = new b<>("current_room_start_time", (Long) 0L);
    public static final b<Long> x = new b<>("current_preview_start_time", (Long) 0L);
    public static final b<Long> y = new b<>("live_last_active_time", (Long) 0L);
    public static final b<Long> z = new b<>("live_stream_video_capture_last_time", (Long) 0L);

    static {
        Covode.recordClassIndex(7770);
        Float valueOf = Float.valueOf(-1.0f);
        P = new b<>("brightening_param_v2", valueOf);
        Q = new b<>("beauty_skin_param_v2", valueOf);
        R = new b<>("big_eyes_param", valueOf);
        S = new b<>("face_lift_param", valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        X = new b<>("barrage_alpha", valueOf2);
        Y = new b<>("barrage_size", valueOf2);
    }
}
