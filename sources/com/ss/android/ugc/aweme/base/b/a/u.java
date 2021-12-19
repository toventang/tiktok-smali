package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.metrics.c.a;

/* access modifiers changed from: package-private */
public final class u implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f68028a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68029b;

    static {
        Covode.recordClassIndex(41902);
    }

    public u(Context context) {
        this.f68028a = context;
        this.f68029b = d.a(context, "LogpbPreference", 0);
    }
}
