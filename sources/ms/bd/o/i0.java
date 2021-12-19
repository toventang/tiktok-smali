package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class i0 extends b.a {
    static {
        Covode.recordClassIndex(105912);
    }

    i0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        Context context = a.f159493a.f159494b;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
