package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.notice.api.d.b;

final class w implements b {

    /* renamed from: a  reason: collision with root package name */
    private Context f68032a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68033b;

    static {
        Covode.recordClassIndex(41904);
    }

    public w(Context context) {
        this.f68032a = context;
        this.f68033b = d.a(context, "default_config", 0);
    }
}
