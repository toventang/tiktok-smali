package com.ss.android.ugc.aweme.im.sdk.chat.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;

public final class g extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f100237a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f100238b;

    public interface a {
        static {
            Covode.recordClassIndex(63892);
        }

        void a();

        void a(int i2);

        void a(Object obj, int i2);
    }

    static {
        Covode.recordClassIndex(63891);
    }

    public g(a aVar) {
        this.f100237a = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.f100237a.get();
        if (aVar != null && message != null) {
            Object obj = message.obj;
            switch (message.what) {
                case 1:
                    aVar.a(message.arg1);
                    if (this.f100238b != 0) {
                        this.f100238b = 0;
                        removeMessages(1);
                        return;
                    }
                    return;
                case 2:
                    if (this.f100238b == 0) {
                        sendEmptyMessageDelayed(1, 300);
                    }
                    this.f100238b++;
                    return;
                case 3:
                    aVar.a();
                    return;
                case 4:
                    if (obj != null) {
                        aVar.a(obj, 0);
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (obj != null) {
                        aVar.a(obj, 1);
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (obj != null) {
                        aVar.a(obj, 2);
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (obj != null) {
                        aVar.a(obj, 3);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public g(Looper looper, a aVar) {
        super(looper);
        this.f100237a = new WeakReference<>(aVar);
    }

    public final boolean sendMessageAtTime(Message message, long j2) {
        com.ss.android.ugc.aweme.im.service.m.a.b("RefreshHandler", "sendMessageAtTime msg=" + message + " uptimeMillis=" + j2);
        return super.sendMessageAtTime(message, j2);
    }
}
