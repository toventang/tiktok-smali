package h.i;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Random;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final a f158738a = new a();

    static {
        Covode.recordClassIndex(105257);
    }

    public static final class a extends ThreadLocal<Random> {
        static {
            Covode.recordClassIndex(105258);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Random initialValue() {
            return new Random();
        }
    }

    @Override // h.i.a
    public final Random a() {
        Object obj = this.f158738a.get();
        l.b(obj, "");
        return (Random) obj;
    }
}
