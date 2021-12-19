package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface j {
    static {
        Covode.recordClassIndex(31311);
    }

    Activity a();

    <T extends LifecycleCallback> T a(String str, Class<T> cls);

    void a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i2);
}
