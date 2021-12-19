package com.a.b;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.net.e.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static com.a.b.c.a f4924a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f4925b = true;

    static {
        Covode.recordClassIndex(2032);
    }

    public static View a(Context context, int i2) {
        MethodCollector.i(8482);
        View a2 = a(context, i2, new FrameLayout(context), false);
        MethodCollector.o(8482);
        return a2;
    }

    public static View a(Context context, int i2, ViewGroup viewGroup, boolean z) {
        return a(context, i2, viewGroup, z, -1);
    }

    public static View a(Context context, int i2, ViewGroup viewGroup, boolean z, int i3) {
        return b(context, i2, viewGroup, z, i3);
    }

    private static View b(Context context, int i2, ViewGroup viewGroup, boolean z, int i3) {
        View a2;
        if (!f4925b) {
            return com.a.a(LayoutInflater.from(context), i2, viewGroup, z);
        }
        e eVar = f.f4951a.get(i2);
        if (eVar == null) {
            Integer.toHexString(i2);
            if (f4924a != null) {
                Integer.toHexString(i2);
                Integer.toHexString(i3);
            }
            return com.a.a(LayoutInflater.from(context), i2, viewGroup, z);
        }
        try {
            if (!b.a()) {
                a2 = f.a(eVar, context, viewGroup, z);
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a2 = f.a(eVar, context, viewGroup, z);
                b.a("x2c", i2, SystemClock.elapsedRealtime() - elapsedRealtime, context);
            }
            if (f4924a != null) {
                Integer.toHexString(i2);
                Integer.toHexString(i3);
            }
            return a2;
        } catch (Throwable th) {
            com.a.b.c.a aVar = f4924a;
            if (aVar != null) {
                Integer.toHexString(i2);
                Integer.toHexString(i3);
                aVar.a(th);
            }
            if (!g.f4952a) {
                return com.a.a(LayoutInflater.from(context), i2, viewGroup, z);
            }
            th.getMessage();
            throw new IllegalStateException(th);
        }
    }
}
