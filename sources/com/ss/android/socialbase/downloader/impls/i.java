package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.m;
import com.ss.android.socialbase.downloader.k.g;

public final class i implements m {
    static {
        Covode.recordClassIndex(37445);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public final int a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String c2 = g.c(a.a("%s_%s", new Object[]{str, str2}));
        if (TextUtils.isEmpty(c2)) {
            return 0;
        }
        return c2.hashCode();
    }
}
