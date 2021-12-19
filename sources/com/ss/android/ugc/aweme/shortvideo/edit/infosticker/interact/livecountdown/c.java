package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown;

import com.bytedance.covode.number.Covode;
import java.util.GregorianCalendar;

public final class c {
    static {
        Covode.recordClassIndex(83525);
    }

    public static final long a(long j2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j2);
        return new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12), 0).getTimeInMillis();
    }

    public static final b a(long j2, long j3) {
        float f2 = ((float) (j2 - j3)) / 1000.0f;
        if (f2 <= 0.0f) {
            return new b("0", "0", "0", "0", j2);
        }
        int i2 = (int) (f2 / 86400.0f);
        float f3 = (float) ((int) (f2 - (((((float) i2) * 24.0f) * 60.0f) * 60.0f)));
        int i3 = (int) (f3 / 3600.0f);
        float f4 = (float) ((int) (f3 - ((((float) i3) * 60.0f) * 60.0f)));
        int i4 = (int) (f4 / 60.0f);
        return new b(String.valueOf(i2), String.valueOf(i3), String.valueOf(i4), String.valueOf((int) (f4 - (((float) i4) * 60.0f))), j2);
    }
}
