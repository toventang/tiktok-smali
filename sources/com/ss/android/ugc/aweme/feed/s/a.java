package com.ss.android.ugc.aweme.feed.s;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.e.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.a.b;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<k> f93863a;

    /* renamed from: b  reason: collision with root package name */
    public static b f93864b = new b() {
        /* class com.ss.android.ugc.aweme.feed.s.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(59713);
        }

        @Override // com.ss.android.ugc.aweme.ml.a.b
        public final int a() {
            k a2 = a.a();
            if (a2 != null) {
                return a2.aE();
            }
            return -1;
        }

        @Override // com.ss.android.ugc.aweme.ml.a.b
        public final Aweme b() {
            k a2 = a.a();
            if (a2 != null) {
                return a2.aD();
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.ml.a.b
        public final Aweme a(int i2) {
            k a2 = a.a();
            if (a2 == null) {
                return null;
            }
            try {
                return a2.f(i2);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.ss.android.ugc.aweme.ml.a.b
        public final Aweme a(String str) {
            aj k2;
            try {
                k a2 = a.a();
                if (a2 == null || (k2 = a2.k(str)) == null) {
                    return AwemeService.b().b(str);
                }
                return k2.b();
            } catch (Throwable unused) {
                return null;
            }
        }
    };

    static {
        Covode.recordClassIndex(59712);
    }

    public static k a() {
        WeakReference<k> weakReference = f93863a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
