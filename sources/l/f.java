package l;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import l.c;

/* access modifiers changed from: package-private */
public final class f extends c.a {

    /* renamed from: a  reason: collision with root package name */
    static final c.a f159237a = new f();

    f() {
    }

    static {
        Covode.recordClassIndex(105762);
    }

    @Override // l.c.a
    public final c<?, ?> a(Type type) {
        if (o.a(type) != b.class) {
            return null;
        }
        final Type e2 = o.e(type);
        return new c<Object, b<?>>() {
            /* class l.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(105763);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [l.b] */
            @Override // l.c
            public final /* bridge */ /* synthetic */ b<?> a(b<Object> bVar) {
                return bVar;
            }

            @Override // l.c
            public final Type a() {
                return e2;
            }
        };
    }
}
