package com.bytedance.ies.xelement;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b<Context, d> f37169a;

    static {
        Covode.recordClassIndex(22354);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private b<? super Context, ? extends d> f37170a;

        static {
            Covode.recordClassIndex(22355);
        }

        public final m a() {
            return new m(this.f37170a, (byte) 0);
        }

        public final a a(b<? super Context, ? extends d> bVar) {
            l.c(bVar, "");
            this.f37170a = bVar;
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.b<? super android.content.Context, ? extends com.bytedance.ies.xelement.d> */
    /* JADX WARN: Multi-variable type inference failed */
    private m(b<? super Context, ? extends d> bVar) {
        this.f37169a = bVar;
    }

    public /* synthetic */ m(b bVar, byte b2) {
        this(bVar);
    }
}
