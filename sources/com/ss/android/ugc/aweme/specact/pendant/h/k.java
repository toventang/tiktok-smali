package com.ss.android.ugc.aweme.specact.pendant.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.specact.pendant.h.j;
import h.f.b.l;
import java.util.Calendar;
import java.util.Date;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f134313a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(87839);
    }

    public static int a() {
        if (j.a.a().a()) {
            return (int) (System.currentTimeMillis() / 1000);
        }
        return NetworkUtils.getServerTime();
    }

    public static long b() {
        Calendar instance = Calendar.getInstance();
        Date date = new Date((((long) a()) * 1000) + 0);
        l.b(instance, "");
        instance.setTime(date);
        instance.set(11, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis() / 1000;
    }

    public static boolean a(long j2) {
        if (b() == j2) {
            return true;
        }
        return false;
    }
}
