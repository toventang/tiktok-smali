package com.ss.android.ugc.aweme.ecommerce.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f84195a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f84196b;

    static {
        Covode.recordClassIndex(52510);
    }

    public a(boolean z, Context context) {
        int i2;
        this.f84196b = z;
        if (context != null) {
            i2 = context.hashCode();
        } else {
            i2 = 0;
        }
        this.f84195a = i2;
    }
}
