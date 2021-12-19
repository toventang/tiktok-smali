package com.lynx.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public class g extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f55519a;

    public interface a {
        static {
            Covode.recordClassIndex(34763);
        }

        void handleMsg(Message message);
    }

    static {
        Covode.recordClassIndex(34762);
    }

    public void handleMessage(Message message) {
        a aVar = this.f55519a.get();
        if (aVar != null && message != null) {
            aVar.handleMsg(message);
        }
    }

    public g(Looper looper, a aVar) {
        super(looper);
        this.f55519a = new WeakReference<>(aVar);
    }
}
