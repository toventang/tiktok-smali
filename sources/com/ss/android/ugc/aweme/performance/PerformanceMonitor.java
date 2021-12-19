package com.ss.android.ugc.aweme.performance;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface PerformanceMonitor extends Parcelable {
    static {
        Covode.recordClassIndex(73838);
    }

    String a();

    List<String> b();
}
