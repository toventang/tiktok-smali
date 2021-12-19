package com.ss.android.ad.splash.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class q extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f58986a;

    public interface a {
        static {
            Covode.recordClassIndex(36493);
        }

        void a(Message message);
    }

    static {
        Covode.recordClassIndex(36492);
    }

    public final void handleMessage(Message message) {
        a aVar = this.f58986a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(com.ss.android.ad.splash.f.q.a r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x000e
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x000a:
            r1.<init>(r0, r2)
            return
        L_0x000e:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.f.q.<init>(com.ss.android.ad.splash.f.q$a):void");
    }

    public q(Looper looper, a aVar) {
        super(looper);
        this.f58986a = new WeakReference<>(aVar);
    }
}
