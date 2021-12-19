package com.bytedance.platform.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f41916a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, HandlerThread> f41917b = new HashMap<>();

    public static class a extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f41918a;

        static {
            Covode.recordClassIndex(25603);
        }

        public final synchronized void start() {
            MethodCollector.i(13277);
            if (this.f41918a) {
                MethodCollector.o(13277);
                return;
            }
            this.f41918a = true;
            super.start();
            MethodCollector.o(13277);
        }

        public a(String str) {
            super(str, 0);
        }
    }

    static {
        Covode.recordClassIndex(25602);
    }

    public static HandlerThread a(String str) {
        a aVar = new a(str);
        aVar.start();
        return aVar;
    }
}
