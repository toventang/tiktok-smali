package com.bytedance.lobby.facebook;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.d;
import com.bytedance.lobby.internal.BaseProvider;
import com.facebook.j;
import com.facebook.m;
import com.ss.android.ugc.aweme.lancet.a.a;

class FacebookProvider<T> extends BaseProvider<T> {

    /* renamed from: b  reason: collision with root package name */
    private Application f40187b;

    static {
        Covode.recordClassIndex(24773);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void d() {
        if (!m.a()) {
            m.f48915a = this.f40228c.f40177c;
            try {
                Context applicationContext = this.f40187b.getApplicationContext();
                if (a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = a.f107166a;
                    }
                }
                m.a(applicationContext);
            } catch (j e2) {
                if (com.bytedance.lobby.a.f40144a) {
                    throw e2;
                }
            }
        }
    }

    FacebookProvider(Application application, d dVar) {
        super(application, dVar);
        this.f40187b = application;
    }
}
