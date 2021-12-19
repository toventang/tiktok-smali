package com.ss.android.ugc.aweme.tools.draft.viewmodel;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Calendar;

public final class b {
    static {
        Covode.recordClassIndex(91458);
    }

    public static final boolean a(long j2) {
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (instance.getTimeInMillis() < j2) {
            return true;
        }
        Calendar instance2 = Calendar.getInstance();
        l.b(instance2, "");
        instance2.setTimeInMillis(j2);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    public static final boolean b(long j2) {
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        l.b(instance2, "");
        instance2.setTimeInMillis(j2);
        int i2 = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i2 <= 0 || i2 >= 7) {
            return false;
        }
        return true;
    }

    public static final boolean c(long j2) {
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        l.b(instance2, "");
        instance2.setTimeInMillis(j2);
        int i2 = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i2 < 7 || i2 >= 30) {
            return false;
        }
        return true;
    }

    public static final boolean d(long j2) {
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        l.b(instance2, "");
        instance2.setTimeInMillis(j2);
        int i2 = instance.get(6) - instance2.get(6);
        if ((instance.get(1) != instance2.get(1) || i2 < 30) && instance2.get(1) >= instance.get(1)) {
            return false;
        }
        return true;
    }
}
