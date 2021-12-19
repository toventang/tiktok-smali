package com.ss.android.ugc.playerkit.d;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(97975);
    }

    public static long a() {
        long j2;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            int i2 = Build.VERSION.SDK_INT;
            j2 = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            j2 = 0;
        }
        return (j2 / 1024) / 1024;
    }
}
