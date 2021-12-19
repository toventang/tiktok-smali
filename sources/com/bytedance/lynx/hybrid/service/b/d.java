package com.bytedance.lynx.hybrid.service.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.service.b.c;
import h.f.b.l;

public class d implements com.bytedance.lynx.hybrid.service.a.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41247b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private String f41248a = "default_bid";

    static {
        Covode.recordClassIndex(25268);
    }

    @Override // com.bytedance.lynx.hybrid.service.a.a
    public void u_() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25269);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.a.a
    public final String b() {
        return this.f41248a;
    }

    @Override // com.bytedance.lynx.hybrid.service.a.a
    public final void a(String str) {
        l.c(str, "");
        this.f41248a = str;
    }

    public final <T extends com.bytedance.lynx.hybrid.service.a.a> T a(Class<T> cls) {
        l.c(cls, "");
        return (T) c.a.a().a(this.f41248a, cls);
    }
}
