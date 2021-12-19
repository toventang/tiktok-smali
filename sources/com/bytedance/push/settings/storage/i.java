package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.a;

public interface i {
    static {
        Covode.recordClassIndex(25869);
    }

    float a(String str, float f2);

    int a(String str, int i2);

    long a(String str, long j2);

    SharedPreferences.Editor a();

    String a(String str);

    String a(String str, String str2);

    void a(Context context, String str, String str2, a aVar);

    void a(a aVar);

    boolean a(String str, boolean z);

    int b(String str);

    long c(String str);

    float d(String str);

    boolean e(String str);

    boolean f(String str);
}
