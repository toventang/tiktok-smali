package com.ss.android.ugc.aweme.legoImp.inflate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f107690a;

    /* renamed from: b  reason: collision with root package name */
    public static int f107691b;

    public static int a() {
        return f107691b;
    }

    static {
        Covode.recordClassIndex(68894);
        SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme-app", 0);
        f107690a = a2;
        f107691b = a2.getInt("x2c_switch", 2);
    }
}
