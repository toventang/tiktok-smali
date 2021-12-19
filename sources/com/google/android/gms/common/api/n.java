package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;

public final class n extends e {
    static {
        Covode.recordClassIndex(31336);
    }

    public final PendingIntent getResolution() {
        return this.mStatus.f49969i;
    }

    public n(Status status) {
        super(status);
    }

    public final void startResolutionForResult(Activity activity, int i2) {
        Status status = this.mStatus;
        if (status.b()) {
            activity.startIntentSenderForResult(status.f49969i.getIntentSender(), i2, null, 0, 0, 0);
        }
    }
}
