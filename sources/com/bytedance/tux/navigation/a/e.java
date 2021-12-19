package com.bytedance.tux.navigation.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f45201a = "";

    /* renamed from: b  reason: collision with root package name */
    public f f45202b = f.PRIMARY;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45203c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45204d = true;

    static {
        Covode.recordClassIndex(27549);
    }

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f45205a;

        static {
            Covode.recordClassIndex(27550);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            this.f45205a.invoke();
        }

        a(h.f.a.a aVar) {
            this.f45205a = aVar;
        }
    }

    public final e a(d dVar) {
        l.c(dVar, "");
        this.f45199f = dVar;
        return this;
    }

    public final e a(f fVar) {
        l.c(fVar, "");
        this.f45202b = fVar;
        return this;
    }

    public final e a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.f45199f = new a(aVar);
        return this;
    }

    public final e a(Object obj) {
        l.c(obj, "");
        this.f45200g = obj;
        return this;
    }

    public final e a(String str) {
        l.c(str, "");
        this.f45201a = str;
        return this;
    }
}
