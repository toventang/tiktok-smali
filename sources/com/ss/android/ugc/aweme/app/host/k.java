package com.ss.android.ugc.aweme.app.host;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.host.j;
import dagger.a.f;
import dagger.hilt.a.b;
import dagger.hilt.android.internal.c.c;
import dagger.hilt.android.internal.managers.d;

abstract class k extends Application implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final dagger.hilt.android.internal.managers.b f66803a = new dagger.hilt.android.internal.managers.b(new d() {
        /* class com.ss.android.ugc.aweme.app.host.k.AnonymousClass1 */

        static {
            Covode.recordClassIndex(41124);
        }

        @Override // dagger.hilt.android.internal.managers.d
        public final Object a() {
            j.c cVar = new j.c((byte) 0);
            cVar.f66802a = (c) f.a(new c(k.this));
            if (cVar.f66802a != null) {
                return new j(cVar.f66802a, (byte) 0);
            }
            throw new IllegalStateException(c.class.getCanonicalName() + " must be set");
        }
    });

    static {
        Covode.recordClassIndex(41123);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return this.f66803a.generatedComponent();
    }

    k() {
    }

    public void onCreate() {
        if (com.ss.android.common.util.f.a(this)) {
            generatedComponent();
        }
        super.onCreate();
    }
}
