package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.u;

public final class q implements u {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f60663a;

    static {
        Covode.recordClassIndex(37454);
    }

    public q(String str) {
        this.f60663a = a(str);
    }

    private static long[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                jArr[i2] = Long.parseLong(split[i2]);
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.u
    public final long a(int i2, int i3) {
        long[] jArr = this.f60663a;
        if (jArr == null || jArr.length <= 0) {
            return 0;
        }
        int i4 = i2 - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > jArr.length - 1) {
            i4 = jArr.length - 1;
        }
        return jArr[i4];
    }
}
