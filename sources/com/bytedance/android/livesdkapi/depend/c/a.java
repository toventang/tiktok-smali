package com.bytedance.android.livesdkapi.depend.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<AbstractC0502a> f22947a;

    /* renamed from: com.bytedance.android.livesdkapi.depend.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0502a {
        static {
            Covode.recordClassIndex(13579);
        }

        void handleMsg(Message message);
    }

    static {
        Covode.recordClassIndex(13578);
    }

    public void handleMessage(Message message) {
        AbstractC0502a aVar = this.f22947a.get();
        if (aVar != null && message != null) {
            aVar.handleMsg(message);
        }
    }

    public a(AbstractC0502a aVar) {
        this.f22947a = new WeakReference<>(aVar);
    }

    public a(Looper looper, AbstractC0502a aVar) {
        super(looper);
        this.f22947a = new WeakReference<>(aVar);
    }
}
