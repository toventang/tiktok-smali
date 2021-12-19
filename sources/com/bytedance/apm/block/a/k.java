package com.bytedance.apm.block.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static SharedPreferences f24640a;

    static {
        Covode.recordClassIndex(14491);
    }

    static synchronized void a(Context context) {
        synchronized (k.class) {
            if (f24640a == null) {
                f24640a = d.a(context, "evil_method_SPUtils", 0);
            }
        }
    }
}
