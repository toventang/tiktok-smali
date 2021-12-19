package com.twitter.sdk.android.core.internal;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C4119a f155944a;

    public static abstract class b {
        static {
            Covode.recordClassIndex(103616);
        }

        public void a() {
        }
    }

    static {
        Covode.recordClassIndex(103613);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.a$a  reason: collision with other inner class name */
    public static class C4119a {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Application.ActivityLifecycleCallbacks> f155945a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Application f155946b;

        static {
            Covode.recordClassIndex(103614);
        }

        C4119a(Application application) {
            this.f155946b = application;
        }
    }

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f155944a = new C4119a((Application) applicationContext);
    }
}
