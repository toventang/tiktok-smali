package com.bytedance.lynx.hybrid.service.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.lynx.hybrid.service.a.a> f41249a;

    /* renamed from: b  reason: collision with root package name */
    private String f41250b;

    static {
        Covode.recordClassIndex(25270);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ConcurrentHashMap<String, com.bytedance.lynx.hybrid.service.a.a> f41251a = new ConcurrentHashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public String f41252b = "default_bid";

        static {
            Covode.recordClassIndex(25271);
        }

        public final e a() {
            return new e(this, (byte) 0);
        }

        public final a a(String str) {
            l.c(str, "");
            this.f41252b = str;
            return this;
        }
    }

    private e() {
        this.f41249a = new ConcurrentHashMap<>();
    }

    public final com.bytedance.lynx.hybrid.service.a.a a(String str) {
        l.c(str, "");
        return this.f41249a.get(str);
    }

    private e(a aVar) {
        this();
        this.f41250b = aVar.f41252b;
        this.f41249a.putAll(aVar.f41251a);
    }

    public /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }

    public final void a(String str, com.bytedance.lynx.hybrid.service.a.a aVar) {
        l.c(str, "");
        l.c(aVar, "");
        com.bytedance.lynx.hybrid.service.a.a aVar2 = this.f41249a.get(str);
        if (aVar2 != null) {
            aVar2.u_();
        }
        String str2 = this.f41250b;
        if (str2 == null) {
            l.a("bid");
        }
        aVar.a(str2);
        this.f41249a.put(str, aVar);
    }
}
