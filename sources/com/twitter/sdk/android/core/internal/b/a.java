package com.twitter.sdk.android.core.internal.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f155955a;

    static {
        Covode.recordClassIndex(103624);
    }

    public a(Context context) {
        if (context != null) {
            this.f155955a = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
