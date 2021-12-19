package com.bytedance.android.livesdk.browser;

import android.app.Activity;
import com.bytedance.android.live.b.k;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14388b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, WeakReference<Activity>> f14389a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(7971);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7972);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f14410a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final b f14411b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(7973);
        }
    }

    @Override // com.bytedance.android.live.b.k
    public final void a(String str, Activity activity) {
        l.d(str, "");
        l.d(activity, "");
        this.f14389a.put(str, new WeakReference<>(activity));
    }
}
