package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    static String f151037a = "VERuntimeConfig";

    /* renamed from: b  reason: collision with root package name */
    static boolean f151038b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f151039c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f151040d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f151041e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f151042f;

    /* renamed from: g  reason: collision with root package name */
    public static int f151043g = a.HW_ENC_FALLBACK_NONE.getValue();

    /* renamed from: h  reason: collision with root package name */
    public static Map<String, Long> f151044h = new HashMap();

    public enum a {
        HW_ENC_FALLBACK_NONE(0),
        VIDEO_ENC_INIT_FALLBACK(1),
        AUDIO_ENC_INIT_FALLBACK(2),
        VIDEO_ENC_ENCODING_FALLBACK(3),
        AUDIO_ENC_ENCODING_FALLBACK(4);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        static {
            Covode.recordClassIndex(99337);
        }

        private a(int i2) {
            this.mValue = i2;
        }
    }

    static {
        Covode.recordClassIndex(99336);
    }

    public static boolean a() {
        if (f151038b || ((Boolean) u.a().a("vesdk_use_agfxcontext", (Object) false)).booleanValue()) {
            return true;
        }
        return false;
    }
}
