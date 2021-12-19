package com.bytedance.im.core.internal.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class x extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f38876a;

    public interface a {
        static {
            Covode.recordClassIndex(23176);
        }

        void a(Message message);
    }

    static {
        Covode.recordClassIndex(23175);
    }

    public final void handleMessage(Message message) {
        a aVar = this.f38876a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    public x(Looper looper, a aVar) {
        super(looper);
        this.f38876a = new WeakReference<>(aVar);
    }
}
