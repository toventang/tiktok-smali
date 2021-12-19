package com.bytedance.l.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class f implements com.bytedance.l.a.a.f {
    static {
        Covode.recordClassIndex(24562);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.l.a.a.f
    public final void a(Context context) {
        SharedPreferences a2;
        if (context != null && (a2 = d.a(context, "ttlive_sdk_shared_pref_cache", 4)) != null) {
            a2.edit().putLong("key_ttlive_sdk_flow_remind", System.currentTimeMillis()).apply();
        }
    }

    @Override // com.bytedance.l.a.a.f
    public final boolean b(Context context) {
        SharedPreferences a2;
        if (context == null || (a2 = d.a(context, "ttlive_sdk_shared_pref_cache", 4)) == null) {
            return false;
        }
        if (((int) ((System.currentTimeMillis() - a2.getLong("key_ttlive_sdk_flow_remind", 0)) / 86400000)) <= 30) {
            return true;
        }
        return false;
    }
}
