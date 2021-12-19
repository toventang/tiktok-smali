package com.ss.android.ugc.aweme.bitrateselector.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cf.a.c;

public abstract /* synthetic */ class e {
    static {
        Covode.recordClassIndex(42283);
    }

    public static d a(int i2) {
        if (i2 == 1) {
            return (d) c.a("com.ss.android.ugc.aweme.bitrateselector.impl.DTBitrateSelectorServiceImpl");
        }
        if (i2 != 2) {
            return null;
        }
        return (d) c.a("com.ss.android.ugc.aweme.bitrateselector.impl.simbitrateselecotr_impl_cloud.CloudBitrateSelectorServiceImpl");
    }
}
