package com.ss.android.ugc.aweme.simkit.model.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.HashMap;
import java.util.Map;

public class b {
    @c(a = "battery_percent_threshold")

    /* renamed from: a  reason: collision with root package name */
    public float f133586a = 0.2f;
    @c(a = "video_time_percent_threshold")

    /* renamed from: b  reason: collision with root package name */
    public float f133587b = 0.7f;
    @c(a = "quality_type_duration_threshold")

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, Long> f133588c = new HashMap();
    @c(a = "resolution_duration_threshold")

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, Long> f133589d = new HashMap();
    @c(a = "quality_type_min_duration_threshold")

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, Long> f133590e = new HashMap();
    @c(a = "resolution_min_duration_threshold")

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, Long> f133591f = new HashMap();
    @c(a = "dash_min_duration_threshold")

    /* renamed from: g  reason: collision with root package name */
    public long f133592g = 0;
    @c(a = "horizontal_video_quality_type_duration_threshold")

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, Long> f133593h = new HashMap();
    @c(a = "horizontal_video_resolution_duration_threshold")

    /* renamed from: i  reason: collision with root package name */
    public Map<Integer, Long> f133594i = new HashMap();
    @c(a = "dash_sr")

    /* renamed from: j  reason: collision with root package name */
    public boolean f133595j = false;
    @c(a = "splash_ad_sr")

    /* renamed from: k  reason: collision with root package name */
    public boolean f133596k = false;
    @c(a = "ad_sr")

    /* renamed from: l  reason: collision with root package name */
    public boolean f133597l = false;
    @c(a = "async_init_sr")

    /* renamed from: m  reason: collision with root package name */
    public int f133598m = 1;
    @c(a = "close_sr_for_first_n_videos")
    public int n = 0;
    @c(a = "close_sr_for_user_local_videos")
    public boolean o = false;
    @c(a = "consider_bitrate")
    public boolean p = false;
    @c(a = "decrease_quality_type_cnt")
    public Map<Integer, Integer> q = new HashMap();
    @c(a = "decrease_resolution_cnt")
    public Map<Integer, Integer> r = new HashMap<Integer, Integer>() {
        /* class com.ss.android.ugc.aweme.simkit.model.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(87389);
        }

        {
            put(1080, 1);
        }
    };

    static {
        Covode.recordClassIndex(87388);
    }

    public static boolean a(b bVar) {
        if (bVar == null || !bVar.f133596k) {
            return false;
        }
        return true;
    }

    public static int a(int i2, String str) {
        int i3;
        if (i2 < 2 || i2 > 3) {
            i3 = 0;
        } else {
            i3 = 1080;
        }
        if (i2 >= 10 && i2 <= 18) {
            i3 = 720;
        }
        if (i2 >= 20 && i2 <= 28) {
            i3 = 540;
        }
        if (i2 >= 30 && i2 <= 38) {
            i3 = 480;
        }
        if (i2 >= 40 && i2 <= 48) {
            return 360;
        }
        if (i3 != 0 || TextUtils.isEmpty(str)) {
            return i3;
        }
        if (str.contains("1080")) {
            return 1080;
        }
        if (str.contains("720")) {
            return 720;
        }
        if (str.contains("540")) {
            return 540;
        }
        if (str.contains("480")) {
            return 480;
        }
        if (str.contains("360")) {
            return 360;
        }
        return 0;
    }
}
