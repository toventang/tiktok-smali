package com.bytedance.apm;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public a f24991a;

    /* renamed from: b  reason: collision with root package name */
    private HashSet<String> f24992b;

    public interface a {
        static {
            Covode.recordClassIndex(14593);
        }

        void a(String str);

        void a(Throwable th, String str);

        void b(Throwable th, String str);
    }

    static {
        Covode.recordClassIndex(14591);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final h f24998a = new h((byte) 0);

        static {
            Covode.recordClassIndex(14594);
        }
    }

    private h() {
        this.f24992b = new HashSet<>();
    }

    /* synthetic */ h(byte b2) {
        this();
    }

    public final void a(String str) {
        if (this.f24991a != null && !this.f24992b.contains(str)) {
            this.f24992b.add(str);
            this.f24991a.a("apm_".concat(String.valueOf(str)));
        }
        if (c.e()) {
            new RuntimeException(str);
            System.exit(1);
        }
    }

    public final void b(Throwable th, String str) {
        try {
            a aVar = this.f24991a;
            if (aVar != null) {
                aVar.b(th, str);
            }
        } catch (Throwable unused) {
        }
        if (c.e() || c.f()) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, String str) {
        if (this.f24991a != null && !this.f24992b.contains(str)) {
            this.f24992b.add(str);
            this.f24991a.a(th, "apm_".concat(String.valueOf(str)));
        }
    }
}
