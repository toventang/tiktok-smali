package com.ss.android.ttve.editorInfo;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, Object> f61098a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f61099b = a.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static String f61100c = "main";

    static {
        Covode.recordClassIndex(37618);
    }

    public static Map<String, Object> a() {
        ConcurrentHashMap<String, Object> concurrentHashMap = f61098a;
        if (concurrentHashMap == null) {
            return null;
        }
        if (concurrentHashMap.containsKey("te_import_video_hw_bit_rate")) {
            f61098a.put("te_import_video_hw_profile", f61100c);
        }
        if (f61098a.containsKey("te_composition_video_encode_mode")) {
            Object obj = f61098a.get("te_composition_video_encode_mode");
            try {
                if (obj instanceof Integer) {
                    if (((Integer) obj).intValue() == 1) {
                        a(new String[]{"te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop", "te_composition_video_sw_qpoffset"});
                    } else if (((Integer) obj).intValue() == 0) {
                        a(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile"});
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            a(new String[]{"te_composition_video_hw_profile"});
        }
        if (f61098a.containsKey("te_record_video_frame_rate")) {
            a(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile", "te_composition_video_encode_mode", "te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop"});
        }
        if (!f61098a.containsKey("te_record_video_frame_rate") && !f61098a.containsKey("ve_use_camera")) {
            a(new String[]{"te_camera_texture_size", "te_camera_preview_size", "te_lens_adaptive_sharpen"});
        }
        if (!f61098a.containsKey("te_edit_Enhance") && f61098a.containsKey("te_is_reencode")) {
            f61098a.put("te_edit_Enhance", 0);
        }
        if (!f61098a.containsKey("te_lens_adaptive_sharpen") && (f61098a.containsKey("te_record_video_frame_rate") || f61098a.containsKey("ve_use_camera"))) {
            f61098a.put("te_lens_adaptive_sharpen", 0);
        }
        a(new String[]{"ve_use_camera"});
        f61098a.put("te_os", 1);
        f61098a.put("te_system", "Android " + Build.VERSION.RELEASE);
        f61098a.put("te_user_device", Build.MODEL);
        f61098a.put("te_ve_version", "10.6.0.132");
        f61098a.put("te_effect_version", "10.6.0_rel_13_mt_202112161409_f7765781541");
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(f61098a);
        ConcurrentHashMap<String, Object> concurrentHashMap3 = f61098a;
        if (concurrentHashMap3 != null) {
            concurrentHashMap3.clear();
        }
        return concurrentHashMap2;
    }

    private static void a(String[] strArr) {
        if (f61098a != null) {
            for (String str : strArr) {
                f61098a.remove(str);
            }
        }
    }

    public static void a(String str, long j2) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f61098a;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Long.valueOf(j2));
        }
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f61098a;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, str2);
            if (str.equals("te_composition_video_hw_profile")) {
                f61100c = str2;
            }
        }
    }
}
