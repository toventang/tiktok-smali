package com.ss.android.ugc.aweme.im;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;

public interface INotificationManagerService {
    static {
        Covode.recordClassIndex(63769);
    }

    ViewGroup a(Activity activity);

    void a(f fVar);

    void a(Integer num);

    void a(boolean z);

    boolean a();

    void b(Activity activity);

    void b(Integer num);

    boolean b();

    Activity c();

    void c(Integer num);

    void d(Integer num);

    void e(Integer num);
}
