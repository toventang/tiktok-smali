package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class c1 extends b.a {
    static {
        Covode.recordClassIndex(105893);
    }

    c1() {
    }

    /* access modifiers changed from: protected */
    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        Throwable c2 = y1.a().c();
        return c2 != null ? Arrays.toString(c2.getStackTrace()) : "";
    }
}
