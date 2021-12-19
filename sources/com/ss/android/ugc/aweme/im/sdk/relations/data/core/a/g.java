package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class g<R> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103051a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f103052b;

    static {
        Covode.recordClassIndex(66063);
    }

    private final List<f<?, R>> d() {
        return (List) this.f103052b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66064);
        }

        private a() {
        }

        public static <R> g<R> a() {
            return new g<>((byte) 0);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<List<f<?, R>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103053a = new b();

        static {
            Covode.recordClassIndex(66065);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    private g() {
        this.f103052b = i.a((h.f.a.a) b.f103053a);
    }

    public final List<f<?, R>> a() {
        return n.g((Collection) d());
    }

    public final f<?, R> c() {
        for (f<?, R> fVar : d()) {
            if (fVar.o) {
                return fVar;
            }
        }
        return null;
    }

    public final void b() {
        for (T t : d()) {
            t.p = false;
            t.f().a();
            t.o = true;
        }
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public final g<R> a(f<?, R> fVar) {
        l.d(fVar, "");
        d().add(fVar);
        return this;
    }
}
