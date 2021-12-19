package com.bytedance.android.live.core.f;

import android.os.Debug;
import com.bytedance.covode.number.Covode;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static long f9112a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f9113b = "";

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f9114c = {0, 192, 290, 512, 1024, 1536, 2048};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f9115d = {0, 528, 620, 1020, 1220, 1520, 2020};

    /* renamed from: e  reason: collision with root package name */
    private static long f9116e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static String f9117f = "";

    public static long a() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return (long) memoryInfo.getTotalPss();
    }

    static {
        Covode.recordClassIndex(4670);
    }
}
