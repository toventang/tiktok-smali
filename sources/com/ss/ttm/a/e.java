package com.ss.ttm.a;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f151888a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f151889b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f151890c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f151891d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f151892e = Build.HARDWARE;

    /* renamed from: f  reason: collision with root package name */
    public static final String f151893f = Build.BRAND;

    /* renamed from: g  reason: collision with root package name */
    public static final String f151894g;

    static {
        Covode.recordClassIndex(101280);
        int i2 = Build.VERSION.SDK_INT;
        f151888a = i2;
        String str = Build.DEVICE;
        f151889b = str;
        String str2 = Build.MANUFACTURER;
        f151890c = str2;
        String str3 = Build.MODEL;
        f151891d = str3;
        f151894g = str + ", " + str3 + ", " + str2 + ", " + i2;
    }
}
