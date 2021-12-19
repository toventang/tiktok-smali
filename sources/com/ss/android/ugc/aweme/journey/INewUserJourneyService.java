package com.ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.r;

public interface INewUserJourneyService {
    static {
        Covode.recordClassIndex(67196);
    }

    p a(int i2);

    r a();

    Class<? extends Activity> a(Intent intent);

    void a(Activity activity, Intent intent);

    void a(Activity activity, boolean z, boolean z2);

    void a(Context context);

    boolean a(Activity activity);

    boolean a(boolean z);

    void b();

    boolean b(Activity activity);
}
