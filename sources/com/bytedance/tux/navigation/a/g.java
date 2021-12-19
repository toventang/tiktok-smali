package com.bytedance.tux.navigation.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f45207a = "";

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f45208b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f45209c = -1;

    static {
        Covode.recordClassIndex(27552);
    }

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f45210a;

        static {
            Covode.recordClassIndex(27553);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            this.f45210a.invoke();
        }

        a(h.f.a.a aVar) {
            this.f45210a = aVar;
        }
    }

    public final g a(CharSequence charSequence) {
        l.c(charSequence, "");
        this.f45207a = charSequence;
        return this;
    }

    public final g b(CharSequence charSequence) {
        l.c(charSequence, "");
        this.f45208b = charSequence;
        return this;
    }

    public final g a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.f45199f = new a(aVar);
        return this;
    }

    public final g a(Object obj) {
        l.c(obj, "");
        this.f45200g = obj;
        return this;
    }

    public final g a(String str) {
        l.c(str, "");
        this.f45207a = str;
        return this;
    }
}
