package h.c;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;

public interface f {

    public interface c<E extends b> {
        static {
            Covode.recordClassIndex(105136);
        }
    }

    static {
        Covode.recordClassIndex(105131);
    }

    <R> R fold(R r, m<? super R, ? super b, ? extends R> mVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);

    f plus(f fVar);

    public interface b extends f {
        static {
            Covode.recordClassIndex(105134);
        }

        @Override // h.c.f
        <E extends b> E get(c<E> cVar);

        c<?> getKey();

        public static final class a {
            static {
                Covode.recordClassIndex(105135);
            }

            public static f a(b bVar, f fVar) {
                l.d(fVar, "");
                return a.a(bVar, fVar);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.c.f$b */
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                l.d(cVar, "");
                if (l.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                l.d(cVar, "");
                if (l.a(bVar.getKey(), cVar)) {
                    return g.INSTANCE;
                }
                return bVar;
            }

            public static <R> R a(b bVar, R r, m<? super R, ? super b, ? extends R> mVar) {
                l.d(mVar, "");
                return (R) mVar.invoke(r, bVar);
            }
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105132);
        }

        public static f a(f fVar, f fVar2) {
            l.d(fVar2, "");
            if (fVar2 == g.INSTANCE) {
                return fVar;
            }
            return (f) fVar2.fold(fVar, C4185a.f158673a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h.c.f$a$a  reason: collision with other inner class name */
        public static final class C4185a extends h.f.b.m implements m<f, b, f> {

            /* renamed from: a  reason: collision with root package name */
            public static final C4185a f158673a = new C4185a();

            static {
                Covode.recordClassIndex(105133);
            }

            C4185a() {
                super(2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ f invoke(f fVar, b bVar) {
                f fVar2 = fVar;
                b bVar2 = bVar;
                l.d(fVar2, "");
                l.d(bVar2, "");
                f minusKey = fVar2.minusKey(bVar2.getKey());
                if (minusKey == g.INSTANCE) {
                    return bVar2;
                }
                e eVar = (e) minusKey.get(e.f158671b);
                if (eVar == null) {
                    return new c(minusKey, bVar2);
                }
                f minusKey2 = minusKey.minusKey(e.f158671b);
                if (minusKey2 == g.INSTANCE) {
                    return new c(bVar2, eVar);
                }
                return new c(new c(minusKey2, bVar2), eVar);
            }
        }
    }
}
