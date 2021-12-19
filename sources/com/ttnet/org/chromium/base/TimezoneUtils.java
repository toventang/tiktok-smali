package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import java.util.TimeZone;

class TimezoneUtils {
    static {
        Covode.recordClassIndex(103279);
    }

    private TimezoneUtils() {
    }

    private static String getDefaultTimeZoneId() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }
}
