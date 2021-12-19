package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;

/* access modifiers changed from: package-private */
public final class hk implements im {

    /* renamed from: b  reason: collision with root package name */
    private static final hu f50980b = new hi();

    /* renamed from: a  reason: collision with root package name */
    private final hu f50981a;

    static {
        Covode.recordClassIndex(31850);
    }

    public hk() {
        this(new hm(gj.f50932a, a()));
    }

    private static hu a() {
        try {
            return (hu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f50980b;
        }
    }

    private hk(hu huVar) {
        this.f50981a = (hu) gp.a((Object) huVar, "messageInfoFactory");
    }

    private static boolean a(hr hrVar) {
        if (hrVar.a() == gm.e.f50948h) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.im
    public final <T> in<T> a(Class<T> cls) {
        if (gm.class.isAssignableFrom(cls) || ip.f51032a == null || ip.f51032a.isAssignableFrom(cls)) {
            hr b2 = this.f50981a.b(cls);
            if (b2.b()) {
                if (gm.class.isAssignableFrom(cls)) {
                    return hz.a(ip.f51035d, gc.f50905a, b2.c());
                }
                return hz.a(ip.f51033b, gc.a(), b2.c());
            } else if (gm.class.isAssignableFrom(cls)) {
                if (a(b2)) {
                    return hx.a(b2, id.f51014b, hd.f50975b, ip.f51035d, gc.f50905a, hs.f50989b);
                }
                return hx.a(b2, id.f51014b, hd.f50975b, ip.f51035d, (ga<?>) null, hs.f50989b);
            } else if (a(b2)) {
                return hx.a(b2, id.f51013a, hd.f50974a, ip.f51033b, gc.a(), hs.f50988a);
            } else {
                return hx.a(b2, id.f51013a, hd.f50974a, ip.f51034c, (ga<?>) null, hs.f50988a);
            }
        } else {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
