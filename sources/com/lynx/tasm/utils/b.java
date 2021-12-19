package com.lynx.tasm.utils;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f57027a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f57028b;

    /* renamed from: c  reason: collision with root package name */
    private static Typeface f57029c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f57030d;

    static {
        Covode.recordClassIndex(35471);
    }

    public static boolean c() {
        return "HUAWEI".equals(Build.MANUFACTURER);
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (b.class) {
            MethodCollector.i(12688);
            if (!f57027a) {
                try {
                    if (Class.forName("miui.os.Build") != null) {
                        f57028b = true;
                    }
                } catch (Exception unused) {
                }
                f57027a = true;
            }
            z = f57028b;
            MethodCollector.o(12688);
        }
        return z;
    }

    public static synchronized Typeface b() {
        synchronized (b.class) {
            MethodCollector.i(12818);
            if (!a()) {
                MethodCollector.o(12818);
                return null;
            } else if (f57030d) {
                Typeface typeface = f57029c;
                MethodCollector.o(12818);
                return typeface;
            } else {
                try {
                    TextPaint paint = new TextView(LynxEnv.b().f55531a).getPaint();
                    if (paint != null) {
                        f57029c = paint.getTypeface();
                    }
                } catch (Exception unused) {
                    LLog.d("Lynx", "get default typeface failed");
                }
                f57030d = true;
                Typeface typeface2 = f57029c;
                MethodCollector.o(12818);
                return typeface2;
            }
        }
    }
}
