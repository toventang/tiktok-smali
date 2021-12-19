package com.ss.android.ugc.aweme.account.n;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {
    static {
        Covode.recordClassIndex(40075);
    }

    public static final int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str == null) {
            try {
                l.b();
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return Integer.parseInt(str);
    }
}
