package h.l;

import com.bytedance.covode.number.Covode;
import h.c.a.b;
import h.c.d;
import h.f.a.m;
import h.z;
import java.util.Iterator;

public class l {
    static {
        Covode.recordClassIndex(105314);
    }

    public static final class a implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f158785a;

        static {
            Covode.recordClassIndex(105315);
        }

        @Override // h.l.h
        public final Iterator<T> a() {
            m mVar = this.f158785a;
            h.f.b.l.d(mVar, "");
            i iVar = new i();
            iVar.f158781a = b.a(mVar, iVar, iVar);
            return iVar;
        }

        public a(m mVar) {
            this.f158785a = mVar;
        }
    }

    public static final <T> h<T> a(m<? super j<? super T>, ? super d<? super z>, ? extends Object> mVar) {
        h.f.b.l.d(mVar, "");
        return new a(mVar);
    }
}
