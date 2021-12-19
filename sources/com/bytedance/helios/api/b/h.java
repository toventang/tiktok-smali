package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.w;

public abstract class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static h f30659a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f30660b = new a((byte) 0);

    static {
        Covode.recordClassIndex(17811);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17812);
        }

        private a() {
        }

        public static h a() {
            h hVar;
            try {
                Object newInstance = Class.forName("com.bytedance.helios.tools.skyeye.SkyEyeConsumer").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance != null) {
                    hVar = (h) newInstance;
                    h.f30659a = hVar;
                    return hVar;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                hVar = null;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
