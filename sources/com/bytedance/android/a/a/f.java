package com.bytedance.android.a.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.bytedance.android.a.a.c.b;
import com.bytedance.android.a.a.h.a;
import com.bytedance.android.a.a.h.h;
import com.bytedance.covode.number.Covode;

public abstract class f {
    static {
        Covode.recordClassIndex(3196);
    }

    public String a() {
        Context context = e.d().f6644b;
        if (!TextUtils.isEmpty(h.f6676a)) {
            return h.f6676a;
        }
        String a2 = e.d().f6648f.a("WEB_UA_KEY");
        if (context == null) {
            a.a("context is null");
        } else if (!h.f6677b.compareAndSet(false, true)) {
            a.a("already updated");
        } else {
            int i2 = Build.VERSION.SDK_INT;
            com.bytedance.android.a.a.c.a.a(new b(context) {
                /* class com.bytedance.android.a.a.h.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Context f6678a;

                static {
                    Covode.recordClassIndex(3213);
                }

                @Override // com.bytedance.android.a.a.c.c
                public final void a() {
                    h.a(WebSettings.getDefaultUserAgent(this.f6678a));
                }

                {
                    this.f6678a = r1;
                }
            });
        }
        if (TextUtils.isEmpty(a2)) {
            return System.getProperty("http.agent");
        }
        h.f6676a = a2;
        return a2;
    }
}
