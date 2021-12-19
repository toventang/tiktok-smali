package com.bytedance.android.livesdk.gift;

import android.content.SharedPreferences;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class b {
    static {
        Covode.recordClassIndex(9905);
    }

    public static boolean a() {
        if (y.e() != null) {
            return d.a(y.e(), "broadcast_storage", 0).getBoolean("saved_last_gift_feature", true);
        }
        return true;
    }

    public static void a(boolean z) {
        if (y.e() != null) {
            SharedPreferences.Editor edit = d.a(y.e(), "broadcast_storage", 0).edit();
            edit.putBoolean("saved_last_gift_feature", z);
            edit.commit();
        }
    }
}
