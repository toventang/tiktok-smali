package com.ss.ugc.live.sdk.msg.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class h extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f154190a;

    public interface a {
        static {
            Covode.recordClassIndex(102830);
        }

        void a(Message message);
    }

    static {
        Covode.recordClassIndex(102829);
    }

    public final void handleMessage(Message message) {
        a aVar = this.f154190a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    public h(Looper looper, a aVar) {
        super(looper);
        this.f154190a = new WeakReference<>(aVar);
    }
}
