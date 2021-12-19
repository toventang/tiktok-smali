package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import d.a.f.d;
import h.f.b.l;
import java.util.Iterator;

public final class al {

    /* renamed from: d  reason: collision with root package name */
    public static final b f153775d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final d.a.a.b<String, d> f153776a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f153777b;

    /* renamed from: c  reason: collision with root package name */
    public d.a.b.b.b f153778c;

    /* renamed from: e  reason: collision with root package name */
    private final d.a.a.b<String, d.a.f.a> f153779e;

    static {
        Covode.recordClassIndex(102564);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(102566);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f153780a;

        /* renamed from: b  reason: collision with root package name */
        public d.a.b.b.b f153781b;

        static {
            Covode.recordClassIndex(102565);
        }

        public final al a() {
            boolean z = this.f153780a;
            d.a.b.b.b bVar = this.f153781b;
            if (bVar == null) {
                bVar = new d.a.b.b.a();
            }
            return new al(z, bVar, (byte) 0);
        }

        public final a a(d.a.b.b.b bVar) {
            l.c(bVar, "");
            this.f153781b = bVar;
            return this;
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ al f153782a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f153783b;

        static {
            Covode.recordClassIndex(102567);
        }

        public final void run() {
            this.f153782a.f153776a.put(this.f153783b.getId(), this.f153783b);
            this.f153783b.run();
            this.f153782a.f153776a.remove(this.f153783b.getId());
        }

        c(al alVar, d dVar) {
            this.f153782a = alVar;
            this.f153783b = dVar;
        }
    }

    public final void a(d dVar) {
        l.c(dVar, "");
        Iterator<T> it = this.f153779e.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().a()) {
                z = true;
            }
        }
        if (dVar instanceof b) {
            ((b) dVar).f();
        }
        if (!z) {
            this.f153778c.execute(new c(this, dVar));
        }
    }

    private al(boolean z, d.a.b.b.b bVar) {
        this.f153777b = z;
        this.f153778c = bVar;
        this.f153779e = new d.a.a.b<>();
        this.f153776a = new d.a.a.b<>(true);
    }

    public /* synthetic */ al(boolean z, d.a.b.b.b bVar, byte b2) {
        this(z, bVar);
    }
}
