package ms.bd.o;

import android.content.Context;
import android.content.pm.Signature;
import com.bytedance.covode.number.Covode;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class p0 extends b.a {
    static {
        Covode.recordClassIndex(105941);
    }

    p0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        Context context = a.f159493a.f159494b;
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
