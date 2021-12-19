package com.bytedance.android.live.liveinteract.multilive.d;

import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.multilive.c.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0243a f11775b = new C0243a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f11776a;

    static {
        Covode.recordClassIndex(6422);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.d.a$a  reason: collision with other inner class name */
    public static final class C0243a {
        static {
            Covode.recordClassIndex(6423);
        }

        private C0243a() {
        }

        public /* synthetic */ C0243a(byte b2) {
            this();
        }
    }

    public a(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f11776a = dataChannel;
    }

    public static m a(String str) {
        l.d(str, "");
        try {
            return (m) e.a.f9628b.a(str, m.class);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("RtcMessageReader", e2);
            return null;
        }
    }
}
