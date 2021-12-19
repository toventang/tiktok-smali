package com.bytedance.android.live.broadcast.api.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f7523a = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.android.live.broadcast.api.c.a.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        private HashMap<String, String> f7524a = new HashMap<>(10);

        static {
            Covode.recordClassIndex(3702);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1 || i2 == 2) {
                Pair pair = (Pair) message.obj;
                this.f7524a.put(pair.first, pair.second);
            } else if (i2 == 3) {
                b.a.a("livesdk_performance_anchor_create_room_duration").a((Map<String, String>) this.f7524a).b();
                this.f7524a = new HashMap<>(10);
            }
        }
    };

    public static void a() {
        Handler handler = f7523a;
        handler.sendMessage(Message.obtain(handler, 3));
    }

    static {
        Covode.recordClassIndex(3701);
    }

    public static void a(String str, String str2) {
        Handler handler = f7523a;
        Message obtain = Message.obtain(handler, 2);
        obtain.obj = new Pair(str, str2);
        handler.sendMessage(obtain);
    }
}
