package com.ss.android.ugc.asve.recorder.camera;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VECameraSettings;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f62210a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f62211b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f62212c = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(38235);
    }

    public static final boolean a(int i2) {
        if (i2 == -1 || i2 != VECameraSettings.CAMERA_TYPE.TYPE_GNOB_Unit.ordinal()) {
            return false;
        }
        return true;
    }
}
