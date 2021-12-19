package com.bytedance.android.live.liveinteract.multiguest.a.e;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f11128c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f11129a;

    /* renamed from: b  reason: collision with root package name */
    public final b f11130b;

    static {
        Covode.recordClassIndex(5981);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5982);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f11129a.f();
    }

    public d(b bVar) {
        a cVar;
        l.d(bVar, "");
        this.f11130b = bVar;
        if (LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue()) {
            cVar = new e(bVar);
        } else {
            cVar = new c(bVar);
        }
        this.f11129a = cVar;
    }
}
