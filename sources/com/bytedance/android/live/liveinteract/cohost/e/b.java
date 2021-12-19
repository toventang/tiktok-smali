package com.bytedance.android.live.liveinteract.cohost.e;

import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10219a = new a((byte) 0);

    static {
        Covode.recordClassIndex(5374);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5375);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static com.bytedance.android.live.liveinteract.cohost.d.b a(String str) {
        l.d(str, "");
        try {
            return (com.bytedance.android.live.liveinteract.cohost.d.b) e.a.f9628b.a(str, com.bytedance.android.live.liveinteract.cohost.d.b.class);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("RtcMessageReader", e2);
            return null;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        l.d(str, "");
        l.d(cls, "");
        try {
            return (T) e.a.f9628b.a(str, (Class) cls);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("RtcMessageReader", e2);
            return null;
        }
    }
}
