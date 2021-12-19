package com.bytedance.helios.a.a;

import com.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.Calendar;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f30638a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(17795);
    }

    public static String a(long j2) {
        String valueOf;
        Calendar instance = Calendar.getInstance();
        l.a((Object) instance, "");
        instance.setTimeInMillis(j2);
        int i2 = instance.get(15) / 3600000;
        if (i2 >= 0) {
            valueOf = "+".concat(String.valueOf(i2));
        } else {
            valueOf = String.valueOf(i2);
        }
        String a2 = a.a("%d-%02d-%02d %02d:%02d:%02d.%03d GMT%s", Arrays.copyOf(new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5)), Integer.valueOf(instance.get(11)), Integer.valueOf(instance.get(12)), Integer.valueOf(instance.get(13)), Integer.valueOf(instance.get(14)), valueOf}, 8));
        l.b(a2, "");
        return a2;
    }
}
