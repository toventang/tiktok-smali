package com.ss.android.ugc.aweme.qrcode.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.io.File;
import java.util.concurrent.Callable;

public class b extends a<a> {
    static {
        Covode.recordClassIndex(77785);
    }

    public void a(String str) {
    }

    public boolean a() {
        return false;
    }

    public File b() {
        return null;
    }

    public final void a(final int i2, final String str) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.qrcode.d.b.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f119731c = null;

            static {
                Covode.recordClassIndex(77786);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return QRCodeApi.a(i2, str, this.f119731c);
            }
        }, 0);
    }
}
