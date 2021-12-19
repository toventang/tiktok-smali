package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface ja {
    static {
        Covode.recordClassIndex(32330);
    }

    void a(JobParameters jobParameters);

    void a(Intent intent);

    boolean a(int i2);
}
