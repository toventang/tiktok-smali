package com.ss.android.vesdk;

import com.bef.effectsdk.EffectABConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.runtime.TEConfigCenter;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class u {

    /* renamed from: b  reason: collision with root package name */
    private static volatile u f151489b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d> f151490a = new HashMap();

    static {
        Covode.recordClassIndex(99599);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f151495a;

        /* renamed from: b  reason: collision with root package name */
        public Object f151496b;

        /* renamed from: c  reason: collision with root package name */
        public b f151497c;

        /* renamed from: d  reason: collision with root package name */
        public String f151498d;

        /* renamed from: e  reason: collision with root package name */
        public a f151499e;

        /* renamed from: f  reason: collision with root package name */
        private AtomicBoolean f151500f = new AtomicBoolean(false);

        static {
            Covode.recordClassIndex(99604);
        }

        public final String toString() {
            Object obj = this.f151496b;
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }

        public final d a(Object obj) {
            if (this.f151500f.get()) {
                return this;
            }
            this.f151496b = obj;
            return this;
        }

        public d(c cVar, Object obj, b bVar, String str) {
            this.f151496b = obj;
            this.f151495a = cVar;
            this.f151497c = bVar;
            this.f151498d = str;
        }
    }

    public enum a {
        FOREFFECT,
        FORCAMERA;

        static {
            Covode.recordClassIndex(99601);
        }
    }

    public enum b {
        CONFIG_TYPE_AB,
        CONFIG_TYPE_SETTINGS,
        CONFIG_TYPE_DEFAULT;

        static {
            Covode.recordClassIndex(99602);
        }
    }

    public static u a() {
        MethodCollector.i(3351);
        if (f151489b == null) {
            synchronized (u.class) {
                try {
                    if (f151489b == null) {
                        f151489b = new u();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3351);
                    throw th;
                }
            }
        }
        u uVar = f151489b;
        MethodCollector.o(3351);
        return uVar;
    }

    /* renamed from: com.ss.android.vesdk.u$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f151491a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 99600(0x18510, float:1.3957E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.vesdk.u$c[] r0 = com.ss.android.vesdk.u.c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.vesdk.u.AnonymousClass1.f151491a = r2
                com.ss.android.vesdk.u$c r0 = com.ss.android.vesdk.u.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.vesdk.u.AnonymousClass1.f151491a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.vesdk.u$c r0 = com.ss.android.vesdk.u.c.INTEGER     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.vesdk.u.AnonymousClass1.f151491a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.vesdk.u$c r0 = com.ss.android.vesdk.u.c.LONG     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.vesdk.u.AnonymousClass1.f151491a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.vesdk.u$c r0 = com.ss.android.vesdk.u.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.vesdk.u.AnonymousClass1.f151491a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.vesdk.u$c r0 = com.ss.android.vesdk.u.c.STRING     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.u.AnonymousClass1.<clinit>():void");
        }
    }

    public enum c {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING;

        static {
            Covode.recordClassIndex(99603);
        }
    }

    private void c() {
        d dVar;
        try {
            JSONArray jSONArray = new JSONArray(EffectABConfig.requestABInfoWithLicenseArray(new String[]{"ve_record", "ve_enigma", "ve_edit", "ve_mv", "ve_detector", "ve_image"}, true));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int i3 = jSONObject.getInt("dataType");
                String string = jSONObject.getString("description");
                if (i3 == 0) {
                    dVar = new d(c.BOOLEAN, Boolean.valueOf(jSONObject.getBoolean("defaultVal")), b.CONFIG_TYPE_AB, string);
                } else if (i3 == 1) {
                    dVar = new d(c.INTEGER, Integer.valueOf(jSONObject.getInt("defaultVal")), b.CONFIG_TYPE_AB, string);
                } else if (i3 == 2) {
                    dVar = new d(c.FLOAT, Float.valueOf((float) jSONObject.getDouble("defaultVal")), b.CONFIG_TYPE_AB, string);
                } else if (i3 == 3) {
                    dVar = new d(c.STRING, jSONObject.getString("defaultVal"), b.CONFIG_TYPE_AB, string);
                }
                dVar.f151499e = a.FOREFFECT;
                a(jSONObject.getString("key"), dVar);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void d() {
        d dVar;
        try {
            JSONArray jSONArray = new JSONArray(q.a());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int i3 = jSONObject.getInt("dataType");
                String string = jSONObject.getString("description");
                if (i3 == 0) {
                    dVar = new d(c.BOOLEAN, Boolean.valueOf(jSONObject.getBoolean("defaultVal")), b.CONFIG_TYPE_AB, string);
                } else if (i3 == 1) {
                    dVar = new d(c.INTEGER, Integer.valueOf(jSONObject.getInt("defaultVal")), b.CONFIG_TYPE_AB, string);
                } else if (i3 == 2) {
                    dVar = new d(c.FLOAT, Float.valueOf((float) jSONObject.getDouble("defaultVal")), b.CONFIG_TYPE_AB, string);
                } else if (i3 == 3) {
                    dVar = new d(c.STRING, jSONObject.getString("defaultVal"), b.CONFIG_TYPE_AB, string);
                }
                dVar.f151499e = a.FORCAMERA;
                a(jSONObject.getString("key"), dVar);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final int b() {
        MethodCollector.i(3363);
        Iterator<Map.Entry<String, d>> it = this.f151490a.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                Map.Entry<String, d> next = it.next();
                if (next.getValue().f151499e == a.FOREFFECT) {
                    String key = next.getKey();
                    d value = next.getValue();
                    if (value.f151499e == a.FOREFFECT) {
                        int i2 = AnonymousClass1.f151491a[value.f151495a.ordinal()];
                        if (i2 == 1) {
                            VEEffectConfig.setABConfigValue(key, value.f151496b, 0);
                        } else if (i2 == 2 || i2 == 3) {
                            VEEffectConfig.setABConfigValue(key, value.f151496b, 1);
                        } else if (i2 == 4) {
                            VEEffectConfig.setABConfigValue(key, value.f151496b, 2);
                        } else if (i2 == 5) {
                            VEEffectConfig.setABConfigValue(key, value.f151496b, 3);
                        }
                    }
                } else if (next.getValue().f151499e != a.FORCAMERA) {
                    String key2 = next.getKey();
                    d value2 = next.getValue();
                    if (value2.f151499e == a.FOREFFECT) {
                        z = true;
                    }
                    int ordinal = value2.f151495a.ordinal();
                    if (ordinal == 0) {
                        TEConfigCenter.nativeSetBoolConfig(key2, ((Boolean) value2.f151496b).booleanValue(), z, value2.f151497c.ordinal());
                    } else if (ordinal == 1 || ordinal == 2) {
                        TEConfigCenter.nativeSetIntConfig(key2, ((Integer) value2.f151496b).intValue(), z, value2.f151497c.ordinal());
                    } else if (ordinal == 3) {
                        TEConfigCenter.nativeSetFloatConfig(key2, ((Float) value2.f151496b).floatValue(), z, value2.f151497c.ordinal());
                    } else if (ordinal == 4) {
                        TEConfigCenter.nativeSetStringConfig(key2, (String) value2.f151496b, z, value2.f151497c.ordinal());
                    }
                }
            } else {
                MethodCollector.o(3363);
                return 0;
            }
        }
    }

    private u() {
        a("wide_camera_id", new d(c.STRING, "-1", b.CONFIG_TYPE_AB, "wide camera device id"));
        a("mv_use_amazing_engine", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable using amazing engine for mv"));
        a("vesdk_seek_predict_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable seek opt for predict seek accelerate speed"));
        a("create_by_codec_name", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "use mediaCodec.createByCodecName"));
        a("enable_android_hdr2sdr_support", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable android hdr2sdr support"));
        a("enable_android_hdr_preview_support", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable android hdr preview support"));
        a("crossplat_glbase_fbo", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable crossplat glbase fbo"));
        a("vboost_compile", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable vboost compile"));
        a("use_open_gl_three", new d(c.INTEGER, 1, b.CONFIG_TYPE_AB, "use GLES3.0"));
        a("vesdk_max_cache_count", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "config max cache count for input decode frame"));
        a("gpu_syncobject_type", new d(c.INTEGER, 0, b.CONFIG_TYPE_DEFAULT, "GPU SyncObject type: 0-glFence; 1-eglFence; 2-glFinish"));
        a("compile_probe_use_byte264", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "compile_probe use libbyte264"));
        a("use_byte264", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "use libbyte264"));
        a("aeabtest_v2api", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "use new audiosdk api"));
        a("color_space", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "color space"));
        a("ve_color_space_for_2020", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "ve color space for 2020"));
        a("vesdk_audiomix_replace", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "vesdk_audiomix_replace"));
        a("enable_record_mpeg4", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable record mpeg4"));
        a("ve_record_codec_type", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "record codec type"));
        a("optimize srv_um crash", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "optimize srv um crash"));
        a("vesdk_audio_hw_encoder", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "audio hw encoder"));
        c cVar = c.FLOAT;
        Float valueOf = Float.valueOf(-1.0f);
        a("ve_recorder_fps_downgrade", new d(cVar, valueOf, b.CONFIG_TYPE_AB, "Downgrading recorder fps."));
        a("video_duration_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "video_duration_opt"));
        a("ve_enable_face_detection", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable_face_detection"));
        a("enable_render_lib", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "vesdk enable render lib"));
        a("vesdk_use_agfxcontext", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "vesdk enable agfx ctx"));
        a("vesdk_enable_reader_refactor", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "vesdk enable reader refactor"));
        a("ve_enable_bingo_refactor", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "dmt bingo refactor"));
        a("enable_duet_gl_finish", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable duet glFinish"));
        a("ve_enable_preload_effect_res", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable preload effect res"));
        a("ve_disable_effect_internal_setting", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "disable effect internal setting"));
        a("ve_enable_titan_auto_test_log", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable titan auto test log"));
        a("ve_opt_first_frame", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "opt first frame"));
        a("ve_opt_first_frame_bypass_effect_frame_cnt", new d(c.INTEGER, 3, b.CONFIG_TYPE_AB, "opt first frame bypass effect frame cnt"));
        a("ve_camera_frame_update_independent_thread", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "camera frame update independent thread"));
        a("ve_set_camera_two_output", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve set camera two output"));
        a("ve_camera_output_and_update_strategy", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "ve camera output and update strategy"));
        a("ve_enable_three_buffer", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable 3 buffer"));
        a("ve_async_detection", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "effect async detection"));
        a("ve_retry_count", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "camera open retry"));
        a("ve_retry_start_preview_count", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "start preview retry count"));
        a("ve_enable_stop_preview_optimize", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "stop preview async optimize"));
        a("ve_enable_audio_gbu_refactor", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "Enable editor/compiler audio gbu refactor"));
        a("ve_enable_compile_buffer_hw_encode", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "Android Hw encode compile "));
        a("ve_enable_file_info_cache", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable file info cache"));
        a("ve_enable_render_encode_resolution_align4", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "render and encode resolution can be align4"));
        a("ve_small_window_double_thread_decode", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve small window double thread decode"));
        a("ve_camera_enable_previewing_fallback", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "camera enable previewing fallback"));
        a("ve_enable_background_strategy", new d(c.BOOLEAN, true, b.CONFIG_TYPE_SETTINGS, "enable background strategy"));
        a("ve_enable_pin_refactor", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "dmt take pin refactor"));
        a("ve_enable_engine_monitor_report", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable engine monitor report"));
        a("ve_enable_hwdecode_dequeue_inputbuffer_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "MediaCodec dequeue video inputBuffer opt"));
        a("ve_async_set_sensor_data", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "Send sensor data to effect asynchronously."));
        a("remux_video_res", new d(c.INTEGER, 921600, b.CONFIG_TYPE_AB, "remux video res"));
        a("ve_compile_report", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "compile report state"));
        a("ve_enable_compile_timeout_diagnosis", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "compile timeout diagnosis"));
        a("ve_enable_refactor_audio", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable audio refactor"));
        a("privacy_error_action", new d(c.INTEGER, 2, b.CONFIG_TYPE_AB, "privacy_error_action"));
        a("privacy_error_check_interval", new d(c.INTEGER, 1000, b.CONFIG_TYPE_AB, "privacy_error_check_interval"));
        a("privacy_error_check_threshold", new d(c.INTEGER, 3000, b.CONFIG_TYPE_AB, "privacy_error_check_threshold"));
        a("ve_enable_oes_texture_shot_screen", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable 2d texture shot screen"));
        a("ve_enable_hwdecode_playback_dropframe_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "hwdecode playback dropframe opt"));
        a("ve_editor_firstframe_delay", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "ve_editor_firstframe_delay"));
        a("ve_record_editor_firstframe_delay", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "ve_record_editor_firstframe_delay"));
        a("ve_enable_encode_bin_gl_context_reuse", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable encode bin gl context reuse"));
        a("ve_enable_editor_compile_gl_context_reuse", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable editor compile gl context reuse"));
        a("ve_enable_upload_virtual_mem_size", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable upload virtual mem size"));
        a("ve_enable_mpeg24vp89_hwdecoder2", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable mpeg24 vp89 hwdecoder"));
        a("ve_enable_glflush_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "glFlush usage opt"));
        a("vesdk_high_speed_change_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "vesdk_high_speed_change_opt"));
        a("ve_enable_p3_re_encode", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve_enable_p3_re_encode"));
        a("ve_enable_imageAlgorithmReuseAndOptForAmazing", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "imageAlgorithm Reuse and optForAmazing"));
        a("byteVC1_10bit_hardware_encoder_timeout", new d(c.INTEGER, 10000, b.CONFIG_TYPE_AB, "byteVC1 10bit hardware encoder timeout params"));
        a("ve_enable_memory_mode", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable low memory mode"));
        a("ve_low_memory_threshold", new d(c.INTEGER, 300, b.CONFIG_TYPE_AB, "low memory mode threshold"));
        a("ve_compile_codec_type", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "compile support bytevc1 encode"));
        a("ve_compile_hw_bytevc1_max_pixel_count", new d(c.INTEGER, 8294400, b.CONFIG_TYPE_AB, "compile bytevc1 max pixel count"));
        a("ve_enable_parallelDecodeMatting", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable parallel decode and matting"));
        a("ve_enable_sys_karaoke", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "enable sys karaoke"));
        a("ve_enable_common_earback", new d(c.BOOLEAN, true, b.CONFIG_TYPE_SETTINGS, "enable common earback"));
        a("ve_enable_aaduio", new d(c.BOOLEAN, true, b.CONFIG_TYPE_SETTINGS, "enable aaudio"));
        a("ve_enable_pip_resolution_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable pip resolution opt"));
        a("ve_hardware_encode_fallback", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "config for hardware encode fallback to soft, DO NOT set NON-ZERO ON LINE"));
        a("ve_asf_amount", new d(c.FLOAT, valueOf, b.CONFIG_TYPE_AB, "ve_asf_amount"));
        a("ve_asf_over_ratio", new d(c.FLOAT, valueOf, b.CONFIG_TYPE_AB, "ve_asf_over_ratio"));
        a("ve_asf_gpu_power_level", new d(c.INTEGER, 4, b.CONFIG_TYPE_AB, "ve_asf_gpu_power_level"));
        a("ve_asf_init_delay_frame_cnt", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "ve_asf_init_delay_frame_cnt"));
        a("ve_asf_process_delay_frame_cnt", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "ve_asf_process_delay_frame_cnt"));
        c cVar2 = c.FLOAT;
        Float valueOf2 = Float.valueOf(0.0f);
        a("ve_duet_audio_delay_opt", new d(cVar2, valueOf2, b.CONFIG_TYPE_AB, "Duet audio delay optimize. 0 is no opt."));
        a("ve_duet_audio_delay_mt_opt", new d(c.FLOAT, valueOf2, b.CONFIG_TYPE_AB, "Duet audio delay mt optimize. 0 is no opt."));
        a("ve_enable_optimize_audio_delay", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "opt audio delay when stop record"));
        a("ve_enable_vboost", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "opt performance when open/close camera and stop record"));
        a("ve_vboost_timeout", new d(c.INTEGER, 500, b.CONFIG_TYPE_SETTINGS, "VBoost timeout"));
        a("ve_enable_effect_render_without_glreadpixels", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable effect render without glreadpixels"));
        a("ve_smart_trans_detect", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "smart trans detect for compile"));
        a("ve_force_edit_bytevc1_swdecode", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "edit module force sw decode"));
        a("ve_enable_engine_resource_opt", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable engine resouce can reuse between graphs"));
        a("ve_enable_concurrent_preload", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "enable concurrent preload for multi clips"));
        a("ve_enable_decoder_dispatch", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "enable global dispatch for decoder tasks"));
        a("ve_enable_decoder_schedule_opt_hw", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "enable decoder schedule for hw"));
        a("ve_enable_readermanager_refactor", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "description tevideoreader manager refactor"));
        a("ve_enable_device_capability_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "description enable  device monitor opt"));
        a("ve_force_compile_bytevc1_swdecode", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "compile module force sw decode"));
        a("ve_hwdecode_support_rt_and_or", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "hw decode support real-time and operating-rate"));
        a("ve_camera_enable_preview_fake_frame", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve camera enable preview fake frame"));
        a("ve_camera_enable_preview_fake_frame_gaussian_blur", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve camera enable preview fake frame gaussian_blur"));
        a("ve_titan_off_screen_before_stop", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "Titan switch off screen before stop preview"));
        a("ve_mediacodec_resource_reasonable_distribute", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "mediacodec resource reasonable distribute"));
        a("ve_aec_sample_rate_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "aec sample rate opt"));
        a("vesdk_ffmpeg_enable_video_timestamp_monotonic", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable ffmpeg video timestamp monotonic"));
        a("ve_titan_release_block_time", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "Titan release block time"));
        a("ve_shotscreen_delay_max_frame", new d(c.INTEGER, 20, b.CONFIG_TYPE_SETTINGS, "shotscreen delay max frame"));
        a("ve_shotscreen_delay_threshold", new d(c.INTEGER, 10, b.CONFIG_TYPE_SETTINGS, "shotscreen delay light frame num threshold"));
        a("ve_enable_audio_reader_preload_reuse", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "support audioReader preload and reuse"));
        a("ve_enable_cache_timestamp", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "enable cache timestamp"));
        a("ve_image_enable_optimize_quality", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "VEImage enable optimize quality"));
        a("ve_titan_follow_shot_independent_thread", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "follow shot independent thread."));
        a("ve_enable_seek_preload_drop_frame", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "seek and preload drop frame"));
        a("ve_enable_amazing_feature_handle_cache", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "amazing feature handle cache"));
        a("ve_enable_amazing_feature_handle_cache", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "amazing feature handle cache"));
        a("ve_enable_image_preload", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable image preload when display"));
        a("ve_ban_hw_extra_data_loop", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "Ban mediacodec sps/pps loop & some opt"));
        a("ve_titan_max_count_of_render_frame_buffer", new d(c.INTEGER, 30, b.CONFIG_TYPE_AB, "Set max count of titan`s frame buffer cache"));
        a("ve_titan_max_count_of_encode_task", new d(c.INTEGER, 20, b.CONFIG_TYPE_AB, "Set max count of titan`s encode queue task"));
        a("ve_enable_amazing_feature_handle_preload", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "amazing feature handle preload"));
        a("ve_enable_titan_audio_graph_refactor", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable titan audio graph refactor."));
        a("ve_enable_bgm_mic_delay_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable bgm mic delay opt"));
        a("ve_enable_luma_detect_ec", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable luma detect ec"));
        a("ve_enable_luma_detect", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable luma detect"));
        a("ve_luma_detect_ec_exe_rate", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "luma detect ec execute rate"));
        a("ve_titan_release_gpu_resource", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "titan release gpu resource."));
        a("ve_enable_recorder_native_api", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable recorder native api"));
        a("ve_anable_codec2_output_format_align_16", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable mediacodec output format align 16"));
        a("ve_enable_canvas_handle_reuse", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "enable canvas blend reuse canvas handle"));
        a("ve_enable_render_layer", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "enable render layer"));
        a("ve_enable_titan_engine_monitor", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "enable titan engine monitor"));
        a("vesdk_use_bytevcremux_in_publish", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable bytevc1 remux"));
        a("ve_enable_forward_ongoingseek_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable forward ongoingseek opt"));
        a("ve_enable_video_reader_hw_overload_fallback_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable video reader hw_overload fallback opt"));
        a("ve_enable_edit_record_unit_unify", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "enable transform unit unify"));
        a("ve_enable_amazing_unit_unify", new d(c.BOOLEAN, false, b.CONFIG_TYPE_SETTINGS, "enable amazing unit unify"));
        a("ve_enable_l_async_initialize", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable lens asynchronous initialization"));
        a("ve_enable_tian_use_reader_factory", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable titan use reader facrory"));
        a("ve_enable_adaptive_encode_level", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable adaptive encode level"));
        a("ve_enable_hw_decoder_support_rotate", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable hw decoder support rotate"));
        a("ve_enable_uri_convert_android_q", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable uri convert android q"));
        a("ve_compile_gl_fence_ab", new d(c.INTEGER, 0, b.CONFIG_TYPE_AB, "compile glfence, 0 - glfinish; 1 - glfence & wait on server; 2 - glfence & wait on client"));
        a("veabtest_enablePreviewQualityOpt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable preview quality opt"));
        a("veabtest_enableUpSamplingOpt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable upsampling opt"));
        a("veabtest_enableCrossplatCanvasOpt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable crossplat canvas opt"));
        a("veabtest_enableCrossplatCanvasDownscaleOpt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable crossplat canvas downscale opt"));
        a("ve_enable_compile_hw_encoder_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable hw compile encoder optimization"));
        a("ve_onekey_process_hdr", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable hdr"));
        a("ve_onekey_process_denoise", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable denoise"));
        a("ve_onekey_process_asf", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable asf"));
        a("ve_onekey_process_hdr_v2", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "enable hdr v2"));
        a("ve_onekey_process_async_process", new d(c.BOOLEAN, true, b.CONFIG_TYPE_AB, "async process"));
        a("ve_onekey_cv_detect_frame", new d(c.INTEGER, 3, b.CONFIG_TYPE_AB, "cv detect frame"));
        a("ve_audio_source_type", new d(c.INTEGER, 1, b.CONFIG_TYPE_AB, "set recorder audio source type"));
        a("ve_enable_lv_audio_graph_refactor", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "enable lv audio graph refactor"));
        a("ve_enable_img_downsample_calculate_opt", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve enable img downsample calculate opt"));
        a("ve_limit_image_texture_size", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve limit image texture size"));
        a("ve_enable_sys_image_decoder", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve enable sys image decoder"));
        a("ve_enable_img_add_black_border", new d(c.BOOLEAN, false, b.CONFIG_TYPE_AB, "ve enable img add black border"));
        c();
        d();
    }

    public final d a(String str) {
        return this.f151490a.get(str);
    }

    private int a(String str, d dVar) {
        if (this.f151490a.containsKey(str)) {
            return -100;
        }
        b(str, dVar);
        return 0;
    }

    private d b(String str, d dVar) {
        return this.f151490a.put(str, dVar);
    }

    public final Object b(String str, Object obj) {
        d dVar = this.f151490a.get(str);
        if (dVar == null) {
            return null;
        }
        Object obj2 = dVar.f151496b;
        dVar.a(obj);
        return obj2;
    }

    public final <T> T a(String str, T t) {
        d dVar = this.f151490a.get(str);
        return (dVar == null || dVar.f151496b == null) ? t : (T) dVar.f151496b;
    }
}
