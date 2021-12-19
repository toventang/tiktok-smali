package com.ss.android.ugc.aweme.bullet.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.a.a;
import com.bytedance.ies.bullet.c.d;
import com.ss.android.ugc.aweme.bullet.views.c;

public interface IBulletService {
    static {
        Covode.recordClassIndex(42412);
    }

    Activity a(String str);

    View a(Context context);

    d.b a();

    c a(Context context, String str, String str2, int i2, int i3);

    void a(Context context, String str);

    void a(Context context, String str, Bundle bundle);

    void a(Context context, String str, String str2, Bundle bundle);

    void a(Class<?> cls);

    a b();

    String b(String str);

    void b(Context context);

    boolean b(Context context, String str);

    void c();
}
