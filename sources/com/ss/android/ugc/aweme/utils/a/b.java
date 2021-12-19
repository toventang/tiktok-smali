package com.ss.android.ugc.aweme.utils.a;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(93273);
    }

    public static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        Handler f142587a;

        /* renamed from: b  reason: collision with root package name */
        Handler.Callback f142588b;

        /* renamed from: c  reason: collision with root package name */
        public List<Handler.Callback> f142589c = new ArrayList();

        static {
            Covode.recordClassIndex(93274);
        }

        public final boolean handleMessage(Message message) {
            Handler handler;
            if (message == null) {
                Handler.Callback callback = this.f142588b;
                if (callback != null) {
                    return callback.handleMessage(message);
                }
                return false;
            } else if (message.what == 131 && Build.VERSION.SDK_INT == 19 && !m.a(Build.MODEL) && Build.MODEL.toLowerCase().trim().startsWith("vivo")) {
                try {
                    Handler.Callback callback2 = this.f142588b;
                    if ((callback2 == null || !callback2.handleMessage(message)) && (handler = this.f142587a) != null) {
                        handler.handleMessage(message);
                    }
                    return true;
                } catch (Throwable th) {
                    if (th instanceof SecurityException) {
                        return true;
                    }
                    throw th;
                }
            } else {
                for (Handler.Callback callback3 : this.f142589c) {
                    if (callback3.handleMessage(message)) {
                        return true;
                    }
                }
                Handler.Callback callback4 = this.f142588b;
                if (callback4 != null) {
                    return callback4.handleMessage(message);
                }
                return false;
            }
        }

        public a(Handler handler, Handler.Callback callback) {
            this.f142587a = handler;
            this.f142588b = callback;
        }
    }
}
