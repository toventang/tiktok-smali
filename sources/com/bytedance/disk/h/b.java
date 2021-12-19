package com.bytedance.disk.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f28619a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f28620b;

    public interface a {
        static {
            Covode.recordClassIndex(16815);
        }
    }

    static {
        Covode.recordClassIndex(16813);
    }

    /* renamed from: com.bytedance.disk.h.b$b  reason: collision with other inner class name */
    public static class C0614b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28622a = new b((byte) 0);

        static {
            Covode.recordClassIndex(16816);
        }
    }

    private b() {
        HandlerThread handlerThread = new HandlerThread("HandleUtil");
        this.f28619a = handlerThread;
        handlerThread.start();
        this.f28620b = new Handler(this.f28619a.getLooper(), new Handler.Callback() {
            /* class com.bytedance.disk.h.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16814);
            }

            public final boolean handleMessage(Message message) {
                if (message.obj == null || !(message.obj instanceof a)) {
                    return true;
                }
                Object obj = message.obj;
                return true;
            }
        });
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(Runnable runnable) {
        this.f28620b.post(runnable);
    }
}
