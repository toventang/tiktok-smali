package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f50262a;

    static {
        Covode.recordClassIndex(31310);
    }

    public i(Activity activity) {
        r.a(activity, "Activity must not be null");
        this.f50262a = activity;
    }
}
