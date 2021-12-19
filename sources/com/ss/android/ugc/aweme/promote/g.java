package com.ss.android.ugc.aweme.promote;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static e f118163a;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f118164b;

    static {
        Covode.recordClassIndex(76737);
    }

    public static SharedPreferences a() {
        if (f118164b == null) {
            f118164b = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme-promote-dialog", 0);
        }
        return f118164b;
    }
}
