package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final a f25253a = new a((byte) 0);

    static class a {
        static {
            Covode.recordClassIndex(14710);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(14709);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
