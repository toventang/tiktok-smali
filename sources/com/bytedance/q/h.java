package com.bytedance.q;

import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public Class<? extends d> f42376a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.q.b.a f42377b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f42378c;

    static {
        Covode.recordClassIndex(25899);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Class<? extends d> f42379a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.q.b.a f42380b;

        /* renamed from: c  reason: collision with root package name */
        public Object[] f42381c;

        static {
            Covode.recordClassIndex(25900);
        }

        public final h a() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f42379a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }
    }

    private h(a aVar) {
        this.f42376a = aVar.f42379a;
        this.f42377b = aVar.f42380b;
        this.f42378c = aVar.f42381c;
        if (this.f42376a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    /* synthetic */ h(a aVar, byte b2) {
        this(aVar);
    }
}
