package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.w;
import java.util.List;

public abstract class l {
    public static final a Companion = new a((byte) 0);
    public static l INSTANCE;

    static {
        Covode.recordClassIndex(17816);
    }

    public abstract void addJsbEvent(k kVar);

    public abstract List<k> getJsbEvents();

    public static final class a {
        static {
            Covode.recordClassIndex(17817);
        }

        private a() {
        }

        public static l a() {
            l lVar;
            try {
                Object newInstance = Class.forName("com.bytedance.helios.sdk.jsb.JsbEventFetcherImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance != null) {
                    lVar = (l) newInstance;
                    l.INSTANCE = lVar;
                    return lVar;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                lVar = null;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
