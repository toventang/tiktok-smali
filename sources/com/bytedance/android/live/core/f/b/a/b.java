package com.bytedance.android.live.core.f.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.ad;
import com.bytedance.android.live.core.f.b.c;
import com.bytedance.covode.number.Covode;

public final class b implements c {
    static {
        Covode.recordClassIndex(4621);
    }

    @Override // com.bytedance.android.live.core.f.b.c
    public final boolean a(Context context) {
        try {
            String a2 = ad.a("ro.hmct.notch_height");
            String a3 = ad.a("ro.hmct.notch_width");
            if (!TextUtils.equals(a2.trim(), "0") && !TextUtils.isEmpty(a2.trim()) && !TextUtils.equals(a3.trim(), "0")) {
                if (!TextUtils.isEmpty(a3.trim())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
