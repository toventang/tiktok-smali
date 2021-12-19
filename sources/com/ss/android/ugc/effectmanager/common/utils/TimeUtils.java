package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    static {
        Covode.recordClassIndex(95350);
    }

    public final String currentTime() {
        String format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS").format(new Date());
        l.a((Object) format, "");
        return format;
    }
}
