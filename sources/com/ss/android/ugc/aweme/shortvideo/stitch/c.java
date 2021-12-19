package com.ss.android.ugc.aweme.shortvideo.stitch;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.port.in.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static SharedPreferences f130814a = d.a(i.f115645a, "av_settings.xml", 0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f130815b = new c();

    private c() {
    }

    public static boolean a() {
        return f130814a.getBoolean("stitch_introduce_shown", false);
    }

    public static boolean b() {
        return f130814a.getBoolean("stich_microphone_guide", false);
    }

    static {
        Covode.recordClassIndex(85727);
    }

    public static void c() {
        f130814a.edit().putBoolean("stich_microphone_guide", true).apply();
    }
}
