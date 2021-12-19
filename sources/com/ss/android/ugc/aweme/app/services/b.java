package com.ss.android.ugc.aweme.app.services;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.boost_multidex.BoostMultiDex;
import com.bytedance.boost_multidex.Monitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.application.o;

public final class b {
    static {
        Covode.recordClassIndex(41195);
    }

    public static boolean a(Application application) {
        if (Build.VERSION.SDK_INT > 19) {
            return false;
        }
        String b2 = f.b(application);
        if (BoostMultiDex.isOptimizeProcess(b2)) {
            return true;
        }
        BoostMultiDex.install(application, new Monitor() {
            /* class com.ss.android.ugc.aweme.app.services.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41196);
            }

            @Override // com.bytedance.boost_multidex.Monitor
            public final void loadLibrary(String str) {
                if (o.f66957b.get(str) == null) {
                    Librarian.a(str, false, (Context) null);
                }
            }
        }.setProcessName(b2));
        return false;
    }
}
