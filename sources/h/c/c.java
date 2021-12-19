package h.c;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.io.Serializable;
import java.util.Objects;

public final class c implements f, Serializable {
    private final f.b element;
    private final f left;

    static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final C4183a f158669a = new C4183a((byte) 0);
        private static final long serialVersionUID = 0;
        private final f[] elements;

        static {
            Covode.recordClassIndex(105124);
        }

        /* renamed from: h.c.c$a$a  reason: collision with other inner class name */
        public static final class C4183a {
            static {
                Covode.recordClassIndex(105125);
            }

            private C4183a() {
            }

            public /* synthetic */ C4183a(byte b2) {
                this();
            }
        }

        private final Object readResolve() {
            f[] fVarArr = this.elements;
            f fVar = g.INSTANCE;
            for (f fVar2 : fVarArr) {
                fVar = fVar.plus(fVar2);
            }
            return fVar;
        }

        public a(f[] fVarArr) {
            l.d(fVarArr, "");
            this.elements = fVarArr;
        }
    }

    static {
        Covode.recordClassIndex(105123);
    }

    public final int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    private final int a() {
        c cVar = this;
        int i2 = 2;
        while (true) {
            f fVar = cVar.left;
            if (!(fVar instanceof c)) {
                fVar = null;
            }
            cVar = (c) fVar;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public final String toString() {
        return "[" + ((String) fold("", b.f158670a)) + "]";
    }

    private final Object writeReplace() {
        int a2 = a();
        f[] fVarArr = new f[a2];
        z.c cVar = new z.c();
        cVar.element = 0;
        fold(h.z.f158842a, new C4184c(fVarArr, cVar));
        if (cVar.element == a2) {
            return new a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final boolean a(f.b bVar) {
        return l.a(get(bVar.getKey()), bVar);
    }

    @Override // h.c.f
    public final f plus(f fVar) {
        l.d(fVar, "");
        return f.a.a(this, fVar);
    }

    @Override // h.c.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        l.d(cVar, "");
        c cVar2 = this;
        while (true) {
            E e2 = (E) cVar2.element.get(cVar);
            if (e2 != null) {
                return e2;
            }
            f fVar = cVar2.left;
            if (!(fVar instanceof c)) {
                return (E) fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.a() == a()) {
                c cVar2 = this;
                while (true) {
                    if (!cVar.a(cVar2.element)) {
                        break;
                    }
                    f fVar = cVar2.left;
                    if (fVar instanceof c) {
                        cVar2 = (c) fVar;
                    } else {
                        Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        if (cVar.a((f.b) fVar)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // h.c.f
    public final f minusKey(f.c<?> cVar) {
        l.d(cVar, "");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        f minusKey = this.left.minusKey(cVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == g.INSTANCE) {
            return this.element;
        }
        return new c(minusKey, this.element);
    }

    public c(f fVar, f.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.left = fVar;
        this.element = bVar;
    }

    /* renamed from: h.c.c$c  reason: collision with other inner class name */
    static final class C4184c extends m implements h.f.a.m<h.z, f.b, h.z> {
        final /* synthetic */ f[] $elements;
        final /* synthetic */ z.c $index;

        static {
            Covode.recordClassIndex(105127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4184c(f[] fVarArr, z.c cVar) {
            super(2);
            this.$elements = fVarArr;
            this.$index = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(h.z zVar, f.b bVar) {
            f.b bVar2 = bVar;
            l.d(zVar, "");
            l.d(bVar2, "");
            f[] fVarArr = this.$elements;
            z.c cVar = this.$index;
            int i2 = cVar.element;
            cVar.element = i2 + 1;
            fVarArr[i2] = bVar2;
            return h.z.f158842a;
        }
    }

    @Override // h.c.f
    public final <R> R fold(R r, h.f.a.m<? super R, ? super f.b, ? extends R> mVar) {
        l.d(mVar, "");
        return (R) mVar.invoke((Object) this.left.fold(r, mVar), this.element);
    }

    static final class b extends m implements h.f.a.m<String, f.b, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f158670a = new b();

        static {
            Covode.recordClassIndex(105126);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(String str, f.b bVar) {
            String str2 = str;
            l.d(str2, "");
            l.d(bVar, "");
            if (str2.length() == 0) {
                return bVar.toString();
            }
            return str2 + ", " + bVar;
        }
    }
}
