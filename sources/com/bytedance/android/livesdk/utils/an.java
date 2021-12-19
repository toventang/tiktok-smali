package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f22242a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f22243b = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: c  reason: collision with root package name */
    private static final SimpleDateFormat f22244c = new SimpleDateFormat("HH:mm");

    static {
        Covode.recordClassIndex(13136);
    }

    public static int a(int i2) {
        boolean z;
        if (i2 <= 0) {
            return 1;
        }
        if (i2 % 60 > 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = i2 / 60;
        if (z) {
            return i3 + 1;
        }
        return i3;
    }

    public static String a(long j2) {
        StringBuilder sb = new StringBuilder();
        long j3 = j2 / 60;
        long j4 = j2 - (60 * j3);
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3).append(":");
        if (j4 < 10) {
            sb.append("0");
        }
        sb.append(j4);
        return sb.toString();
    }

    public static String b(long j2) {
        StringBuilder sb = new StringBuilder();
        long j3 = j2 / 60;
        long j4 = j2 - (60 * j3);
        sb.append(j3).append(":");
        if (j4 < 10) {
            sb.append("0");
        }
        sb.append(j4);
        return sb.toString();
    }
}
