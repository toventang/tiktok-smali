package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class h0 extends b.a {
    static {
        Covode.recordClassIndex(105909);
    }

    h0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        int i2;
        Context context = a.f159493a.f159494b;
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}
