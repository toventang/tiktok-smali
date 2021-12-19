package com.ss.android.ugc.aweme.performance;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.n;
import java.util.Arrays;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f114805a = Arrays.asList("REDMI 6A", "VIVO 1812", "MRD-LX1F", "VIVO 1908", "MRD-LX1", "AMN-LX9", "TECNO ID3K", "TECNO KB2", "TECNO KB3", "KSA-LX9", "INFINIX X627V");

    /* renamed from: b  reason: collision with root package name */
    private static volatile int f114806b = 0;

    public static boolean a() {
        if (n.a()) {
            return n.b();
        }
        if (f114806b == -1 || f114806b == 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (n.a()) {
            return n.b();
        }
        if (f114806b == -1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(73857);
    }

    public static void a(h hVar) {
        if (!a()) {
            hVar.a();
        }
    }

    public static void a(Context context) {
        if (context != null) {
            SharedPreferences a2 = d.a(context, "performance_sp", 0);
            if (a2.getInt("update_version", -1) != 2) {
                f114806b = ((Integer) b(context).first).intValue();
                a2.edit().putInt("update_version", 2).putInt("performance_poor_score", f114806b).apply();
            } else if (a2.contains("performance_poor_score")) {
                f114806b = a2.getInt("performance_poor_score", 0);
            } else if (a2.getBoolean("is_performance_poor", false)) {
                f114806b = 1;
            }
        }
    }

    private static Pair<Integer, String> b(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return new Pair<>(-1, "Android 6.0 and below");
        }
        long a2 = g.a(context);
        if (a2 <= 1287651328) {
            return new Pair<>(-1, "1.2G RAM and below");
        }
        if (a2 <= 1610612736) {
            return new Pair<>(1, "1.5G RAM and below");
        }
        int a3 = g.a();
        int b2 = g.b();
        if (a3 <= 4 && b2 <= 2048000) {
            return new Pair<>(1, "4 core and below && The main frequency is lower than 2GHZ");
        }
        if (a2 <= 2147483648L && Build.VERSION.SDK_INT < 24) {
            return new Pair<>(1, "2G RAM and below && Android7.0 and below");
        }
        if (b2 > 0 && b2 <= 1620000) {
            return new Pair<>(1, "The main frequency is lower than 1.6GHZ");
        }
        String str = Build.MODEL;
        for (String str2 : f114805a) {
            if (str2.equalsIgnoreCase(str)) {
                return new Pair<>(1, "The filtering model is a low-end machine： ".concat(String.valueOf(str)));
            }
        }
        return new Pair<>(0, "");
    }
}
