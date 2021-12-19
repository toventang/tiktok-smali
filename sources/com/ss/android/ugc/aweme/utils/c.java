package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f142752a;

    /* renamed from: b  reason: collision with root package name */
    public static ArrayList<Object> f142753b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f142754c = false;

    static {
        Covode.recordClassIndex(93376);
    }

    public static void a() {
        MethodCollector.i(7177);
        f142754c = true;
        int size = f142753b.size();
        if (size > 0) {
            synchronized (f142753b) {
                int i2 = 0;
                while (true) {
                    try {
                        f142753b.get(i2);
                        i2++;
                        if (i2 < size) {
                        }
                    } finally {
                        MethodCollector.o(7177);
                    }
                }
            }
            return;
        }
        MethodCollector.o(7177);
    }
}
