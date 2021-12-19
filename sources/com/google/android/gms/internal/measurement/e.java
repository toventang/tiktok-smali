package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class e extends a implements c {
    static {
        Covode.recordClassIndex(31747);
    }

    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IStringProvider");
        MethodCollector.i(367);
        MethodCollector.o(367);
    }
}
