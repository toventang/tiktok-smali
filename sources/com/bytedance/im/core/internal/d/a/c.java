package com.bytedance.im.core.internal.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.proto.Response;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f38703a;

    /* renamed from: b  reason: collision with root package name */
    public String f38704b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f38705c;

    /* renamed from: d  reason: collision with root package name */
    public Response f38706d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f38707a = new c((byte) 0);

        static {
            Covode.recordClassIndex(23079);
        }
    }

    static {
        Covode.recordClassIndex(23078);
    }

    private c() {
    }

    public final boolean a() {
        int i2 = this.f38703a;
        if (i2 < 200 || i2 >= 300) {
            return false;
        }
        return true;
    }

    /* synthetic */ c(byte b2) {
        this();
    }
}
