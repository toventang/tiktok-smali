package com.ss.android.socialbase.downloader.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class h extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f60736a;

    public interface a {
        static {
            Covode.recordClassIndex(37476);
        }

        void a(Message message);
    }

    static {
        Covode.recordClassIndex(37475);
    }

    public final void handleMessage(Message message) {
        a aVar = this.f60736a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    public h(Looper looper, a aVar) {
        super(looper);
        this.f60736a = new WeakReference<>(aVar);
    }
}
