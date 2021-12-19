package com.bytedance.ies.powerpreload.d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.d;
import com.bytedance.ies.powerpreload.c;
import com.bytedance.ies.powerpreload.task.f;
import com.bytedance.ies.powerpreload.task.g;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final h f34523b = i.a((h.f.a.a) b.f34526a);

    /* renamed from: c  reason: collision with root package name */
    public static final C0777a f34524c = new C0777a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f34525a;

    /* renamed from: com.bytedance.ies.powerpreload.d.a$a  reason: collision with other inner class name */
    public static final class C0777a {
        static {
            Covode.recordClassIndex(20650);
        }

        public static a a() {
            return (a) a.f34523b.getValue();
        }

        private C0777a() {
        }

        public /* synthetic */ C0777a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34526a = new b();

        static {
            Covode.recordClassIndex(20651);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new b(), (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(20649);
    }

    private a(b bVar) {
        this.f34525a = bVar;
    }

    public /* synthetic */ a(b bVar, byte b2) {
        this(bVar);
    }

    public final void a(Bundle bundle, Class<? extends d> cls) {
        l.c(cls, "");
        b bVar = this.f34525a;
        l.c(cls, "");
        l.c(cls, "");
        if (c.a.a()) {
            try {
                com.bytedance.ies.powerpreload.b bVar2 = bVar.f34528a;
                if (bVar2 == null) {
                    l.a("preloadProxy");
                }
                Object newInstance = cls.newInstance();
                l.a(newInstance, "");
                d dVar = (d) newInstance;
                l.c(dVar, "");
                com.bytedance.ies.powerpreload.d dVar2 = new com.bytedance.ies.powerpreload.d(z.INSTANCE, z.INSTANCE);
                dVar2.f34518c = n.a(dVar);
                if (dVar.enable(bundle)) {
                    f<d> a2 = com.bytedance.ies.powerpreload.a.a.c().a(dVar, dVar2, bundle);
                    String str = null;
                    if (a2 != null) {
                        a2.a((f.a) null);
                    }
                    g a3 = bVar2.a();
                    if (a2 == null) {
                        l.a();
                    }
                    if (bundle != null) {
                        str = com.bytedance.ies.powerpreload.a.b(bundle);
                    }
                    a3.a(dVar2, dVar, a2, str);
                }
            } catch (Exception e2) {
                com.bytedance.ies.powerpreload.a.a.a(e2);
            }
        }
    }
}
