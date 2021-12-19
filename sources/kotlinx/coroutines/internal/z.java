package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.w;
import kotlinx.coroutines.cv;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final v f159160a = new v("ZERO");

    /* renamed from: b  reason: collision with root package name */
    private static final m<Object, f.b, Object> f159161b = a.f159165a;

    /* renamed from: c  reason: collision with root package name */
    private static final m<cv<?>, f.b, cv<?>> f159162c = b.f159166a;

    /* renamed from: d  reason: collision with root package name */
    private static final m<ac, f.b, ac> f159163d = d.f159168a;

    /* renamed from: e  reason: collision with root package name */
    private static final m<ac, f.b, ac> f159164e = c.f159167a;

    static {
        Covode.recordClassIndex(105678);
    }

    public static final Object a(f fVar) {
        Object fold = fVar.fold(0, f159161b);
        if (fold == null) {
            l.a();
        }
        return fold;
    }

    static final class b extends h.f.b.m implements m<cv<?>, f.b, cv<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f159166a = new b();

        static {
            Covode.recordClassIndex(105680);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* bridge */ /* synthetic */ cv<?> invoke(cv<?> cvVar, f.b bVar) {
            f.b bVar2 = bVar;
            if (cvVar != null) {
                return cvVar;
            }
            if (!(bVar2 instanceof cv)) {
                return null;
            }
            return bVar2;
        }
    }

    static final class a extends h.f.b.m implements m<Object, f.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f159165a = new a();

        static {
            Covode.recordClassIndex(105679);
        }

        a() {
            super(2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(Object obj, f.b bVar) {
            int i2;
            if (!(bVar instanceof cv)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i2 = num.intValue();
                if (i2 == 0) {
                    return bVar;
                }
            } else {
                i2 = 1;
            }
            return Integer.valueOf(i2 + 1);
        }
    }

    static final class c extends h.f.b.m implements m<ac, f.b, ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f159167a = new c();

        static {
            Covode.recordClassIndex(105681);
        }

        c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ ac invoke(ac acVar, f.b bVar) {
            ac acVar2 = acVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof cv) {
                Object[] objArr = acVar2.f159115a;
                int i2 = acVar2.f159116b;
                acVar2.f159116b = i2 + 1;
                ((cv) bVar2).a(objArr[i2]);
            }
            return acVar2;
        }
    }

    static final class d extends h.f.b.m implements m<ac, f.b, ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f159168a = new d();

        static {
            Covode.recordClassIndex(105682);
        }

        d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ ac invoke(ac acVar, f.b bVar) {
            ac acVar2 = acVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof cv) {
                Object a2 = ((cv) bVar2).a(acVar2.f159117c);
                Object[] objArr = acVar2.f159115a;
                int i2 = acVar2.f159116b;
                acVar2.f159116b = i2 + 1;
                objArr[i2] = a2;
            }
            return acVar2;
        }
    }

    public static final Object a(f fVar, Object obj) {
        if (obj == null) {
            obj = a(fVar);
        }
        if (obj == 0) {
            return f159160a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new ac(fVar, ((Number) obj).intValue()), f159163d);
        }
        if (obj != null) {
            return ((cv) obj).a(fVar);
        }
        throw new w("null cannot be cast to non-null type");
    }

    public static final void b(f fVar, Object obj) {
        if (obj != f159160a) {
            if (obj instanceof ac) {
                ((ac) obj).f159116b = 0;
                fVar.fold(obj, f159164e);
                return;
            }
            Object fold = fVar.fold(null, f159162c);
            if (fold != null) {
                ((cv) fold).a(obj);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }
}
