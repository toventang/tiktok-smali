package com.ss.ttm.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static StringBuilder f151882a;

    static {
        Covode.recordClassIndex(101276);
    }

    public static final void a(Context context, StringBuilder sb) {
        String[] a2 = f.a();
        if (a2 != null) {
            sb.append(com.a.a("version:%s,%s,%s\r\n", new Object[]{a2[0], a2[1], a2[2]})).append("\r\n");
        }
        long[] a3 = d.a();
        if (a3 != null) {
            sb.append(com.a.a(Locale.US, "rom memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(a3[0]), Long.valueOf(a3[1])})).append("\r\n");
        }
        long a4 = d.a(context);
        long b2 = d.b();
        sb.append(com.a.a(Locale.US, "ram memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(b2), Long.valueOf(a4)})).append("\r\n");
        long[] a5 = c.a(context);
        sb.append(com.a.a(Locale.US, "sdcard totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(a5[0]), Long.valueOf(a5[1])})).append("\r\n");
    }
}
