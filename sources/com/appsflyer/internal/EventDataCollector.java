package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.appsflyer.AndroidUtils;
import com.bytedance.covode.number.Covode;

public class EventDataCollector {

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f149;

    static {
        Covode.recordClassIndex(2702);
    }

    public long bootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public String signature() {
        return AndroidUtils.signature(this.f149.getPackageManager(), this.f149.getPackageName());
    }

    public String disk() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        int i2 = Build.VERSION.SDK_INT;
        long blockSizeLong = statFs.getBlockSizeLong();
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        double availableBlocksLong = (double) (statFs.getAvailableBlocksLong() * blockSizeLong);
        Double.isNaN(availableBlocksLong);
        long j2 = (long) (availableBlocksLong / pow);
        double d2 = (double) blockCountLong;
        Double.isNaN(d2);
        return new StringBuilder().append(j2).append("/").append((long) (d2 / pow)).toString();
    }

    public EventDataCollector(Context context) {
        this.f149 = context;
    }
}
