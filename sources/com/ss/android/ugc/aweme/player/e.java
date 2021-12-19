package com.ss.android.ugc.aweme.player;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.ab.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f115088a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f115089b = false;

    /* renamed from: c  reason: collision with root package name */
    public static a f115090c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f115091d;

    /* renamed from: e  reason: collision with root package name */
    public static String f115092e = null;

    /* renamed from: f  reason: collision with root package name */
    public static int f115093f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static int f115094g = -1;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f115095h;

    /* renamed from: i  reason: collision with root package name */
    private static Boolean f115096i;

    public static int a() {
        int i2 = f115093f + 1;
        f115093f = i2;
        return i2;
    }

    public static boolean e() {
        if (b.a().a(true, "player_v3_up_mtk_enable", 0) == 1) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (b.a().a(false, "player_reuse_engine", 0) == 1) {
            return true;
        }
        return false;
    }

    private static String g() {
        try {
            if (f115092e == null) {
                f115092e = Build.HARDWARE;
            }
        } catch (Throwable unused) {
            f115092e = null;
        }
        return f115092e;
    }

    static {
        Covode.recordClassIndex(73979);
    }

    public static boolean d() {
        if (g() == null || !g().toLowerCase().startsWith("mt")) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        if (f115095h == null) {
            boolean z = true;
            if (b.a().a(true, "player_preferch_tts_audio", 0) != 1) {
                z = false;
            }
            f115095h = Boolean.valueOf(z);
        }
        return f115095h.booleanValue();
    }

    public static boolean c() {
        if (f115096i == null) {
            boolean z = true;
            if (b.a().a(true, "player_prefetch_cla_caption", 0) != 1) {
                z = false;
            }
            f115096i = Boolean.valueOf(z);
        }
        return f115096i.booleanValue();
    }

    public static String a(Video video) {
        VideoUrlModel playAddr;
        if (video == null || (playAddr = video.getPlayAddr()) == null) {
            return "null";
        }
        if (playAddr.getSourceId() == null) {
            return "nullid";
        }
        return playAddr.getSourceId();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "play";
        }
        StringBuilder append = new StringBuilder().append(str).append("_");
        int i2 = f115094g + 1;
        f115094g = i2;
        return append.append(i2).toString();
    }

    public static String a(String str, int i2) {
        if (!TextUtils.isEmpty(str) && str.length() > i2) {
            return str.substring(0, i2 - 1);
        }
        return str;
    }
}
