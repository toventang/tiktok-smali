package com.ss.android.ttvecamera.g;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f61545a = {2, 0, 1, 3};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f61546b = {1, 2, 0, 3};

    public static boolean a() {
        if (Build.BRAND.toLowerCase().equals("samsung")) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(37882);
    }
}
