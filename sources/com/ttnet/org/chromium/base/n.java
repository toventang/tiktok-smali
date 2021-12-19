package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class n extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f155285a;

    public interface a {
        static {
            Covode.recordClassIndex(103334);
        }
    }

    static {
        Covode.recordClassIndex(103333);
    }

    public final void handleMessage(Message message) {
        this.f155285a.get();
    }

    public n(Looper looper, a aVar) {
        super(looper);
        this.f155285a = new WeakReference<>(aVar);
    }
}
