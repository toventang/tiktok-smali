package com.ss.android.ugc.aweme.ao;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.r;

public final class b {
    static {
        Covode.recordClassIndex(40814);
    }

    public static final boolean a(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        try {
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
            return false;
        }
    }
}
