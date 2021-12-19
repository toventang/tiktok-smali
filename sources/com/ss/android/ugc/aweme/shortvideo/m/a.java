package com.ss.android.ugc.aweme.shortvideo.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VECameraSettings;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f128744a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f128745b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f128746c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(84388);
    }

    public static final boolean a(int i2) {
        if (i2 == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()) {
            return true;
        }
        return false;
    }
}
