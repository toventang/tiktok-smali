package com.ss.android.ugc.aweme.lancet;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f107219a = true;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f107220b;

    static {
        Covode.recordClassIndex(68582);
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Handler f107221a;

        static {
            Covode.recordClassIndex(68583);
        }

        public final void handleMessage(Message message) {
            Handler handler = this.f107221a;
            if (handler != null) {
                handler.handleMessage(message);
            }
        }

        public a(Handler handler) {
            super(Looper.getMainLooper());
            this.f107221a = handler;
        }
    }
}
