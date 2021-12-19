package com.bytedance.assem.arch.extensions;

import com.bytedance.assem.arch.b.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import h.f.b.m;
import h.h;
import h.i;
import h.k.c;
import java.util.concurrent.Executor;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25646a = true;

    /* renamed from: b  reason: collision with root package name */
    public static k f25647b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f25648c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f25649d;

    /* renamed from: e  reason: collision with root package name */
    public static c<? extends v<? extends d>> f25650e;

    /* renamed from: f  reason: collision with root package name */
    public static l f25651f;

    /* renamed from: g  reason: collision with root package name */
    public static Executor f25652g;

    /* renamed from: h  reason: collision with root package name */
    public static final j f25653h = new j();

    /* renamed from: i  reason: collision with root package name */
    private static final h f25654i = i.a((h.f.a.a) a.f25656a);

    /* renamed from: j  reason: collision with root package name */
    private static final h f25655j = i.a((h.f.a.a) b.f25657a);

    private j() {
    }

    static final class a extends m implements h.f.a.a<com.bytedance.assem.arch.c.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25656a = new a();

        static {
            Covode.recordClassIndex(14922);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.c.c invoke() {
            return new com.bytedance.assem.arch.c.c();
        }
    }

    static final class b extends m implements h.f.a.a<com.bytedance.assem.arch.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25657a = new b();

        static {
            Covode.recordClassIndex(14923);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.c.a invoke() {
            return new com.bytedance.assem.arch.c.a();
        }
    }

    static {
        Covode.recordClassIndex(14921);
    }

    public static Executor a(boolean z) {
        if (f25649d && z) {
            return (com.bytedance.assem.arch.c.a) f25655j.getValue();
        }
        Executor executor = f25652g;
        if (executor == null) {
            return (Executor) f25654i.getValue();
        }
        return executor;
    }
}
