package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;

public class VELensCallBacks {
    private volatile VEListener.z mLensStateListener;

    static {
        Covode.recordClassIndex(99143);
    }

    public void setmLensStateListener(Object obj) {
        this.mLensStateListener = (VEListener.z) obj;
    }

    public static boolean onAlgorithmProcess(Object obj, int i2) {
        if (obj instanceof VELensCallBacks) {
            VELensCallBacks vELensCallBacks = (VELensCallBacks) obj;
            if (vELensCallBacks.mLensStateListener == null || !vELensCallBacks.mLensStateListener.a()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
