package com.bytedance.ug.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class g implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f45734a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(27826);
    }

    g() {
    }

    @Override // com.bytedance.ug.a.l
    public final void a(a aVar) {
        final RuntimeException runtimeException = new RuntimeException();
        this.f45734a.post(new Runnable() {
            /* class com.bytedance.ug.a.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(27827);
            }

            public final void run() {
                throw runtimeException;
            }
        });
    }
}
