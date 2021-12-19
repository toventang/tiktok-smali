package com.bytedance.ies.powerpermissions.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f34454a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC0768a f34455b;

    /* renamed from: com.bytedance.ies.powerpermissions.c.a$a  reason: collision with other inner class name */
    public enum EnumC0768a {
        GRANTED,
        THIS_OPERATION_NOT_PERMITTED,
        DENIED_PERMANENT;

        static {
            Covode.recordClassIndex(20591);
        }
    }

    static {
        Covode.recordClassIndex(20590);
    }

    public final boolean a() {
        if (this.f34455b == EnumC0768a.GRANTED) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "[" + this.f34454a + ':' + this.f34455b + ']';
    }

    public a(String str, EnumC0768a aVar) {
        l.c(str, "");
        l.c(aVar, "");
        this.f34454a = str;
        this.f34455b = aVar;
    }
}
