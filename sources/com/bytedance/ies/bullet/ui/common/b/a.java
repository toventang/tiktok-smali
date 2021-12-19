package com.bytedance.ies.bullet.ui.common.b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(19743);
    }

    void a(Activity activity, int i2, int i3, Intent intent);

    void a(Activity activity, int i2, String[] strArr, int[] iArr);

    void a(Activity activity, Configuration configuration);

    void a(Activity activity, Bundle bundle);

    void a(Activity activity, boolean z);

    boolean a(Activity activity);

    void b(Activity activity);

    void b(Activity activity, Bundle bundle);

    void c(Activity activity);

    void c(Activity activity, Bundle bundle);

    void d(Activity activity);

    void e(Activity activity);

    void f(Activity activity);
}
