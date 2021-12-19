package com.ss.android.ugc.aweme.login.ui;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final h f109036b = i.a(m.SYNCHRONIZED, b.f109039a);

    /* renamed from: c  reason: collision with root package name */
    public static final C2794a f109037c = new C2794a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f109038a = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$a  reason: collision with other inner class name */
    public static final class C2794a {
        static {
            Covode.recordClassIndex(69827);
        }

        public static a a() {
            return (a) a.f109036b.getValue();
        }

        private C2794a() {
        }

        public /* synthetic */ C2794a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f109039a = new b();

        static {
            Covode.recordClassIndex(69828);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    public final void a() {
        this.f109038a.set(false);
    }

    static {
        Covode.recordClassIndex(69826);
    }

    public static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.retrofit2.client.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f109040a = new c();

        static {
            Covode.recordClassIndex(69829);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.bytedance.retrofit2.client.b bVar) {
            com.bytedance.retrofit2.client.b bVar2 = bVar;
            l.b(bVar2, "");
            return Boolean.valueOf(l.a((Object) bVar2.f42471a, (Object) "x-tt-logid"));
        }
    }
}
