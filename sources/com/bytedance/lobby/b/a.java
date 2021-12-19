package com.bytedance.lobby.b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f40174a;

    static {
        Covode.recordClassIndex(24759);
    }

    public final Bundle b() {
        return a();
    }

    public final synchronized Bundle a() {
        Bundle bundle;
        MethodCollector.i(7167);
        if (this.f40174a == null) {
            this.f40174a = new Bundle();
        }
        bundle = this.f40174a;
        MethodCollector.o(7167);
        return bundle;
    }

    public final a a(String str, String str2) {
        a().putString(str, str2);
        return this;
    }
}
