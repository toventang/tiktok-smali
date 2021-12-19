package ms.bd.o;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class y0 extends b.a {
    static {
        Covode.recordClassIndex(105974);
    }

    y0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        Context context = a.f159493a.f159494b;
        String[] strArr = (String[]) obj;
        if (context == null || str == null || strArr == null || strArr.length % 2 != 0) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            intent.putExtra(strArr[i2], strArr[i2 + 1]);
        }
        context.sendBroadcast(intent);
        return null;
    }
}
