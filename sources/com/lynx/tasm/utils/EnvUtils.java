package com.lynx.tasm.utils;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.lancet.d;

public class EnvUtils {
    static {
        Covode.recordClassIndex(35468);
    }

    public static String getCacheDir() {
        Application application = LynxEnv.b().f55531a;
        if (d.f107194b == null || !d.f107197e) {
            d.f107194b = application.getCacheDir();
        }
        return d.f107194b.getAbsolutePath();
    }
}
