package com.bytedance.platform.godzilla.b;

import android.app.Application;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.platform.godzilla.b.b.d;

public final class a extends com.bytedance.platform.godzilla.c.a {

    /* renamed from: b  reason: collision with root package name */
    private Application f41959b;

    static {
        Covode.recordClassIndex(25628);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "DeadSystemExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final void a() {
        super.a();
        new b().a();
        if (Build.VERSION.SDK_INT == 29) {
            new d().a(this.f41959b);
            new com.bytedance.platform.godzilla.b.b.a().a();
        }
    }

    public a(Application application) {
        this.f41959b = application;
        if (application == null) {
            throw new IllegalArgumentException("Argument application can not be null!");
        }
    }
}
