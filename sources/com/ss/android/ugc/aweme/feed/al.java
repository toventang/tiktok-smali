package com.ss.android.ugc.aweme.feed;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static final al f91906a = new al();

    private al() {
    }

    static {
        Covode.recordClassIndex(57850);
    }

    public static final int b() {
        return a().getInt("diggUnloginCount", 0);
    }

    public static final boolean d() {
        return a().getBoolean("deviceHasDigged", false);
    }

    public static SharedPreferences a() {
        SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "MainTabPreferences", 0);
        l.b(a2, "");
        return a2;
    }

    public static final void c() {
        a().edit().putBoolean("deviceHasDigged", true).apply();
    }

    public static final void a(int i2) {
        a().edit().putInt("diggUnloginCount", i2).apply();
    }
}
