package com.ss.android.ugc.playerkit.exp;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.NativeBitrateSelectConfig;
import h.h;
import h.i;
import h.m;
import java.lang.reflect.Type;

public final class b {
    private static final h A = c.b("cold_boot_video_url_select_enable", false);
    private static final h B = c.b("cold_boot_video_force_h264", false);
    private static final h C = c.b("cold_boot_video_precreate_decoder", false);
    private static final h D = c.b("cold_boot_video_specific_preload_size", 0);
    private static final h E = c.b("cold_boot_preload_add_media_delay", false);
    private static final h F = c.b("cold_boot_video_playtime_lost_fix", false);
    private static final h G = c.b("cold_boot_play_session_create_after_launch", -1);
    private static final h H = c.b("origin_splash_ad_prerender_after_launch", -1);
    private static final h I = c.b("player_setting_update_audio_addr_when_player_reset", false);
    private static final h J = c.b("engine_reuse_restrict_decode_type", false);
    private static final h K = c.b("engine_reuse_opt_codec_adjust_v2", 0);
    private static final h L = c.b("engine_reuse_device_self_adaptive", false);
    private static final h M = c.a("engine_reuse_opt_codec_adjust", false);
    private static final h N = c.b("cold_boot_video_disable_texture_render", false);
    private static final h O = c.b("player_setting_progress_clear_old_msg_before_new_msg", false);
    private static final h P = c.b("player_setting_save_last_player_config", false);
    private static final h Q = c.b("player_setting_disable_engine_info_log_config", false);
    private static final h R = c.b("player_setting_enable_odd_opt", false);
    private static final h S = c.b("player_setting_min_progress_interval", -1);
    private static final h T = c.b("call_start_after_surface_when_start_without_surface", false);
    private static final h U = c.b("player_set_native_thread_pool_stack_size", 0);
    private static final h V = c.b("enable_use_new_get_cache_method", false);
    private static final h W = c.b("enable_handler_use_asynchronous_msg", false);

    /* renamed from: a  reason: collision with root package name */
    public static final h f148667a = c.a("player_setting_only_select_bitrate_once", false);

    /* renamed from: b  reason: collision with root package name */
    public static final h f148668b = c.b("player_set_surface_by_msg", false);

    /* renamed from: c  reason: collision with root package name */
    public static final h f148669c = c.a("player_sleep_callback_retain", false);

    /* renamed from: d  reason: collision with root package name */
    public static final h f148670d = c.b("player_sleep_release_background_session", false);

    /* renamed from: e  reason: collision with root package name */
    public static final h f148671e = c.b("player_impl_prepare_custom_exception_report", 0);

    /* renamed from: f  reason: collision with root package name */
    public static final h f148672f = c.b("cold_boot_video_url_select_strategy", 0);

    /* renamed from: g  reason: collision with root package name */
    public static final h f148673g = c.b("play_auth_verify_restore_for_test", false);

    /* renamed from: h  reason: collision with root package name */
    public static final h f148674h = c.b("sc_preload_sequence_single_thread", false);

    /* renamed from: i  reason: collision with root package name */
    public static final h f148675i = c.b("sc_preload_sequence_single_thread_priority", 0);

    /* renamed from: j  reason: collision with root package name */
    public static final h f148676j = c.b("engine_reuse_restrict_video_width_diff", 0);

    /* renamed from: k  reason: collision with root package name */
    public static final h f148677k = c.b("engine_reuse_restrict_video_height_diff", 0);

    /* renamed from: l  reason: collision with root package name */
    public static final h f148678l = c.b("engine_reuse_opt_codec_adjust_v3", false);

    /* renamed from: m  reason: collision with root package name */
    public static final h f148679m = c.b("player_setting_enable_brightness_info", false);
    public static final h n = c.b("mediacodec_capability_report_times", 0);
    public static final h o = c.b("player_first_prerender_video_set_surface_early", false);
    public static final h p = c.b("enable_use_custom_orderly_main_handler", false);
    public static final b q = new b();
    private static final h r = i.a(m.SYNCHRONIZED, a.f148680a);
    private static final h s = c.b("open_crop_sr", false);
    private static final h t = c.b("use_540_for_low_device", false);
    private static final h u = c.b("bitrate_for_low_device", 540);
    private static final h v = c.b("open_sr_opt_for_mali", false);
    private static final h w = c.b("enable_audio_focus_when_play", false);
    private static final h x = c.b("delay_sr_init", false);
    private static final h y;
    private static final h z = c.a("player_x_pcdn_min_cache", "");

    public static boolean a() {
        return ((Boolean) s.getValue()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) t.getValue()).booleanValue();
    }

    public static int c() {
        return ((Number) u.getValue()).intValue();
    }

    public static boolean d() {
        return ((Boolean) v.getValue()).booleanValue();
    }

    public static boolean e() {
        return ((Boolean) w.getValue()).booleanValue();
    }

    public static NativeBitrateSelectConfig f() {
        return (NativeBitrateSelectConfig) y.getValue();
    }

    public static a<String> g() {
        return (a) z.getValue();
    }

    public static boolean h() {
        return ((Boolean) A.getValue()).booleanValue();
    }

    public static boolean i() {
        return ((Boolean) B.getValue()).booleanValue();
    }

    public static boolean j() {
        return ((Boolean) C.getValue()).booleanValue();
    }

    public static boolean k() {
        return ((Boolean) I.getValue()).booleanValue();
    }

    public static boolean l() {
        return ((Boolean) J.getValue()).booleanValue();
    }

    public static int m() {
        return ((Number) K.getValue()).intValue();
    }

    public static a<Boolean> n() {
        return (a) M.getValue();
    }

    public static boolean o() {
        return ((Boolean) O.getValue()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) Q.getValue()).booleanValue();
    }

    public static boolean q() {
        return ((Boolean) R.getValue()).booleanValue();
    }

    public static int r() {
        return ((Number) S.getValue()).intValue();
    }

    public static Boolean s() {
        return (Boolean) T.getValue();
    }

    public static int t() {
        return ((Number) U.getValue()).intValue();
    }

    public static boolean u() {
        return ((Boolean) V.getValue()).booleanValue();
    }

    public static boolean v() {
        return ((Boolean) W.getValue()).booleanValue();
    }

    private b() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<a<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f148680a = new a();

        static {
            Covode.recordClassIndex(97981);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a<Integer> invoke() {
            return new a("player_setting_test", (Type) Integer.class, (Object) 0);
        }
    }

    static {
        Covode.recordClassIndex(97980);
        Boolean.valueOf(false);
        Boolean.valueOf(true);
        Integer.valueOf(540);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(false);
        NativeBitrateSelectConfig nativeBitrateSelectConfig = new NativeBitrateSelectConfig(false, false, 0);
        new NativeBitrateSelectConfig(false, false, 0);
        y = c.b("native_bitrate_select_config", nativeBitrateSelectConfig);
        Boolean.valueOf(true);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(-1);
        Integer.valueOf(-1);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Integer.valueOf(-1);
        Boolean.valueOf(true);
        Integer.valueOf(0);
        Boolean.valueOf(true);
        Integer.valueOf(0);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
    }
}
