package com.ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f145459a;

    static {
        Covode.recordClassIndex(95114);
    }

    l(Boolean bool) {
        this.f145459a = bool;
    }

    public final void run() {
        Boolean bool = this.f145459a;
        int intValue = c.f99077a.f99078b.getPushdelayinitSwitch().intValue();
        if (bool.booleanValue()) {
            intValue = 0;
        }
        new Handler(Looper.getMainLooper()).postDelayed(r.f145465a, (long) intValue);
    }
}
