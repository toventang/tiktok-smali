package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class b {

    /* renamed from: l  reason: collision with root package name */
    public static b f35870l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f35871m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public IHostFrameworkDepend f35872a;

    /* renamed from: b  reason: collision with root package name */
    public IHostLogDepend f35873b;

    /* renamed from: c  reason: collision with root package name */
    public IHostMediaDepend f35874c;

    /* renamed from: d  reason: collision with root package name */
    public IHostOpenDepend f35875d;

    /* renamed from: e  reason: collision with root package name */
    public IHostContextDepend f35876e;

    /* renamed from: f  reason: collision with root package name */
    public IHostStyleUIDepend f35877f;

    /* renamed from: g  reason: collision with root package name */
    public IHostRouterDepend f35878g;

    /* renamed from: h  reason: collision with root package name */
    public IHostUserDepend f35879h;

    /* renamed from: i  reason: collision with root package name */
    public IHostNetworkDepend f35880i;

    /* renamed from: j  reason: collision with root package name */
    public IHostPermissionDepend f35881j;

    /* renamed from: k  reason: collision with root package name */
    public IHostThreadPoolExecutorDepend f35882k;

    static {
        Covode.recordClassIndex(21441);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21442);
        }

        private a() {
        }

        public static b a() {
            return new b((byte) 0);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b() {
    }

    public final synchronized void a() {
        MethodCollector.i(11484);
        if (f35870l == null) {
            f35870l = this;
        }
        MethodCollector.o(11484);
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public final b a(IHostContextDepend iHostContextDepend) {
        l.c(iHostContextDepend, "");
        this.f35876e = iHostContextDepend;
        return this;
    }

    public final b a(IHostFrameworkDepend iHostFrameworkDepend) {
        l.c(iHostFrameworkDepend, "");
        this.f35872a = iHostFrameworkDepend;
        return this;
    }

    public final b a(IHostLogDepend iHostLogDepend) {
        l.c(iHostLogDepend, "");
        this.f35873b = iHostLogDepend;
        return this;
    }

    public final b a(IHostMediaDepend iHostMediaDepend) {
        l.c(iHostMediaDepend, "");
        this.f35874c = iHostMediaDepend;
        return this;
    }

    public final b a(IHostNetworkDepend iHostNetworkDepend) {
        l.c(iHostNetworkDepend, "");
        this.f35880i = iHostNetworkDepend;
        return this;
    }

    public final b a(IHostOpenDepend iHostOpenDepend) {
        l.c(iHostOpenDepend, "");
        this.f35875d = iHostOpenDepend;
        return this;
    }

    public final b a(IHostPermissionDepend iHostPermissionDepend) {
        l.c(iHostPermissionDepend, "");
        this.f35881j = iHostPermissionDepend;
        return this;
    }

    public final b a(IHostRouterDepend iHostRouterDepend) {
        l.c(iHostRouterDepend, "");
        this.f35878g = iHostRouterDepend;
        return this;
    }

    public final b a(IHostStyleUIDepend iHostStyleUIDepend) {
        l.c(iHostStyleUIDepend, "");
        this.f35877f = iHostStyleUIDepend;
        return this;
    }

    public final b a(IHostUserDepend iHostUserDepend) {
        l.c(iHostUserDepend, "");
        this.f35879h = iHostUserDepend;
        return this;
    }
}
