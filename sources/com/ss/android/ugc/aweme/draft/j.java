package com.ss.android.ugc.aweme.draft;

import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Calendar;
import java.util.TimeZone;

public final class j {

    /* renamed from: a */
    public static final j f83137a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(51843);
    }

    public static String a(long j2, String str) {
        l.d(str, "");
        if (j2 <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(str));
        l.b(instance, "");
        instance.setTimeInMillis(j2);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
    }
}
