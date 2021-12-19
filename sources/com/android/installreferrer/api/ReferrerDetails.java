package com.android.installreferrer.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public class ReferrerDetails {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f5910a;

    static {
        Covode.recordClassIndex(2474);
    }

    public ReferrerDetails(Bundle bundle) {
        this.f5910a = bundle;
    }

    public final String a() {
        return this.f5910a.getString("install_referrer");
    }
}
