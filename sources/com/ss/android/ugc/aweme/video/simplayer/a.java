package com.ss.android.ugc.aweme.video.simplayer;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.webkit.CookieManager;
import com.bytedance.common.utility.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.player.ab.abs.VolumeBalanceData;
import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData;
import com.ss.android.ugc.aweme.player.c;
import com.ss.android.ugc.aweme.player.e;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import com.ss.android.ugc.aweme.video.b.ad;
import com.ss.android.ugc.aweme.video.b.ae;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.b.w;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.util.BothHWDecDeviceList;
import com.ss.android.ugc.playerkit.model.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static g f143829a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f143830b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f143831c = false;

    static {
        Covode.recordClassIndex(94130);
    }

    private static String a(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        IOException e2;
        MethodCollector.i(12543);
        InputStream inputStream2 = null;
        try {
            inputStream = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                b.a(inputStream);
                MethodCollector.o(12543);
                return str2;
            } catch (IOException e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    b.a(inputStream);
                    MethodCollector.o(12543);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    b.a(inputStream2);
                    MethodCollector.o(12543);
                    throw th;
                }
            }
        } catch (IOException e4) {
            e2 = e4;
            inputStream = null;
            e2.printStackTrace();
            b.a(inputStream);
            MethodCollector.o(12543);
            return null;
        } catch (Throwable th3) {
            th = th3;
            b.a(inputStream2);
            MethodCollector.o(12543);
            throw th;
        }
    }

    public static m a(m.e eVar, boolean z, boolean z2) {
        boolean z3;
        BothHWDecDeviceList bothHWDecDeviceList;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i3;
        boolean z13;
        boolean z14;
        int i4;
        m mVar = new m();
        mVar.f148755b = eVar;
        mVar.f148754a = d.a();
        if (eVar == m.e.Ijk || eVar == m.e.IjkHardware) {
            mVar.f148757d = b.f143843a;
        } else if (eVar == m.e.TT || eVar == m.e.TT_IJK_ENGINE || eVar == m.e.TT_HARDWARE) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseArray sparseArray = new SparseArray();
            sparseIntArray.put(80, q.a() ? 1 : 0);
            sparseIntArray.put(53, com.bytedance.ies.abmock.b.a().a(true, "mtk_hardware_decode_opt_height_limit", -1));
            sparseIntArray.put(54, com.bytedance.ies.abmock.b.a().a(true, "mtk_hardware_decode_opt_choose_device_limit", 0));
            sparseIntArray.put(1, z ? 1 : 0);
            sparseIntArray.put(55, com.bytedance.ies.abmock.b.a().a(true, "enable_native_yv12_render", 0));
            sparseIntArray.put(57, com.bytedance.ies.abmock.b.a().a(true, "file_play_no_buffering", 0));
            sparseIntArray.put(82, com.bytedance.ies.abmock.b.a().a(true, "player_pre_render_buffering_update", 0));
            sparseIntArray.put(83, com.bytedance.ies.abmock.b.a().a(true, "player_pre_render_buffering_update_percentage", 90));
            sparseIntArray.put(58, com.bytedance.ies.abmock.b.a().a(true, "no_buffering_update", 0));
            sparseIntArray.put(61, com.bytedance.ies.abmock.b.a().a(true, "player_position_update_interval", 0));
            sparseIntArray.put(60, com.bytedance.ies.abmock.b.a().a(true, "enable_clip_heaacv2_first_ptspkt", 0));
            sparseIntArray.put(71, com.bytedance.ies.abmock.b.a().a(true, "player_enable_opt_subload_time", 1));
            sparseIntArray.put(81, com.bytedance.ies.abmock.b.a().a(true, "player_mdl_seek_reopen", 0));
            sparseIntArray.put(84, com.bytedance.ies.abmock.b.a().a(true, "player_heaavv2_pts_ms_correction", 0));
            sparseIntArray.put(85, com.bytedance.ies.abmock.b.a().a(true, "player_enable_vc1_block_list", 1));
            sparseIntArray.put(86, com.bytedance.ies.abmock.b.a().a(true, "player_mtkhip_skip_adaptive", 0));
            sparseIntArray.put(64, com.bytedance.ies.abmock.b.a().a(true, "player_feed_packet_unitil_empty", 0));
            int a2 = com.bytedance.ies.abmock.b.a().a(true, "player_enable_volume_balance", 0);
            sparseIntArray.put(28, a2);
            if (a2 == 1) {
                try {
                    VolumeBalanceData volumeBalanceData = (VolumeBalanceData) com.bytedance.ies.abmock.b.a().a(true, "player_volume_balance_data", VolumeBalanceData.class);
                    if (volumeBalanceData == null) {
                        volumeBalanceData = new VolumeBalanceData();
                    }
                    sparseArray.put(29, Float.valueOf(volumeBalanceData.getPregain()));
                    sparseArray.put(30, Float.valueOf(volumeBalanceData.getThreshold()));
                    sparseArray.put(31, Float.valueOf(volumeBalanceData.getRatio()));
                    sparseArray.put(32, Float.valueOf(volumeBalanceData.getPredelay()));
                } catch (Throwable unused) {
                }
            }
            com.ss.android.ugc.aweme.player.ab.b bVar = null;
            if (com.bytedance.ies.abmock.b.a().a(true, "player_global_force_soft_decode", 0) == 1) {
                sparseIntArray.put(17, 0);
                sparseIntArray.put(16, 0);
            } else {
                try {
                    if (com.bytedance.ies.abmock.b.a().a(false, "player_enable_hw_dec_fix_list_decode", 1) == 1) {
                        if (f143830b == null) {
                            String a3 = a(d.a(), "player/hwdec.json");
                            if (a3 == null || (bothHWDecDeviceList = (BothHWDecDeviceList) new f().a(a3, BothHWDecDeviceList.class)) == null || bothHWDecDeviceList.deviceList == null || !bothHWDecDeviceList.deviceList.contains(Build.MODEL.toLowerCase())) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            f143830b = Boolean.valueOf(z3);
                        }
                        if (f143830b.booleanValue()) {
                            sparseIntArray.put(17, 1);
                            sparseIntArray.put(16, 1);
                            mVar.b();
                            mVar.a();
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.ss.android.ugc.aweme.player.ab.a a4 = o.a();
                if (a4 != null) {
                    sparseIntArray.put(17, a4.f115011c);
                    sparseIntArray.put(16, a4.f115010b);
                    if (a4.f115011c == 1) {
                        mVar.b();
                    }
                    if (a4.f115010b == 1) {
                        mVar.a();
                    }
                } else if (eVar == m.e.TT_HARDWARE) {
                    mVar.a();
                    mVar.b();
                }
            }
            sparseIntArray.put(2, 1);
            int i5 = 1000;
            try {
                i5 = com.bytedance.ies.abmock.b.a().a(true, "player_buffer_data_time", 1000);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            sparseIntArray.put(41, com.bytedance.ies.abmock.b.a().a(true, "enable_player_delay_buffing_update", 1));
            sparseIntArray.put(3, i5);
            sparseIntArray.put(4, com.bytedance.ies.abmock.b.a().a(true, "player_max_buffer_time", 5000));
            sparseIntArray.put(5, com.bytedance.ies.abmock.b.a().a(true, "enable_player_log", 1));
            if (q.b() == w.f143335c) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            sparseIntArray.put(15, i2);
            if (e.f115088a) {
                sparseIntArray.put(6, 1);
            }
            if (!z) {
                Boolean c2 = SharePrefCache.inst().getEableUltraResolution().c();
                Boolean c3 = SharePrefCache.inst().isInUltraResBlackList().c();
                if (!(c2 == null || !c2.booleanValue() || c3 == null)) {
                    c3.booleanValue();
                }
            }
            if (com.bytedance.ies.abmock.b.a().a(true, "ttplayer_is_ipc", 0) == ae.f143274a) {
                sparseIntArray.put(0, 1);
            }
            if (com.bytedance.ies.abmock.b.a().a(true, "ttplayer_use_sys_audio_codec", 0) == ad.f143272a) {
                sparseIntArray.put(18, 1);
            }
            try {
                bVar = (com.ss.android.ugc.aweme.player.ab.b) com.bytedance.ies.abmock.b.a().a(false, "player_unified_ab_config", com.ss.android.ugc.aweme.player.ab.b.class);
            } catch (Throwable unused3) {
            }
            if (bVar == null) {
                bVar = new com.ss.android.ugc.aweme.player.ab.b();
            }
            sparseIntArray.put(23, bVar.f115046a);
            sparseIntArray.put(24, bVar.f115047b);
            sparseIntArray.put(26, bVar.f115048c);
            sparseIntArray.put(27, bVar.f115049d);
            try {
                if (com.bytedance.ies.abmock.b.a().a(true, "player_enable_buffer_config", 0) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                mVar.O = z5;
                if (z5) {
                    m.a aVar = new m.a();
                    try {
                        PlayeAbBufferConfigData playeAbBufferConfigData = (PlayeAbBufferConfigData) com.bytedance.ies.abmock.b.a().a(true, "player_buffer_config_data", PlayeAbBufferConfigData.class);
                        if (playeAbBufferConfigData != null) {
                            aVar.f148771e = playeAbBufferConfigData.getNetBlockDurationInitial();
                            aVar.f148769c = playeAbBufferConfigData.getNetBlockDurationMax();
                            aVar.f148770d = playeAbBufferConfigData.getNetBlockIncFactor();
                            aVar.f148767a = playeAbBufferConfigData.getInteractionBlockDurationPreloaded();
                            aVar.f148768b = playeAbBufferConfigData.getInteractionBlockDurationNonPreloaded();
                            aVar.f148772f = playeAbBufferConfigData.getExpType();
                        }
                    } catch (Throwable unused4) {
                    }
                    mVar.N = aVar;
                }
                if (com.bytedance.ies.abmock.b.a().a(true, "player_enable_reuse_mtk_hw_workaround", 0) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                mVar.A = z6;
                sparseIntArray.put(33, com.bytedance.ies.abmock.b.a().a(true, "player_option_cache", 15));
                sparseIntArray.put(34, com.bytedance.ies.abmock.b.a().a(false, "player_reuse_engine", 0));
                sparseIntArray.put(51, com.bytedance.ies.abmock.b.a().a(false, "player_reset_when_stop", 0));
                sparseIntArray.put(52, com.bytedance.ies.abmock.b.a().a(false, "player_force_close_codec", 0));
                sparseIntArray.put(40, com.bytedance.ies.abmock.b.a().a(true, "disable_player_logv2_async", 0));
                m.b bVar2 = new m.b();
                bVar2.f148775c = com.bytedance.ies.abmock.b.a().a(true, "player_dash_video_range", 1048576);
                bVar2.f148776d = com.bytedance.ies.abmock.b.a().a(true, "player_dash_audio_range", 409600);
                bVar2.f148777e = com.bytedance.ies.abmock.b.a().a(true, "player_skip_find_stream_info", 1);
                bVar2.f148778f = com.bytedance.ies.abmock.b.a().a(true, "player_dash_enable_hijack", 1);
                bVar2.f148779g = com.bytedance.ies.abmock.b.a().a(true, "player_dash_hijack_main_dns", 2);
                bVar2.f148780h = com.bytedance.ies.abmock.b.a().a(true, "player_dash_hijack_backup_dns", 0);
                bVar2.f148781i = com.bytedance.ies.abmock.b.a().a(true, "player_dash_403_fallback", 0);
                bVar2.f148782j = com.bytedance.ies.abmock.b.a().a(true, "player_dash_range_mode", 2);
                bVar2.f148783k = com.bytedance.ies.abmock.b.a().a(true, "player_dash_video_time_range", 5000);
                bVar2.f148784l = com.bytedance.ies.abmock.b.a().a(true, "player_dash_audio_time_range", 10000);
                bVar2.f148785m = com.bytedance.ies.abmock.b.a().a(true, "player_dash_read_mode", 0);
                bVar2.p = com.bytedance.ies.abmock.b.a().a(true, "player_mp4_bash_read_mode", 0);
                bVar2.o = com.bytedance.ies.abmock.b.a().a(true, "player_mp4_bash_video_range", 0);
                bVar2.n = com.bytedance.ies.abmock.b.a().a(true, "player_mp4_bash_range_mode", 0);
                if (com.bytedance.ies.abmock.b.a().a(true, "player_get_cookie_lazy_enable", 0) == 1) {
                    mVar.f148763j = new m.d() {
                        /* class com.ss.android.ugc.aweme.video.simplayer.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(94131);
                        }

                        @Override // com.ss.android.ugc.playerkit.model.m.d
                        public final Map<String, String> b() {
                            return com.ss.android.token.d.a(com.ss.android.c.b.f59137a);
                        }

                        @Override // com.ss.android.ugc.playerkit.model.m.d
                        public final String a() {
                            return CookieManager.getInstance().getCookie(com.ss.android.c.b.f59137a);
                        }
                    };
                } else {
                    String cookie = CookieManager.getInstance().getCookie(com.ss.android.c.b.f59137a);
                    Map<String, String> a5 = com.ss.android.token.d.a(com.ss.android.c.b.f59137a);
                    m.c cVar = new m.c();
                    cVar.f148786a = cookie;
                    cVar.f148787b = a5;
                    mVar.f148764k = cVar;
                }
                if (com.bytedance.ies.abmock.b.a().a(true, "player_enable_bash_mp4", 0) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                mVar.t = z7;
                if (com.bytedance.ies.abmock.b.a().a(true, "player_use_codecpool", 0) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z8 || !z9) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mVar.f148762i = z10;
                mVar.v = com.bytedance.ies.abmock.b.a().a(true, "player_enable_native_thread_pool", 1);
                if (com.bytedance.ies.abmock.b.a().a(true, "player_engine_use_ttnet", 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mVar.o = z11;
                mVar.f148760g = bVar2;
                if (com.bytedance.ies.abmock.b.a().a(true, "player_use_v2_report_block", 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                mVar.f148765l = z12;
                mVar.f148766m = com.bytedance.ies.abmock.b.a().a(true, "player_enable_seek_end", 1);
                if (c.h()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                mVar.z = i3;
                mVar.n = com.bytedance.ies.abmock.b.a().a(true, "player_enable_hardware_decode_skip_nonref", 0);
                mVar.u = com.bytedance.ies.abmock.b.a().a(true, "player_vendor_frc_level", 0);
                mVar.q = com.bytedance.ies.abmock.b.a().a(true, "player_enable_post_prepare", 0);
                mVar.r = com.bytedance.ies.abmock.b.a().a(true, "player_enable_stop_async", 0);
                mVar.p = com.bytedance.ies.abmock.b.a().a(true, "player_option_abr_cache", 60);
                mVar.w = com.bytedance.ies.abmock.b.a().a(true, "player_prerender_fix_range", 512000);
                if (com.bytedance.ies.abmock.b.a().a(true, "player_use_native_render_soft_decode", 0) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                mVar.x = z13;
                if (f143829a == null) {
                    f143829a = new o(com.bytedance.ies.ugc.aweme.network.ext.a.a(com.a.a("https://%s/", new Object[]{"tiktokv.com"})));
                }
                mVar.s = f143829a;
                mVar.E = com.bytedance.ies.abmock.b.a().a(true, "player_sr_max_width", 720);
                mVar.F = com.bytedance.ies.abmock.b.a().a(true, "player_sr_max_height", 1280);
                mVar.I = com.bytedance.ies.abmock.b.a().a(true, "player_sr_ignore_resolution_limit", false);
                if (1 == com.bytedance.ies.abmock.b.a().a(true, "surface_lifecycle_notification_enabled", 0)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                mVar.G = z14;
                if (com.bytedance.ies.abmock.b.a().a(true, "super_resolution_strategy", com.ss.android.ugc.aweme.simkit.model.b.a.class) != null) {
                    if (z2) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    sparseIntArray.put(42, i4);
                    sparseIntArray.put(45, com.bytedance.ies.abmock.b.a().a(true, "player_super_resolution_algorithm_type", 1));
                }
                sparseIntArray.put(48, com.bytedance.ies.abmock.b.a().a(true, "preload_pcdn_first_frame_go_cdn_size", 0));
                sparseIntArray.put(49, com.bytedance.ies.abmock.b.a().a(true, "player_enable_heart_beat", 0));
                sparseIntArray.put(50, com.bytedance.ies.abmock.b.a().a(true, "player_enable_heart_beat_interval", 300));
            } catch (Throwable th) {
                com.bytedance.c.a.a.a.b.a(th);
            }
            mVar.J = com.bytedance.ies.abmock.b.a().a(true, "video_codec_buffer_stack_size", 0);
            mVar.L = com.bytedance.ies.abmock.b.a().a(true, "audio_codec_buffer_stack_size", 0);
            mVar.K = com.bytedance.ies.abmock.b.a().a(true, "audio_filter_stack_size", 0);
            if (1 == com.bytedance.ies.abmock.b.a().a(false, "player_render_prepare_enabled", 1)) {
                z4 = true;
            } else {
                z4 = false;
            }
            mVar.H = z4;
            mVar.f148758e = sparseIntArray;
            mVar.f148759f = sparseArray;
            com.ss.android.ugc.aweme.player.sdk.a.f115103a = q.a();
            ISimPlayerService$$CC.get$$STATIC$$().c();
            int a6 = com.bytedance.ies.abmock.b.a().a(true, "videocache_loader_type", 0);
            if (a6 > 0) {
                sparseIntArray.put(39, a6);
            }
            ISimPlayerService$$CC.get$$STATIC$$().a(com.bytedance.ies.abmock.b.a().a(true, "player_enable_debug_log", 0));
        }
        mVar.S = (List) com.ss.android.ugc.aweme.video.b.o.f143307d.getValue();
        return mVar;
    }
}
