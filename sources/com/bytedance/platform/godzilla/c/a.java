package com.bytedance.platform.godzilla.c;

import android.app.Application;
import com.bytedance.covode.number.Covode;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public c f41978a;

    static {
        Covode.recordClassIndex(25651);
    }

    public abstract String b();

    public d d() {
        return d.IMMEDIATE;
    }

    public void a() {
        this.f41978a = c.STARTED;
    }

    public void a(Application application) {
        this.f41978a = c.INITIALIZED;
    }
}
