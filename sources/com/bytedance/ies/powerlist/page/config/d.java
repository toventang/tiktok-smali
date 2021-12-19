package com.bytedance.ies.powerlist.page.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.e;
import com.bytedance.ies.powerlist.page.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;

public abstract class d<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f34365d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h f34366a;

    /* renamed from: c  reason: collision with root package name */
    public a<T> f34367c;

    static {
        Covode.recordClassIndex(20531);
    }

    public abstract void a(h.c.d<? super f<T>> dVar);

    public abstract void b(h.c.d<? super f<T>> dVar, T t);

    public static final class a {
        static {
            Covode.recordClassIndex(20532);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34368a = new b();

        static {
            Covode.recordClassIndex(20533);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new a<T>() {
                /* class com.bytedance.ies.powerlist.page.config.d.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(20534);
                }

                @Override // com.bytedance.ies.powerlist.page.config.a
                public final void a(e eVar) {
                    l.c(eVar, "");
                }

                @Override // com.bytedance.ies.powerlist.page.config.a
                public final void a(T t) {
                }

                @Override // com.bytedance.ies.powerlist.page.config.a
                public final void b(T t) {
                }

                @Override // com.bytedance.ies.powerlist.page.config.a
                public final void e() {
                }
            };
        }
    }

    public d() {
        h a2 = i.a((h.f.a.a) b.f34368a);
        this.f34366a = a2;
        this.f34367c = (a) a2.getValue();
    }

    public void a(h.c.d<? super f<T>> dVar, T t) {
        l.c(dVar, "");
        dVar.resumeWith(q.m223constructorimpl(f.a.a()));
    }
}
