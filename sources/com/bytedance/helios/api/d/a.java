package com.bytedance.helios.api.d;

import com.bytedance.covode.number.Covode;
import h.w;

public abstract class a {
    public static final C0642a Companion = new C0642a((byte) 0);
    public static a INSTANCE;

    static {
        Covode.recordClassIndex(17849);
    }

    public abstract void startMonitor();

    /* renamed from: com.bytedance.helios.api.d.a$a  reason: collision with other inner class name */
    public static final class C0642a {
        static {
            Covode.recordClassIndex(17850);
        }

        private C0642a() {
        }

        public static a a() {
            a aVar;
            try {
                Object newInstance = Class.forName("com.bytedance.helios.nativeaudio.AudioMonitorImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance != null) {
                    aVar = (a) newInstance;
                    a.INSTANCE = aVar;
                    return aVar;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                aVar = null;
            }
        }

        public /* synthetic */ C0642a(byte b2) {
            this();
        }
    }
}
