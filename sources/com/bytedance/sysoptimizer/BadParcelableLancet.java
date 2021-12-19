package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public class BadParcelableLancet {
    static {
        Covode.recordClassIndex(26972);
    }

    public Bundle getBundleExtra(String str) {
        Bundle bundle = (Bundle) new Object();
        Context context = BadParcelableCrashOptimizer.getContext();
        if (context != null) {
            bundle.setClassLoader(context.getClassLoader());
        }
        return bundle;
    }
}
